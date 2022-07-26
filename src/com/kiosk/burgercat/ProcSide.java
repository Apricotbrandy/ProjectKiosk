package com.kiosk.burgercat;

import java.util.ArrayList;

import com.kiosk.burgercat.data.Goods;
import com.kiosk.burgercat.data.Side;

public class ProcSide {
	public void run(ArrayList<Goods> basket) {

		loop:
		while(true) {
			Command cmd = new Command(); 
			String c = cmd.getCommand("메뉴 선택."
					+"[1:스낵랩,2:치즈스틱 4개,3:치킨 너겟 10조각,4:치킨텐더,"
					+"5:해쉬브라운,6:디핑소스,"
					+"c:취소,b:뒤로 ]:");
			
			switch(c) {
			case "1":
				System.out.println("스낵랩");
				basket.add(new Side(2000,"스낵랩","20220726"));
				break;
			case "2":
				System.out.println("치즈스틱 4개");
				basket.add(new Side(4000,"치즈스틱 4개","20220726"));
				break;
			case "3":
				System.out.println("치킨 너겟 10조각");
				basket.add(new Side(4500,"치킨 너겟 10조각","20220726"));
				break;
			case "4":
				System.out.println("치킨 텐더");
				basket.add(new Side(5000,"치킨텐더","20220726"));
				break;
			case "5":
				System.out.println("해쉬브라운");
				basket.add(new Side(1000,"해쉬브라운","20220726"));
				break;
			case "6":
				System.out.println("디핑소스");
				basket.add(new Side(300,"디핑소스","20220726"));
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
