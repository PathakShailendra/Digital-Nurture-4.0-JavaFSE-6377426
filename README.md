# Digital-Nurture-4.0-JavaFSE-6377426

# 🧠 SOLID Principles – Java Deep Skilling (Week 1)

This directory contains hands-on Java implementations for all five SOLID principles as a part of the Cognizant Digital Nurture 4.0 – Java FSE Deep Skilling Program.

Each principle has:
- ❌ A file that violates the principle (`ImplementationWithoutXYZ.java`)
- ✅ A file that follows the principle (`ImplementationWithXYZ.java`)
- 🎯 A `Main.java` file to demonstrate behavior

---

## 🔷 What Are SOLID Principles?

| Letter | Principle Name               | Description |
|--------|------------------------------|-------------|
| S      | Single Responsibility        | One class = One job |
| O      | Open/Closed                  | Open for extension, closed for modification |
| L      | Liskov Substitution          | Subclass must replace superclass safely |
| I      | Interface Segregation        | Don't force implementation of unused methods |
| D      | Dependency Inversion         | Depend on abstractions, not concrete classes |

---

## ✅ Implemented Principles

### 1️⃣ Single Responsibility Principle (SRP)

- `ImplementationWithSRP.java` ✅  
- `ImplementationWithoutSRP.java` ❌  
- `Main.java` – demonstrates clean vs. messy responsibilities

---

### 2️⃣ Open/Closed Principle (OCP)

- `ImplementationWithOCP.java` ✅ (interface-based extension)
- `ImplementationWithoutOCP.java` ❌ (hardcoded if-else logic)
- `Main.java` – shows flexible payment structure

---

### 3️⃣ Liskov Substitution Principle (LSP)

- `ImplementationWithLSP.java` ✅ (safe inheritance using abstract classes)
- `ImplementationWithoutLSP.java` ❌ (runtime error via wrong subclassing)
- `Main.java` – test bird/ostrich scenarios

---

### 4️⃣ Interface Segregation Principle (ISP)

- `ImplementationWithISP.java` ✅ (small focused interfaces)
- `ImplementationWithoutISP.java` ❌ (large interface + unused methods)
- `Main.java` – test dog, bird behavior separately

---

### 5️⃣ Dependency Inversion Principle (DIP)

- `ImplementationWithDIP.java` ✅ (interface + constructor injection)
- `ImplementationWithoutDIP.java` ❌ (direct instantiation/tight coupling)
- `Main.java` – test keyboard/mouse input with Computer class

---

# 📘 Design Patterns – Creational (Part of Week 1)

In addition to SOLID principles, the following **creational design patterns** have been implemented:

---

### 🧩 Singleton Pattern

- 📄 `ImplementatingTheSingletonPattern.java`
- 🎯 Ensures that only **one instance** of a class is created
- ✅ Common in logging, database, config manager, etc.

**Key Concepts Used:**
- Private constructor
- Static instance
- Lazy initialization (`getInstance()` method)

**Expected Output:
Singleton instance created.
Hello from Singleton!
true


---

### 🧩 Factory Method Pattern

- 📄 `ImplementingTheFactoryMethodPattern.java`
- 🎯 Returns object based on input without exposing creation logic
- ✅ Helps in decoupling object creation from client logic

**Key Concepts Used:**
- Interface: `Shape`
- Factory class: `ShapeFactory`
- Implementations: `Circle`, `Rectangle`

**Expected Output:
Drawing Circle...
Drawing Rectangle...

---

#### 📘 Analysis of Algorithms (Theory)
- Introduction to Algorithms & Need for DSA
- Types of Data Structures (Linear, Non-linear, Hash-based, etc.)
- Notations: Time Complexity & Space Complexity
- Framework for analyzing algorithms using:
  - Loop counting
  - Recursion tree
- Asymptotic Notation:
  - **Big O (O)** – Worst-case analysis
  - **Omega (Ω)** – Best-case analysis
  - **Theta (Θ)** – Average-case analysis
- Best, Average, and Worst-case scenarios with examples
- Time & Space Complexity of:
  - Iterative algorithms (e.g., loop-based sum)
  - Recursive algorithms (e.g., factorial, sum recursion)

