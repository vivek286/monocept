package com.monocept.cart;

public class LineItem {
private int id;
private int quantity;
private product produc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public product getProduc() {
	return produc;
}
public void setProduc(product produc) {
	this.produc = produc;
}
public LineItem(int id, int quantity, product produc) {
	super();
	this.id = id;
	this.quantity = quantity;
	this.produc = produc;
}
public double lineitemcost() {
	double netprice=quantity*produc.getdiscountedprice();
	return netprice;
}
}
