package com.company.string;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        // Original String
        String str = "This,is,String,tokenizer,session";

        // =========================================================
        // APPROACH 1:
        // StringTokenizer + StringJoiner
        // =========================================================

        // StringTokenizer breaks the string into tokens
        // using comma (,) as the delimiter.
        StringTokenizer st = new StringTokenizer(str, ",");

        // StringJoiner joins multiple strings using "#"
        // as the delimiter.
        StringJoiner sj = new StringJoiner("#");

        // Check whether more tokens are available
        while (st.hasMoreTokens()) {

            // Get the next token and add it to StringJoiner
            sj.add(st.nextToken());
        }

        System.out.println("Using StringTokenizer + StringJoiner:");
        System.out.println(sj);

        /*
         * Output:
         * This#is#String#tokenizer#session
         */


        System.out.println("================================");


        // =========================================================
        // APPROACH 2:
        // String.split() + String.concat()
        // =========================================================

        // split() divides the string into an array.
        // Here comma is used as the delimiter.
        String[] strarr = str.split(",");

        // Empty String
        String reqStr = "";

        // Traverse the String array
        for (String eachstr : strarr) {

            // Add each string followed by "#"
            reqStr = reqStr.concat(eachstr).concat("#");
        }

        System.out.println("Using split() + concat():");
        System.out.println(reqStr);

        /*
         * Output:
         * This#is#String#tokenizer#session#
         *
         * Notice that an extra "#" is present at the end.
         */


        System.out.println("================================");


        // =========================================================
        // APPROACH 3:
        // String.split() + StringJoiner
        // =========================================================

        StringJoiner reqStrJoiner =
                new StringJoiner("#");

        // Traverse the String array
        for (String eachstr : strarr) {

            // Add each element to StringJoiner
            reqStrJoiner.add(eachstr);
        }

        System.out.println("Using split() + StringJoiner:");
        System.out.println(reqStrJoiner);

        /*
         * Output:
         * This#is#String#tokenizer#session
         *
         * No extra "#" is added at the end.
         */


        System.out.println("================================");


        // =========================================================
        // APPROACH 4:
        // StringJoiner.merge()
        // =========================================================

        // Create another StringJoiner.
        // Empty string is used as delimiter.
        StringJoiner sj1 = new StringJoiner("");

        // Add "Hello" to sj1
        sj1.add("Hello");

        // Merge sj1 into sj
        sj.merge(sj1);

        System.out.println("After merge():");
        System.out.println(sj);

        /*
         * sj originally contains:
         *
         * This#is#String#tokenizer#session
         *
         * sj1 contains:
         *
         * Hello
         *
         * After merge():
         *
         * This#is#String#tokenizer#session#Hello
         */
    }
}