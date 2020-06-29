package com.practice.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
	int marks;
	String name;

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	public String toString() {
		return String.format(" marks::%d :, Student name::%s",marks,name);
	}

}

public class FunctionGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student, String> f = (s) -> {
			return (s.marks > 80) ?  "A[Distinction]" : (s.marks > 60 && s.marks < 80) ?  "B[First Class]" : (s.marks > 50 && s.marks < 60) ?	 "C[Second Class]" :  "D[Failed]";
		};

		List<Student> l = new ArrayList<Student>();
		l.add(new Student(40, "Harsha"));
		l.add(new Student(51, "Kiran"));
		l.add(new Student(61, "Sowjanya"));
		l.add(new Student(75, "Hansh"));
		l.add(new Student(85, "Deep"));

		l.forEach(s -> System.out.println("Student with "+s+" and Grade is :"+f.apply(s)));

	}

}
