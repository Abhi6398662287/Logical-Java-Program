package com.jtc.p1;

import java.util.Arrays;
import java.util.HashMap;

public class UccuranceOfChar {
	public static void main(String arg[]) {
		String s1="IndEpenDeNce";
		char c[]=s1.toCharArray();
		HashMap map=new HashMap();
		System.out.println(Arrays.toString(c));
		char c2[]=new char[c.length];
		
		/*
		 * for(char c1:c) { map.put(c1,map.getOrDefault(c1, 0)+1);
		 * 
		 * }
		 */
		for(char c1:c) {
		if(map.containsKey(c1)) {
		map.put(c1, (int)map.get(c1)+1);
			
		}else {
			map.put(c1, 1);
		}
		}
		System.out.println(map);
		
	}


}
