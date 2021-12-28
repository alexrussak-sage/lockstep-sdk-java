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


public class CustomerDetailsModel
{
    private String groupKey;
    private String customerId;
    private String name;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private String email;
    private String contactId;
    private String contactName;
    private String contactEmail;
    private Integer outstandingInvoices;
    private Double outstandingAmount;
    private Double amountPastDue;
    private CustomerDetailsPaymentModel[] payments;

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
     * The unique ID of this customer
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     */
    public String getname() { return this.name; }
    /**
     * The unique ID of this customer
     */
    public void setname(String value) { this.name = value; }
    /**
     * Customer address info
     */
    public String getaddress1() { return this.address1; }
    /**
     * Customer address info
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Customer address info
     */
    public String getaddress2() { return this.address2; }
    /**
     * Customer address info
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Customer address info
     */
    public String getaddress3() { return this.address3; }
    /**
     * Customer address info
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * Customer address info
     */
    public String getcity() { return this.city; }
    /**
     * Customer address info
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Customer address info
     */
    public String getstate() { return this.state; }
    /**
     * Customer address info
     */
    public void setstate(String value) { this.state = value; }
    /**
     * Customer address info
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Customer address info
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Customer address country
     */
    public String getcountry() { return this.country; }
    /**
     * Customer address country
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Customer phone number
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     */
    public String getemail() { return this.email; }
    /**
     * Customer AR email address
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Customer primary contact id
     */
    public String getcontactId() { return this.contactId; }
    /**
     * Customer primary contact id
     */
    public void setcontactId(String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     */
    public String getcontactName() { return this.contactName; }
    /**
     * Customer primary contact name
     */
    public void setcontactName(String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     */
    public String getcontactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     */
    public void setcontactEmail(String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     */
    public Integer getoutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     */
    public void setoutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     */
    public Double getoutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     */
    public void setoutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     */
    public Double getamountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     */
    public void setamountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     */
    public CustomerDetailsPaymentModel[] getpayments() { return this.payments; }
    /**
     * Customer payments collected
     */
    public void setpayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};