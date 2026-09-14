package com.company.modules.module2;

import java.util.Scanner;

class Product{
	String name;
	int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
public class ProductStore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfOperations = scanner.nextInt();
		
		Product productarr[] = new Product[numberOfOperations];
		int reqIndex = -1;

		for(int index = 0; index <= numberOfOperations; index++) {
			String str = scanner.nextLine();
			String parts[] = str.split("[ ]");
			String operation = parts[0];
			
			switch(operation) {
				case "ADD":
					boolean isExist = false;
					for(int i = 0; i < reqIndex; i++) {
						if(productarr[i].name.equals(parts[1])) {
							isExist = true;
							break;
						}
					}
					if(!isExist) {
					reqIndex++;
					productarr[reqIndex] = new Product(parts[1],
							Integer.parseInt(parts[2]));
					}
					break;
				case "UPDATE":
					boolean isExist1 = false;
					int onIndex = -1;
					for(int i = 0; i < reqIndex; i++) {
						if(productarr[i].name.equals(parts[1])) {
							isExist1 = true;
							onIndex = i;
							break;
						}
					}
					
					if(isExist1) {
						productarr[onIndex] = new Product(parts[1], 
								Integer.parseInt(parts[2]));
					}
					break;
				case "GET":
					boolean isExist2 = false;
					int onIndex1 = -1;
					for(int i = 0; i < reqIndex; i++) {
						if(productarr[i].name.equals(parts[1])) {
							isExist2 = true;
							onIndex1 = i;
							break;
						}
					}
					
					if(isExist2) {
						System.out.println(productarr[onIndex1].price);
					}else {
						System.out.println(-1);
					}
					
					break;
			}
		} //end of for loop
	}
}
