package com.kiosk.burgercat.data;

public class Food extends Goods{
	public String expiryDate;
	public Food(int price, String name, String date) {
		super(price, name);
		this.expiryDate = date;
	}
}
