package com.jtc.p2;

import java.util.List;

public class Jtc1 {
    public static void main(String[] args) {
        // Create an immutable list
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        // Print the list
        System.out.println(fruits);
        int a[]=new int[5];
        System.out.println(a.length);
        System.out.println(a);

        // Trying to modify the list (will throw UnsupportedOperationException)
        // fruits.add("Orange"); // This will throw an exception
        System.out.println("______________________");
        for(int i=0;i<=5;i++) {
        	if(true) {
        		System.out.println("Hi");
        	}
        	if (true) {
        		System.out.println("Shubham");
        	}
        }
    }
}
