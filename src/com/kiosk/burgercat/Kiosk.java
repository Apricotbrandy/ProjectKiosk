package com.kiosk.burgercat;

import java.util.ArrayList;

import com.kiosk.burgercat.data.Food;
import com.kiosk.burgercat.data.Goods;

public class Kiosk {
	ArrayList<Goods> basket = new ArrayList<>();
	
	public void run() {
		loop:
		while(true) {
			Command cmd = new Command();
			String c = cmd.getCommand("select menu "
					+ "1:[burger],2:[side],3:[drink],4:[dessert]");
			
			switch (c) {
			case "1":
				System.out.println("[burger]");
				ProcBurger pb = new ProcBurger();
				pb.run(basket);
				break;
			case "2":
				System.out.println("[side]");
				ProcSide ps = new ProcSide();
				ps.run(basket);
				break;
			case "3":
				System.out.println("[drink]");
				ProcDrink pd = new ProcDrink();
				pd.run(basket);
				break;
			case "4":
				System.out.println("[dessert]");
				ProcDessert pds = new ProcDessert();
				pds.run(basket);
				break;
			case "p":
				System.out.println("[Pay]");
				//장바구니 확인
				System.out.println("basket: ");
				for(int i=0; i<basket.size(); i++) {
					System.out.println(basket.get(i).name+"유통기한: "+((Food)basket.get(i)).expiryDate +"까지");
				}
//				for(Goods g:basket) {
//					System.out.println(g.name+" ");
//				}
				//계산
				int sum = 0;
				for(int i=0; i<basket.size(); i++) {
					sum += basket.get(i).price;
				}
//				for(Goods g:basket) {
//					sum += g.price;
//				}
				System.out.println("Receipt: "+sum);
				break loop;
			case "e":
				System.out.println("[Exit]");
				break loop;
			}
		}
	}
}
