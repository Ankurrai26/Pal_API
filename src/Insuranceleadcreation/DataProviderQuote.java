package Insuranceleadcreation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderQuote {

	@DataProvider(name = "QuoteIDTestdata")
	public Object[][] QuoteIDTestdata(){
		
		
	return	new Object[][] {{"SSLT03SBSF","IN-SLT5-HD5"},
		                   {"SSLT03SBSF","IN-SLT10-HD5"},
		                   {"SSLT03SBSF","IN-SLT15-HD5"},
		                   {"SSLT03SBSF","IN-SLT20-HD5"},
		                   {"SSLT03SBSF","IN-SLT30-HD5"}};
		
		
	}

	
	
	
	}



