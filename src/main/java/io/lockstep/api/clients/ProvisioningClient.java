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
import io.lockstep.api.models.ProvisioningResponseModel;
import io.lockstep.api.models.ProvisioningModel;
import io.lockstep.api.models.ProvisioningFinalizeRequestModel;

public class ProvisioningClient
{
    private LockstepApi client;

    public ProvisioningClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Creates a new User or updates an Invited user based on metadata provided by the User during the onboarding process
     * 
     * @param body - Represents a User and their related metadata
     */
    public LockstepResponse<ProvisioningResponseModel> ProvisionUserAccount(ProvisioningModel body)
    {
        RestRequest<ProvisioningResponseModel> r = new RestRequest<ProvisioningResponseModel>(this.client, "POST", "/api/v1/Provisioning");
        r.AddBody(body);
        return r.Call(ProvisioningResponseModel.class);
    }

    /**
     * Updates user, company and group metadata for a User of status 'Onboarding' and finalizes a user's onboarding process by changing the user status to 'Active'
     * 
     * @param body - Represents a User and their related metadata
     */
    public LockstepResponse<ProvisioningResponseModel> FinalizeUserAccountProvisioning(ProvisioningFinalizeRequestModel body)
    {
        RestRequest<ProvisioningResponseModel> r = new RestRequest<ProvisioningResponseModel>(this.client, "POST", "/api/v1/Provisioning/finalize");
        r.AddBody(body);
        return r.Call(ProvisioningResponseModel.class);
    }
}