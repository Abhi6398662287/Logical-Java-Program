package com.jtc.p1;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateChar {
	public static void main(String arg[]) {
		System.out.println("Enter The String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		Arrays.sort(c);
		int count=0;
		char c1=c[0];
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1]) {
				count++;
				if(count==2) {
					c1=c[i];
					break;
				}
			}
			
		}
		
		System.out.println("Second Time Duplicaet "+c1);
		
	}
	

}
