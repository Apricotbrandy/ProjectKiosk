package com.kiosk.catburger;

import java.util.ArrayList;

public class Kiosk {
	ArrayList<String> basket = new ArrayList<>();
	
	public void run() {
		Command cmd = new Command();
		String c = cmd.getCommand("명령어를 입력하세요 [burger],[side],[drink],[dessert]");
		System.out.println(c);
		
		switch (c) {
		case "burger":
			System.out.println("[burger]");
			ProcBurger pb = new ProcBurger();
			pb.run(basket);
			break;
		case "side":
			System.out.println("[side]");
			break;
		case "drink":
			System.out.println("[drink]");
			break;
		case "dessert":
			System.out.println("[dessert]");
			break;
		}
		System.out.println("basket: "+basket.get(0) );
	}
}
