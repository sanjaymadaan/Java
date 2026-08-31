package com.company.oops;

class BankAccount{
	int accountNumber;
	int balance;
	void deposit(int amount) {
		System.out.println("\nAmount Deposited.");
		balance = balance + amount;
	}
	void withdraw(int amount) {
		if(balance <= 0) {
			System.out.println("\nNot Sufficient balance.");
		}else if(balance <= 5000) {
			System.out.println("\nMinimum amount to be maintained.");
		}else {
			System.out.println("\nAmount withdraw.");
			balance = balance - amount;
		}
	}
	void getInfo() {
		System.out.println("Account details:");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.accountNumber = 123456789;
		b1.balance = 20000;
		b1.getInfo();

		b1.deposit(2000);
		b1.getInfo();
		
		b1.withdraw(1500);
		b1.getInfo();
		
		System.out.println("============");
		BankAccount b2 = new BankAccount();
		b2.accountNumber = 346426243;
		b2.balance = 2000;
		
		b2.getInfo();
		b2.withdraw(1000);
		b2.getInfo();
	}

}





