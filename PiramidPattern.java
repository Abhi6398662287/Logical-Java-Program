package com.jtc.p1;

import java.util.Scanner;

public class PiramidPattern {
	public static void main(String arg[]) {
		// System.out.println("Enter The Number For Piramid");
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_______________");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		System.out.println("_____________________");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_________________");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
