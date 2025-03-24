package com.jtc.p1;

public class PrimeNumber {
	public static void main(String arg[]) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is prime");
		}else {
			System.out.println(" no");
		}
	}

}
