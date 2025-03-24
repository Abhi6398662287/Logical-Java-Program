package com.jtc.p1;

import java.util.HashMap;

public class OccureanceTheValue {
	public static void main(String arh[]) {
		int ar[] = { 1, 1, 2, 3, 3, 2, 4, 2, 4, 2, 4, 24, 2 };
        HashMap<Integer,Integer> hm = new HashMap();
		 for (int num : ar) {
			 System.out.println(hm.get(num));
	            if (hm.containsKey(num)) {
	               
	                hm.put(num,hm.get(num) + 1);
	            } else {
	                
	                hm.put(num, 1);
	            }
	        }
		 System.out.println(hm);
	}
}
