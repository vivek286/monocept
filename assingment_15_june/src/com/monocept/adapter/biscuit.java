package com.monocept.adapter;

public class biscuit implements items {
private String name;
private double mrp;
public biscuit(String name, double mrp) {
	super();
	this.name = name;
	this.mrp = mrp;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMrp() {
	return mrp;
}

public void setMrp(double mrp) {
	this.mrp = mrp;
}

public String getname() {
	return name;
}
public double itemprice() {
	return mrp;
}
}
