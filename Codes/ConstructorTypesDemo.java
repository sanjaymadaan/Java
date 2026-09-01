package com.company.oops;

/*
 * ============================================================
 * Program: ConstructorTypesDemo
 * Purpose:
 * This program demonstrates different types of constructors
 * in Java:
 *
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Copy Constructor
 * and explains the concept of Constructor Overloading
 * Real-World Example:
 * Product represents a product available in a store.
 * ============================================================
 */

class Product {

    // --------------------------------------------------------
    // Data Members / Fields
    // These variables store the information of a Product.
    // --------------------------------------------------------

    int pid;        // Product ID
    String pname;   // Product Name
    int pprice;     // Product Price


    // --------------------------------------------------------
    // 1. DEFAULT CONSTRUCTOR
    // --------------------------------------------------------
    /*
     * A constructor with no parameters is called a
     * default/no-argument constructor.
     *
     * It is automatically called when an object is created
     * without passing any arguments.
     */

    Product() {

        System.out.println("\nDefault Constructor Called.");
    }


    // --------------------------------------------------------
    // 2. PARAMETERIZED CONSTRUCTOR
    // --------------------------------------------------------
    /*
     * A constructor that accepts parameters is called a
     * parameterized constructor.
     *
     * This constructor initializes all the Product fields.
     */

    Product(int id, String name, int price) {

        System.out.println(
                "\nParameterized Constructor 1 Called."
        );

        pid = id;
        pname = name;
        pprice = price;
    }


    // --------------------------------------------------------
    // 3. ANOTHER PARAMETERIZED CONSTRUCTOR
    // --------------------------------------------------------
    /*
     * This is another parameterized constructor.
     *
     * It accepts only Product ID and Product Name.
     *
     * Since this constructor has a different parameter list,
     * it demonstrates Constructor Overloading.
     */

    Product(int id, String name) {

        System.out.println(
                "\nParameterized Constructor 2 Called."
        );

        pid = id;
        pname = name;

        // pprice is not explicitly initialized.
        // Therefore, Java assigns the default value 0 to it.
    }


    // --------------------------------------------------------
    // 4. COPY CONSTRUCTOR
    // --------------------------------------------------------
    /*
     * Java does not provide a built-in copy constructor like
     * some other languages.
     *
     * However, we can create our own copy constructor by
     * accepting an object of the same class as a parameter.
     *
     * Here, 'pref' is another Product object.
     *
     * The values of pref are copied into the current object.
     */

    Product(Product pref) {

        System.out.println(
                "\nCopy Constructor Called."
        );

        pid = pref.pid;
        pname = pref.pname;
        pprice = pref.pprice;
    }


    // --------------------------------------------------------
    // METHOD: getInfo()
    // --------------------------------------------------------
    /*
     * This method displays the information of a Product object.
     */

    void getInfo() {

        System.out.println("Product Information:");
        System.out.println("Product ID    : " + pid);
        System.out.println("Product Name  : " + pname);
        System.out.println("Product Price : " + pprice);
    }
}


/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class ConstructorTypesDemo {

    public static void main(String[] args) {


        // ----------------------------------------------------
        // OBJECT 1: Default Constructor
        // ----------------------------------------------------
        /*
         * No arguments are passed.
         * Therefore, the default constructor is called.
         */

        Product p1 = new Product();

        p1.getInfo();


        // ----------------------------------------------------
        // OBJECT 2: Parameterized Constructor
        // ----------------------------------------------------
        /*
         * Three arguments are passed:
         *
         * Product ID = 1001
         * Product Name = Keyboard
         * Product Price = 1200
         *
         * Therefore, Product(int, String, int) is called.
         */

        Product p2 =
                new Product(
                        1001,
                        "Keyboard",
                        1200
                );

        p2.getInfo();


        // ----------------------------------------------------
        // OBJECT 3: Constructor Overloading
        // ----------------------------------------------------
        /*
         * Two arguments are passed:
         *
         * Product ID = 1002
         * Product Name = Mouse
         *
         * Therefore, Product(int, String) is called.
         *
         * Since price is not provided, pprice gets the
         * default value 0.
         */

        Product p3 =
                new Product(
                        1002,
                        "Mouse"
                );

        p3.getInfo();


        // ----------------------------------------------------
        // OBJECT 4: Copy Constructor
        // ----------------------------------------------------
        /*
         * We want p4 to have the same values as p2.
         *
         * Instead of manually copying every field:
         *
         * Product p4 = new Product(
         *     p2.pid,
         *     p2.pname,
         *     p2.pprice
         * );
         *
         * We can use our copy constructor:
         */

        Product p4 = new Product(p2);

        p4.getInfo();
    }
}
