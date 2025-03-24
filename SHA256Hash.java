package com.jtc.p1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Hash {
    public static String getSHA256Hash(String input) {
        try {
           
            MessageDigest md = MessageDigest.getInstance("SHA-256");

           
            byte[] hashBytes = md.digest(input.getBytes());

          
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found!", e);
        }
    }
    public static String getSHA256HashDe(String output) {
    	try {
    		 MessageDigest md = MessageDigest.getInstance("SHA-256");
    		 byte[] dht=md.digest(output.getBytes());
    		 StringBuilder shA=new StringBuilder();
    		 
    		 for(byte b1:dht) {
    			 shA.append(String.format("%02x",b1));
    			 
    		 }
    		 return dht.toString();
    		 
    	}catch(Exception e) {
    		throw new RuntimeException("Okok");
    	}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
String enc=getSHA256Hash(input);
        
        System.out.println(enc);
        String dec=getSHA256HashDe(enc);
        System.out.println(dec);
    }
}
