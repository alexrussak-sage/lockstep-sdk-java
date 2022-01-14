
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;
public class TransferOwnerModel
{
    private UserAccountModel previousOwner;
    private UserAccountModel newOwner;

    /**
     * The previous owner of the account.
     *
     * @return a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public UserAccountModel getPreviousOwner() { return this.previousOwner; }
    /**
     * The previous owner of the account.
     *
     * @param value a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public void setPreviousOwner(UserAccountModel value) { this.previousOwner = value; }
    /**
     * The new owner of the account.
     *
     * @return a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public UserAccountModel getNewOwner() { return this.newOwner; }
    /**
     * The new owner of the account.
     *
     * @param value a {@link io.lockstep.api.models.UserAccountModel} object.
     */
    public void setNewOwner(UserAccountModel value) { this.newOwner = value; }
};
