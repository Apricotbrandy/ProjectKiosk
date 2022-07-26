package com.kiosk.burgercat;

import java.util.ArrayList;

import com.kiosk.burgercat.data.Drink;
import com.kiosk.burgercat.data.Goods;

public class ProcDrink {
	public void run(ArrayList<Goods> basket) {

		loop:
		while(true) {
			Command cmd = new Command(); 
			String c = cmd.getCommand("메뉴 선택."
					+"[1:코카콜라,2:코카콜라제로,3:스프라이트,4:초코쉐이크,"
					+"5:바닐라쉐이크,6:딸기쉐이크,7:아메리카노,8:카페라떼,9:카푸치노,10:순수(미네랄워터)"
					+"c:취소,b:뒤로] :");
			
			switch(c) {
			case "1":
				System.out.println("코카콜라");
				basket.add(new Drink(1300,"코카콜라","20220807"));
				break;
			case "2":
				System.out.println("코카콜라제로");
				basket.add(new Drink(1300,"코카콜라제로","20220807"));
				break;
			case "3":
				System.out.println("스프라이트");
				basket.add(new Drink(1300,"스프라이트","20220807"));
				break;
			case "4":
				System.out.println("초코쉐이크");
				basket.add(new Drink(2500,"초코쉐이크","20220726"));
				break;
			case "5":
				System.out.println("바닐라쉐이크");
				basket.add(new Drink(2500,"바닐라쉐이크","20220726"));
				break;
			case "6":
				System.out.println("딸기 쉐이크");
				basket.add(new Drink(2500,"딸기쉐이크","20220726"));
				break;
			case "7":
				System.out.println("아메리카노");
				basket.add(new Drink(1700,"아메리카노","20220726"));
				break;
			case "8":
				System.out.println("카페라떼");
				basket.add(new Drink(2000,"카페라떼","20220726"));
				break;
			case "9":
				System.out.println("카푸치노");
				basket.add(new Drink(2000,"카푸치노","20220726"));
				break;
			case "10":
				System.out.println("순수(미네랄워터)");
				basket.add(new Drink(1000,"순수(미네랄워터)","20220807"));
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
