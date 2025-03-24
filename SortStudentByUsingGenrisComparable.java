package com.jtc.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	String email;
	public Student(int id, String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
		
	}

	@Override
	public String toString() {
		//return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
		return  ""+ id + ", name=" + name + ", email=" + email +"";
	}

	/*
	 * public int CompareTo(Student s) { return this.id-s.id; }
	 */
	//@Override
	/*
	 * public int compareTo(Student o) {
	 * 
	 * return Integer.compare(this.id, o.id); }
	 */
	 @Override
	    public int compareTo(Student o) {
	        return this.email.compareTo(o.email); // Email ke basis pe sort ho raha hai
	    }
	
}
class B1 implements Comparator<Student>{
     @Override
	public int compare(Student s1, Student s2) {
		
		return Integer.compare(s1.id, s2.id);
	}

	
	
}
public class SortStudentByUsingGenrisComparable {
	public static void main(String arg[]) {
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(1,"Abhishek","ak216256@gmail.com"));
		st.add(new Student(5,"Abhishek","ak21625@gmail.com"));
		st.add(new Student(4,"Abhishek","ak26@gmail.com"));
		st.add(new Student(3,"Abhishek","ak2156@gmail.com"));
		
		
		Collections.sort(st);
		st.forEach(System.out::println);
		System.out.println("____________________________________________");
		Collections.sort(st,new B1());
		st.forEach(System.out::println);
		Enumeration en =Collections.enumeration(st);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
		}
		
		
		
	}

}
