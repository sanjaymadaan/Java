package com.company.basic;

/*
 * Program: Demonstration of Java Literals and Primitive Data Types
 *
 * Literals:
 * Literals are fixed values assigned directly to variables.
 * Examples:
 *  'A'          -> Character Literal
 *  "Hello"      -> String Literal
 *  100          -> Integer Literal
 *  34.56        -> Floating Point Literal
 *  true         -> Boolean Literal
 *
 * Primitive Data Types in Java:
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. char
 * 8. boolean
 */

public class LiteralDemo1 {

    public static void main(String[] args) {

        // ================= Integer Literals =================

        // Decimal Literal (Base 10)
        int var1 = 42;

        // Octal Literal (Base 8) - Starts with 0
        int var2 = 052;

        // Binary Literal (Base 2) - Starts with 0b or 0B
        int var3 = 0B101010;

        // Hexadecimal Literal (Base 16) - Starts with 0x or 0X
        int var4 = 0x2A;

        System.out.println("Decimal Literal      : " + var1);
        System.out.println("Octal Literal        : " + var2);
        System.out.println("Binary Literal       : " + var3);
        System.out.println("Hexadecimal Literal  : " + var4);

        // Display the same number in different number systems
        System.out.println("\n========== Number System Conversion ==========");

        System.out.println("Binary Representation      : " +
                Integer.toBinaryString(var1));

        System.out.println("Octal Representation       : " +
                Integer.toOctalString(var1));

        System.out.println("Hexadecimal Representation : " +
                Integer.toHexString(var1));

        // ================= byte Data Type =================

        System.out.println("\n========== Byte ==========");

        byte byteVar = 45;

        System.out.println("Value      : " + byteVar);
        System.out.println("Minimum    : " + Byte.MIN_VALUE);
        System.out.println("Maximum    : " + Byte.MAX_VALUE);

        // ================= short Data Type =================

        System.out.println("\n========== Short ==========");

        short shortVar = 45;

        System.out.println("Value      : " + shortVar);
        System.out.println("Minimum    : " + Short.MIN_VALUE);
        System.out.println("Maximum    : " + Short.MAX_VALUE);

        // ================= long Data Type =================

        System.out.println("\n========== Long ==========");

        // Long literal must end with L or l
        long longVar = 21474836499L;

        System.out.println("Long Value : " + longVar);

        // ================= float Data Type =================

        System.out.println("\n========== Float ==========");

        // Float literal must end with F or f
        float floatVar = 34.563758327892F;

        System.out.printf("Float Value : %.8f%n", floatVar);

        // ================= double Data Type =================

        System.out.println("\n========== Double ==========");

        // Double is the default floating-point type
        double doubleVar = 34.56;

        System.out.println("Double Value : " + doubleVar);

        // ================= Character Literals =================

        System.out.println("\n========== Character Literals ==========");

        // Character Literal
        char charVar = 'a';
        System.out.println("Character Literal          : " + charVar);

        // ASCII value converted into Character
        char charVar1 = 65;
        System.out.println("ASCII Value 65             : " + charVar1);

        // Unicode Representation
        int charVar2 = '\u0041';
        System.out.println("Unicode \\u0041 (Integer)   : " + charVar2);

        // Octal Literal assigned to Character
        char charVar3 = 065;
        System.out.println("Octal 065 as Character     : " + charVar3);

        // Hexadecimal Literal assigned to Character
        char charVar4 = 0x65;
        System.out.println("Hexadecimal 0x65 Character : " + charVar4);

        // ================= Boolean Data Type =================

        System.out.println("\n========== Boolean ==========");

        boolean bVar = true;

        System.out.println("Boolean Value : " + bVar);

    }
}
