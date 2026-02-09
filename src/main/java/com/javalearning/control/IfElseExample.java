package com.javalearning.control;

/**
 * If-Else Statements
 * Demonstrates conditional execution
 */
public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        System.out.println("=== Grade Calculator ===");
        System.out.println("Score: " + score);

        // Simple if
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Ternary operator
        System.out.println("\n=== Ternary Operator ===");
        String status = score >= 70 ? "PASS" : "FAIL";
        System.out.println("Status: " + status);
    }
}
