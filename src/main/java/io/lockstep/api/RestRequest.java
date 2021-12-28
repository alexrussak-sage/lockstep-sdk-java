/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */

package io.lockstep.api;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.Hashtable;
import java.util.Map.Entry;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import com.google.gson.Gson;

import io.lockstep.api.models.ErrorResult;
import io.lockstep.api.models.LockstepResponse;


/**
 * Represents a failed request.
 */
public class RestRequest<T>
{
    private Hashtable<String, String> queryParams;
    private Hashtable<String, String> pathReplacements;
    private String method;
    private String path;
    private Object body;
    private LockstepApi client;

    public RestRequest(LockstepApi client, String method, String path)
    {
        this.client = client;
        this.method = method;
        this.path = path;
        queryParams = new Hashtable<String, String>();
        pathReplacements = new Hashtable<String, String>();
    }

    public void AddQuery(String name, String value)
    {
        this.queryParams.put(name, value);
    }

    public void AddPath(String name, String value)
    {
        this.pathReplacements.put(name, value);
    }

    public void AddBody(Object body)
    {
        this.body = body;
    }

    /**
     * Adapted from Apache simple request client example
     */
    public LockstepResponse<T> Call(Type classReference)
    {
        LockstepResponse<T> lockstepResponse = new LockstepResponse<T>();
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();

            // Add query parameters
            URIBuilder builder = new URIBuilder(this.client.getServerUri());
            for (Entry<String, String> entry : this.queryParams.entrySet()) {
                builder.addParameter(entry.getKey(), entry.getValue());
            }

            // Set the path and execute replacements
            String filledPath = this.path;
            for (Entry<String, String> entry : this.pathReplacements.entrySet()) {
                filledPath = filledPath.replaceAll(entry.getKey(), entry.getValue());
            }
            builder.setPath(filledPath);
            URI uri = builder.build();

            // Create the appropriate request
            ClassicHttpRequest request;
            switch (this.method) {
                case "PATCH":
                    request = new HttpPatch(uri);
                    break;
                case "PUT":
                    request = new HttpPut(uri);
                    break;
                case "POST":
                    request = new HttpPost(uri);
                    break;
                case "DELETE":
                    request = new HttpDelete(uri);
                    break;
                case "GET":
                default:
                    request = new HttpGet(uri);
                    break;
            }
            
            // Add authentication
            String apiKey = this.client.getApiKey();
            if (apiKey != null) {
                request.addHeader("Api-Key", apiKey);
            }
            String bearerToken = this.client.getBearerToken();
            if (apiKey != null) {
                request.addHeader("Authorization", "Bearer " + bearerToken);
            }

            // If we have a request body
            Gson gson = new Gson();
            if (body != null) {
                StringEntity stringEntity = new StringEntity(gson.toJson(body));
                request.setEntity(stringEntity);
            }

            // Execute and parse results
            final CloseableHttpResponse response = httpclient.execute(request);

            // Did we succeed?
            int code = response.getCode();
            if (code >= 200 && code < 300) {
                String content = EntityUtils.toString(response.getEntity());
                T t = gson.fromJson(content, classReference);
                lockstepResponse.setValue(t);
                lockstepResponse.setSuccess(true);
            } else {
                String content = EntityUtils.toString(response.getEntity());
                ErrorResult errorResult = gson.fromJson(content, ErrorResult.class);
                lockstepResponse.setError(errorResult);
                lockstepResponse.setSuccess(false);
            }
            return lockstepResponse;
        } catch (Exception e) {
            lockstepResponse.setSuccess(false);
            lockstepResponse.setException(e);
        }
        return lockstepResponse;
    }
}