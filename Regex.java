package com.jtc.p1;

import java.util.Scanner;

class Regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			System.out.println("Enter the ip Address");
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}
}

class MyRegex {
	String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}
