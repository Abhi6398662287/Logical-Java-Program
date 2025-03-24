package com.jtc.p1;

import java.util.Arrays;
import java.util.Scanner;

public class sortCharByTakeString {
	public static void main(String arg[]) {
		System.out.println("Enter The String a");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c1[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		c1[i]=s.charAt(i);
		
	}
	System.out.println(Arrays.toString(c1));
		
	}

}
