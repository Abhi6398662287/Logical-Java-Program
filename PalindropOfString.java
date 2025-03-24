package com.jtc.p2;

import java.util.Scanner;

public class PalindropOfString {
	public static void main(String arg[]) {
		System.out.println("Enter The String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	String reverse=new  StringBuilder(s).reverse().toString();
	if(s.equals(reverse)) {
		System.out.println("Palindrom");
	}
	else {
		System.out.println("not");
	}
	}

}
