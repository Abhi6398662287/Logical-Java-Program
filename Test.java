package com.jtc.p1;
class A{
	final static int c1=12;
	int a=19,b=10;

	static int c=12;
	{
		System.out.println(c1);
		System.out.println(a+" "+b);
		System.out.println("It Is Instance Block");
	}
	static {
		System.out.println("Static Bloack");
		System.out.println(c1);
//		System.out.println(a);
		
		
	}
public static void m2() {
	System.out.println("Hello M2");
}
}
public class Test {
	public static void main(String arg[]) {
		System.out.println("Main Method  in Java ");
		A a=new A ();
		System.out.println(A.c1);
		
		//A.m2();
	//	int a=23;
		//System.out.println(""+Math.sqrt(a));
		
	}

}
