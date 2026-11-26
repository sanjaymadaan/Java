package com.company.collectionframework;

import java.util.*;

class ProductN{
	private int pId;
	private String pName;
	private float pPrice;
	
	public ProductN(int pId, String pName, float pPrice) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public float getpPrice() {
		return pPrice;
	}
	
	void displayProduct() {
		System.out.println(pId + "/" + pName + "/" + pPrice);
	}
}

class PriceComparator implements Comparator<ProductN>{
	@Override
	public int compare(ProductN o1, ProductN o2) {
		return (int)(o1.getpPrice() - o2.getpPrice());
	}
}

class PriceRevComparator implements Comparator<ProductN>{
	@Override
	public int compare(ProductN o1, ProductN o2) {
		return (int)(o2.getpPrice() - o1.getpPrice());
	}
}
class PIdComparator implements Comparator<ProductN>{
	@Override
	public int compare(ProductN o1, ProductN o2) {
			return o1.getpId() - o2.getpId();
	}
}

public class SortingExample1 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		ProductN pobj = null;
		
		ArrayList<ProductN> list = new ArrayList<ProductN>();
		
		for(int i = 0; i < N; i++) {
			int id = scanner.nextInt();
			String name = scanner.next();
			float price = scanner.nextFloat();
			
			pobj = new ProductN(id, name, price);
			
			list.add(pobj);
		}
		
		System.out.println("Product Details:");
		for(ProductN obj : list) {
			obj.displayProduct();
		}
		
		String query = scanner.next();
		switch (query) {
			case "PRICE":
				Collections.sort(list, new PriceComparator());
				break;
			case "ID":
				Collections.sort(list, new PIdComparator());
				break;
			case "PRICEREV":
				Collections.sort(list, new PriceRevComparator());
				break;
			default:
				break;
		}
		
		System.out.println("Product Details (Sorted):");
		for(ProductN obj : list) {
			obj.displayProduct();
		}
		
	}

}


/*
Test Case 1:
	
4
324 Laptop 45000.0
23 Mouse 560.0
675 Keyboard 1500.0
10 SSD 7400.0
PRICE


4
324 Laptop 45000.0
23 Mouse 560.0
675 Keyboard 1500.0
10 SSD 7400.0
ID


4
324 Laptop 45000.0
23 Mouse 560.0
675 Keyboard 1500.0
10 SSD 7400.0
PRICEREV


*/