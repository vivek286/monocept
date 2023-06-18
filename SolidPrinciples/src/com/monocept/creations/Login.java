package com.monocept.creations;

public class Login {
private static Login login;
private Login() {
	
}
public static Login getlogin() {
	if(login==null)
		login=new Login();
	return login;
}
}
