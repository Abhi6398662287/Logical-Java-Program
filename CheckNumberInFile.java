package com.jtc.p1;

import java.io.*;
import java.util.TreeSet;

public class CheckNumberInFile {
	public static void main(String[] args) {
		String filePath = "src/com/jtc/p1/Bharat.txt";
		TreeSet<Long> treeSet = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				try {
					long num = Long.parseLong(line.trim());
					treeSet.add(num);
				} catch (NumberFormatException e) {
					System.out.println("Invalid Number Found: " + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number to check: ");
		try {
			long searchNumber = Long.parseLong(reader.readLine().trim());

			if (treeSet.contains(searchNumber)) {
				System.out.println("Number " + searchNumber + " is present in the file.");
			} else {
				System.out.println("Number " + searchNumber + " is NOT present in the file.");
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Invalid input.");
		}
	}
}
