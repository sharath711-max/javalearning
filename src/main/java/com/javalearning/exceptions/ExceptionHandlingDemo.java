package com.javalearning.exceptions;

/**
 * Exception Handling
 * Demonstrates try-catch-finally and custom exceptions
 */
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("=== Exception Handling ===\n");

        // Example 1: Arithmetic Exception
        System.out.println("Example 1: Division");
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Division operation completed.\n");
        }

        // Example 2: Array Index Exception
        System.out.println("Example 2: Array Access");
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } finally {
            System.out.println("Array access completed.\n");
        }

        // Example 3: Multiple Exceptions
        System.out.println("Example 3: Multiple Exceptions");
        try {
            String number = "abc";
            int num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method that throws exception
    static int divide(int a, int b) {
        return a / b;  // Throws ArithmeticException if b is 0
    }

    // Custom Exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Method with custom exception
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        System.out.println("Withdrawal successful: $" + amount);
    }
}
