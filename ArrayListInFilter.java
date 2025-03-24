package com.jtc.p1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInFilter {
	public static void main(String arg[]) {
		ArrayList list = new ArrayList();
		list.add("Abhishek");
		list.add(12);
		list.add('a');
		list.add("Raju");
		list.add("vivek");
		list.add(12.22f);
		list.add(23);
		list.add(67);
		list.add(90);

		int count = 0;
		for (Object o : list) {
			if (o instanceof Integer) {
				count++;

			}

		}
		int arr[] = new int[count];
		int i = 0;
		for (Object o1 : list) {
			if (o1 instanceof Integer) {
				arr[i] = (int) o1;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
