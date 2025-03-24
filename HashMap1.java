package com.jtc.p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
	public static void main(String arg[]) {
		HashMap hm = new HashMap();
		hm.put("abhi", "Abhishek");
		hm.put(12, "Guddu Chaudhary");
		hm.put("age", 23);
		hm.put("Subject", "English");
		System.out.println(hm);
		System.out.println("Access The Key Only");
		Set set = hm.keySet();
		System.out.println(set);
		System.out.println("Entry Set() method Uuing For print \n\n");
		Set set1 = hm.entrySet();
		System.out.println(set1);
		System.out.println("Fetch The Vlaue Only\n");
		Collection col = hm.values();
		System.out.println(col);
		for(Object o:set) {
			System.out.println(o+" Value  "+hm.get(o));
		}

	}

}
