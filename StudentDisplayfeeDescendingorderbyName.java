package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentDisplayfeeDescendingorderbyName {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		list.stream().filter(mystu->mystu.getFeePaid()>0)
		.sorted((stu1,stu2)->stu1.getSname().compareTo(stu2.getSname()))
		.forEach(System.out::println);
		
		System.out.println("_______________________________________");
		List<Student> list2=list.stream().filter(mystu->mystu.getFeePaid()<0)
				.sorted((stu1,stu2)->stu2.getSname().compareTo(stu1.getSname()))
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

}
