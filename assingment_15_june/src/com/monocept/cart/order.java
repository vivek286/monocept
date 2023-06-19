package com.monocept.cart;

import java.util.List;

public class order {
private int id;
private String date;
private List<LineItem> items;
private double netprice=0.0;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public List<LineItem> getItems() {
	return items;
}
public void setItems(List<LineItem> items) {
	this.items = items;
}
public order(int id, String date, List<LineItem> items) {
	super();
	this.id = id;
	this.date = date;
	this.items = items;
}

public double orderprice() {
	
	items.forEach(item->netprice+=item.lineitemcost());
	return netprice;
}

}
