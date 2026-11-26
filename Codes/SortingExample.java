package com.company.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private int empAge;
	public Employee(int empId, String empName, int empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	void display() {
		System.out.println(empId + "/" + empName + "/" + empAge);
	}
}

class IdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
			return o1.getEmpId() - o2.getEmpId();
	}
}

class AgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
			return o1.getEmpAge() - o2.getEmpAge();
	}
}

class AgeReverseComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
			return o2.getEmpAge() - o1.getEmpAge();
	}
}
public class SortingExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		Employee emp = null;
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for(int i = 0; i < N; i++) {
			int id = scanner.nextInt();
			String name = scanner.next();
			int age = scanner.nextInt();
			
			emp = new Employee(id, name, age);
			
			list.add(emp);
		}
		
		System.out.println("Count : " + list.size());
		
		System.out.println("Employee Details:");
		for(Employee obj : list) {
			obj.display();
		}

		String query = scanner.next();
		
		switch (query) {
			case "NATURAL":
				Collections.sort(list, new IdComparator());
				break;
			case "NAME":
//				Collections.sort(list, new Comparator<Employee>() {
//					public int compare(Employee o1, Employee o2) {
//						return o1.getEmpName().compareTo(o2.getEmpName());
//					};
//				}); 
				
				Collections.sort(list, (Employee o1, Employee o2) ->{
						return o1.getEmpName().compareTo(o2.getEmpName());
					}); 
				break;
			case "AGE":
				Collections.sort(list, new AgeComparator());
				break;
			case "AGE_REVERSED":
				Collections.sort(list, new AgeReverseComparator());
			default:
				break;
		}
		System.out.println("Employee Details (Sorted):");
		for(Employee obj : list) {
			obj.display();
		}

		
	}
}


//•	NATURAL
//•	MARKS
//•	MARKS_REVERSED
//•	NAME
//•	AGE

/*
Test Case 1:

4
345 Rohan 34
123 Gagan 20
76 Riya 26
23 Ajay 45
NATURAL


4
345 Rohan 34
123 Gagan 20
76 Riya 26
23 Ajay 45
AGE


4
345 Rohan 34
123 Gagan 20
76 Riya 26
23 Ajay 45
AGE_REVERSED

4
345 Rohan 34
123 Gagan 20
76 Riya 26
23 Ajay 45
NAME

*/

