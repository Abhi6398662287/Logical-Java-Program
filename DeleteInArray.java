package com.jtc.p1;

import java.util.Scanner;

public class DeleteInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int n = arr.length;

		System.out.print("Enter index to delete (0 to " + (n - 1) + "): ");
		int index = sc.nextInt();

		if (index < 0 || index >= n) {
			System.out.println("Invalid Index!");
		} else {

			arr[index] = -1;

			System.out.print("Updated Array: ");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
