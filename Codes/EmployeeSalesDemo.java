package com.company.oops;


class Employee1 {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private int performanceRating;
    //code
    Employee1(int employeeId, String employeeName, double
    		basicSalary, int performanceRating){
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    	
    	this.basicSalary = basicSalary < 0 ? 15000.0 : basicSalary;
    
    	if(performanceRating < 1 || performanceRating > 5) {
    		this.performanceRating = 1;
    	}else {
    		this.performanceRating = performanceRating;
    	}
    }
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	
	public void setBasicSalary(double basicSalary) {
    	this.basicSalary = basicSalary < 0 ? 15000.0 : basicSalary;
	}
	public void setPerformanceRating(int performanceRating) {
    	if(performanceRating < 1 || performanceRating > 5) {
    		this.performanceRating = 1;
    	}else {
    		this.performanceRating = performanceRating;
    	}
	}

	public double calculatePerformanceBonus() {
		double bonus = 0.0;
		if(this.performanceRating == 5) {
			bonus = this.basicSalary * 20/100;
		}else if(this.performanceRating == 4) {
			bonus = this.basicSalary * 10/100;
		}else if(this.performanceRating == 3) {
			bonus = this.basicSalary * 5/100;
		}else {
			bonus = 0;
		}
		return bonus;
	}
	public double calculateSalary() {
		return basicSalary + calculatePerformanceBonus();
	}
	public void displayInfo() {
		System.out.println("Employee ID: " + this.employeeId);
		System.out.println("Employee Name: " + this.employeeName);
		System.out.printf("%s %.2f\n", "Basic Salary:", this.basicSalary);
		System.out.println("Performance Rating: " + this.performanceRating);
	}

}

class SalesEmployee extends Employee1 {

    private double salesAmount;
    private double commissionRate;

    SalesEmployee(int employeeId, String employeeName,
    		double basicSalary, int performanceRating, double salesAmount){
    	super(employeeId, employeeName, basicSalary, performanceRating);
    	this.salesAmount = salesAmount < 0 ? 0.0 : salesAmount;
    }
    
    public double getSalesAmount() {
		return salesAmount;
	}
	public double getCommissionRate() {
		return commissionRate;
	}

	public double calculateCommission() {
    	if(salesAmount >= 100000) {
    		commissionRate = 10.0;
    	}else if (salesAmount >= 50000) {
    		commissionRate = 5.0;
    	}else {
    		commissionRate = 2.0;
    	}
    	return (salesAmount * getCommissionRate()/100);
    }
    
	public double calculateSalary() {
		return super.calculateSalary() 
				+ calculateCommission();
	}
    public void displayInfo() {
    	super.displayInfo();
    	System.out.println("Sales Amount: " + salesAmount);
    	System.out.println("Commission: " + calculateCommission());
    	System.out.println("Final Salary: " + calculateSalary());
    }

}

public class EmployeeSalesDemo { 

    public static void main(String[] args) {

        // All evaluation test cases
        SalesEmployee[] employees = {

            new SalesEmployee(101, "Amit", 30000.0, 5, 120000.0),

            new SalesEmployee(102, "Neha", 25000, 4, 75000),

            new SalesEmployee(103, "Rahul", 40000, 3, 30000),

            new SalesEmployee(104, "Priya", 20000, 2, 50000),

            new SalesEmployee(105, "Karan", -5000, 5, -100),

            new SalesEmployee(106, "Simran", 50000, 8, 100000),

            new SalesEmployee(107, "Riya", 18000, 1, 49999)
        };

        // Execute all test cases
        for (SalesEmployee employee : employees) {

            employee.displayInfo();

            System.out.println("------------------------------");
        }
    }
}
