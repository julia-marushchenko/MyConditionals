/**
 *  Java program to demonstrate conditional operators OR and ||.
 */

package com.myoperators;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        if (true | true) {
            System.out.println("Output true");
        }

        if (true | false) {
            System.out.println("Output true");
        }

        if (false | true) {
            System.out.println("Output true");
        }

        if (false | false) {
            // No output because of false
        }

        if (true || true) {
            System.out.println("Output true");
        }

        if (true || false) {
            System.out.println("Output true");
        }

        if (false || true) {
            System.out.println("Output true");
        }

        if (false || false) {
            // No output because of false
        }
    }
}