package com.company.basic;

/**
 * Program Name : StudentManagementSystem
 * Description  : Demonstrates Java Coding Standards and Naming Conventions.
 *
 * Author       : Your Name
 * Date         : 29-July-2026
 * Version      : 1.0
 */

public class StudentManagementSystem {

    // Constant (UPPER_CASE)
	/**
	 * Constant (UPPER_CASE)
	 */
    private static final String UNIVERSITY_NAME = "GLA University";

    // Instance Variables (camelCase)
    private int studentId;
    private String studentName;
    private double marks;
    
    /**
     * Parameterized Constructor
     *
     * @param studentId Unique Student ID
     * @param studentName Name of the Student
     * @param marks Student Marks
     */
    public StudentManagementSystem(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
       
    }

    /**
     * Displays student information.
     */
    public void displayStudentDetails() {
        System.out.println("University : " + UNIVERSITY_NAME);
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());
    }

    /**
     * Calculates the student's grade.
     *
     * @return Grade based on marks
     */
    public String calculateGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }

    /**
     * This is the documentation comment.
     */
    public static void getdata() {
    	
    }
    
    
    /**
     * Main Method: This is the description of the main method.
     */
    public static void main(String[] args) {
    
        // Local Variable
        StudentManagementSystem student =
                new StudentManagementSystem(101, "Rahul Sharma", 88.5);

        student.displayStudentDetails();
        
        
    }
}
