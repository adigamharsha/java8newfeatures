package com.practice.java8features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCustomSorting {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(105, "harsha"));
		e.add(new Employee(100, "abhi"));
		e.add(new Employee(101, "kiran"));
		e.add(new Employee(102, "sowji"));
		System.out.println("Order of Insertion" + e);

		// Without Lambda Expression
		Collections.sort(e, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (e1.getId() > e2.getId()) ? -1 : (e1.getId() < e2.getId()) ? 1 : 0; // Descending Sorting
			}
		});
		System.out.println("Sorting based on Id without lambda expression" + e);

		// With lambda Expression using employee name
		Collections.sort(e, (e1, e2) -> -(e1.getEname().compareTo(e2.getEname()))); // Descending order Sorting
		System.out.println("Sorting based on Name" + e);
	}
}

class Employee {
	private int id;
	private String ename;

	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}

}
