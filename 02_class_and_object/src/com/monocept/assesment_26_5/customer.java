package com.monocept.assesment_26_5;

public class customer {
private int cid;
private String name;
private String email;
private String password;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public customer(int cid, String name, String email, String password) {
	
	this.cid = cid;
	this.name = name;
	this.email = email;
	this.password = password;
}
public String toString() {
	return "Customer name: "+this.name+"\n"+"Email: "+this.email+"\n";
}
public customer() {
	// TODO Auto-generated constructor stub
}
public void sorting() {
	// TODO Auto-generated method stub
	
}
}
