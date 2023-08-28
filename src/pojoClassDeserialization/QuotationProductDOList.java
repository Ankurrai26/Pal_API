package pojoClassDeserialization;

import java.util.List;

public class QuotationProductDOList {

	private String productId;
	private String productVersion;
	private String productPlanOptionCd;
	private float basePremium;
	private float sumInsured;
	private String zoneCd;
	private String productTypeCd;
	private int extraPremium;
	private int discount;
	private String payoutOption;
	private String reducingBalanceSI;
	private String paymentFrequencyCd;
	private String premiumOption;
	private List<QuotationProductBenefitDOList> quotationProductBenefitDOList; //Class
	private List<QuotationProductInsuredDOList> quotationProductInsuredDOList; //Class
	private String quotationProductChargeDOList;
	private List<QuotationProductAddOnDOList> quotationProductAddOnDOList; //class
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public String getProductPlanOptionCd() {
		return productPlanOptionCd;
	}
	public void setProductPlanOptionCd(String productPlanOptionCd) {
		this.productPlanOptionCd = productPlanOptionCd;
	}
	public float getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(float basePremium) {
		this.basePremium = basePremium;
	}
	public float getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(float sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getProductTypeCd() {
		return productTypeCd;
	}
	public void setProductTypeCd(String productTypeCd) {
		this.productTypeCd = productTypeCd;
	}
	public int getExtraPremium() {
		return extraPremium;
	}
	public void setExtraPremium(int extraPremium) {
		this.extraPremium = extraPremium;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPayoutOption() {
		return payoutOption;
	}
	public void setPayoutOption(String payoutOption) {
		this.payoutOption = payoutOption;
	}
	public String getReducingBalanceSI() {
		return reducingBalanceSI;
	}
	public void setReducingBalanceSI(String reducingBalanceSI) {
		this.reducingBalanceSI = reducingBalanceSI;
	}
	public String getPaymentFrequencyCd() {
		return paymentFrequencyCd;
	}
	public void setPaymentFrequencyCd(String paymentFrequencyCd) {
		this.paymentFrequencyCd = paymentFrequencyCd;
	}
	public String getPremiumOption() {
		return premiumOption;
	}
	public void setPremiumOption(String premiumOption) {
		this.premiumOption = premiumOption;
	}
	public List<QuotationProductBenefitDOList> getQuotationProductBenefitDOList() {
		return quotationProductBenefitDOList;
	}
	public void setQuotationProductBenefitDOList(List<QuotationProductBenefitDOList> quotationProductBenefitDOList) {
		this.quotationProductBenefitDOList = quotationProductBenefitDOList;
	}
	public List<QuotationProductInsuredDOList> getQuotationProductInsuredDOList() {
		return quotationProductInsuredDOList;
	}
	public void setQuotationProductInsuredDOList(List<QuotationProductInsuredDOList> quotationProductInsuredDOList) {
		this.quotationProductInsuredDOList = quotationProductInsuredDOList;
	}
	public String getQuotationProductChargeDOList() {
		return quotationProductChargeDOList;
	}
	public void setQuotationProductChargeDOList(String quotationProductChargeDOList) {
		this.quotationProductChargeDOList = quotationProductChargeDOList;
	}
	public List<QuotationProductAddOnDOList> getQuotationProductAddOnDOList() {
		return quotationProductAddOnDOList;
	}
	public void setQuotationProductAddOnDOList(List<QuotationProductAddOnDOList> quotationProductAddOnDOList) {
		this.quotationProductAddOnDOList = quotationProductAddOnDOList;
	}
	
	
	
}
