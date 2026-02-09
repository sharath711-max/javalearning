package com.javalearning.oop;

/**
 * Classes and Objects
 * Demonstrates basic OOP concepts
 */
public class Person {
    // Attributes (properties)
    private String name;
    private int age;
    private String email;

    // Constructor (initializes object)
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Business logic method
    public boolean isAdult() {
        return age >= 18;
    }

    // Override toString for better display
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    // Main method to test
    public static void main(String[] args) {
        // Create objects
        Person person1 = new Person("John Doe", 25, "john@example.com");
        Person person2 = new Person("Jane Smith", 17, "jane@example.com");

        System.out.println("=== Person Objects ===");
        System.out.println(person1);
        System.out.println("Is Adult: " + person1.isAdult());

        System.out.println("\n" + person2);
        System.out.println("Is Adult: " + person2.isAdult());
    }
}
