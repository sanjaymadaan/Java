package com.company.collectionframework;

import java.util.HashSet;
import java.util.Scanner;

class Voucher{
	private String couponCode;

	public Voucher(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponCode() {
		return couponCode;
	}
	@Override
	public boolean equals(Object obj) {
		return this.couponCode.equals(((Voucher)obj).couponCode);
	}
	@Override
	public int hashCode() {
	//	System.out.println("Hello.");
		return couponCode.hashCode();
	}
}

class DiscountCoupon extends Voucher{
	private double discountAmount;

	public DiscountCoupon(String couponCode, double discountAmount) {
		super(couponCode);
		this.discountAmount = discountAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

}

public class Unique1CouponCodeRegistry {
	public static void main(String[] args) {

		HashSet<DiscountCoupon> set = new HashSet<DiscountCoupon>();
		
		Scanner scanner = new Scanner(System.in);
		int numberofcoupons = scanner.nextInt();
		
		for(int i = 0; i < numberofcoupons; i++) {
		//	scanner.next();
			String name = scanner.next();
		//	scanner.next();
			double discount = scanner.nextDouble();

			DiscountCoupon obj = new DiscountCoupon(name, discount);
			set.add(obj);
		}
		
		//String query = scanner.next();
		String couponName = scanner.next();
		
		DiscountCoupon obj1 = new DiscountCoupon(couponName, 0);
		System.out.println("Total Unique Coupons: " + set.size());
		System.out.println("Coupon Present: " + set.contains(obj1));
			
	}
}

/*
Test Case 1:

4
First 500
Second 1000
First 200
Fourth 700
Third


Test Case 2:

4
First 500
Second 1000
Third 200
Fourth 700
Third


*/



