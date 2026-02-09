package com.javalearning.advanced;

/**
 * Design Patterns - Singleton
 * Ensures only one instance of a class
 */
public class Singleton {
    private static Singleton instance;
    private String data;

    // Private constructor prevents instantiation
    private Singleton() {
        this.data = "Singleton Instance";
    }

    // Public method to get instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern ===\n");

        // Get instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 data: " + singleton1.getData());
        System.out.println("singleton2 data: " + singleton2.getData());

        // Modify through singleton1
        singleton1.setData("Modified Data");

        // Check singleton2 - same data
        System.out.println("\nAfter modification:");
        System.out.println("singleton1 data: " + singleton1.getData());
        System.out.println("singleton2 data: " + singleton2.getData());
        System.out.println("Same instance: " + (singleton1 == singleton2));
    }
}