📚 Referenced from: [GeeksForGeeks – Design and Analysis of Algorithms](https://www.geeksforgeeks.org/designand-analysis-of-algorithms/)

---

#### 🔢 Sorting Algorithms Implemented & Analyzed

| Algorithm      | Best Case | Average Case | Worst Case | Space Complexity |
|----------------|-----------|--------------|------------|------------------|
| **Bubble Sort**    | O(n)      | O(n²)        | O(n²)      | O(1)             |
| **Insertion Sort** | O(n)      | O(n²)        | O(n²)      | O(1)             |
| **Heap Sort**      | O(n log n)| O(n log n)   | O(n log n) | O(1)             |
| **Quick Sort**     | O(n log n)| O(n log n)   | O(n²)      | O(log n)         |
| **Merge Sort**     | O(n log n)| O(n log n)   | O(n log n) | O(n)             |

✅ Implemented all above sorting algorithms with:
- Code in Java

---

### 📘 Topics Covered:
- Arrays  
  - Array Traversal, Array representation in memory, Measuring Time Complexity  
  - Searching & Traversal, When to use Arrays  
  🔗 [GeeksForGeeks – Arrays](https://www.geeksforgeeks.org/arraydata-structure-guide/)

- Linked List  
  - Singly Linked List, Circular Singly Linked List, Doubly Linked List, Circular Doubly Linked List  
  - Search, Insert, Traverse, Delete operations with Time Complexity  
  🔗 [GeeksForGeeks – Linked List in Java](https://www.geeksforgeeks.org/linked-listin-java/)

- Searching Algorithms  
  - Linear Search, Binary Search  
  🔗 [GeeksForGeeks – Searching Algorithms](https://www.geeksforgeeks.org/searchingalgorithms/#basics-of-searchingalgorithms)

---

### 🛠️ Hands-On Exercises Completed:
- **Exercise 2:** E-commerce Platform Search Function  
- **Exercise 7:** Financial Forecasting  

✅ **Week 1 learning completed successfully.**


# 🚀 Week 2: PL/SQL, JUnit, Mockito & Logging – Java FSE Deep Skilling Program

Welcome to **Week 2** of the Cognizant Digital Nurture 4.0 – Java FSE Deep Skilling Program!  
This week focused on mastering **PL/SQL programming**, **Test-Driven Development (TDD)** using **JUnit5 and Mockito**, and **SLF4J Logging Framework**.

---

## 📘 1. PL/SQL Programming

PL/SQL (Procedural Language/Structured Query Language) is Oracle’s extension to SQL. This week, we explored core PL/SQL components that help us build efficient database-driven applications.

### 📚 Topics Covered:
- Introduction to PL/SQL: Syntax, Features, Importance
- PL/SQL Environment: Block structure, Anonymous vs Named blocks
- Basic PL/SQL Syntax: Variables, Data types, Assigning values
- Control Structures: Conditional and Looping constructs
- Error Handling: Predefined and User-defined Exceptions
- Cursors: Implicit and Explicit with FETCH/CLOSE
- Procedures & Functions: IN/OUT/IN OUT Parameters
- Packages & Triggers: Specification, Body, BEFORE/AFTER triggers

### 🛠️ Exercises Implemented:
| # | Exercise Title                | Directory          |
|---|-------------------------------|--------------------|
| 1️⃣ | Control Structures (IF, LOOP, CASE) | `PLSQL_Exercises`  |
| 2️⃣ | Stored Procedures with IN/OUT params | `PLSQL_Exercises`  |

---

## 🧪 2. Test-Driven Development (TDD) using JUnit5 & Mockito

TDD encourages writing tests **before** writing the actual implementation. This week we got hands-on with JUnit and Mockito to test units in isolation.

### 📚 Topics Covered:
- What is TDD & TDD Cycle (Red-Green-Refactor)
- JUnit Framework Setup & Assertions
- Test Structure (Arrange-Act-Assert), Fixtures, Setup, Teardown
- Mockito Basics: Stubbing, Verifying, Argument Matching
- Mocking Dependencies & Integration Testing Overview

### 🛠️ Exercises Implemented:
| # | Exercise Title | Directory |
|---|----------------|-----------|
| 1️⃣ | Setting Up JUnit | `1. JUnit_Basic Testing Exercises` |
| 2️⃣ | Assertions in JUnit | `1. JUnit_Basic Testing Exercises` |
| 3️⃣ | AAA Pattern, Fixtures, Setup & Teardown | `1. JUnit_Basic Testing Exercises` |
| 4️⃣ | Mocking and Stubbing | `3. Mockito exercises` |
| 5️⃣ | Verifying Interactions with Mockito | `3. Mockito exercises` |

---

## 📝 3. SLF4J Logging Framework

Logging is crucial for debugging and monitoring applications. This week we learned about logging strategies using SLF4J with different severity levels.

### 📚 Topics Covered:
- Difference between SLF4J, Log4J, Lombok
- SLF4J Setup and Configuration
- Logging Levels: INFO, DEBUG, WARN, ERROR
- Parameterized Logging and Appenders

### 🛠️ Exercise Implemented:
| # | Exercise Title                             | Directory               |
|---|--------------------------------------------|--------------------------|
| 1️⃣ | Logging Error Messages and Warning Levels | `6. SL4J Logging exercises` |

---

## 🧠 Summary of Concepts & Skills Gained

✅ Efficient database automation with PL/SQL  
✅ Structured unit testing and TDD principles  
✅ Mocking external services with Mockito  
✅ Logging and debugging best practices using SLF4J  

---


