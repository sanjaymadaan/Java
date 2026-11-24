package com.company.collectionframework;

import java.util.HashMap;
import java.util.Scanner;

class StoreItem{
    private String barcode;
    private String itemName;
	public StoreItem(String barcode, String itemName) {
		this.barcode = barcode;
		this.itemName = itemName;
	}
	public String getBarcode() {
		return barcode;
	}
	public String getItemName() {
		return itemName;
	}
    
}

class GroceryItem extends StoreItem{
    private double price;
    
    public GroceryItem(String barcode, String itemName, double price) {
		super(barcode, itemName);
		this.price = price;
	}

	void printReceiptLine(){
		System.out.println(getBarcode() + " | " + getItemName() 
				+ " | Rs." + price);
    }
}

public class ProductPriceLookupDirectoryHM {
	public static void main(String[] args) {
		  	Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();

	        HashMap<String, GroceryItem> hm = new HashMap<String, GroceryItem>();
	        
	        GroceryItem obj = null;
	        
	        for(int i = 0; i< N; i++){
		        String barcode = scanner.next();
		        String itemName = scanner.next();
		        double price  = scanner.nextDouble();
		        
		        obj = new GroceryItem(barcode, itemName, price);
		        
		        hm.put(barcode, obj);
	        }
	   
	        String searchBarCode = scanner.next();
	        
        	System.out.println("Pairs : " + hm.size());	        
	        GroceryItem item = hm.get(searchBarCode);
	       
	        if(item == null) {
	        	System.out.println("Item Not Found.");
	        }else {
	        	item.printReceiptLine();
	        }
	}
}

/*
TestCase 1:

4
ASD101 Laptop 67000.0
ASD102 Mouse 700.0
ASD103 Keyboard 1500.0
ASD104 Screen 4000.0
ASD103
  
4
ASD101 Laptop 67000.0
ASD102 Mouse 700.0
ASD103 Keyboard 1500.0
ASD104 Screen 4000.0
ASD106  

  
4
ASD101 Laptop 67000.0
ASD102 Mouse 700.0
ASD101 Keyboard 1500.0
ASD104 Screen 4000.0
ASD101  

  
*/








