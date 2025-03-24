package com.jtc.p1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMergeConcat {
	public static void main(String arg[]) {
		int a[]= {1,2,3,4,4};
		int[] b= {5,6,8,6,5,5,5};
		int []c= {34,34,45,23};
		int e[]= {2,3,23,23};
		int d[]=IntStream.concat(
				IntStream.concat(
						IntStream.concat(Arrays.stream(a), Arrays.stream(b))
						,Arrays.stream(c))
				,Arrays.stream(e))
				.toArray();
		System.out.println(Arrays.toString(d));
		
		
	}

	

}
