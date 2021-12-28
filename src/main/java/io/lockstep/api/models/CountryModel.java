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


public class CountryModel
{
    private String name;
    private String alpha2;
    private String alpha3;
    private Integer countryCode;
    private String region;
    private String subRegion;
    private String intermediateRegion;
    private Integer regionCode;
    private Integer subRegionCode;
    private Integer intermediateRegionCode;
    private String frenchName;
    private String aliases;

    /**
     * Name of the country
     */
    public String getname() { return this.name; }
    /**
     * Name of the country
     */
    public void setname(String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given country
     */
    public String getalpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given country
     */
    public void setalpha2(String value) { this.alpha2 = value; }
    /**
     * 3 letter alphabetic code for the given country
     */
    public String getalpha3() { return this.alpha3; }
    /**
     * 3 letter alphabetic code for the given country
     */
    public void setalpha3(String value) { this.alpha3 = value; }
    /**
     * Unique 3 digit number for the given country
     */
    public Integer getcountryCode() { return this.countryCode; }
    /**
     * Unique 3 digit number for the given country
     */
    public void setcountryCode(Integer value) { this.countryCode = value; }
    /**
     * Region of the country
     */
    public String getregion() { return this.region; }
    /**
     * Region of the country
     */
    public void setregion(String value) { this.region = value; }
    /**
     * Subregion of the country
     */
    public String getsubRegion() { return this.subRegion; }
    /**
     * Subregion of the country
     */
    public void setsubRegion(String value) { this.subRegion = value; }
    /**
     * Intermediate region of the country
     */
    public String getintermediateRegion() { return this.intermediateRegion; }
    /**
     * Intermediate region of the country
     */
    public void setintermediateRegion(String value) { this.intermediateRegion = value; }
    /**
     * Numeric code for a region
     */
    public Integer getregionCode() { return this.regionCode; }
    /**
     * Numeric code for a region
     */
    public void setregionCode(Integer value) { this.regionCode = value; }
    /**
     * Numeric code for a subregion
     */
    public Integer getsubRegionCode() { return this.subRegionCode; }
    /**
     * Numeric code for a subregion
     */
    public void setsubRegionCode(Integer value) { this.subRegionCode = value; }
    /**
     * Numeric code for an intermediate region
     */
    public Integer getintermediateRegionCode() { return this.intermediateRegionCode; }
    /**
     * Numeric code for an intermediate region
     */
    public void setintermediateRegionCode(Integer value) { this.intermediateRegionCode = value; }
    /**
     * French name of the country
     */
    public String getfrenchName() { return this.frenchName; }
    /**
     * French name of the country
     */
    public void setfrenchName(String value) { this.frenchName = value; }
    /**
     * A different name for a country
     */
    public String getaliases() { return this.aliases; }
    /**
     * A different name for a country
     */
    public void setaliases(String value) { this.aliases = value; }
};