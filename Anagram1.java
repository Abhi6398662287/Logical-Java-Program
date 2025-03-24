package com.jtc.p2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
	public static void main(String arg[]) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean t=isAnagram(a,b);
	if(t) {
		System.out.println("It Is Anagram");
	}else {
		System.out.println("Not Anagram");
	}
		
	}
	public static boolean isAnagram(String s,String s1) {
		if(s.length()!=s1.length()) return false;
		char c[]=s.toLowerCase().toCharArray();
		char c1[]=s1.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		return Arrays.equals(c, c1);
		
	}

}
