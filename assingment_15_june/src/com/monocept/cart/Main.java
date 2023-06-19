package com.monocept.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Customer customer=new Customer(01,"vivek",new ArrayList<order>());
		
		
		shoping(customer,1);
		
		System.out.println(customer.getOrders().toString());
		System.out.println(customer.totalprice());
		
	}

	public static void shoping(Customer customer,int orderid) {
		
		List<LineItem> items=getLineItems();
		order ord=new order(orderid,"23/2/10",items);
		 List<order>orders=customer.getOrders();
		 orders.add(ord);
		 customer.setOrders(orders);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("to continue Shopping 1 else 0");
		int option=scanner.nextInt();
		if(option==1) {
			 shoping(customer,orderid+1);
		}
		
		
		
		
	}

	public static List<LineItem> getLineItems() {
		List<product>products=productfactory.getproduct();
		Scanner scanner=new Scanner(System.in);
		System.out.println("To end shoping enter 0 \nEnter product id: ");
		int id=-1;
		List<LineItem>item=new ArrayList<>();
		while(id!=0) {
			
			System.out.println("Enter id for product :");
			 id=scanner.nextInt();
			 if(id==0)break;
			System.out.println("Enter quantity for product "+id+" :");
			int quant=scanner.nextInt();
			LineItem l1=new LineItem(id,quant,products.get(id-1));
			item.add(l1);
			
		}
		
		return item;
	}
}
