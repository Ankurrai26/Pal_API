package pojoClassDeserialization;

import java.util.List;

public class GetQuoteResponce {

	private List<ErrorList> errorList;
	private String authenticationTO;
	private String userDO;
	private List<ListofquotationTO> listofquotationTO;
	
	public List<ErrorList> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ErrorList> errorList) {
		this.errorList = errorList;
	}
	public String getAuthenticationTO() {
		return authenticationTO;
	}
	public void setAuthenticationTO(String authenticationTO) {
		this.authenticationTO = authenticationTO;
	}
	public String getUserDO() {
		return userDO;
	}
	public void setUserDO(String userDO) {
		this.userDO = userDO;
	}
	public List<ListofquotationTO> getListofquotationTO() {
		return listofquotationTO;
	}
	public void setListofquotationTO(List<ListofquotationTO> listofquotationTO) {
		this.listofquotationTO = listofquotationTO;
	}
	
	
	
}
