package com.company.oops;

import java.util.Scanner;

class Employee{
	int empNo;
	String empName;
	String joinDate;
	char desigCode;
	String dept;
	int basic;
	int hra;
	int it;
	
	Employee(int empNo,	String empName,	String joinDate,
				char desigCode,	String dept,
				int basic, int hra, int it){
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.desigCode = desigCode;
		this.dept = dept;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
}


public class EmployeeInformationDemo {
	public static void main(String[] args) {
		//Array of Objects (Employee)
	Employee emparr[] = new Employee[3];
	
	// Employee 1001
	emparr[0] = new Employee(1001,"Ashish","01/04/2009",
								'e',"R&D",
								20000,8000,3000);
		
		// Employee 1002
	emparr[1]	= new Employee(1002,"Sushma","23/08/2012",
		        				'c',"PM",
		        				30000,12000,9000);
		
		// Employee 1003
	emparr[2]	= new Employee(1003,"Rahul","12/11/2008",
		        				'k',"Acct",
		        				10000,8000,1000);
		
	System.out.println("Enter Employee code:");
	Scanner scanner = new Scanner(System.in);
	int empcodetobesearch = scanner.nextInt();
	
	int index = -1;
	for(int i = 0; i < emparr.length; i++) {
		if(emparr[i].empNo == empcodetobesearch) {
			index = i;
			break;
		}
	}
	
	if(index == -1) {
		System.out.println("There is no employee with empid : "
									+ empcodetobesearch);
	}else {
		System.out.println("Employee Found at : "+ index);
		Employee e = emparr[index];
		
		char desgkey = e.desigCode;
		String designation = new String();
		int da = 0;
		switch (desgkey) {
			case 'e':
				designation = "Engineer";
				da = 20000;
				break;
			case 'c':
				designation = "Consultant";
				da = 32000;
				break;
			case 'k':
				designation = "Clerk";
				da = 12000;
				break;
			case 'r':
				designation = "Receptionist";
				da = 15000;
				break;
			case 'm':
				designation = "Manager";
				da = 40000;
				break;
		}
		//salary =  Basic+HRA+DA-IT
		int salary = e.basic + e.hra + da - e.it;
		
		//Emp No. Emp Name Department Designation Salary
		System.out.printf("%-15s %-15s %-15s %-15s %-15s",
				"Emp No.", "Emp Name", "Department",
				"Designation", "Salary");
		System.out.println();
		System.out.printf("%-15d %-15s %-15s %-15s %-15d",
				e.empNo, e.empName, e.dept, 
				  designation,  salary);
	}
	
	
	}

}












