package com.javalearning.oop;

/**
 * Inheritance Example
 * Demonstrates inheritance and method overriding
 */

// Parent class
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

// Child class 1
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food");
    }

    public void bark() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food");
    }

    public void meow() {
        System.out.println(name + " meows: Meow! Meow!");
    }
}

// Test class
class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Example ===\n");

        Dog dog = new Dog("Buddy", 5);
        System.out.println(dog);
        dog.eat();
        dog.bark();
        dog.sleep();

        System.out.println();

        Cat cat = new Cat("Whiskers", 3);
        System.out.println(cat);
        cat.eat();
        cat.meow();
        cat.sleep();
    }
}
