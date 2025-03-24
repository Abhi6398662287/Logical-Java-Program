package com.jtc.p1;

import java.util.Arrays;
import java.util.Scanner;

public class MyStack {
	public static void main(String arg[]) {
		System.out.println("Enter The PLease Giving size Of Stack");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StackM s = new StackM(n);
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Element For Insert in Stack ");
			int n1=sc.nextInt();
			s.push(n1);
		}
		System.out.println(s.isEmpty());
		System.out.println(s.toString());
		System.out.println(s.pop());
		System.out.println(s.toString());
		System.out.println(s.peek());

	}

}

class StackM {
	private int maxSize;
	private long[] stackA;
	private int top;

	public StackM(int s) {
		maxSize = s;
		stackA = new long[maxSize];
		top = -1;

	}

	public void push(long j) {
		stackA[++top] = j;
	}

	public long pop() {
	//	stackA[top--] = -1;
		
		return stackA[top--];
	}

	public long peek() {
		return stackA[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	@Override
	public String toString() {
		return "StackM [maxSize=" + maxSize + ", stackA=" + Arrays.toString(stackA) + ", top=" + top + "]";
	}

}
