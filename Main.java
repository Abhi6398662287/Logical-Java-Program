package com.jtc.p1;

import java.util.*;

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

// 🔹 ID ke basis par sorting
class StudentIdComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s2.id, s1.id); // decending Order
    }
}

// 🔹 Name ke basis par sorting
class StudentNameComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s2.name.compareTo(s1.name); // Alphabetical Order
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2(103, "Ravi"));
        students.add(new Student2(101, "Aman"));
        students.add(new Student2(102, "Sita"));

        // 🔹 ID ke basis par sorting
        Collections.sort(students, new StudentIdComparator());
        System.out.println("Sorted by ID:");
        for (Student2 s : students) {
            System.out.println(s);
        }

        // 🔹 Name ke basis par sorting
        Collections.sort(students, new StudentNameComparator());
        System.out.println("\nSorted by Name:");
        for (Student2 s : students) {
            System.out.println(s);
        }
    }
}

