package com.company.array;

public class SalesAnalysis {

	public static void displaySales(int arr[][]) {
		System.out.printf("%5s%5s%5s\n","Jan","Feb","Mar");
		for(int arr1d[] : arr) {
			for(int saleValue : arr1d) {
				System.out.printf("%5d", saleValue);
			}
			System.out.println();
		}
	}
	
	public static void branchWiseTotal(int arr[][]) {
		System.out.println("\nBranch Wise Sales:");
		int totalSales = 0;
		for(int arr1d[] : arr) {
			totalSales = 0;
			for(int saleValue : arr1d) {
				totalSales = totalSales + saleValue;
			}
			System.out.println("Sales = " + totalSales);
		}
	}
	public static void monthWiseTotal(int arr[][]) {
		System.out.println("\nMonth wise sales:");
		int totalSales = 0;
		for(int col = 0; col < arr[0].length; col++) {
			totalSales = 0;
			for(int row = 0; row < arr.length; row++) {
				totalSales = totalSales + arr[row][col];
			}
			System.out.println("Sales = " + totalSales);
		}
	}
	
	public static void highestSalesBranch(int arr[][]){

		System.out.println("\nHighest Sales Branch:");
		int maxSales = Integer.MIN_VALUE;
		int totalSales = 0;
		int branchNumber = 0;
		int reqBranchNumber = 0;
		for(int arr1d[] : arr) {
			branchNumber++; //current branch Number

			totalSales = 0;
			for(int saleValue : arr1d) {
				totalSales = totalSales + saleValue;
			}
			if(totalSales > maxSales) {
				maxSales = totalSales;
				reqBranchNumber = branchNumber;
			}

		}
		System.out.println("Max sales at Branch : " + reqBranchNumber);
		System.out.println("Max Sales: " + maxSales);
	}
	
	public static void highestSalesMonth(int arr[][]) {
		System.out.println("\nHighest Month sales:");
		int totalSales = 0;
		int maxSales = Integer.MIN_VALUE;
		int reqMonth = 0;
		for(int col = 0; col < arr[0].length; col++) {
			totalSales = 0;
			for(int row = 0; row < arr.length; row++) {
				totalSales = totalSales + arr[row][col];
			}
			if(totalSales > maxSales) {
				maxSales = totalSales;
				reqMonth = col + 1;
			}
		}
		System.out.println("Max sales at Month : " + reqMonth);
		System.out.println("Max Sales: " + maxSales);
		
		
	}
	
	
	public static void main(String[] args) {

        int sales[][] = {
            {120, 150, 180},   // Branch 1
            {200, 170, 210},   // Branch 2
            {140, 160, 155},   // Branch 3
            {250, 220, 280}    // Branch 4
        };

        // Display the sales data
        displaySales(sales);
               
        // Calculate total sales of each branch
        branchWiseTotal(sales);

        // Calculate total sales of each month
        monthWiseTotal(sales);

        // Find branch with highest sales
        highestSalesBranch(sales);
//
//        // Find month with highest overall sales
        highestSalesMonth(sales);
    }
} 

