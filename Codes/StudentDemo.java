package com.company.oops;

class Student{
	//data members/properties/data
	String name;
	int age;
	String course;
	boolean isAttending;
	
	//constructor
	Student(){
		System.out.println("\nDefault Constructor.");
		course = "default course.";
		isAttending = false;
	}
	Student(String n, int a,String c, boolean ia) {
		System.out.println("\nParameterized Constructor.");
		name = n;
		age = a;
		course = c;
		isAttending = ia;
	}
	//member function/ methods/ behaviour
	void study() {
		System.out.println(name + " is studying in " + course);
	}
	void attendClasses() {
		if(isAttending) {
			System.out.println(name + " is attending the classes.");
		}else {
			System.out.println(name + " is not attending the classes.");
		}
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Rahul", 20,"B.tech", false);
		
		s1.study();
		s1.attendClasses();

		Student s2 = new Student("Priya", 19, "B.Sc", true);
		
		s2.study();
		s2.attendClasses();
	}
}



