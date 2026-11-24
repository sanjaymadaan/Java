package com.company.collectionframework;

import java.util.HashSet;
import java.util.Scanner;

class StudentN{
	private String rollNo;
	private String studentName;
	
	public StudentN(String rollNo, String studentName) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getStudentName() {
		return studentName;
	}
	//- Override `equals(Object o)` and `hashCode()` strictly using `rollNo`.
	@Override
	public boolean equals(Object obj) {
		StudentN stuobj = (StudentN)obj;
		return rollNo.equals(stuobj.rollNo);
	}
	
	@Override
	public int hashCode() {
	//	System.out.println("Hash code.");
		return rollNo.hashCode();
	}
}

class WorkshopParticipant extends StudentN{
	private String trackName;

	public WorkshopParticipant(String rollNo) {
		super(rollNo, null);
		this.trackName = null;
	}
	public WorkshopParticipant(String rollNo, String studentName,
						String trackName) {
		super(rollNo, studentName);
		this.trackName = trackName;
	}
	
}

public class UniqueWorkshopRegistration {
	public static void main(String[] args) {
		HashSet<WorkshopParticipant> hs = new HashSet<WorkshopParticipant>();
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		WorkshopParticipant obj = null;
		
		for(int i = 0; i < N; i++) {
			String rollNo = scanner.next();
			String studentName = scanner.next();
			String trackName = scanner.next();
			
			obj = new WorkshopParticipant(rollNo, studentName, trackName);
			
			hs.add(obj);
		}
		
		String checkRollNo = scanner.next();
		
		System.out.println("Registered Count: " + hs.size());
		obj = new WorkshopParticipant(checkRollNo);
		System.out.println("Is Registered: " + hs.contains(obj));
	}
}

/*
Test Case 1:

4
101 Sahil AIML
102 Gagan FSD
103 Rahul AIML
104 Rohan FSD
102


Test Case 2:

3
101 Sahil AIML
102 Gagan FSD
101 Rahul AIML
102
 */





