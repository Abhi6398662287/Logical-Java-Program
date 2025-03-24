package com.jtc.p1;

import java.util.Scanner;

public class HCFfromJava {
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int a=sc.nextInt();
	int c=0;
	System.out.println("Enter The Second Number");
	int b=sc.nextInt();
for(int i=a;i>=1;i--) {
	if(a%i==0) {
		if(b%i==0) {
			c=i;
			break;
		}
	}
}
System.out.println(c);
}
}
