package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentfeePaybalance {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		list.stream().filter(name->name.getSname()=="Abhishek")
		.forEach(System.out::println);
		System.out.println("=============");
		
		list.stream().filter(mystu->mystu.getFeeBal()>0)
		.forEach(System.out::println);
		list.stream().filter(mystu->mystu.getFeePaid()>0)
		.forEach(System.out::println);
		System.out.println("----------------------------");
		List<Student> list2=list.stream().collect(Collectors.toList());
		System.out.println("-=====");
		list2.forEach(System.out::println);
		
	}

}
