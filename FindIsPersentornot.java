package com.jtc.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class FindIsPersentornot {
	public static void main(String arg[]) {
		System.out.println("Enter The Line Of Integer for Create A line ");
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("How Many Element in  your Line  ");
			int d = sc.nextInt();
			ArrayList<Integer> line = new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				System.out.println("PLease Enter New Elements");
				int num = sc.nextInt();
				line.add(num);
			}
			lines.add(line);
		}
		System.out.println("For Find Queries in Your ArrayList");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Your Query :-"+q+"Which line PLease Enter");
			int x = sc.nextInt();
			System.out.println("Which Position The Elements PLease Enter");
			int y = sc.nextInt();
			if (x > 0 && x <= lines.size()) {
				ArrayList<Integer> list = lines.get(x - 1);
				if (y > 0 && y <= list.size()) {
					System.out.println("Aapne ye Store kiya Tha"+list.get(y - 1));
				} else {
					System.out.println("Not Present The Element");
				}
			} else {
				System.out.println("Not Present The Line ");
			}
		}
		sc.close();

	}
}
