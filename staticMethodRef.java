package com.jtc.p2;

import java.util.Scanner;

interface Hai {
	public int test(int a, int b);

}

class MyInteger {
	public static int findsum(int a, int b) {
		System.out.println("Add Two Number");
		return a + b;

	}

	public static int Mul(int a, int b) {
		System.out.println("Multiply Two Numbers");
		return a * b;
	}

	public static int dif(int a, int b) {
		System.out.println("Difference Of Two Numbers");
		return a - b;
	}
}

public class staticMethodRef {
	public static void main(String arg[]) {
		Hai h1 = MyInteger::findsum;
		Scanner sc = new Scanner(System.in);
		System.out.println("For Add Two Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = h1.test(a, b);

		System.out.println(sum);

		Hai h2 = MyInteger::Mul;
		System.out.println("Multiple two Number");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int mul = h2.test(a1, b1);
		System.out.println(mul);
		Hai h3 = MyInteger::dif;
		System.out.println("Difference of Two Number");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int diff = h3.test(a2, b2);
		System.out.println(diff);
		sc.close();
	}

}
