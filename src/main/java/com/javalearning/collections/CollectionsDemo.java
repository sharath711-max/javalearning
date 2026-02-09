package com.javalearning.collections;

import java.util.*;

/**
 * Collections Framework Demo
 * Demonstrates List, Set, and Map
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // List - Ordered, allows duplicates
        System.out.println("=== List (ArrayList) ===");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate allowed

        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Size: " + fruits.size());

        // Set - Unordered, no duplicates
        System.out.println("\n=== Set (HashSet) ===");
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Cherry");
        uniqueFruits.add("Apple"); // Duplicate ignored

        System.out.println("Unique Fruits: " + uniqueFruits);
        System.out.println("Size: " + uniqueFruits.size());

        // Map - Key-Value pairs
        System.out.println("\n=== Map (HashMap) ===");
        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 5);
        fruitCount.put("Banana", 3);
        fruitCount.put("Cherry", 2);

        System.out.println("Fruit Count: " + fruitCount);
        System.out.println("Apple count: " + fruitCount.get("Apple"));

        // Iteration
        System.out.println("\n=== Iteration ===");
        System.out.println("Iterating Map:");
        for (String key : fruitCount.keySet()) {
            System.out.println(key + " -> " + fruitCount.get(key));
        }
    }
}
