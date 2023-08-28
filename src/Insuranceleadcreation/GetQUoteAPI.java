package Insuranceleadcreation;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GetQUoteAPI{
	
	@Test(dataProviderClass = DataProviderQuote.class, dataProvider = "QuoteIDTestdata")
	public void GetQuoteAPI1(String productId,String productPlanOptionCd) {
		
			RestAssured.baseURI = "https://computequoteapi-3scale-apicast-staging.uatwebservices.manipalcigna.com";
			
		String GetquoteResponce = 	given().header("app_id","240f9d2c").header("app_key","12345").header("Content-Type","application/json").body(Payload.GetQuote(productId,productPlanOptionCd))
			.when().post("/v1/rest/api/cigna/QuoteCompute")
			.then().assertThat().statusCode(200).extract().response().asString();
			
		
		System.out.println(".......................................");
		JsonPath js = new JsonPath(GetquoteResponce);
		
		String errorList = js.get("errorList[0].exceptionCatgCd");
		//System.out.println(errorList);
		
		  if(errorList != null) {
			  
			  String exceptionCd = js.get("errorList[0].exceptionCd"); String errDescription =
			  js.get("errorList[0].errDescription"); System.out.println(errDescription); }
			 
			  else {
			  
			  String QuoteID = js.get("listofquotationTO[0].quoteId");
			  String TotalPremium = js.get("listofquotationTO[0].totPremium").toString();
			  String basePremium = js.get("listofquotationTO[0].quotationProductDOList[0].basePremium").toString();
			  String GSTAmount = js.get("listofquotationTO[0].quotationChargeDOList[0].chargeAmount").toString();
			  
			  System.out.println("QuoateID: " + QuoteID + " totPremium: " + TotalPremium +" basePremium: " + basePremium + "GSTAmount: " + GSTAmount );
			  
			  
		}
		
		
	}
	
	
	
	
}

