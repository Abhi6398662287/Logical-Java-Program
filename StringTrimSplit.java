package com.jtc.p1;

import java.util.Scanner;

public class StringTrimSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        // Split using regex to remove non-alphabetic characters
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Handle empty input case
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
