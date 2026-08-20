package com.company.array;

import java.util.Scanner;

public class TwoDArrayOperations {

    // Method to display the 2-D array
    public static void display(int[][] arr) {

        System.out.println("\nArray Elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }
    }

    // Method to calculate the sum of all elements
    public static int calculateSum(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }

        return sum;
    }

    // Method to display row-wise sum
    public static void rowWiseSum(int[][] arr) {

        System.out.println("\nRow-wise Sum:");

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            System.out.println("Sum of Row " + i + " = " + sum);
        }
    }

    // Method to display column-wise sum
    public static void columnWiseSum(int[][] arr) {

        System.out.println("\nColumn-wise Sum:");

        // Number of columns
        int columns = arr[0].length;

        for (int j = 0; j < columns; j++) {

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }

            System.out.println("Sum of Column " + j + " = " + sum);
        }
    }

    // Method to find maximum element
    public static int findMaximum(int[][] arr) {

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    // Method to find minimum element
    public static int findMinimum(int[][] arr) {

        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min;
    }

    // Method to search an element
    public static void searchElement(int[][] arr, int key) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == key) {

                    System.out.println(
                            "Element " + key +
                            " found at position [" + i + "][" + j + "]"
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found.");
        }
    }

    // Method to display transpose
    public static void transpose(int[][] arr) {

        System.out.println("\nTranspose of Array:");

        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare a 2-D array with 3 rows and 4 columns
        int[][] arr = new int[3][4];

        // Taking input from the user
        System.out.println("Enter 12 elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(
                        "Enter element [" + i + "][" + j + "]: "
                );

                arr[i][j] = sc.nextInt();
            }
        }

        // Display the array
        display(arr);

        // Calculate total sum
        System.out.println(
                "\nTotal Sum = " + calculateSum(arr)
        );

        // Row-wise sum
        rowWiseSum(arr);

        // Column-wise sum
        columnWiseSum(arr);

        // Maximum element
        System.out.println(
                "\nMaximum Element = " + findMaximum(arr)
        );

        // Minimum element
        System.out.println(
                "Minimum Element = " + findMinimum(arr)
        );

        // Search an element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        searchElement(arr, key);

        // Transpose
        transpose(arr);

        sc.close();
    }
}