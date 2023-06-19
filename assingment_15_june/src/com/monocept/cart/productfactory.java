package com.monocept.cart;

import java.util.ArrayList;
import java.util.List;

public class productfactory {
public static List<product> getproduct(){
	List<product>products=new ArrayList<>();
	product p1=new product(1,"p1",10.0,2);
	product p2=new product(2,"p2",100.0,30);
	product p3=new product(3,"p3",1000.0,22);
	product p4=new product(4,"p4",1220.0,40);
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	products.forEach(prod->System.out.println(prod));
	return products;
	
}
}
