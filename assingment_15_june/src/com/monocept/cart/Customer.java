package com.monocept.cart;

import java.util.List;

public class Customer {
private int id;
private String name;
private List<order>orders;
private double total_price=0.0;
public Customer(int id, String name, List<order> orders) {
	super();
	this.id = id;
	this.name = name;
	this.orders = orders;
}
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
public List<order> getOrders() {
	return orders;
}
public void setOrders(List<order> orders) {
	this.orders = orders;
}
public double totalprice() {
	
	orders.forEach(ord->total_price+=ord.orderprice());
	return total_price;
}
}
