package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentOrderByName {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		list.stream()
		.sorted((stu1,stu2)->stu1.getSname().compareTo(stu2.getSname()))
		.forEach(System.out::println);
		System.out.println("-----------------------");
		List<Student> list1=list.stream()
				.sorted((stu1,stu2)->stu2.getSname().compareTo(stu1.getSname()))
				.collect(Collectors.toList());
            list1.forEach(System.out::println);		
	}

}
