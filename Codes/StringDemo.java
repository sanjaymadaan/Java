package com.company.string;

public class StringDemo {

    public static void main(String[] args) {

        String text = "   Java Programming Java   ";

        System.out.println("Original String: [" + text + "]");

        // 1. length()
        System.out.println("\n1. length()");
        System.out.println("Length = " + text.length());

        // 2. charAt()
        System.out.println("\n2. charAt()");
        System.out.println("Character at index 3 = " + text.charAt(3));

        // 3. substring(int)
        System.out.println("\n3. substring(int)");
        System.out.println(text.substring(3));

        // 4. substring(int, int)
        System.out.println("\n4. substring(int, int)");
        System.out.println(text.substring(3, 7));

        // 5. concat()
        System.out.println("\n5. concat()");
        System.out.println(text.concat(" Course"));

        // 6. indexOf()
        System.out.println("\n6. indexOf()");
        System.out.println("First Java = " + text.indexOf("Java"));

        // 7. indexOf(String, int)
        System.out.println("\n7. indexOf(String, int)");
        System.out.println("Java after index 5 = " +
                           text.indexOf("Java", 5));

        // 8. lastIndexOf()
        System.out.println("\n8. lastIndexOf()");
        System.out.println("Last Java = " +
                           text.lastIndexOf("Java"));

        // 9. equals()
        System.out.println("\n9. equals()");
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1.equals(s2));

        // 10. equalsIgnoreCase()
        System.out.println("\n10. equalsIgnoreCase()");
        System.out.println("java".equalsIgnoreCase("JAVA"));

        // 11. compareTo()
        System.out.println("\n11. compareTo()");
        System.out.println("Apple vs Banana = " +
                           "Apple".compareTo("Banana"));

        // 12. compareToIgnoreCase()
        System.out.println("\n12. compareToIgnoreCase()");
        System.out.println("java vs JAVA = " +
                           "java".compareToIgnoreCase("JAVA"));

        // 13. toLowerCase()
        System.out.println("\n13. toLowerCase()");
        System.out.println(text.toLowerCase());

        // 14. toUpperCase()
        System.out.println("\n14. toUpperCase()");
        System.out.println(text.toUpperCase());

        // 15. trim()
        System.out.println("\n15. trim()");
        System.out.println("[" + text.trim() + "]");

        // 16. replace()
        System.out.println("\n16. replace()");
        System.out.println(text.replace('a', 'o'));

        // 17. contains()
        System.out.println("\n17. contains()");
        System.out.println("Contains Java = " +
                           text.contains("Java"));

        // 18. toCharArray()
        System.out.println("\n18. toCharArray()");

        char[] chars = text.toCharArray();

        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        // 19. startsWith()
        System.out.println("\n\n19. startsWith()");
        System.out.println("Starts with Java = " +
                           text.startsWith("Java"));
    }
}