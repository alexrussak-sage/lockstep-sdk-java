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


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.CustomFieldValueModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class CustomFieldValuesClient
{
    private LockstepApi client;

    public CustomFieldValuesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves all Custom Field Definitions.
     * 
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param definitionId - The unique Lockstep Platform ID number of the Custom Field Definition for the Custom Field Value to retrieve.
     * @param recordKey - The unique Lockstep Platform ID number of the Lockstep Platform object the Custom Field Value is attached to.
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: CustomFieldDefinition
     */
    public LockstepResponse<CustomFieldValueModel> RetrieveField(String definitionId, String recordKey, String include)
    {
        RestRequest<CustomFieldValueModel> r = new RestRequest<CustomFieldValueModel>(this.client, "GET", "/api/v1/CustomFieldValues/{definitionId}/{recordKey}");
        r.AddPath("{definitionId}", definitionId.toString());
        r.AddPath("{recordKey}", recordKey.toString());
        r.AddQuery("include", include.toString());
        return r.Call(CustomFieldValueModel.class);
    }

    /**
     * Updates an existing Custom Field with the information supplied to this PATCH call.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     * 
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param definitionId - The unique Lockstep Platform ID number of the Custom Field Definition for the Custom Field Value to retrieve.
     * @param recordKey - The unique Lockstep Platform ID number of the Lockstep Platform object the Custom Field Value is attached to.
     * @param body - A list of changes to apply to this Custom Field
     */
    public LockstepResponse<CustomFieldValueModel> UpdateField(String definitionId, String recordKey, Object body)
    {
        RestRequest<CustomFieldValueModel> r = new RestRequest<CustomFieldValueModel>(this.client, "PATCH", "/api/v1/CustomFieldValues/{definitionId}/{recordKey}");
        r.AddPath("{definitionId}", definitionId.toString());
        r.AddPath("{recordKey}", recordKey.toString());
        r.AddBody(body);
        return r.Call(CustomFieldValueModel.class);
    }

    /**
     * Deletes the Custom Field referred to by this unique identifier.
     * 
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param definitionId - The unique Lockstep Platform ID number of the Custom Field Definition for the Custom Field Value to retrieve.
     * @param recordKey - The unique Lockstep Platform ID number of the Lockstep Platform object the Custom Field Value is attached to.
     */
    public LockstepResponse<ActionResultModel> DeleteField(String definitionId, String recordKey)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/CustomFieldValues/{definitionId}/{recordKey}");
        r.AddPath("{definitionId}", definitionId.toString());
        r.AddPath("{recordKey}", recordKey.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more Custom Fields and returns the records as created.  A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param body - The Custom Fields to create
     */
    public LockstepResponse<CustomFieldValueModel[]> CreateFields(CustomFieldValueModel[] body)
    {
        RestRequest<CustomFieldValueModel[]> r = new RestRequest<CustomFieldValueModel[]>(this.client, "POST", "/api/v1/CustomFieldValues");
        r.AddBody(body);
        return r.Call(CustomFieldValueModel[].class);
    }

    /**
     * Queries Custom Fields within the Lockstep platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     * 
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: CustomFieldDefinition
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<CustomFieldValueModel>> QueryFields(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<CustomFieldValueModel>> r = new RestRequest<FetchResult<CustomFieldValueModel>>(this.client, "GET", "/api/v1/CustomFieldValues/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CustomFieldValueModel>>() {}.getType());
    }
}