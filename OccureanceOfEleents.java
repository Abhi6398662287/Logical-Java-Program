

package com.jtc.p1;

import java.util.HashMap;
import java.util.Map;

public class OccureanceOfEleents {
	public static void main(String arg[]) {
		int arr[]= {1,2,2,3,2,1,2,32,1,3,3,32,3};
		HashMap<Integer,Integer> hm=new HashMap();
		
		for(int a:arr) {
			hm.put(a, hm.getOrDefault(a,0)+1);
			
		}
	  for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
		  System.out.println("Elements :"+entry.getKey()+"  Occurance Time "+entry.getValue());
		  
	  }
	}

}
