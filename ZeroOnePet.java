package com.jtc.p1;

public class ZeroOnePet {
	public static void main(String arg[]) {
		int n=5,i,j;
		for( i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print((i+j)%2);
			}
			System.out.print("\n");
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print((i*j)%2);
			}
			System.out.println();
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(j%2);
			}
			System.out.print("\n");
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(i%2);
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print((1+i+j)%2);
			}
			System.out.println();
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print((1+i)%2);
			}
			System.out.print("\n");
		}
	}

}
