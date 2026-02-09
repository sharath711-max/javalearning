# Java Learning Project Roadmap 🚀

A comprehensive, structured Java learning repository with practical examples and exercises following a progressive learning path from basics to advanced concepts.

## Table of Contents
- [Project Structure](#project-structure)
- [Learning Roadmap](#learning-roadmap)
- [Quick Start](#quick-start)
- [Available Examples](#available-examples)
- [How to Learn](#how-to-learn)

## Project Structure

```
javalearning/
├── pom.xml                    # Maven configuration
├── README.md                  # This file
└── src/
    ├── main/java/com/javalearning/
    │   ├── basics/            # Phase 1: Variables, Data Types, Operators
    │   ├── control/           # Phase 1: If-else, Loops, Switch
    │   ├── oop/               # Phase 2: OOP concepts and patterns
    │   ├── collections/       # Phase 2: List, Set, Map collections
    │   ├── strings/           # Phase 3: String operations
    │   ├── io/                # Phase 3: File I/O and Streams
    │   ├── exceptions/        # Phase 4: Exception handling
    │   ├── generics/          # Phase 4: Generic types and wildcards
    │   ├── functional/        # Phase 4: Lambdas and Stream API
    │   ├── threading/         # Phase 4: Threads and concurrency
    │   └── advanced/          # Phase 4: Design patterns, Reflection
    └── test/java/             # Unit tests
```

## Learning Roadmap

### Phase 1: Java Fundamentals (Beginner) ⭐
**Time: 1-2 weeks**

**Basics Module** (`com.javalearning.basics`)
- `HelloWorld.java` - Your first Java program, main method, print statements
- `VariablesAndDataTypes.java` - Primitive types (byte, short, int, long, float, double, char, boolean), type casting
- `Operators.java` - Arithmetic, comparison, and logical operators

**Control Flow Module** (`com.javalearning.control`)
- `IfElseExample.java` - If-else statements, ternary operator
- `LoopsExample.java` - For, while, do-while loops, enhanced for-loop, break/continue

**Key Concepts:**
- Understand JVM and bytecode
- Master variable declaration and initialization
- Learn operator precedence
- Understand control flow structures

**Practice:**
- Create a calculator program
- Write a number guessing game
- Build a simple grading system

---

### Phase 2: Object-Oriented Programming (Intermediate) 🎯
**Time: 2-3 weeks**

**OOP Module** (`com.javalearning.oop`)
- `Person.java` - Classes, objects, constructors, getters/setters, encapsulation
- `Animal.java` - Inheritance, method overriding, polymorphism, parent-child relationships

**Collections Module** (`com.javalearning.collections`)
- `CollectionsDemo.java` - ArrayList, LinkedList, HashMap, HashSet, iteration

**Key Concepts:**
- Classes and objects fundamentals
- Constructor overloading
- Instance vs static members
- Inheritance and method overriding
- Polymorphism and method binding
- Collections framework (List, Set, Map)
- Iterator patterns

**Practice:**
- Create a Bank Account system with inheritance
- Build a Student Management system
- Implement a Shopping Cart with collections

---

### Phase 3: Working with Data (Intermediate) 📊
**Time: 2 weeks**

**Strings Module** (`com.javalearning.strings`)
- `StringOperations.java` - String methods, concatenation, StringBuilder, immutability

**I/O Module** (`com.javalearning.io`)
- File reading and writing examples
- Streams and readers
- Serialization/Deserialization

**Key Concepts:**
- String immutability and String pool
- StringBuilder for performance
- File I/O streams
- Character encoding
- Serialization basics

**Practice:**
- Create a text file analyzer
- Build a simple logging system
- Implement CSV file parsing

---

### Phase 4: Advanced Java (Advanced) 💪
**Time: 3-4 weeks**

**Exception Handling** (`com.javalearning.exceptions`)
- `ExceptionHandlingDemo.java` - try-catch-finally, custom exceptions, exception hierarchy
- Exception best practices

**Generics Module** (`com.javalearning.generics`)
- Generic classes and methods
- Bounded type parameters
- Wildcards and type erasure

**Functional Programming** (`com.javalearning.functional`)
- `StreamAPIDemo.java` - Lambda expressions, functional interfaces, Stream API, collectors

**Threading Module** (`com.javalearning.threading`)
- Thread creation and lifecycle
- Synchronization and locks
- Thread pools and executors
- Concurrent collections

**Advanced Concepts** (`com.javalearning.advanced`)
- `Singleton.java` - Design patterns (Singleton, Factory, Observer)
- Reflection API
- Annotations

**Key Concepts:**
- Exception hierarchy and handling
- Checked vs unchecked exceptions
- Generic type parameters and bounds
- Lambda expressions and functional interfaces
- Stream API for functional data processing
- Thread lifecycle and synchronization
- Design patterns for common problems
- Reflection for runtime introspection

**Practice:**
- Build a multi-threaded server
- Create a custom generic data structure
- Implement design patterns in a project
- Process large data with Streams

---

## Quick Start

### Prerequisites
```bash
# Check Java installation
java -version      # JDK 11 or higher

# Check Maven installation
mvn -version       # Maven 3.6 or higher
```

### Build the Project
```bash
cd /workspaces/javalearning
mvn clean compile
```

### Run Examples
```bash
# Run specific example
mvn exec:java -Dexec.mainClass="com.javalearning.basics.HelloWorld"
mvn exec:java -Dexec.mainClass="com.javalearning.basics.VariablesAndDataTypes"
mvn exec:java -Dexec.mainClass="com.javalearning.basics.Operators"
mvn exec:java -Dexec.mainClass="com.javalearning.control.IfElseExample"
mvn exec:java -Dexec.mainClass="com.javalearning.control.LoopsExample"
mvn exec:java -Dexec.mainClass="com.javalearning.oop.Person"
mvn exec:java -Dexec.mainClass="com.javalearning.oop.InheritanceTest"
mvn exec:java -Dexec.mainClass="com.javalearning.collections.CollectionsDemo"
mvn exec:java -Dexec.mainClass="com.javalearning.strings.StringOperations"
mvn exec:java -Dexec.mainClass="com.javalearning.functional.StreamAPIDemo"
mvn exec:java -Dexec.mainClass="com.javalearning.advanced.Singleton"
```

### Run All Tests
```bash
mvn test
```

---

## Available Examples

### Phase 1 Examples

| Topic | File | Main Concepts |
|-------|------|---|
| Hello World | `HelloWorld.java` | Basic program structure, print statements |
| Variables & Types | `VariablesAndDataTypes.java` | All 8 primitive types, type casting |
| Operators | `Operators.java` | Arithmetic, comparison, logical operators |
| If-Else | `IfElseExample.java` | Conditional statements, ternary operator |
| Loops | `LoopsExample.java` | For, while, do-while, enhanced for-loop |

### Phase 2 Examples

| Topic | File | Main Concepts |
|-------|------|---|
| Classes & Objects | `Person.java` | Encapsulation, getters/setters, toString |
| Inheritance | `Animal.java` | Parent-child relationship, method overriding |
| Collections | `CollectionsDemo.java` | ArrayList, HashMap, HashSet, iteration |

### Phase 3 Examples

| Topic | File | Main Concepts |
|-------|------|---|
| String Operations | `StringOperations.java` | Methods, comparison, concatenation, StringBuilder |

### Phase 4 Examples

| Topic | File | Main Concepts |
|-------|------|---|
| Exception Handling | `ExceptionHandlingDemo.java` | Try-catch-finally, custom exceptions |
| Stream API | `StreamAPIDemo.java` | Lambda, filter, map, reduce, collect |
| Singleton Pattern | `Singleton.java` | Design pattern implementation |

---

## How to Learn

### 1. Start with Phase 1 (Week 1-2)
- Read the README section
- Run each example with: `mvn exec:java -Dexec.mainClass="..."`
- Modify the code and experiment
- Try to write your own variations
- Complete practice exercises

### 2. Move to Phase 2 (Week 3-5)
- Understand OOP fundamentals
- Study inheritance and polymorphism
- Explore collections framework
- Build a small project using OOP

### 3. Progress to Phase 3 (Week 6-7)
- Master string manipulation
- Learn file I/O
- Implement practical file operations

### 4. Complete Phase 4 (Week 8-10)
- Deep dive into exceptions
- Learn functional programming with Streams
- Understand concurrent programming
- Study design patterns
- Build an advanced project

### Best Practices

✅ **DO:**
- Run every example and understand the output
- Modify examples to see how they behave differently
- Write your own test cases
- Read Java documentation
- Practice regularly
- Build small projects between phases

❌ **DON'T:**
- Skip concepts - they build on each other
- Copy-paste without understanding
- Ignore exceptions and error handling
- Skip the fundamentals to jump to advanced
- Stop practicing

### Learning Tips

1. **Understand, Don't Memorize** - Focus on *why* not *what*
2. **Experiment** - Modify examples and run them
3. **Read Errors** - Error messages tell you what's wrong
4. **Use IDE Features** - Auto-completion, refactoring, debugging
5. **Debug Actively** - Use breakpoints and step through code
6. **Build Projects** - Apply knowledge to real problems
7. **Peer Review** - Share code and get feedback
8. **Document** - Write comments explaining your logic

---

## Project Milestones

- [ ] **Phase 1 Complete** - Can write basic Java programs with conditionals and loops
- [ ] **Phase 2 Complete** - Can build OOP applications with inheritance and polymorphism
- [ ] **Phase 3 Complete** - Can work with strings and file operations
- [ ] **Phase 4 Complete** - Can use advanced features and design patterns

---

## Resources

### Official Documentation
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials - Oracle](https://docs.oracle.com/javase/tutorial/)
- [Maven Documentation](https://maven.apache.org/guides/)

### Online Learning
- Codecademy Java Course
- Oracle's "Learn the Java Language"
- LeetCode for practice problems
- HackerRank Java challenges

### Books
- "Head First Java" - Great for beginners
- "Effective Java" - Best practices
- "Clean Code" - Code quality

---

## Next Steps

After completing this roadmap:
1. Build a full-stack application (Backend with Spring Boot)
2. Learn SQL and databases
3. Explore testing frameworks (JUnit, Mockito)
4. Learn about web development (Servlets, JSP, Spring MVC)
5. Study microservices and cloud-native development

---

## Troubleshooting

### Build Fails
```bash
# Clear Maven cache
mvn clean
# Rebuild
mvn compile
```

### Cannot Find Main Class
```bash
# Ensure class has: public static void main(String[] args)
# Run with correct package path: com.javalearning.package.ClassName
```

### Need Java Installation
```bash
# Install JDK
apt-get install openjdk-11-jdk

# Verify
java -version
```

---

## Contributing

Feel free to add more examples, exercises, or improvements to this learning project!

---

## License

This project is open for educational purposes.

---

**Ready to start your Java learning journey? Run your first example:**

```bash
mvn exec:java -Dexec.mainClass="com.javalearning.basics.HelloWorld"
```

**Happy Learning! 🎓**
