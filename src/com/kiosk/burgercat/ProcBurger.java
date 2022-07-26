package com.kiosk.burgercat;

import java.util.ArrayList;

import com.kiosk.burgercat.data.Burger;
import com.kiosk.burgercat.data.Goods;

public class ProcBurger {
	public void run(ArrayList<Goods> basket) {
		loop:
		while (true) {
			//버거 메뉴 처리
			Command cmd = new Command();
			String c = cmd.getCommand(
					"메뉴 선택 1:[치즈버거],2:[불고기버거],3:[맥치킨]");
			
			switch (c) {
			case "1":
				System.out.println("치즈버거");
				basket.add(new Burger(2300,"치즈버거","20220726"));
				break;
			case "2":
				System.out.println("불고기버거");
				basket.add(new Burger(2300,"불고기버거","20220726"));
				break;
			case "3":
				System.out.println("맥치킨");
				basket.add(new Burger(3300,"맥치킨","20220726"));
				break;
			case "c":
				System.out.println("취소");
				break loop;
			case "b":
				System.out.println("뒤로");
				break loop;
			}
		}
	}
}
