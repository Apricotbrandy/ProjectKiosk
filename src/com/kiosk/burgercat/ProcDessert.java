package com.kiosk.burgercat;

import java.util.ArrayList;

import com.kiosk.burgercat.data.Dessert;
import com.kiosk.burgercat.data.Goods;

public class ProcDessert {
	public void run(ArrayList<Goods> basket) {

		loop:
		while(true) {
			Command cmd = new Command(); 
			String c = cmd.getCommand("menu choice"
					+"1:사과파이,2:아이스크림,3:맥플러리,4:아포가토"
					+",c:취소,b:뒤로] :");
			
			switch(c) {
			case "1":
				System.out.println("사과파이");
				basket.add(new Dessert(1200,"사과파이","20220726"));
				break;
			case "2":
				System.out.println("아이스크림");
				basket.add(new Dessert(1000,"아이스크림","20220726"));
				break;
			case "3":
				System.out.println("맥플러리");
				basket.add(new Dessert(2500,"맥플러리","20220726"));
				break;
			case "4":
				System.out.println("아포가토");
				basket.add(new Dessert(3000,"아포가토","20220726"));
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
