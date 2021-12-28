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

public class PaymentSummaryModel
{
    private String groupKey;
    private String paymentId;
    private String memoText;
    private String referenceCode;
    private String paymentType;
    private Date paymentDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private Integer invoiceCount;
    private Double totalPaymentsApplied;
    private String[] invoiceList;
    private String[] invoiceIdList;
    private String customerName;
    private String customerId;

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
     * The id of the payment
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The id of the payment
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * The date of this payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Total amount of this payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The number of invoices associated to this payment.
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices associated to this payment.
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of payments applied to this payment.
     */
    public Double gettotalPaymentsApplied() { return this.totalPaymentsApplied; }
    /**
     * The number of payments applied to this payment.
     */
    public void settotalPaymentsApplied(Double value) { this.totalPaymentsApplied = value; }
    /**
     * The reference codes of the invoices associated to this payment.
     */
    public String[] getinvoiceList() { return this.invoiceList; }
    /**
     * The reference codes of the invoices associated to this payment.
     */
    public void setinvoiceList(String[] value) { this.invoiceList = value; }
    /**
     * The ids of the invoices associated to this payment.
     */
    public String[] getinvoiceIdList() { return this.invoiceIdList; }
    /**
     * The ids of the invoices associated to this payment.
     */
    public void setinvoiceIdList(String[] value) { this.invoiceIdList = value; }
    /**
     * The name of the customer for this payment.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the customer for this payment.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * The id of the customer for this payment.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The id of the customer for this payment.
     */
    public void setcustomerId(String value) { this.customerId = value; }
};