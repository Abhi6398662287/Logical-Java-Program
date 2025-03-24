package com.jtc.p1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentFeeBalaadd1000 {
	public static void main(String arg[]) {
		List<Student> list=DataUtil.getStudentList();
		System.out.println("___________________________________");
		List<Student> mylist=list.stream().filter(mystu->mystu.getFeeBal()>1200).map(mystu->{mystu.setFeeBal(mystu.getFeeBal()+1000);
		return mystu;
		})
		.sorted((stu1,stu2)->(int)(stu2.getFeeBal()-stu1.getFeeBal()))
		.collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}

}
