package com.monocept.hotel;

public class ItalianHotels implements IHotel {

	public IMenu getmenu() {
		return new ItalianMenu();
	}
}
