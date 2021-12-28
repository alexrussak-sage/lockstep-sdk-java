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


package io.lockstep.api.models;


public class ConnectorInfoModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;
    private String email;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public String getauthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public void setauthCode(String value) { this.authCode = value; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public String getrealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public void setrealmId(String value) { this.realmId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public String getredirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public void setredirectUri(String value) { this.redirectUri = value; }
    /**
     * The email an email connection is being created for.
     */
    public String getemail() { return this.email; }
    /**
     * The email an email connection is being created for.
     */
    public void setemail(String value) { this.email = value; }
};