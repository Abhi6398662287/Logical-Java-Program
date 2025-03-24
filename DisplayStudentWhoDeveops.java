package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayStudentWhoDeveops {
public static void main(String arg[]) {
	List<Student> list=DataUtil.getStudentList();
	list.stream().filter(stu1->stu1.getSname().equals("Abhi"))
	.forEach(System.out::println);
	System.out.println("============================");
	List<Student> list1=list.stream().filter(stu->stu.getCoursesName().equals("Devops"))
		.collect(Collectors.toList());
	
			list1.forEach(System.out::println);
}
}
