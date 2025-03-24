package com.jtc.p1;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public static List<Student> getStudentList(){
		List<Student> list=new ArrayList();
				Student stu1=new Student(101,"Abhi",5555,"Devops",30000,0);
				Student stu2=new Student(102,"Abhi",5555,"Devops",30000,0);
				Student stu3=new Student(103,"Abhi",5555,"Devops",30000,0);
				Student stu4=new Student(104,"Abhi",5555,"Devops",0,0);
				Student stu5=new Student(105,"Abhishek",5555,"Devops",0,90);
				Student stu6=new Student(106,"Abhi",5555,"Devops",90,0);
				Student stu7=new Student(107,"Abhi",5555,"Devops",1900,0);
				Student stu8=new Student(108,"Abhi",5555,"Devops",0,9000);
				Student stu9=new Student(109,"Abhi",5555,"Devops",30000,0);
				Student stu10=new Student(110,"Abhi",5555,"Devops",30000,0);
				list.add(stu1);
				list.add(stu2);
				list.add(stu3);
				list.add(stu4);
				list.add(stu5);
				list.add(stu6);
				list.add(stu7);
				list.add(stu8);
				list.add(stu9);
				list.add(stu10);
				return list;
		
	}
}
