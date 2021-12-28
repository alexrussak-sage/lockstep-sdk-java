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


public class AvailableMigrationsModel
{
    private AvailableGroup[] migrations;

    /**
     * Indicates which records are available for migration
     */
    public AvailableGroup[] getmigrations() { return this.migrations; }
    /**
     * Indicates which records are available for migration
     */
    public void setmigrations(AvailableGroup[] value) { this.migrations = value; }
};