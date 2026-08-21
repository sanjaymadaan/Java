package com.company.array;

import java.util.Arrays;

public class ArraysMethodDemo {

    // Method to display a one-dimensional integer array
    private static void display(int[] arr) {

        System.out.println("\nArray Elements:");

        for (int element : arr) {
            System.out.printf("%4d", element);
        }

        System.out.println();
    }

    // Method to display a String array
    private static void display(String[] arr) {

        System.out.println("\nArray Elements:");

        for (String element : arr) {
            System.out.printf("%12s", element);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = { 2, 34, 45, 67, 78, 96, 32, 45, 33 };

        int[] arr2 = { 2, 34, 45, 67, 78, 96, 33, 45, 33 };

        System.out.println("========== ORIGINAL ARRAYS ==========");

        display(arr1);
        display(arr2);


        // =====================================================
        // 1. Arrays.toString()
        // =====================================================

        System.out.println("\n========== toString() ==========");

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));


        // =====================================================
        // 2. Arrays.copyOf()
        // =====================================================

        System.out.println("\n========== copyOf() ==========");

        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        display(arr3);

        // Copy first 5 elements
        int[] arr4 = Arrays.copyOf(arr1, 5);

        System.out.println("First 5 elements:");
        display(arr4);

        // Copy with larger size
        int[] arr5 = Arrays.copyOf(arr1, 12);

        System.out.println("Copy with larger size:");
        display(arr5);


        // =====================================================
        // 3. Arrays.copyOfRange()
        // =====================================================

        System.out.println("\n========== copyOfRange() ==========");

        int[] arr6 = Arrays.copyOfRange(arr1, 4, arr1.length);

        System.out.println("Elements from index 4:");
        display(arr6);

        int[] arr7 = Arrays.copyOfRange(arr1, 2, 6);

        System.out.println("Elements from index 2 to 5:");
        display(arr7);


        // =====================================================
        // 4. Arrays.equals()
        // =====================================================

        System.out.println("\n========== equals() ==========");

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("arr1 and arr2 are equal.");
        } else {
            System.out.println("arr1 and arr2 are not equal.");
        }


        // =====================================================
        // 5. Arrays.compare()
        // =====================================================

        System.out.println("\n========== compare() ==========");

        int result = Arrays.compare(arr1, arr2);

        System.out.println("Arrays.compare(arr1, arr2) = " + result);

        if (result == 0) {
            System.out.println("Both arrays are equal.");
        } else if (result < 0) {
            System.out.println("arr1 is smaller than arr2.");
        } else {
            System.out.println("arr1 is greater than arr2.");
        }


        // =====================================================
        // 6. Arrays.mismatch()
        // =====================================================

        System.out.println("\n========== mismatch() ==========");

        int mismatchIndex = Arrays.mismatch(arr1, arr2);

        System.out.println("First mismatch index: " + mismatchIndex);

        if (mismatchIndex == -1) {
            System.out.println("No mismatch found.");
        } else {
            System.out.println("arr1[" + mismatchIndex + "] = "
                    + arr1[mismatchIndex]);

            System.out.println("arr2[" + mismatchIndex + "] = "
                    + arr2[mismatchIndex]);
        }


        // =====================================================
        // 7. Arrays.mismatch() with ranges
        // =====================================================

        System.out.println("\n========== mismatch() with ranges ==========");

        int mismatchRange = Arrays.mismatch(
                arr1, 0, 5,
                arr2, 1, 6
        );

        System.out.println("Mismatch index within selected ranges: "
                + mismatchRange);


        // =====================================================
        // 8. Arrays.fill()
        // =====================================================

        System.out.println("\n========== fill() ==========");

        int[] arr8 = new int[10];

        Arrays.fill(arr8, 50);

        System.out.println("After filling entire array with 50:");
        display(arr8);


        // Fill a specific range
        Arrays.fill(arr8, 2, 6, 100);

        System.out.println("After filling index 2 to 5 with 100:");
        display(arr8);


        // =====================================================
        // 9. Arrays.sort()
        // =====================================================

        System.out.println("\n========== sort() ==========");

        int[] arr9 = Arrays.copyOf(arr1, arr1.length);

        System.out.println("Before sorting:");
        display(arr9);

        Arrays.sort(arr9);

        System.out.println("After sorting:");
        display(arr9);


        // =====================================================
        // 10. Arrays.binarySearch()
        // =====================================================

        System.out.println("\n========== binarySearch() ==========");

        // Binary search requires a sorted array
        int searchElement = 67;

        int index = Arrays.binarySearch(arr9, searchElement);

        System.out.println("Searching for: " + searchElement);
        System.out.println("Element found at index: " + index);


        // =====================================================
        // 11. Arrays.setAll()
        // =====================================================

        System.out.println("\n========== setAll() ==========");

        int[] arr11 = new int[10];

        Arrays.setAll(arr11, indexValue -> indexValue * 10);

        System.out.println("Array generated using setAll():");
        display(arr11);

    }
}