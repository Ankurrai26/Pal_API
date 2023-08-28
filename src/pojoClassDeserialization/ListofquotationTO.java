package pojoClassDeserialization;

import java.util.List;

public class ListofquotationTO {

	private String quoteId;
	private String channelId;
	private String productId;	
	private String parentProductId;
	private int parentProductVersion;
	private int noOfAdults;
	private int noOfKids;
	private int tenure;
	private String productPlanOptionCd;
	private String policyType;
	private String saveFl;
	private String quoteTypeCd;
	private float totPremium;
	private String quotationDt;
	private String agentId;
	private String campaignCd;
	private String productFamilyCd;
	private String policyNum;
	private String applicationID;
	private String inwardTypeCd; //error
	private String inwardSubTypeCd;
	private int modalPremium;
	private String initialPremium;
	private String ppmcFl;
	private String uwFl;
	private String caseType;
	private String premiumToBeCollected;
	private String premiumSuspenseAmount;
	private int renewalYear;
	private String totUWLoadingAmount;
	private String uwLoadingPerc;
	private String totUWLoadingInclOfTaxes;
	private String modalServiceTax;
	private String modalEduCess;
	private String modalHigherEduCess;
	private String baseModalPremium;
	private String cummulativeBonusAmt;
	private String prevCummulativeBonus;
	private String actualCummulativeBonus;
	private String cummulativeBonusPerc;
	private String totRenewalLoadingAmount;
	private String totRenewalLoadingInclOfTaxes;
	private String sezUnit;
	private String stateCd;
	private String standaloneChild;
	private String srNum;
	private String migrationFlag;
	private String gstAvailFlg;
	private String productTermUnitCd;
	private String utilizeHMBForPremium;
	private String hmbUtilizedTowardPremium;
	private List<QuotationProductDOList> quotationProductDOList; //Class
	private List<QuotationChargeDOList> quotationChargeDOList;///Class 
	private String quotationChangeDOList;
	private String totWellnessRewardPoints;
	private float uwLoadingModalPremium;
	private float uwLoadingModalPremiumInclOfTaxes;
	private String renewalLoadingModalAmount;
	private String renewalLoadingModalInclOfTaxes;
	private String modalLoadingPremium;
	private int noOfInstallments;
	private String initialPayment;
	private String migrationProductId;
	private String coverageType;
	private String coverageIllness;
	private String pedFlag;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getParentProductId() {
		return parentProductId;
	}
	public void setParentProductId(String parentProductId) {
		this.parentProductId = parentProductId;
	}
	public int getParentProductVersion() {
		return parentProductVersion;
	}
	public void setParentProductVersion(int parentProductVersion) {
		this.parentProductVersion = parentProductVersion;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfKids() {
		return noOfKids;
	}
	public void setNoOfKids(int noOfKids) {
		this.noOfKids = noOfKids;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getProductPlanOptionCd() {
		return productPlanOptionCd;
	}
	public void setProductPlanOptionCd(String productPlanOptionCd) {
		this.productPlanOptionCd = productPlanOptionCd;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getSaveFl() {
		return saveFl;
	}
	public void setSaveFl(String saveFl) {
		this.saveFl = saveFl;
	}
	public String getQuoteTypeCd() {
		return quoteTypeCd;
	}
	public void setQuoteTypeCd(String quoteTypeCd) {
		this.quoteTypeCd = quoteTypeCd;
	}
	public float getTotPremium() {
		return totPremium;
	}
	public void setTotPremium(float totPremium) {
		this.totPremium = totPremium;
	}
	public String getQuotationDt() {
		return quotationDt;
	}
	public void setQuotationDt(String quotationDt) {
		this.quotationDt = quotationDt;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getCampaignCd() {
		return campaignCd;
	}
	public void setCampaignCd(String campaignCd) {
		this.campaignCd = campaignCd;
	}
	public String getProductFamilyCd() {
		return productFamilyCd;
	}
	public void setProductFamilyCd(String productFamilyCd) {
		this.productFamilyCd = productFamilyCd;
	}
	public String getPolicyNum() {
		return policyNum;
	}
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}
	public String getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}
	public String getInwardTypeCd() {
		return inwardTypeCd;
	}
	public void setInwardTypeCd(String inwardTypeCd) {
		this.inwardTypeCd = inwardTypeCd;
	}
	public String getInwardSubTypeCd() {
		return inwardSubTypeCd;
	}
	public void setInwardSubTypeCd(String inwardSubTypeCd) {
		this.inwardSubTypeCd = inwardSubTypeCd;
	}
	public int getModalPremium() {
		return modalPremium;
	}
	public void setModalPremium(int modalPremium) {
		this.modalPremium = modalPremium;
	}
	public String getInitialPremium() {
		return initialPremium;
	}
	public void setInitialPremium(String initialPremium) {
		this.initialPremium = initialPremium;
	}
	public String getPpmcFl() {
		return ppmcFl;
	}
	public void setPpmcFl(String ppmcFl) {
		this.ppmcFl = ppmcFl;
	}
	public String getUwFl() {
		return uwFl;
	}
	public void setUwFl(String uwFl) {
		this.uwFl = uwFl;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getPremiumToBeCollected() {
		return premiumToBeCollected;
	}
	public void setPremiumToBeCollected(String premiumToBeCollected) {
		this.premiumToBeCollected = premiumToBeCollected;
	}
	public String getPremiumSuspenseAmount() {
		return premiumSuspenseAmount;
	}
	public void setPremiumSuspenseAmount(String premiumSuspenseAmount) {
		this.premiumSuspenseAmount = premiumSuspenseAmount;
	}
	public int getRenewalYear() {
		return renewalYear;
	}
	public void setRenewalYear(int renewalYear) {
		this.renewalYear = renewalYear;
	}
	public String getTotUWLoadingAmount() {
		return totUWLoadingAmount;
	}
	public void setTotUWLoadingAmount(String totUWLoadingAmount) {
		this.totUWLoadingAmount = totUWLoadingAmount;
	}
	public String getUwLoadingPerc() {
		return uwLoadingPerc;
	}
	public void setUwLoadingPerc(String uwLoadingPerc) {
		this.uwLoadingPerc = uwLoadingPerc;
	}
	public String getTotUWLoadingInclOfTaxes() {
		return totUWLoadingInclOfTaxes;
	}
	public void setTotUWLoadingInclOfTaxes(String totUWLoadingInclOfTaxes) {
		this.totUWLoadingInclOfTaxes = totUWLoadingInclOfTaxes;
	}
	public String getModalServiceTax() {
		return modalServiceTax;
	}
	public void setModalServiceTax(String modalServiceTax) {
		this.modalServiceTax = modalServiceTax;
	}
	public String getModalEduCess() {
		return modalEduCess;
	}
	public void setModalEduCess(String modalEduCess) {
		this.modalEduCess = modalEduCess;
	}
	public String getModalHigherEduCess() {
		return modalHigherEduCess;
	}
	public void setModalHigherEduCess(String modalHigherEduCess) {
		this.modalHigherEduCess = modalHigherEduCess;
	}
	public String getBaseModalPremium() {
		return baseModalPremium;
	}
	public void setBaseModalPremium(String baseModalPremium) {
		this.baseModalPremium = baseModalPremium;
	}
	public String getCummulativeBonusAmt() {
		return cummulativeBonusAmt;
	}
	public void setCummulativeBonusAmt(String cummulativeBonusAmt) {
		this.cummulativeBonusAmt = cummulativeBonusAmt;
	}
	public String getPrevCummulativeBonus() {
		return prevCummulativeBonus;
	}
	public void setPrevCummulativeBonus(String prevCummulativeBonus) {
		this.prevCummulativeBonus = prevCummulativeBonus;
	}
	public String getActualCummulativeBonus() {
		return actualCummulativeBonus;
	}
	public void setActualCummulativeBonus(String actualCummulativeBonus) {
		this.actualCummulativeBonus = actualCummulativeBonus;
	}
	public String getCummulativeBonusPerc() {
		return cummulativeBonusPerc;
	}
	public void setCummulativeBonusPerc(String cummulativeBonusPerc) {
		this.cummulativeBonusPerc = cummulativeBonusPerc;
	}
	public String getTotRenewalLoadingAmount() {
		return totRenewalLoadingAmount;
	}
	public void setTotRenewalLoadingAmount(String totRenewalLoadingAmount) {
		this.totRenewalLoadingAmount = totRenewalLoadingAmount;
	}
	public String getTotRenewalLoadingInclOfTaxes() {
		return totRenewalLoadingInclOfTaxes;
	}
	public void setTotRenewalLoadingInclOfTaxes(String totRenewalLoadingInclOfTaxes) {
		this.totRenewalLoadingInclOfTaxes = totRenewalLoadingInclOfTaxes;
	}
	public String getSezUnit() {
		return sezUnit;
	}
	public void setSezUnit(String sezUnit) {
		this.sezUnit = sezUnit;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public String getStandaloneChild() {
		return standaloneChild;
	}
	public void setStandaloneChild(String standaloneChild) {
		this.standaloneChild = standaloneChild;
	}
	public String getSrNum() {
		return srNum;
	}
	public void setSrNum(String srNum) {
		this.srNum = srNum;
	}
	public String getMigrationFlag() {
		return migrationFlag;
	}
	public void setMigrationFlag(String migrationFlag) {
		this.migrationFlag = migrationFlag;
	}
	public String getGstAvailFlg() {
		return gstAvailFlg;
	}
	public void setGstAvailFlg(String gstAvailFlg) {
		this.gstAvailFlg = gstAvailFlg;
	}
	public String getProductTermUnitCd() {
		return productTermUnitCd;
	}
	public void setProductTermUnitCd(String productTermUnitCd) {
		this.productTermUnitCd = productTermUnitCd;
	}
	public String getUtilizeHMBForPremium() {
		return utilizeHMBForPremium;
	}
	public void setUtilizeHMBForPremium(String utilizeHMBForPremium) {
		this.utilizeHMBForPremium = utilizeHMBForPremium;
	}
	public String getHmbUtilizedTowardPremium() {
		return hmbUtilizedTowardPremium;
	}
	public void setHmbUtilizedTowardPremium(String hmbUtilizedTowardPremium) {
		this.hmbUtilizedTowardPremium = hmbUtilizedTowardPremium;
	}
	public List<QuotationProductDOList> getQuotationProductDOList() {
		return quotationProductDOList;
	}
	public void setQuotationProductDOList(List<QuotationProductDOList> quotationProductDOList) {
		this.quotationProductDOList = quotationProductDOList;
	}
	
	public List<QuotationChargeDOList> getQuotationChargeDOList() {
		return quotationChargeDOList;
	}
	public void setQuotationChargeDOList(List<QuotationChargeDOList> quotationChargeDOList) {
		this.quotationChargeDOList = quotationChargeDOList;
	}
	public String getQuotationChangeDOList() {
		return quotationChangeDOList;
	}
	public void setQuotationChangeDOList(String quotationChangeDOList) {
		this.quotationChangeDOList = quotationChangeDOList;
	}
	public String getTotWellnessRewardPoints() {
		return totWellnessRewardPoints;
	}
	public void setTotWellnessRewardPoints(String totWellnessRewardPoints) {
		this.totWellnessRewardPoints = totWellnessRewardPoints;
	}
	public float getUwLoadingModalPremium() {
		return uwLoadingModalPremium;
	}
	public void setUwLoadingModalPremium(float uwLoadingModalPremium) {
		this.uwLoadingModalPremium = uwLoadingModalPremium;
	}
	public float getUwLoadingModalPremiumInclOfTaxes() {
		return uwLoadingModalPremiumInclOfTaxes;
	}
	public void setUwLoadingModalPremiumInclOfTaxes(float uwLoadingModalPremiumInclOfTaxes) {
		this.uwLoadingModalPremiumInclOfTaxes = uwLoadingModalPremiumInclOfTaxes;
	}
	public String getRenewalLoadingModalAmount() {
		return renewalLoadingModalAmount;
	}
	public void setRenewalLoadingModalAmount(String renewalLoadingModalAmount) {
		this.renewalLoadingModalAmount = renewalLoadingModalAmount;
	}
	public String getRenewalLoadingModalInclOfTaxes() {
		return renewalLoadingModalInclOfTaxes;
	}
	public void setRenewalLoadingModalInclOfTaxes(String renewalLoadingModalInclOfTaxes) {
		this.renewalLoadingModalInclOfTaxes = renewalLoadingModalInclOfTaxes;
	}
	public String getModalLoadingPremium() {
		return modalLoadingPremium;
	}
	public void setModalLoadingPremium(String modalLoadingPremium) {
		this.modalLoadingPremium = modalLoadingPremium;
	}
	public int getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	public String getInitialPayment() {
		return initialPayment;
	}
	public void setInitialPayment(String initialPayment) {
		this.initialPayment = initialPayment;
	}
	public String getMigrationProductId() {
		return migrationProductId;
	}
	public void setMigrationProductId(String migrationProductId) {
		this.migrationProductId = migrationProductId;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getCoverageIllness() {
		return coverageIllness;
	}
	public void setCoverageIllness(String coverageIllness) {
		this.coverageIllness = coverageIllness;
	}
	public String getPedFlag() {
		return pedFlag;
	}
	public void setPedFlag(String pedFlag) {
		this.pedFlag = pedFlag;
	}

	
	
	
	
	
	
	
	
	
	
}
