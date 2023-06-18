package com.monocept.account;

public class AccountException extends RuntimeException {
	String Exceptiontypename="";
public AccountException(String Exceptioncase) {
	
		this.Exceptiontypename=Exceptioncase;
	
	
}
public String getMessage() {
	if(Exceptiontypename.equals("BalanceInsufficient"))
	return "Balance is in insufficeint";
	if(Exceptiontypename.equals("MinimumAmountLimit"))
		return "Minimum amount left should be 5000 after withdraw";
	
	
	
	
	
	return "No excaption";
}
}
