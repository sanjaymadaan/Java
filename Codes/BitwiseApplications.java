package com.company.basic;

public class BitwiseApplications {

    public static void main(String[] args) {

        int number = 18;

        // Check Even or Odd
        if ((number & 1) == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");

        // Multiply by 4
        System.out.println("Multiply by 4 : " + (number << 2));

        // Divide by 2
        System.out.println("Divide by 2 : " + (number >> 1));

        // Check Power of Two
        int n = 16;

        if ((n & (n - 1)) == 0)
            System.out.println(n + " is Power of Two");
        else
            System.out.println(n + " is Not Power of Two");

        // Swap using XOR
        int a = 25;
        int b = 50;

        System.out.println("\nBefore Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}