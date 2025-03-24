package com.jtc.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	String email;
	public Student1(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
}
class B implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.email.compareTo(o2.email); 
	}
	
}
public class SortComparatorUsingGenric {
	public static void main(String arg[]) {
		List<Student1> st=new ArrayList<Student1>();
		
		st.add(new Student1(1,"Abhishek","kumar32@gmail.com"));
		st.add(new Student1(2,"Guddu","ak21@gmail.com"));
		Collections.sort(st);
		for(Student1 s:st) {
			System.out.println(s);
		}
		System.out.println("******************");
		Collections.sort(st,new B());
		st.forEach(System.out::println);
	}

}
