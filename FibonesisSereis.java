package com.jtc.p1;

import java.util.Scanner;

public class FibonesisSereis {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++) {
			temp=temp*i;
			
		}
		System.out.println(temp);
		
			}


}
