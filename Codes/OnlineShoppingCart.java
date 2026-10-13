package com.company.exception;

class CartItem {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public CartItem(int productId, String productName,
                    double price, int quantity) {

        if (productId <= 0)
            throw new IllegalArgumentException(
                "Product ID must be positive.");

        if (productName == null || productName.isBlank())
            throw new IllegalArgumentException(
                "Product name cannot be empty.");

        if (price <= 0)
            throw new IllegalArgumentException(
                "Price must be a valid positive number.");

        if (quantity <= 0)
            throw new IllegalArgumentException(
                "Quantity must be positive.");

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double calculateSubtotal() {
        return price * quantity;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity <= 0)
            throw new IllegalArgumentException(
                "Quantity must be positive.");

        this.quantity = newQuantity;
    }

    public void displayItem() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + calculateSubtotal());
    }
}


class ShoppingCart {
    private CartItem[] arr;

    public ShoppingCart(int numberOfItems) {
        if (numberOfItems <= 0) {
            throw new IllegalArgumentException(
                "Cart capacity must be positive.");
        }

        arr = new CartItem[numberOfItems];
    }

    public void addItems(CartItem item) {
        try {
            if (item == null) {
                throw new IllegalArgumentException(
                    "Cart item cannot be null.");
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = item;
                    System.out.println(
                        "Item added successfully.");
                    return;
                }
            }

            throw new IllegalStateException(
                "Shopping cart is full.");

        } catch (IllegalArgumentException |
                 IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println(
                "Add item operation completed.");
        }
    }

    public void removeItems(String name) {
        try {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException(
                    "Product name cannot be empty.");
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null &&
                    arr[i].getProductName()
                          .equalsIgnoreCase(name)) {

                    arr[i] = null;
                    System.out.println(
                        "Item removed successfully.");
                    return;
                }
            }

            throw new IllegalStateException(
                "Product not found: " + name);

        } catch (IllegalArgumentException |
                 IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println(
                "Remove item operation completed.");
        }
    }

    public double totalBill() {
        double totalbill = 0.0;

        try {
            boolean found = false;

            for (CartItem item : arr) {
                if (item != null) {
                    totalbill += item.calculateSubtotal();
                    found = true;
                }
            }

            if (!found) {
                throw new IllegalStateException(
                    "No items in the cart.");
            }

            return totalbill;

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
            return 0.0;

        } finally {
            System.out.println(
                "Bill calculation operation completed.");
        }
    }

    public void displayCart() {
        try {
            boolean found = false;

            for (CartItem item : arr) {
                if (item != null) {
                    item.displayItem();
                    System.out.println("---------------");
                    found = true;
                }
            }

            if (!found) {
                throw new IllegalStateException(
                    "Shopping cart is empty.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println(
                "Display cart operation completed.");
        }
    }
}


public class OnlineShoppingCart {
	public static void main(String[] args) {
	
		CartItem c1 = new CartItem(101, "Laptop", 67000, 10);
		CartItem c2 = new CartItem(102, "Mouse", 500, 5);
		CartItem c3 = new CartItem(103, "Book", 1070, 10);
		CartItem c4 = new CartItem(104, "Pendrive", 1000, 6);
		CartItem c5 = new CartItem(105, "Keyboard", 670, 5);
		CartItem c6 = null;
		
		ShoppingCart sc1 = new ShoppingCart(3);
		sc1.addItems(c1);
		sc1.addItems(c2);
		sc1.addItems(c3);
		
		sc1.displayCart();
		
		System.out.println("=============");
		sc1.removeItems("Mouse");
		sc1.displayCart();

		System.out.println("=============");
		sc1.removeItems("Pen");
		sc1.displayCart();
		System.out.println("=============");
		sc1.addItems(c6);
		sc1.addItems(c5);
		sc1.displayCart();
		
		System.out.println("=============");
		sc1.addItems(c4);    
		sc1.displayCart();
		
		System.out.println("=============");
		sc1.addItems(c6);    
		sc1.displayCart();
		
		
	}
}
