package com.monocept.hotel;

public class IndianHotels implements IHotel {

	public IMenu getmenu() {
		return new IndianMenu();
	}
}
