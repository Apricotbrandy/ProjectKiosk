package com.kiosk.catburger;

import java.util.ArrayList;

public class ProcBurger {
	public void run(ArrayList<String> basket) {
		//버거 메뉴 처리
		Command cmd = new Command();
		String c = cmd.getCommand(
				"명령 입력 [cheese],[bulgogi],[chicken]");
		
		switch (c) {
		case "cheese":
			System.out.println("Cheese burger");
			basket.add("Cheese burger");
			break;
		case "bulgogi":
			System.out.println("Bulgogi burger");
			break;
		case "chicken":
			System.out.println("Chicken burger");
			break;
		}
	}
}
