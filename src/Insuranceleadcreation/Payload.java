package Insuranceleadcreation;
import org.testng.annotations.Test;

public class Payload {

	
	@Test
	public static String GetQuote(String productId, String productPlanOptionCd) {
		
		String Getquote = "{\r\n"
				+ "\r\n"
				+ "    \"listofquotationTO\": [\r\n"
				+ "\r\n"
				+ "        {\r\n"
				+ "\r\n"
				+ "            \"channelId\": \"350\",\r\n"
				+ "\r\n"
				+ "            \"productId\": \""+productId+"\",\r\n"
				+ "\r\n"
				+ "            \"parentProductVersion\": 1,\r\n"
				+ "\r\n"
				+ "            \"noOfAdults\": 2,\r\n"
				+ "\r\n"
				+ "            \"noOfKids\": 0,\r\n"
				+ "\r\n"
				+ "            \"tenure\": 1,\r\n"
				+ "\r\n"
				+ "            \"productPlanOptionCd\": \""+productPlanOptionCd+"\",\r\n"
				+ "\r\n"
				+ "            \"policyType\": \"INDIVIDUAL\",\r\n"
				+ "\r\n"
				+ "            \"saveFl\": \"YES\",\r\n"
				+ "\r\n"
				+ "            \"quoteTypeCd\": \"PORTAL\",\r\n"
				+ "\r\n"
				+ "            \"quotationDt\": \"16/08/2023\",\r\n"
				+ "\r\n"
				+ "            \"agentId\": \"1607647-01\",\r\n"
				+ "\r\n"
				+ "            \"campaignCd\": null,\r\n"
				+ "\r\n"
				+ "            \"inwardTypeCd\": \"NEWBUSINESS\",\r\n"
				+ "\r\n"
				+ "            \"inwardSubTypeCd\": \"PROPOSALDOCUMENT\",\r\n"
				+ "\r\n"
				+ "            \"quotationProductDOList\": [\r\n"
				+ "\r\n"
				+ "                {\r\n"
				+ "\r\n"
				+ "                    \"productId\": \""+productId+"\",\r\n"
				+ "\r\n"
				+ "                    \"productVersion\": 1,\r\n"
				+ "\r\n"
				+ "                    \"productPlanOptionCd\": \""+productPlanOptionCd+"\",\r\n"
				+ "\r\n"
				+ "                    \"zoneCd\": \"ZONE1\",\r\n"
				+ "\r\n"
				+ "                    \"sumInsured\": null,\r\n"
				+ "\r\n"
				+ "                    \"productTypeCd\": \"SUBPLAN\",\r\n"
				+ "\r\n"
				+ "                    \"paymentFrequencyCd\": \"SINGLE\",\r\n"
				+ "\r\n"
				+ "                    \"quotationProductInsuredDOList\": [\r\n"
				+ "\r\n"
				+ "                        {\r\n"
				+ "\r\n"
				+ "                            \"issueAge\": 30,\r\n"
				+ "\r\n"
				+ "                            \"genderCd\": \"MALE\",\r\n"
				+ "\r\n"
				+ "                            \"insuredTypeCd\": \"PRIMARY\",\r\n"
				+ "\r\n"
				+ "                            \"cityCd\": \"MUMBAI\",\r\n"
				+ "\r\n"
				+ "                            \"mobileNum\": 9999999900,\r\n"
				+ "\r\n"
				+ "                            \"emailAddress\": \"abc@gmail.com\",\r\n"
				+ "\r\n"
				+ "                            \"dob\": \"08/05/1993\",\r\n"
				+ "\r\n"
				+ "                            \"zoneCd\": \"ZONE1\",\r\n"
				+ "\r\n"
				+ "                            \"relationCd\": \"SELF\",\r\n"
				+ "\r\n"
				+ "                            \"productPlanOptionCd\": \""+productPlanOptionCd+"\",\r\n"
				+ "\r\n"
				+ "                            \"sumInsured\": 500000,\r\n"
				+ "\r\n"
				+ "                            \"refGuid\": \"adult1\"\r\n"
				+ "\r\n"
				+ "                        }\r\n"
				+ "\r\n"
				+ "                    ],\r\n"
				+ "\r\n"
				+ "                    \"quotationProductAddOnDOList\": []\r\n"
				+ "\r\n"
				+ "                }\r\n"
				+ "\r\n"
				+ "            ]\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "    ]\r\n"
				+ "\r\n"
				+ "}";
		
		return Getquote;
		
		
		
	}
	
	
	
}