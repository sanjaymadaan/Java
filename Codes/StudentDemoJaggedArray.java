package com.company.modules.module3;

import java.util.Arrays;

/*
Student Class
	 │
┌──────────────┼──────────────┐
↓              ↓              ↓
studentId      studentName       marks
		              │
		              ↓
		       Jagged Array
		              │
		┌────────────────┼───────────────┐
		↓                ↓               ↓
		Student 1        Student 2       Student 3
		5 subjects       3 subjects      4 subjects
*/

class Student {

    int studentId;
    String studentName;

    // Jagged array to store marks of multiple students
    // Each row can have a different number of subjects
    static int[][] marks = new int[3][];

    static int i = -1;

    Student(int studentId, String studentName, int arr[]) {

        this.studentId = studentId;
        this.studentName = studentName;

        // Move to the next row
        i++;

        // Create a copy of the marks array
        marks[i] = Arrays.copyOf(arr, arr.length);

        // Demonstrating that the original array is separate
        arr[0] = 0;
    }

    void displayDetails(int i) {

        System.out.println("\nStudent ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Subjects     : " + marks[i].length);

        System.out.print("Marks        : ");

        int sum = 0;

        for (int mark : marks[i]) {

            System.out.printf("%3d", mark);

            sum += mark;
        }

        System.out.println();

        System.out.println("Total Marks  : " + sum);

        System.out.printf(
            "Average      : %.2f%n",
            (double) sum / marks[i].length
        );
    }
}

public class StudentDemoJaggedArray {

    public static void main(String[] args) {

        Student stuarr[] = new Student[3];

        stuarr[0] = new Student(
            1001,
            "Rohan",
            new int[]{78, 85, 67, 90, 88}
        );

        stuarr[1] = new Student(
            1002,
            "Mohan",
            new int[]{92, 81, 76}
        );

        stuarr[2] = new Student(
            1003,
            "Sohan",
            new int[]{69, 74, 88, 91}
        );

        for (int i = 0; i < stuarr.length; i++) {

            stuarr[i].displayDetails(i);
        }
    }
}