package com.practice.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmployeeInfo {
	private String name;
	private double salary;
	private String designation;

	public EmployeeInfo(String name, double salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString() {
		return String.format("(%s,%.2f, %s)", name, salary, designation);
	}

}

public class Custompredicate {

	public static void main(String[] args) {

		List<EmployeeInfo> employeeList = new ArrayList<EmployeeInfo>();
		employeeList.add(new EmployeeInfo("harsha", 2000, "manager"));
		employeeList.add(new EmployeeInfo("kiran", 5000, "manager"));
		employeeList.add(new EmployeeInfo("vijay", 1000, "manager"));

		Predicate<EmployeeInfo> p1 = (emp) -> emp.getDesignation().equals("manager");
		Predicate<EmployeeInfo> p2 = (emp) -> emp.getSalary()> 2000;

		for(EmployeeInfo e : employeeList) {
			if(p1.and(p2).test(e)) {
				System.out.println(e);
			}
		}
	}

}
