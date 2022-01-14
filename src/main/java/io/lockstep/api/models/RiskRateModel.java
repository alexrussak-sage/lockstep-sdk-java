
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

import java.util.Date;
public class RiskRateModel
{
    private String groupKey;
    private Date reportPeriod;
    private String invoiceMonthName;
    private Integer totalInvoiceCount;
    private Double totalInvoiceAmount;
    private Integer atRiskCount;
    private Double atRiskAmount;
    private Double atRiskCountPercentage;
    private Double atRiskPercentage;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The month the risk rate was calculated for
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getReportPeriod() { return this.reportPeriod; }
    /**
     * The month the risk rate was calculated for
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setReportPeriod(Date value) { this.reportPeriod = value; }
    /**
     * The string name of the month the risk rate was calculated for
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceMonthName() { return this.invoiceMonthName; }
    /**
     * The string name of the month the risk rate was calculated for
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceMonthName(String value) { this.invoiceMonthName = value; }
    /**
     * The count of all invoices in the calculation month
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoiceCount() { return this.totalInvoiceCount; }
    /**
     * The count of all invoices in the calculation month
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoiceCount(Integer value) { this.totalInvoiceCount = value; }
    /**
     * The sum of the total amount for invoices in the calculation month
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalInvoiceAmount() { return this.totalInvoiceAmount; }
    /**
     * The sum of the total amount for invoices in the calculation month
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalInvoiceAmount(Double value) { this.totalInvoiceAmount = value; }
    /**
     * The count of open invoices over 90 days from the calculation month
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getAtRiskCount() { return this.atRiskCount; }
    /**
     * The count of open invoices over 90 days from the calculation month
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setAtRiskCount(Integer value) { this.atRiskCount = value; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAtRiskAmount() { return this.atRiskAmount; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAtRiskAmount(Double value) { this.atRiskAmount = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAtRiskCountPercentage() { return this.atRiskCountPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAtRiskCountPercentage(Double value) { this.atRiskCountPercentage = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getAtRiskPercentage() { return this.atRiskPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setAtRiskPercentage(Double value) { this.atRiskPercentage = value; }
};
