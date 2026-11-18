package com.company.exception;

import java.util.Scanner;

// Inventory class
class Inventory {

    int productId;
    String productName;
    int availableQuantity;

    // Constructor with initial stock validation
    public Inventory(int productId, String productName,
                     int availableQuantity)
            throws InvalidQuantityException,
                   MaximumStockLimitException {
        if (availableQuantity < 0) {
            throw new InvalidQuantityException(
                    ": Initial stock cannot be negative.");
        }
        if (availableQuantity > 500) {
            throw new MaximumStockLimitException(
                    ": Initial stock cannot exceed 500 units.");
        }
        this.productId = productId;
        this.productName = productName;
        this.availableQuantity = availableQuantity;
    }

    // Add stock
    void addStock(int quantity)
            throws InvalidQuantityException,
                   MaximumStockLimitException {
        if (quantity <= 0) {
            throw new InvalidQuantityException(
                    ": Quantity must be greater than zero.");
        }

        if (this.availableQuantity + quantity > 500) {
            throw new MaximumStockLimitException(
                    ": Inventory cannot exceed 500 units.");
        }
        this.availableQuantity += quantity;
    }

    // Purchase product
    void purchaseProduct(int quantity)
            throws InvalidQuantityException,
                   InsufficientStockException {
        if (quantity <= 0) {
            throw new InvalidQuantityException(
                    ": Quantity must be greater than zero.");
        }
        if (quantity > this.availableQuantity) {
            throw new InsufficientStockException(
                    ": Requested quantity is not available.");
        }
        this.availableQuantity -= quantity;
    }

    // Display stock
    void displayStock(String message) {
        System.out.println(message + this.availableQuantity);
    }
}

// Custom exception: Insufficient stock
class InsufficientStockException extends Exception {

    public InsufficientStockException(String message) {
        super(message);
    }
}

// Custom exception: Invalid quantity
class InvalidQuantityException extends Exception {

    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Custom exception: Maximum stock limit exceeded
class MaximumStockLimitException extends Exception {

    public MaximumStockLimitException(String message) {
        super(message);
    }
}

// Main class
public class OnlineShoppingCartInsufficientStock {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productId = scanner.nextInt();
        String productName = scanner.next();
        int initialStock = scanner.nextInt();

        int noOfOperations = scanner.nextInt();

        Inventory inventory = null;
        // Create inventory with exception handling
        try {
            inventory = new Inventory(productId, productName, initialStock);
        } catch (InvalidQuantityException e) {
            System.out.println(
                    e.getClass().getSimpleName() + e.getMessage());
        } catch (MaximumStockLimitException e) {
            System.out.println(
                    e.getClass().getSimpleName() + e.getMessage());
        }

        // Process inventory operations
        if (inventory != null) {
            for (int i = 0; i < noOfOperations; i++) {
                String operation = scanner.next();
                int quantity = scanner.nextInt();

                try {
                    switch (operation) {
                        case "Purchase":
                            inventory.purchaseProduct(quantity);
                            inventory.displayStock(
                                    "Remaining stock: ");
                            break;

                        case "AddStock":
                            inventory.addStock(quantity);
                            inventory.displayStock(
                                    "Updated stock: ");
                            break;
                        default:
                            System.out.println(
                                    "Invalid Operation.");
                            break;
                    }
                } catch (InvalidQuantityException e) {
                    System.out.println(
                            e.getClass().getSimpleName()
                            + e.getMessage());
                } catch (InsufficientStockException e) {
                    System.out.println(
                            e.getClass().getSimpleName()
                            + e.getMessage());
                } catch (MaximumStockLimitException e) {
                    System.out.println(
                            e.getClass().getSimpleName()
                            + e.getMessage());
                } finally {
                    System.out.println(
                            "Transaction processing completed.");
                }
            }
        }
        scanner.close();
    }
}


/*
Test Cases: Online Shopping Cart – Custom Exception Handling


Test Case 1: Successful Stock Addition

Input:

101 Laptop 100
2
AddStock 50
AddStock 100

Expected Output:

	Updated stock: 150
Transaction processing completed.
Updated stock: 250
Transaction processing completed.


Test Case 2: Successful Product Purchase

Input:

101 Laptop 100
2
Purchase 20
Purchase 30


Expected Output:

Remaining stock: 80
Transaction processing completed.
Remaining stock: 50
Transaction processing completed.


Test Case 3: Insufficient Stock Exception

Input:

101 Laptop 100
2
Purchase 80
Purchase 30


Expected Output:

Remaining stock: 20
Transaction processing completed.
InsufficientStockException: Requested quantity is not available.
Transaction processing completed.


Test Case 4: Invalid Quantity Exception

Input:

101 Laptop 100
3
AddStock -10
Purchase 0
Purchase -5


Expected Output:

InvalidQuantityException: Quantity must be greater than zero.
Transaction processing completed.
InvalidQuantityException: Quantity must be greater than zero.
Transaction processing completed.
InvalidQuantityException: Quantity must be greater than zero.
Transaction processing completed.


Test Case 5: Maximum Stock Limit Exception

Input:

101 Laptop 450
3
AddStock 50
AddStock 1
Purchase 100


Expected Output:

Updated stock: 500
Transaction processing completed.
MaximumStockLimitException: Inventory cannot exceed 500 units.
Transaction processing completed.
Remaining stock: 400
Transaction processing completed.


Test Case 6: Initial Stock Validation

Input:

101 Laptop 600
2
AddStock 50
Purchase 20


Expected Output:

MaximumStockLimitException: Initial stock cannot exceed 500 units.

*Note: Since inventory creation fails, subsequent operations are not processed.*

Test Case 7: Zero Initial Stock

Input:
101 Laptop 0
2
Purchase 10
AddStock 100

Expected Output::
InsufficientStockException: Requested quantity is not available.
Transaction processing completed.
Updated stock: 100
Transaction processing completed.

*/