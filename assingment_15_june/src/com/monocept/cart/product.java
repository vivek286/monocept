package com.monocept.cart;

public class product {
private int id;
private String name;
private double price;
private double discountper;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscountper() {
	return discountper;
}
public void setDiscountper(double discountper) {
	this.discountper = discountper;
}
public product(int id, String name, double price, double discountper) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.discountper = discountper;
}
public double getdiscountedprice() {
	double netprice=price-(discountper*price/100);
	return price;
}
@Override
public String toString() {
	return "product id=" + id + ", name=" + name + ", price=" + price + ", discountper=" + discountper ;
}


}
