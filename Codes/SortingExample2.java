package com.company.collectionframework;

import java.util.*;

class StudentNew{
	private int stuId;
	private String stuName;
	private float stuMarks;
	
	public StudentNew(int stuId, String stuName, float stuMarks) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}
	
	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public float getStuMarks() {
		return stuMarks;
	}


	void displayStudent() {
		System.out.println(stuId +"/" + stuName + "/" + stuMarks);
	}
}

class StuIdComparator implements Comparator<StudentNew>{
	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		return o1.getStuId() - o2.getStuId();
	}
}

class StuMarksComparator implements Comparator<StudentNew>{
	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		return (int)(o1.getStuMarks() - o2.getStuMarks());
	}
}

class StuNComparator implements Comparator<StudentNew>{
	@Override
	public int compare(StudentNew o1, StudentNew o2) {
			return o1.getStuName().compareTo(o2.getStuName());
	}
}

public class SortingExample2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		StudentNew obj = null;
		ArrayList<StudentNew> list = new ArrayList<StudentNew>();
		
		for(int i = 0; i < N; i++) {
			int id = scanner.nextInt();
			String name = scanner.next();
			float marks = scanner.nextFloat();
			
			obj = new StudentNew(id, name, marks);
			
			list.add(obj);
		}
		
		System.out.println("Student Details:");
		for(StudentNew s : list) {
			s.displayStudent();
		}
		
		String query = scanner.next();
		
		if(query.equalsIgnoreCase("ID")) {
			Collections.sort(list, new StuIdComparator());
		}else if(query.equalsIgnoreCase("MARKS")){
			Collections.sort(list, new StuMarksComparator());
		}else if(query.equalsIgnoreCase("NAME")) {
			Collections.sort(list, new StuNComparator());
		}
		
		System.out.println("Student Details (Sorted):");
		for(StudentNew s : list) {
			s.displayStudent();
		}

	}
}


/*
Test Case 1:

4
434 Rahul 456
101 Priya 345
23 Rohan 478
110 Sahil 240
ID


Test Case 2:

4
434 Rahul 456
101 Priya 345
23 Rohan 478
110 Sahil 240
MARKS


Test Case 3:

4
434 Rahul 456
101 Priya 345
23 Rohan 478
110 Sahil 240
NAME

 */




