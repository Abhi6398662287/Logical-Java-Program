package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class filterfilterStudentDisplay {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		System.out.println("=========================");
		long count1=list.stream()
				.filter(mystu->mystu.getCoursesName().equals("Devops"))
				.filter(mystu->mystu.getFeeBal()==0)
				.collect(Collectors.counting());
		System.out.println(count1);
		
	}

}
