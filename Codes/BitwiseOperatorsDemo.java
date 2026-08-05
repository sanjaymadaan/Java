package com.company.basic;

/**
 * Program: Demonstration of Bitwise Operators in Java
 * Author: Your Name
 * Description: This program illustrates all the bitwise operators
 *              available in Java with examples.
 */

public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        int a = 5;    // Binary: 00000101
        int b = 3;    // Binary: 00000011

        System.out.println("BITWISE OPERATORS IN JAVA");

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        System.out.println("\n1. Bitwise AND (&)");
        System.out.println("a & b = " + (a & b));

        System.out.println("\n2. Bitwise OR (|)");
        System.out.println("a | b = " + (a | b));

        System.out.println("\n3. Bitwise XOR (^)");
        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("\n4. Bitwise NOT (~)");
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));

        System.out.println("\n5. Left Shift (<<)");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));

        System.out.println("\n6. Right Shift (>>)");
        System.out.println("20 >> 1 = " + (20 >> 1));
        System.out.println("20 >> 2 = " + (20 >> 2));

        System.out.println("\n7. Unsigned Right Shift (>>>)");
        int c = -20;
        System.out.println("c = " + c);
        System.out.println("c >>> 2 = " + (c >>> 2));

    }
}