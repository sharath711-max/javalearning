# Java Learning Project - All Concepts & Exceptions by Module

A comprehensive reference guide listing all concepts and exceptions covered in each example.

---

## 📋 Quick Navigation

- [Phase 1: Fundamentals](#phase-1-fundamentals)
- [Phase 2: Object-Oriented Programming](#phase-2-object-oriented-programming)
- [Phase 3: Strings & I/O](#phase-3-strings--io)
- [Phase 4: Advanced Java](#phase-4-advanced-java)

---

# PHASE 1: FUNDAMENTALS

## Module 1: HelloWorld.java
**Location:** `src/main/java/com/javalearning/basics/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.basics.HelloWorld"`

### ✅ Concepts Covered
1. **Class Declaration** - Defining a public class
2. **Main Method** - Entry point of Java program (`public static void main(String[] args)`)
3. **Static Methods** - Methods that don't require object instantiation
4. **Console Output** - Using `System.out.println()` for printing
5. **String Literals** - Using strings in double quotes
6. **Method Parameters** - Understanding command-line arguments array

### ❌ Exceptions
- None (basic example with no error-prone operations)

### 📚 Related Topics
- JVM (Java Virtual Machine) execution
- Bytecode compilation
- Program entry points

---

## Module 2: VariablesAndDataTypes.java
**Location:** `src/main/java/com/javalearning/basics/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.basics.VariablesAndDataTypes"`

### ✅ Concepts Covered
1. **Primitive Data Types** - All 8 types:
   - `byte` (8-bit integer, range: -128 to 127)
   - `short` (16-bit integer, range: -32,768 to 32,767)
   - `int` (32-bit integer, most common, range: ±2.1 billion)
   - `long` (64-bit integer, requires 'L' suffix)
   - `float` (32-bit decimal, requires 'f' suffix)
   - `double` (64-bit decimal, default for decimals)
   - `char` (16-bit Unicode character, single quotes)
   - `boolean` (true or false, logical values)

2. **Variable Declaration & Initialization** - Creating variables with types
3. **Type Casting** - Converting one type to another:
   - Implicit casting (smaller to larger type)
   - Explicit casting (larger to smaller type, requires syntax)
4. **String Type** - Reference type, not primitive
5. **Variable Naming Conventions** - camelCase for variables
6. **Comments** - Code documentation with `//`

### ❌ Exceptions
- **Potential:** `OutOfMemoryError` if declaring extremely large numbers
- **Potential:** Loss of precision when casting float to int (data loss, not an exception)

### 📚 Related Topics
- Memory allocation for different types
- Type safety
- Default values for data types
- Type erasure in generics

---

## Module 3: Operators.java
**Location:** `src/main/java/com/javalearning/basics/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.basics.Operators"`

### ✅ Concepts Covered
1. **Arithmetic Operators:**
   - Addition `+`
   - Subtraction `-`
   - Multiplication `*`
   - Division `/` (integer division truncates)
   - Modulus `%` (remainder)
   - Increment `++` (prefix and postfix)
   - Decrement `--` (prefix and postfix)

2. **Comparison Operators** - Return boolean values:
   - Equal to `==`
   - Not equal to `!=`
   - Greater than `>`
   - Less than `<`
   - Greater than or equal `>=`
   - Less than or equal `<=`

3. **Logical Operators:**
   - AND `&&` (both conditions true)
   - OR `||` (at least one condition true)
   - NOT `!` (negates condition)

4. **Operator Precedence** - Order of evaluation
5. **Pre/Post Increment** - Differences in value return timing

### ❌ Exceptions
- **ArithmeticException** - Division by zero (if attempted)
- **Potential:** Integer overflow when using very large numbers

### 📚 Related Topics
- Operator precedence and associativity
- Short-circuit evaluation of logical operators
- Type coercion in operations

---

## Module 4: IfElseExample.java
**Location:** `src/main/java/com/javalearning/control/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.control.IfElseExample"`

### ✅ Concepts Covered
1. **If Statement** - Single condition execution
2. **If-Else Statement** - Two-path decision
3. **If-Else If-Else Chain** - Multiple conditions:
   - `if (condition1) { }`
   - `else if (condition2) { }`
   - `else { }`

4. **Ternary Operator** - Shorthand for if-else:
   - Syntax: `condition ? valueIfTrue : valueIfFalse`
   - Returns a value directly

5. **Boolean Expressions** - Conditions that evaluate to true/false
6. **Block Scope** - Variables declared in blocks

### ❌ Exceptions
- None (control flow doesn't throw exceptions)

### 📚 Related Topics
- Control flow diagrams
- Boolean logic
- Code readability and maintainability

---

## Module 5: LoopsExample.java
**Location:** `src/main/java/com/javalearning/control/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.control.LoopsExample"`

### ✅ Concepts Covered
1. **For Loop** - Traditional C-style loop:
   - Initialization, condition, increment
   - Used when iteration count is known

2. **While Loop** - Condition-checked before execution:
   - Used when condition determines termination
   - May not execute if condition false initially

3. **Do-While Loop** - Condition-checked after execution:
   - Executes at least once
   - Useful for menu-driven programs

4. **Enhanced For Loop (For-Each):**
   - `for (type element : array/collection) { }`
   - Simplified iteration over arrays and collections
   - No index access

5. **Break Statement** - Exit loop immediately
6. **Continue Statement** - Skip current iteration
7. **Loop Nesting** - Loops within loops
8. **Infinite Loops** - When termination condition never becomes false

### ❌ Exceptions
- **Potential:** `ArrayIndexOutOfBoundsException` if manual array access
- **Potential:** Infinite loops causing program hang

### 📚 Related Topics
- Loop control flow
- Performance considerations
- Iterator pattern

---

# PHASE 2: OBJECT-ORIENTED PROGRAMMING

## Module 6: Person.java
**Location:** `src/main/java/com/javalearning/oop/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.oop.Person"`

### ✅ Concepts Covered
1. **Classes & Objects:**
   - Class definition
   - Object instantiation with `new` keyword
   - Class vs instance

2. **Attributes (Fields):**
   - Private access modifier `-`
   - Instance variables
   - Encapsulation principle

3. **Constructors:**
   - No-arg and parameterized constructors
   - Constructor overloading
   - Initialization of objects

4. **Getter Methods (Accessors):**
   - Read-only access to private fields
   - Pattern: `public Type getFieldName()`

5. **Setter Methods (Mutators):**
   - Write access to private fields
   - Validation capability
   - Pattern: `public void setFieldName(Type value)`

6. **Business Logic Methods:**
   - Methods with logic based on object state
   - Example: `isAdult()` method

7. **Method Overriding:**
   - `@Override` annotation
   - `toString()` method override
   - String representation of objects

8. **Encapsulation (Principle 1 of OOP):**
   - Data hiding with private
   - Controlled access with public methods

### ❌ Exceptions
- None in main execution (but illegal constructors could throw)
- **Potential:** `NullPointerException` if calling methods on null object

### 📚 Related Topics
- JavaBeans pattern
- Immutable objects
- Method overloading

---

## Module 7: Animal.java (Inheritance Example)
**Location:** `src/main/java/com/javalearning/oop/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.oop.InheritanceTest"`

### ✅ Concepts Covered
1. **Inheritance (Principle 2 of OOP):**
   - Parent class (superclass) - `Animal`
   - Child classes (subclasses) - `Dog`, `Cat`
   - Keyword: `extends`
   - IS-A relationships

2. **Parent Class Features:**
   - Common attributes (`name`, `age`)
   - Common methods (`eat()`, `sleep()`)
   - Constructor with initialization

3. **Child Class Features:**
   - Inherits parent attributes and methods
   - Can add new methods (`bark()`, `meow()`)
   - Can add new attributes/behavior

4. **Method Overriding (Principle 3 - Polymorphism):**
   - Override parent methods in child classes
   - `@Override` annotation
   - Same method name, different implementation
   - Example: `eat()` overridden in `Dog` and `Cat`

5. **Access Modifiers:**
   - `protected` - Accessible to subclasses and same package
   - `public` - Accessible everywhere
   - `private` - Accessible only in same class

6. **Constructor Chaining:**
   - `super()` keyword to call parent constructor
   - Initialization of parent fields

7. **Polymorphism (Principle 3 of OOP):**
   - Dog and Cat both are Animal
   - Each has their own `eat()` implementation
   - Runtime method binding

### ❌ Exceptions
- None in this example
- **Potential:** `NoSuchMethodException` if method not found at runtime

### 📚 Related Topics
- Method resolution order
- Virtual method invocation
- Type hierarchy
- Abstract methods and classes

---

## Module 8: CollectionsDemo.java
**Location:** `src/main/java/com/javalearning/collections/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.collections.CollectionsDemo"`

### ✅ Concepts Covered
1. **Collections Framework:**
   - Generic collections with type parameters `<Type>`
   - Collections interface hierarchy

2. **List Interface:**
   - **ArrayList** - Resizable array implementation
   - Ordered collection
   - Allows duplicates
   - Methods: `add()`, `get()`, `size()`, `remove()`

3. **Set Interface:**
   - **HashSet** - Hash-based implementation
   - Unordered collection
   - No duplicates allowed
   - Faster lookup than List for membership
   - Method: `add()`, `contains()`

4. **Map Interface:**
   - **HashMap** - Hash-based key-value store
   - Key-value pairs
   - No duplicate keys
   - Methods: `put()`, `get()`, `keySet()`, `values()`

5. **Generics:**
   - Type parameters: `<String>`, `<Integer>`
   - Type safety at compile time
   - Prevents ClassCastException

6. **Iteration:**
   - For-each loop over lists
   - KeySet iteration for maps
   - Iterator pattern

7. **Collection Methods:**
   - `add()` - Insert element
   - `get()` - Retrieve by index
   - `size()` - Get collection size
   - `put(key, value)` - Add to map

### ❌ Exceptions
- **ArrayIndexOutOfBoundsException** - Accessing invalid index (converted to IndexOutOfBoundsException in List)
- **Potential:** `ClassCastException` - Without generics, cast issues
- **Potential:** `NullPointerException` - If operations on null elements

### 📚 Related Topics
- Hash functions and hash codes
- Load factors
- Collection performance characteristics (O(1), O(n), etc.)
- Comparable and Comparator interfaces

---

# PHASE 3: STRINGS & I/O

## Module 9: StringOperations.java
**Location:** `src/main/java/com/javalearning/strings/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.strings.StringOperations"`

### ✅ Concepts Covered
1. **String Immutability:**
   - Strings are immutable once created
   - Each modification creates new String object
   - String pool in memory

2. **String Creation:**
   - Literal: `String s = "Hello";` (string pool)
   - Constructor: `String s = new String("Hello");` (heap)
   - String equality complications

3. **String Methods:**
   - `length()` - String length
   - `toUpperCase()` - Convert to uppercase
   - `toLowerCase()` - Convert to lowercase
   - `charAt(index)` - Get character at position
   - `substring(start, end)` - Extract substring
   - `contains(sequence)` - Check if contains substring
   - `indexOf(sequence)` - Find first index of substring
   - `replace(old, new)` - Replace occurrences
   - `split(regex)` - Split into array
   - `trim()` - Remove leading/trailing whitespace

4. **String Comparison:**
   - `==` operator - Reference equality
   - `.equals()` method - Content equality
   - `.equalsIgnoreCase()` - Case-insensitive comparison
   - `.compareTo()` - Lexicographic comparison

5. **String Concatenation:**
   - `+` operator - String concatenation
   - Performance issue with many concatenations

6. **StringBuilder Class:**
   - Mutable string buffer
   - `append()` method - Append strings
   - `toString()` - Convert to String
   - Efficient for multiple concatenations
   - Methods: `insert()`, `delete()`, `reverse()`

7. **StringBuffer:**
   - Thread-safe version of StringBuilder
   - Synchronized methods
   - Slightly slower performance

### ❌ Exceptions
- **Potential:** `StringIndexOutOfBoundsException` - Invalid string index
- **Potential:** `NullPointerException` - Operations on null string
- **Potential:** `NumberFormatException` - If parsing non-numeric string

### 📚 Related Topics
- Regular expressions
- Character encoding (UTF-8, etc.)
- String methods for validation
- Performance tuning string operations

---

# PHASE 4: ADVANCED JAVA

## Module 10: ExceptionHandlingDemo.java
**Location:** `src/main/java/com/javalearning/exceptions/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.exceptions.ExceptionHandlingDemo"`

### ✅ Concepts Covered
1. **Exception Handling - Try-Catch Block:**
   - `try` block - Code that might throw exception
   - `catch` block - Handle specific exception
   - Multiple catch blocks for different exceptions
   - Catch order matters (specific to general)

2. **Finally Block:**
   - Executes regardless of exception occurrence
   - Cleanup code (closing resources)
   - Always executes except for system exit

3. **Exception Hierarchy:**
   - Throwable (root)
   - ├── Exception
   - │   ├── Checked exceptions
   - │   └── Unchecked exceptions (RuntimeException)
   - └── Error

4. **Exception Types:**
   - **Checked Exceptions** - Must be caught or declared
   - **Unchecked Exceptions** - Optional to catch
   - **Errors** - Severe problems

5. **Common Exceptions Demonstrated:**
   - **ArithmeticException** - Division by zero
     - Unchecked exception (RuntimeException)
     - Thrown by: `/` operator, `%` operator
     - Example: `10 / 0`
   
   - **ArrayIndexOutOfBoundsException** - Invalid array access
     - Unchecked exception (RuntimeException)
     - Thrown by: accessing array with invalid index
     - Example: `arr[5]` when array only has 3 elements
   
   - **NumberFormatException** - Invalid number format
     - Unchecked exception (RuntimeException)
     - Thrown by: `Integer.parseInt()`, `Double.parseDouble()`
     - Example: `Integer.parseInt("abc")`

6. **Custom Exceptions:**
   - Extend `Exception` class (checked)
   - Extend `RuntimeException` (unchecked)
   - Constructor with message
   - Example: `InsufficientBalanceException`

7. **Exception Throwing:**
   - `throw new CustomException("message");`
   - Method throws clause: `throws ExceptionType`
   - Propagating exceptions up call stack

8. **Best Practices:**
   - Catch specific exceptions
   - Don't catch Exception (too broad)
   - Provide meaningful error messages
   - Log exceptions
   - Cleanup in finally or try-with-resources

### ❌ Exceptions (Detailed)

| Exception | Type | Cause | Example |
|-----------|------|-------|---------|
| `ArithmeticException` | Unchecked | Division by zero | `10 / 0` |
| `ArrayIndexOutOfBoundsException` | Unchecked | Invalid array index | `arr[100]` |
| `NumberFormatException` | Unchecked | Invalid number format | `Integer.parseInt("abc")` |
| `NullPointerException` | Unchecked | Null object operation | `null.method()` |
| `ClassCastException` | Unchecked | Invalid type cast | `(String) 123` |
| `IllegalArgumentException` | Unchecked | Invalid method argument | Custom checks |
| `InsufficientBalanceException` | Custom Checked | Business logic error | Balance < Amount |

### 📚 Related Topics
- Try-with-resources (Java 7+)
- Exception chaining
- Stack trace analysis
- Logging frameworks (Log4j, SLF4J)

---

## Module 11: StreamAPIDemo.java
**Location:** `src/main/java/com/javalearning/functional/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.functional.StreamAPIDemo"`

### ✅ Concepts Covered
1. **Lambda Expressions:**
   - Arrow syntax: `(parameters) -> expression`
   - `(n) -> n % 2 == 0` - Filter even numbers
   - `(n) -> n * 2` - Map transformation
   - Replaces anonymous inner classes

2. **Functional Interfaces:**
   - Interface with single abstract method
   - `Predicate<T>` - Returns boolean
   - `Function<T, R>` - Transform input to output
   - `Consumer<T>` - Accept input, return nothing

3. **Stream API:**
   - Pipeline approach to data processing
   - Lazy evaluation
   - No external iteration needed
   - Immutable (doesn't modify source)

4. **Stream Operations:**

   **Intermediate Operations (Lazy):**
   - `filter(predicate)` - Keep elements matching condition
     - Example: `.filter(n -> n > 5)`
     - Returns Stream
   
   - `map(function)` - Transform each element
     - Example: `.map(n -> n * 2)`
     - Returns Stream with transformed elements
   
   - `flatMap(function)` - Map and flatten
   - `distinct()` - Remove duplicates
   - `sorted()` - Sort elements
   - `limit(n)` - Take first n elements
   - `skip(n)` - Skip first n elements

   **Terminal Operations (Eager):**
   - `forEach(consumer)` - Loop through stream
     - Example: `.forEach(System.out::println)`
     - Side effects only
   
   - `collect(collector)` - Accumulate to collection
     - Example: `.collect(Collectors.toList())`
     - Returns List, Set, Map, etc.
   
   - `reduce(operation)` - Combine elements
     - Example: `.reduce(0, Integer::sum)`
     - Returns single value
   
   - `count()` - Count elements
     - Example: `.filter(...).count()`
     - Returns long
   
   - `min(comparator)` - Find minimum
   - `max(comparator)` - Find maximum
   - `anyMatch(predicate)` - Any element matches
   - `allMatch(predicate)` - All elements match
   - `findFirst()` - Get first element

5. **Method References:**
   - `System.out::println` - Print each element
   - `String::toUpperCase` - Reference to method
   - Shorthand for lambda: `x -> System.out.println(x)`
   - Shorthand for lambda: `x -> x.toUpperCase()`

6. **Optional Class:**
   - Handles null values gracefully
   - `Optional<T>` - Container for possibly-null value
   - `isPresent()` - Check if value exists
   - `get()` - Get value (throws if empty)
   - `orElse(default)` - Default value if empty
   - `ifPresent(consumer)` - Action if present

7. **Collectors Utility:**
   - `Collectors.toList()` - Collect to ArrayList
   - `Collectors.toSet()` - Collect to HashSet
   - `Collectors.toMap(keyMapper, valueMapper)` - Collect to HashMap
   - `Collectors.joining(delimiter)` - Join strings
   - `Collectors.groupingBy(classifier)` - Group elements
   - `Collectors.summingInt()` - Sum integers

8. **Stream Characteristics:**
   - Stateless vs stateful operations
   - Sequential vs parallel streams
   - Source: Collection, Array, I/O channel, Generator function

### ❌ Exceptions
- **Potential:** `NullPointerException` - Lambda on null elements
- **Potential:** `ClassCastException` - Invalid type conversion in streams
- **Potential:** `NoSuchElementException` - Calling `get()` on empty Optional

### 📚 Related Topics
- Parallel streams for multi-core processing
- Reactive programming
- Performance characteristics of stream operations
- Functional programming paradigm

---

## Module 12: Singleton.java
**Location:** `src/main/java/com/javalearning/advanced/`  
**Run Command:** `mvn exec:java -Dexec.mainClass="com.javalearning.advanced.Singleton"`

### ✅ Concepts Covered
1. **Design Patterns:**
   - Reusable solutions to common problems
   - Gang of Four patterns
   - Creational, Structural, Behavioral

2. **Singleton Pattern:**
   - **Purpose:** Ensure only one instance of class
   - **Use Cases:** Logging, Database connections, Configuration
   - **Benefits:** Global access, controlled instance creation
   - **Drawbacks:** Hidden dependencies, testing difficulty

3. **Singleton Implementation:**
   - **Private Constructor** - Prevent instantiation
     - `private Singleton() { }`
     - Forces use of getInstance()
   
   - **Static Instance** - Hold single instance
     - `private static Singleton instance;`
     - Class-level variable
   
   - **Static Getter Method** - Access instance
     - `public static Singleton getInstance() { }`
     - Lazy initialization (created on first use)

4. **Synchronized Access:**
   - `synchronized` keyword - Thread safety
   - Only one thread can execute method
   - Prevents race conditions
   - Trade-off: Performance vs safety

5. **Variations:**
   - Eager initialization - Create at class load
   - Lazy initialization - Create on first use
   - Double-checked locking - Performance optimization
   - Bill Pugh Singleton - Using static inner class
   - Enum Singleton - Thread-safe, serialization-safe

6. **Thread Safety Considerations:**
   - Multiple threads accessing getInstance()
   - Synchronized prevents multiple instances
   - Memory visibility guarantees

7. **Key Properties:**
   - Immutable instance
   - Global accessibility
   - Lazy or eager creation
   - Thread-safe in multi-threaded environment

### ❌ Exceptions
- None in this implementation
- **Potential:** `CloneNotSupportedException` if cloning attempted
- **Potential:** Reflection could break singleton (via private constructor)

### 📚 Related Topics
- Other creational patterns: Factory, Builder, Abstract Factory
- Dependency injection as alternative
- Testing singletons (challenges)
- Anti-pattern when overused

---

## 📊 Summary Table: Concepts by Module

| Module | Concepts Count | Exception Count | Difficulty |
|--------|-----------------|-----------------|------------|
| HelloWorld | 6 | 0 | ⭐ |
| VariablesAndDataTypes | 6 | 2 | ⭐ |
| Operators | 7 | 2 | ⭐ |
| IfElse | 6 | 0 | ⭐ |
| Loops | 8 | 2 | ⭐⭐ |
| Person (Classes) | 8 | 1 | ⭐⭐ |
| Animal (Inheritance) | 7 | 1 | ⭐⭐ |
| Collections | 7 | 3 | ⭐⭐ |
| Strings | 7 | 3 | ⭐⭐ |
| ExceptionHandling | 8 | 8 | ⭐⭐⭐ |
| StreamAPI | 8 | 3 | ⭐⭐⭐ |
| Singleton | 7 | 2 | ⭐⭐⭐ |
| **TOTAL** | **86** | **27** | - |

---

## 🎯 Exception Reference Quick Lookup

### By Module
- **Phase 1 (Basics):** 6 potential exceptions
- **Phase 2 (OOP):** 5 potential exceptions
- **Phase 3 (Strings):** 3 specific exceptions
- **Phase 4 (Advanced):** 13+ different exceptions

### Most Common Exceptions in This Project
1. **NullPointerException** - Appears in: Modules 6, 8, 9, 11
2. **ArithmeticException** - Appears in: Modules 3, 10
3. **ArrayIndexOutOfBoundsException** - Appears in: Modules 5, 8, 10
4. **NumberFormatException** - Appears in: Modules 9, 10
5. **ClassCastException** - Appears in: Modules 8, 11
6. **StringIndexOutOfBoundsException** - Appears in: Module 9

### Exception Handling Strategies
- **Prevent:** Validate input, check bounds, check for null
- **Catch:** Use try-catch for expected exceptions
- **Propagate:** Let caller handle with throws keyword
- **Log & Continue:** Log error but continue execution
- **Retry:** Repeat operation with backoff

---

## 💡 Learning Progression

```
Click here to expand learning strategy:

Phase 1: Learn WHAT (Syntax & Fundamentals)
├─ Variables, operators, control flow
├─ Basic exception scenarios
└─ Few exception types (Division by zero, Index out of bounds)

Phase 2: Learn HOW (OOP Design)
├─ Classes, inheritance, polymorphism
├─ Understanding object lifecycle
└─ More exception types (Null pointer, Cast issues)

Phase 3: Learn WHY & WHEN (Data Handling)
├─ Working with complex data (Strings, collections)
├─ Performance implications
└─ String-specific exceptions

Phase 4: Learn PATTERNS & BEST PRACTICES (Advanced)
├─ Exception handling strategies
├─ Functional programming paradigm
├─ Design patterns for maintainability
└─ All exception types and prevention techniques
```

---

## 🔍 Cross-Module Concept References

### Concepts Used in Multiple Modules

**Encapsulation:**
- Module 6 (Person) - Getter/Setter
- Module 8 (Collections) - Abstraction
- Module 10 (Exceptions) - Hidden details

**Generics & Type Safety:**
- Module 8 (Collections) - Generic collections
- Module 11 (StreamAPI) - Generic lambdas and collectors
- Module 12 (Singleton) - Type-safe pattern

**Method Overriding:**
- Module 7 (Inheritance) - Explicit override
- Module 9 (Strings) - toString() override
- Module 11 (StreamAPI) - Lambda implementations

**Control Flow:**
- Module 4 (If-Else) - Conditions
- Module 5 (Loops) - Iteration
- Module 10 (Exceptions) - Try-catch control
- Module 11 (StreamAPI) - Lazy evaluation

---

## 📌 Cheat Sheet: Concepts by Appearance Count

### Most Important Concepts (Appear 3+ times)
1. **Control Flow** - Conditionals, loops, exception handling
2. **Data Types & Operations** - Variables, operators, casting
3. **Object-Oriented Programming** - Classes, inheritance, polymorphism
4. **Exception Handling** - Try-catch, exception types
5. **Functional Programming** - Lambdas, streams, collectors
6. **Encapsulation** - Getters/setters, access modifiers

### Advanced Concepts (Phase 4 specific)
1. **Functional Interfaces** - Predicate, Function, Consumer
2. **Stream Operations** - Intermediate vs terminal
3. **Method References** - Shorthand for lambdas
4. **Design Patterns** - Singleton and others
5. **Synchronization** - Thread safety with synchronized

---

## ✅ Self-Check Mastery Level

### Phase 1 Mastery
- [ ] Can explain all 8 primitive types and their sizes
- [ ] Can use all arithmetic and logical operators
- [ ] Can write if-else chains and ternary operators
- [ ] Can write for, while, do-while, and enhanced for loops
- [ ] Understand break and continue

### Phase 2 Mastery
- [ ] Can design and implement classes with encapsulation
- [ ] Can create inheritance hierarchies
- [ ] Can override methods correctly
- [ ] Can use List, Set, Map appropriately
- [ ] Understand polymorphism

### Phase 3 Mastery
- [ ] Can manipulate strings efficiently
- [ ] Know when to use StringBuilder
- [ ] Understand string immutability
- [ ] Can compare strings correctly
- [ ] Know string-related exceptions

### Phase 4 Mastery
- [ ] Can handle exceptions properly with try-catch-finally
- [ ] Can write and use custom exceptions
- [ ] Can write lambda expressions
- [ ] Can use Stream API effectively
- [ ] Understand when to apply design patterns

---

**For more details, refer to individual module documentation or run the examples!**

