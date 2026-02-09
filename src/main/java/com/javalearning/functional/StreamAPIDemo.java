package com.javalearning.functional;

import java.util.*;
import java.util.stream.*;

/**
 * Functional Programming - Stream API
 * Demonstrates lambdas and streams
 */
public class StreamAPIDemo {
    public static void main(String[] args) {
        System.out.println("=== Stream API ===\n");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter and print
        System.out.println("Filter (even numbers):");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Map transformation
        System.out.println("\nMap (multiply by 2):");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        // Collect to list
        System.out.println("\nCollect (filter and map):");
        List<Integer> result = numbers.stream()
                                      .filter(n -> n > 5)
                                      .map(n -> n * n)
                                      .collect(Collectors.toList());
        System.out.println(result);

        // Reduce (sum all)
        System.out.println("\nReduce (sum):");
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Count
        System.out.println("\nCount (even numbers):");
        long count = numbers.stream()
                           .filter(n -> n % 2 == 0)
                           .count();
        System.out.println("Count: " + count);

        // Custom object stream
        System.out.println("\n=== Stream with Objects ===");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
             .filter(name -> name.length() > 3)
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
