package com.company.array;

import java.util.Arrays;

public class JaggedArrayDemo {

    // Method to display the elements of a jagged array
    public static void display(String[][] arr) {

        System.out.println("Jagged Array Elements:");

        // Outer loop traverses each row
        for (String[] row : arr) {

            // Inner loop traverses elements of the current row
            for (String element : row) {
                System.out.printf("%2s ", element);
            }

            // Move to the next line after displaying one row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
         * Creating a jagged array with 4 rows.
         *
         * At this point, only the number of rows is specified.
         * The number of columns for each row can be different.
         */
        String[][] arr = new String[4][];

        /*
         * Create each row with a different size.
         *
         * index = 3 → row size = 4
         * index = 2 → row size = 3
         * index = 1 → row size = 2
         * index = 0 → row size = 1
         *
         * Therefore, the array will look like:
         *
         * Row 0 → [*, *, *, *]
         * Row 1 → [*, *, *]
         * Row 2 → [*, *]
         * Row 3 → [*]
         */
        int row = 0;

        for (int index = arr.length - 1; index >= 0; index--) {

            // Create a row with a different number of columns
            arr[row] = new String[index + 1];

            // Fill all elements of the current row with "*"
            Arrays.fill(arr[row], "*");

            row++;
        }

        // Display the jagged array
        display(arr);
    }
}