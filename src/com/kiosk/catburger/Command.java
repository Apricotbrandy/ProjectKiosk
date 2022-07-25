package com.kiosk.catburger;

import java.util.Scanner;

public class Command {
	public Scanner sc = new Scanner(System.in);
	
	public String getCommand(String guide) {
		
		System.out.println(guide);
		String cmd = sc.next();
		return cmd;
	}
}

