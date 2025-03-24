package com.jtc.p2;

interface Hello {
	public int Test(int a, String b);
}

public class StaticMethodRefernce {
	public static void main(String arg[]) {
		Hello he = (a1, a2) -> {
			System.out.println("Ram :Krishna");
			return 1;
		};
		int k = he.Test(90, "Abhishek");
		System.out.println(k);
		System.out.println("==================");
		Hello hello = StaticMethodRefernce::find;
		int a = hello.Test(10, "Shubham");
		System.out.println(a); 
	}

	public static int find(int a, String c) {
		System.out.println("Ram : Krishna");
		return 12;
	}
}
