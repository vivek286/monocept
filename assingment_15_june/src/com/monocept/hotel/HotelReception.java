package com.monocept.hotel;

public class HotelReception {
public void getIndianMenu() {
	IHotel indhotel=new IndianHotels();
	IMenu indmenu=indhotel.getmenu();
	indmenu.displaymenu();
}
public void getItalianMenu() {
	IHotel Italhotel=new ItalianHotels();
	IMenu Italmenu=Italhotel.getmenu();
	Italmenu.displaymenu();
}
}
