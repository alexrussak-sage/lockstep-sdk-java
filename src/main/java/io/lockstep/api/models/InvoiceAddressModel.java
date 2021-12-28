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

import java.util.Date;

public class InvoiceAddressModel
{
    private String invoiceAddressId;
    private String groupKey;
    private String invoiceId;
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private Float latitude;
    private Float longitude;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getinvoiceAddressId() { return this.invoiceAddressId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setinvoiceAddressId(String value) { this.invoiceAddressId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the invoice this address belongs to
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this address belongs to
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The first line of the address.
     */
    public String getline1() { return this.line1; }
    /**
     * The first line of the address.
     */
    public void setline1(String value) { this.line1 = value; }
    /**
     * The second line of the address.
     */
    public String getline2() { return this.line2; }
    /**
     * The second line of the address.
     */
    public void setline2(String value) { this.line2 = value; }
    /**
     * The third line of the address.
     */
    public String getline3() { return this.line3; }
    /**
     * The third line of the address.
     */
    public void setline3(String value) { this.line3 = value; }
    /**
     * The name of the city for this address.
     */
    public String getcity() { return this.city; }
    /**
     * The name of the city for this address.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state or region part of this address.
     */
    public String getregion() { return this.region; }
    /**
     * The state or region part of this address.
     */
    public void setregion(String value) { this.region = value; }
    /**
     * The postal code for this address.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal code for this address.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The country for this address.
     */
    public String getcountry() { return this.country; }
    /**
     * The country for this address.
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * The latitude of this address, if available.
     */
    public Float getlatitude() { return this.latitude; }
    /**
     * The latitude of this address, if available.
     */
    public void setlatitude(Float value) { this.latitude = value; }
    /**
     * The longitude of this address, if available.
     */
    public Float getlongitude() { return this.longitude; }
    /**
     * The longitude of this address, if available.
     */
    public void setlongitude(Float value) { this.longitude = value; }
    /**
     * The date on which this address record was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this address record was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};