package com.javalearning.basics;

/**
 * Variables and Data Types
 * Demonstrates all primitive data types in Java
 */
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;              // 8-bit
        short shortValue = 32000;          // 16-bit
        int intValue = 2147483647;         // 32-bit (most common)
        long longValue = 9223372036854775807L; // 64-bit (suffix L)

        // Floating point types
        float floatValue = 3.14f;          // 32-bit (suffix f)
        double doubleValue = 3.14159265;   // 64-bit (default, most common)

        // Character and Boolean
        char charValue = 'A';              // 16-bit Unicode
        boolean boolValue = true;          // true or false

        // String (Reference type)
        String name = "Java Learner";

        // Display values
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("String: " + name);

        // Type casting
        System.out.println("\n=== Type Casting ===");
        double num = 3.99;
        int casted = (int) num;  // Explicit cast (loses decimal)
        System.out.println("Double: " + num + " -> Int: " + casted);
    }
}
