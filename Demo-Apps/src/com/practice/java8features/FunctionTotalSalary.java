package com.practice.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employe {
	String name;
	double salary;

	public Employe(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s ,%.2f", name, salary);
	}
}

public class FunctionTotalSalary {
	public static void main(String[] args) {
		
		
		List<Employe> employeeList = new ArrayList<Employe>();
		List<Employe> newemployeeList = new ArrayList<Employe>();
		employeeList.add(new Employe("Harsha", 20000));
		employeeList.add(new Employe("Kiran", 10000));
		employeeList.add(new Employe("Sowjanya", 15000.50));
		employeeList.add(new Employe("hanshal", 50000.123));
		
		Predicate<Employe> p = (e) -> e.salary < 20000;

		Function<Employe, Employe> f = (l) -> new Employe(l.name , l.salary+2000);
		
		System.out.println(employeeList);
		List<Employe> newList = employeeList.stream().filter(e -> p.test(e)).map(e -> f.apply(e)).collect(Collectors.toList());
//		for(Employe e : employeeList) {
//			if(p.test(e)) {				
//				newemployeeList.add(f.apply(e));
//			}
//		}
		System.out.println("After Increment in Salaries :: " + newList);
		//System.out.println("Total Cost to Company in Paying Salaries :: " );
	}

}
