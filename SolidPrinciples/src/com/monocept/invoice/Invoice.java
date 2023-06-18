package com.monocept.invoice;

public class Invoice {
private int invoiceid;
private int amount;
private int tax;
private String name;
public Invoice(int invoiceid, int amount, String name) {
	super();
	this.invoiceid = invoiceid;
	this.amount = amount;
	this.name = name;
	
}

public int getInvoiceid() {
	return invoiceid;
}
public void setInvoiceid(int invoiceid) {
	this.invoiceid = invoiceid;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}










}
