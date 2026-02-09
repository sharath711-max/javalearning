package com.javalearning.basics;

/**
 * Operators in Java
 * Demonstrates arithmetic, logical, and comparison operators
 */
public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));    // Addition
        System.out.println("a - b = " + (a - b));    // Subtraction
        System.out.println("a * b = " + (a * b));    // Multiplication
        System.out.println("a / b = " + (a / b));    // Division
        System.out.println("a % b = " + (a % b));    // Modulus (remainder)
        System.out.println("++a = " + (++a));        // Increment
        System.out.println("--b = " + (--b));        // Decrement

        // Comparison Operators
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a == b: " + (a == b));   // Equal
        System.out.println("a != b: " + (a != b));   // Not equal
        System.out.println("a > b: " + (a > b));     // Greater than
        System.out.println("a < b: " + (a < b));     // Less than
        System.out.println("a >= b: " + (a >= b));   // Greater or equal
        System.out.println("a <= b: " + (a <= b));   // Less or equal

        // Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y (AND): " + (x && y));  // Both true
        System.out.println("x || y (OR): " + (x || y));   // At least one true
        System.out.println("!x (NOT): " + (!x));          // Opposite
    }
}
