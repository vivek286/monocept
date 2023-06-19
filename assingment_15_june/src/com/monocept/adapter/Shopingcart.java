package com.monocept.adapter;

import java.util.ArrayList;
import java.util.List;

public class Shopingcart {
private List<items>cartlist;
private double totalprice;
public Shopingcart() {
	super();
	this.cartlist = new ArrayList<>();
}

public List<items> getCartlist() {
	return cartlist;
}

public void setCartlist(List<items> cartlist) {
	this.cartlist = cartlist;
}
public void additem(items it) {
	cartlist.add(it);
}
public List<items> getlist(){
	return cartlist;
}
public double getcartprice() {
	cartlist.forEach(item->totalprice+=item.itemprice());
	return totalprice;
}
}
