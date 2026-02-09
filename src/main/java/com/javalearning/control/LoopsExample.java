package com.javalearning.control;

/**
 * Loops in Java
 * Demonstrates for, while, and do-while loops
 */
public class LoopsExample {
    public static void main(String[] args) {
        // For loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop
        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("Value: " + j);
            j++;
        }

        // Do-While loop
        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);

        // Enhanced for loop (for-each)
        System.out.println("\n=== Enhanced For Loop ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Break and Continue
        System.out.println("\n=== Break and Continue ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;  // Skip iteration
            }
            if (i == 8) {
                break;     // Exit loop
            }
            System.out.println("i = " + i);
        }
    }
}
