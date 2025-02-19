package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DowngradePlanUpdateResponse
 */

public class DowngradePlanUpdateResponse {
  @JsonProperty("accountPaymentMethod")
  private String accountPaymentMethod = null;

  @JsonProperty("discountApplied")
  private String discountApplied = null;

  @JsonProperty("downgradeEffectiveDate")
  private String downgradeEffectiveDate = null;

  @JsonProperty("downgradePaymentCycle")
  private String downgradePaymentCycle = null;

  @JsonProperty("downgradePlanId")
  private String downgradePlanId = null;

  @JsonProperty("downgradePlanName")
  private String downgradePlanName = null;

  @JsonProperty("downgradeRequestStatus")
  private String downgradeRequestStatus = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("saleDiscount")
  private String saleDiscount = null;

  @JsonProperty("saleDiscountPeriods")
  private String saleDiscountPeriods = null;

  @JsonProperty("saleDiscountType")
  private String saleDiscountType = null;

  public DowngradePlanUpdateResponse accountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
    return this;
  }

   /**
   * 
   * @return accountPaymentMethod
  **/
  @ApiModelProperty(value = "")
  public String getAccountPaymentMethod() {
    return accountPaymentMethod;
  }

  public void setAccountPaymentMethod(String accountPaymentMethod) {
    this.accountPaymentMethod = accountPaymentMethod;
  }

  public DowngradePlanUpdateResponse discountApplied(String discountApplied) {
    this.discountApplied = discountApplied;
    return this;
  }

   /**
   * 
   * @return discountApplied
  **/
  @ApiModelProperty(value = "")
  public String getDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(String discountApplied) {
    this.discountApplied = discountApplied;
  }

  public DowngradePlanUpdateResponse downgradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
    return this;
  }

   /**
   * 
   * @return downgradeEffectiveDate
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeEffectiveDate() {
    return downgradeEffectiveDate;
  }

  public void setDowngradeEffectiveDate(String downgradeEffectiveDate) {
    this.downgradeEffectiveDate = downgradeEffectiveDate;
  }

  public DowngradePlanUpdateResponse downgradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
    return this;
  }

   /**
   * 
   * @return downgradePaymentCycle
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePaymentCycle() {
    return downgradePaymentCycle;
  }

  public void setDowngradePaymentCycle(String downgradePaymentCycle) {
    this.downgradePaymentCycle = downgradePaymentCycle;
  }

  public DowngradePlanUpdateResponse downgradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
    return this;
  }

   /**
   * 
   * @return downgradePlanId
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePlanId() {
    return downgradePlanId;
  }

  public void setDowngradePlanId(String downgradePlanId) {
    this.downgradePlanId = downgradePlanId;
  }

  public DowngradePlanUpdateResponse downgradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
    return this;
  }

   /**
   * 
   * @return downgradePlanName
  **/
  @ApiModelProperty(value = "")
  public String getDowngradePlanName() {
    return downgradePlanName;
  }

  public void setDowngradePlanName(String downgradePlanName) {
    this.downgradePlanName = downgradePlanName;
  }

  public DowngradePlanUpdateResponse downgradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
    return this;
  }

   /**
   * 
   * @return downgradeRequestStatus
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeRequestStatus() {
    return downgradeRequestStatus;
  }

  public void setDowngradeRequestStatus(String downgradeRequestStatus) {
    this.downgradeRequestStatus = downgradeRequestStatus;
  }

  public DowngradePlanUpdateResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DowngradePlanUpdateResponse promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * 
   * @return promoCode
  **/
  @ApiModelProperty(value = "")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public DowngradePlanUpdateResponse saleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
    return this;
  }

   /**
   * 
   * @return saleDiscount
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscount() {
    return saleDiscount;
  }

  public void setSaleDiscount(String saleDiscount) {
    this.saleDiscount = saleDiscount;
  }

  public DowngradePlanUpdateResponse saleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
    return this;
  }

   /**
   * 
   * @return saleDiscountPeriods
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscountPeriods() {
    return saleDiscountPeriods;
  }

  public void setSaleDiscountPeriods(String saleDiscountPeriods) {
    this.saleDiscountPeriods = saleDiscountPeriods;
  }

  public DowngradePlanUpdateResponse saleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
    return this;
  }

   /**
   * 
   * @return saleDiscountType
  **/
  @ApiModelProperty(value = "")
  public String getSaleDiscountType() {
    return saleDiscountType;
  }

  public void setSaleDiscountType(String saleDiscountType) {
    this.saleDiscountType = saleDiscountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowngradePlanUpdateResponse downgradePlanUpdateResponse = (DowngradePlanUpdateResponse) o;
    return Objects.equals(this.accountPaymentMethod, downgradePlanUpdateResponse.accountPaymentMethod) &&
        Objects.equals(this.discountApplied, downgradePlanUpdateResponse.discountApplied) &&
        Objects.equals(this.downgradeEffectiveDate, downgradePlanUpdateResponse.downgradeEffectiveDate) &&
        Objects.equals(this.downgradePaymentCycle, downgradePlanUpdateResponse.downgradePaymentCycle) &&
        Objects.equals(this.downgradePlanId, downgradePlanUpdateResponse.downgradePlanId) &&
        Objects.equals(this.downgradePlanName, downgradePlanUpdateResponse.downgradePlanName) &&
        Objects.equals(this.downgradeRequestStatus, downgradePlanUpdateResponse.downgradeRequestStatus) &&
        Objects.equals(this.message, downgradePlanUpdateResponse.message) &&
        Objects.equals(this.promoCode, downgradePlanUpdateResponse.promoCode) &&
        Objects.equals(this.saleDiscount, downgradePlanUpdateResponse.saleDiscount) &&
        Objects.equals(this.saleDiscountPeriods, downgradePlanUpdateResponse.saleDiscountPeriods) &&
        Objects.equals(this.saleDiscountType, downgradePlanUpdateResponse.saleDiscountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPaymentMethod, discountApplied, downgradeEffectiveDate, downgradePaymentCycle, downgradePlanId, downgradePlanName, downgradeRequestStatus, message, promoCode, saleDiscount, saleDiscountPeriods, saleDiscountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradePlanUpdateResponse {\n");
    
    sb.append("    accountPaymentMethod: ").append(toIndentedString(accountPaymentMethod)).append("\n");
    sb.append("    discountApplied: ").append(toIndentedString(discountApplied)).append("\n");
    sb.append("    downgradeEffectiveDate: ").append(toIndentedString(downgradeEffectiveDate)).append("\n");
    sb.append("    downgradePaymentCycle: ").append(toIndentedString(downgradePaymentCycle)).append("\n");
    sb.append("    downgradePlanId: ").append(toIndentedString(downgradePlanId)).append("\n");
    sb.append("    downgradePlanName: ").append(toIndentedString(downgradePlanName)).append("\n");
    sb.append("    downgradeRequestStatus: ").append(toIndentedString(downgradeRequestStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    saleDiscount: ").append(toIndentedString(saleDiscount)).append("\n");
    sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
    sb.append("    saleDiscountType: ").append(toIndentedString(saleDiscountType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

