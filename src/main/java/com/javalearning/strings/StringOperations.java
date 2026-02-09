package com.javalearning.strings;

/**
 * String Operations
 * Demonstrates string manipulation and methods
 */
public class StringOperations {
    public static void main(String[] args) {
        String text = "Hello Java World";

        System.out.println("=== String Methods ===");
        System.out.println("Original: " + text);

        // Basic methods
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("Substring (0-5): " + text.substring(0, 5));

        // Search and replace
        System.out.println("\n=== Search and Replace ===");
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Replace: " + text.replace("Java", "Programming"));

        // String comparison
        System.out.println("\n=== String Comparison ===");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));           // true (same reference)
        System.out.println("str1.equals(str3): " + (str1.equals(str3))); // true (same content)

        // String concatenation
        System.out.println("\n=== Concatenation ===");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Concatenation: " + fullName);

        // StringBuilder for efficient concatenation
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append("Item ").append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}
