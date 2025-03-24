package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc1dispay {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		list.stream().forEach(System.out::println);
		System.out.println("-----------------------------------");
		System.out.println(list);
		  List<Student> list2=list.stream().collect(Collectors.toList());
		  list2.forEach(System.out::println);
		  System.out.println("===============================================");
		 System.out.println(list2);
	}

}
