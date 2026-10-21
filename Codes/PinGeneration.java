package com.company.collectionframework;

public class PinGeneration {

    // Validate the name
    private static String validateName(String name, String fieldName) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    fieldName + " cannot be null or empty.");
        }
        name = name.trim();
        return name;
    }
    // Validate the PIN
    private static String validatePin(int pin) {
        if (pin < 100000 || pin > 999999) {
            throw new IllegalArgumentException(
                    "PIN must be a six-digit positive number.");
        }
        return String.valueOf(pin);
    }
    
    public static int validateNumber(int pin, int n) {
    	String pinStr = Integer.toString(pin);
    	if (n < 1 || n > pinStr.length()) {
            throw new IllegalArgumentException(
                    "n must be between 1 and "+ pinStr.length()+".");
        }
    	return n;
    }

    // Toggle the case of every alphabetic character
    public static String toggleString(String str) {
        if (str == null) {
            throw new IllegalArgumentException(
                    "String cannot be null.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Generate the required PIN
    public static String generatePin(
            String firstName, String lastName, int pin, int n) {

        String longerName;
        String smallerName;
        String pinStr = Integer.toString(pin);
        // Select longer and smaller names
        if (firstName.length() > lastName.length()) {
            longerName = firstName;
            smallerName = lastName;
        } else if (firstName.length() < lastName.length()) {
            longerName = lastName;
            smallerName = firstName;
        } else {
            // If lengths are equal, use lexicographical order
            if (firstName.compareTo(lastName) >= 0) {
                longerName = firstName;
                smallerName = lastName;
            } else {
                longerName = lastName;
                smallerName = firstName;
            }
        }

        // Construct the required string
        String result = longerName.charAt(0)
                + smallerName
                + pinStr.charAt(n - 1)
                + pinStr.charAt(pinStr.length() - n);

        // Toggle the case
        return toggleString(result);
    }

    public static void main(String[] args) {
        try {
            String firstName = "Rajiv";
            String lastName = "Roy";
            int pin = 560037;
            int n = 5;

            // Validate all inputs
            firstName = validateName(firstName, "First name");
            lastName = validateName(lastName, "Last name");
            n = validateNumber(pin, n);
            String pinStr = validatePin(pin);

            String result = generatePin(
                    firstName, lastName, pin, n);

            System.out.println("Generated PIN: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
