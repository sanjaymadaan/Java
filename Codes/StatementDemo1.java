package com.company.basic;

import java.util.Scanner;

public class StatementDemo1 {
	public static void main(String[] args) {
		
		final int YES = 1;
		final int NO = 2;
		final int MAYBE = 3;
		System.out.println("First Statement");;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your answer (1/2/3):");
		int response = scanner.nextInt();
		
		switch(response) {
			case YES:
				System.out.println("First Month");
				System.out.println("January");
				break;
			case NO:
				System.out.println("Second Month");
				System.out.println("February");
				break;
			case MAYBE:
				System.out.println("Third Month");
				System.out.println("March");
				break;
			default:
				System.out.println("Invalid Month.");
				break;
		}
		
		
		System.out.println("Last Statement");
		
	}
}