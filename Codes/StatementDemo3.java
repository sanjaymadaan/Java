package com.company.basic;

public class StatementDemo3 {
	public static void main(String[] args) {
		
//		for(declaration/initialization; condition; updation) {
//			// set of statement (repeated till the condition is true)
//		}
		int times = 5;
		
		for(int i = 1; i <= times; i++) {
			System.out.println(" i = " + i);
			for(int j = 1; j <= times; j++) {
				System.out.print(" j="+j);
			}
			System.out.println();
		}
		
		System.out.println("\n======1======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= times; j++) {
				System.out.printf("%2s","*");
			}
			System.out.println();
		}

		System.out.println("\n======2======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.printf("%2s","*");
			}
			System.out.println();
		}
		
		System.out.println("\n======3======");
		for(int i = 1; i <= times; i++) {
			for(int j = times; j >= i; j--) {
				System.out.printf("%2s","*");
			}
			System.out.println();
		}
		
		System.out.println("\n======4======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.printf("%2d",j);
			}
			System.out.println();
		}

		System.out.println("\n======5======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.printf("%2d",i);
			}
			System.out.println();
		}

		System.out.println("\n======6======");
		for(int i = 1; i <= times; i++) {
			for(int k = 1; k < i; k++) {
				System.out.printf("%s","  ");//two blankspaces
			}
			for(int j = times; j >= i; j--) {
				System.out.printf("%2s","*");
			}
			System.out.println();
		}

		System.out.println("\n======7======");
		int counter = 1;
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.printf("%3d",counter++);
			}
			System.out.println();
		}

		System.out.println("\n======8======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= times; j++) {
				if(i == 1 || j == 1 || i == times || j == times) {
					System.out.printf("%2s","*");
				}else {
					System.out.printf("%2s","  ");//two blankspaces
				}
			}
			System.out.println();
		}
		
		System.out.println("\n======9======");
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= times; j++) {
				if(i == 1 || j == 1 || i == times || j == times || i == j) {
					System.out.printf("%2s","*");
				}else {
					System.out.printf("%s","  ");//two blankspaces
				}
			}
			System.out.println();
		}
		
		System.out.println("\n======10======");
		times = 8;
		for(int i = 1; i <= times; i++) {
			for(int j = 1; j<= times; j++) {
				if(i == 1 || j == 1 || i == times || j == times) {
					System.out.printf("%2s","*");
				}else if(i == 2 || j == 2 || i == times - 1 || j == times - 1) {
					System.out.printf("%2s","  ");//two blankspaces
				}else{
					System.out.printf("%2s","*");
				}
			}
			System.out.println();
		}
		
	}
}
