package com.company.exception;

import java.util.HashMap;
import java.util.Scanner;


class InvalidProductPriceException extends Exception {
    public InvalidProductPriceException(String message) {
        super(message);
    }
}

class PriceLimitExceededException extends Exception {
    public PriceLimitExceededException(String message) {
        super(message);
    }
}

class ProductN {
    private int productId;
    private String productName;
    private double price;

    public ProductN(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Validate product price
    private void validatePrice(double price)
            throws InvalidProductPriceException,
                   PriceLimitExceededException {

        if (price <= 0) {
            throw new InvalidProductPriceException(
                "Price must be greater than zero."
            );
        }

        if (price > 100000) {
            throw new PriceLimitExceededException(
                "Price cannot exceed Rs. 100000."
            );
        }
    }

    // Add product
    public void addProduct()
            throws InvalidProductPriceException,
                   PriceLimitExceededException {

        validatePrice(this.price);
        System.out.println("Product added successfully.");
    }

    // Update product price
    public void updatePrice(double newPrice)
            throws InvalidProductPriceException,
                   PriceLimitExceededException {

        validatePrice(newPrice);

        price = newPrice;

        System.out.println("Price updated successfully.");
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: Rs. " + price);
    }
}

public class ECommerceProductPriceValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store products using Product ID
        HashMap<Integer, ProductN> products = new HashMap<Integer, ProductN>();

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            String operation = sc.next().toUpperCase();

            try {
                if (operation.equals("ADD")) {

                    int id = sc.nextInt();
                    String name = sc.next();
                    double price = sc.nextDouble();

                    ProductN p = new ProductN(id, name, price);

                    p.addProduct();

                    // Store only valid products
                    products.put(id, p);

             //       p.displayProduct();

                } else if (operation.equals("UPDATE")) {

                    int id = sc.nextInt();
                    double newPrice = sc.nextDouble();

                    ProductN p = products.get(id);

                    if (p == null) {
                        System.out.println("Product not found.");
                    } else {

                        p.updatePrice(newPrice);

               //         p.displayProduct();
                    }

                } else {
                    System.out.println("Invalid operation.");
                }

            }
            catch (InvalidProductPriceException |
                   PriceLimitExceededException e) {
                System.out.println(
                    e.getClass().getSimpleName()
                    + ": " + e.getMessage()
                );
            }
        }
        
        
        products.entrySet().stream()
        .forEach(entry -> entry.getValue().displayProduct());
        
        
        
        
        sc.close();
    }
}


/*
Test Case 1: 
4
ADD 101 Laptop 54000
ADD 102 Mouse 700
Update 101 67000
Update 102 450

Test Case 2:
4
ADD 101 Laptop 54000
ADD 102 Mouse -700
Update 101 167000
Update 102 450

Test Case 3:
1
Update 101 67000

Test Case 4:
3
Add 101 Mouse 500
Update 101 700
Add 101 Mouse 1000

*/




