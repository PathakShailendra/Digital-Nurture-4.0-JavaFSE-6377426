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

### 🧩 Singleton Pattern

- 📄 `ImplementatingTheSingletonPattern.java`
- 🎯 Ensures that only **one instance** of a class is created
- ✅ Common in logging, database, config manager, etc.

**Key Concepts Used:**
- Private constructor
- Static instance
- Lazy initialization (`getInstance()` method)

**Expected Output:**
Singleton instance created.
Hello from Singleton!
true

markdown
Copy
Edit

---

### 🧩 Factory Method Pattern

- 📄 `ImplementingTheFactoryMethodPattern.java`
- 🎯 Returns object based on input without exposing creation logic
- ✅ Helps in decoupling object creation from client logic

**Key Concepts Used:**
- Interface: `Shape`
- Factory class: `ShapeFactory`
- Implementations: `Circle`, `Rectangle`

**Expected Output:**
Drawing Circle...
Drawing Rectangle...

yaml
Copy
Edit

---

### 📘 Analysis of Algorithms (Theory)

- Introduction to Algorithms & Need for DSA
- Types of Data Structures (Linear, Non-linear, Hash-based, etc.)
- Notations: Time Complexity & Space Complexity
- Asymptotic Notation:
  - Big O (O): Worst-case analysis
  - Omega (Ω): Best-case analysis
  - Theta (Θ): Average-case analysis

- Analysis Techniques:
  - Loop counting
  - Recursion trees

- Complexity Examples:
  - Iterative sum
  - Recursive factorial

📚 Ref: [GeeksForGeeks – Design and Analysis of Algorithms](https://www.geeksforgeeks.org/designand-analysis-of-algorithms/)

---

### 🔢 Sorting Algorithms Implemented & Analyzed

| Algorithm         | Best Case | Avg Case | Worst Case | Space Complexity |
|------------------|-----------|----------|------------|------------------|
| Bubble Sort      | O(n)      | O(n²)    | O(n²)      | O(1)             |
| Insertion Sort   | O(n)      | O(n²)    | O(n²)      | O(1)             |
| Heap Sort        | O(n log n)| O(n log n)| O(n log n) | O(1)             |
| Quick Sort       | O(n log n)| O(n log n)| O(n²)     | O(log n)         |
| Merge Sort       | O(n log n)| O(n log n)| O(n log n)| O(n)             |

✅ Implemented in Java with dry-run comments.

---

### 📘 Topics Covered:

- **Arrays**
  - Traversal, Searching, Memory Layout  
  🔗 [GFG – Arrays](https://www.geeksforgeeks.org/arraydata-structure-guide/)

- **Linked Lists**
  - Singly, Doubly, Circular  
  🔗 [GFG – Linked List](https://www.geeksforgeeks.org/linked-listin-java/)

- **Searching Algorithms**
  - Linear, Binary  
  🔗 [GFG – Searching](https://www.geeksforgeeks.org/searchingalgorithms/#basics-of-searchingalgorithms)

---

### 🛠️ Hands-On Exercises Completed:

- **Exercise 2:** E-commerce Platform Search Function  
- **Exercise 7:** Financial Forecasting  

✅ **Week 1 learning completed successfully.**

---

# 📘 Week 2 – PL/SQL, JUnit5, Mockito, SLF4J Logging

This week focused on unit testing, database programming using PL/SQL, and logging practices with SLF4J.

---

## 🗂️ Exercise Summary

| Topic                        | Module No. | Folder/Package Name           | Exercise Description                                       |
|-----------------------------|------------|-------------------------------|------------------------------------------------------------|
| PL/SQL programming          | 1          | PLSQL_Exercises               | Exercise 1: Control Structures                             |
| PL/SQL programming          | 2          | PLSQL_Exercises               | Exercise 3: Stored Procedures                              |
| TDD using JUnit5 and Mockito| 1          | 1. JUnit_Basic Testing Exercises| Exercise 1: Setting Up JUnit                              |
| TDD using JUnit5 and Mockito| 2          | 1. JUnit_Basic Testing Exercises| Exercise 3: Assertions in JUnit                           |
| TDD using JUnit5 and Mockito| 3          | 1. JUnit_Basic Testing Exercises| Exercise 4: AAA Pattern, Test Fixtures, Setup & Teardown  |
| TDD using JUnit5 and Mockito| 4          | 3. Mockito exercises           | Exercise 1: Mocking and Stubbing                           |
| TDD using JUnit5 and Mockito| 5          | 3. Mockito exercises           | Exercise 2: Verifying Interactions                         |
| SLF4J logging framework     | 1          | 6. SL4J Logging exercises      | Exercise 1: Logging Error Messages and Warning Levels      |

---

### ✅ Week 2 learning completed successfully.

- Explored **Test-Driven Development** with JUnit and Mockito  
- Wrote unit tests, assertions, mocking techniques  
- Learned **structured PL/SQL blocks** and procedures  
- Practiced **logging best practices** using SLF4J  

---

# 📅 Week 3 - Spring Core, Maven, Spring Boot, Spring Data JPA, and REST

This week focused on building a solid foundation in Spring Core concepts, understanding Maven project setup, diving deeper into Spring Boot, exploring Spring Data JPA with Hibernate, and implementing RESTful APIs.

---

### 🌱 Spring Core and Maven

#### ✅ Exercise 1: Configuring a Basic Spring Application
- Created a Maven project `LibraryManagement`.
- Added Spring Core dependencies in `pom.xml`.
- Configured `applicationContext.xml` with beans for `BookService` and `BookRepository`.
- Defined service and repository classes.
- Successfully tested the application with a main class that loaded Spring context.

#### ✅ Exercise 2: Implementing Dependency Injection
- Implemented setter-based Dependency Injection using Spring's IoC container.
- Updated XML configuration to wire dependencies.
- Verified injection by running the application.

#### ✅ Exercise 4: Creating and Configuring a Maven Project
- Set up a new Maven project and added required Spring dependencies.
- Configured the Maven Compiler Plugin to support Java 1.8.
- Ensured project structure aligns with Spring conventions.

---

### 🗃️ Spring Data JPA with Spring Boot & Hibernate

#### ✅ Hands-on 1: Spring Data JPA - Quick Example
- Created a Spring Boot project `orm-learn` using Spring Initializr.
- Added dependencies for Spring Data JPA, MySQL Driver, and DevTools.
- Configured `application.properties` with DB connection and logging properties.
- Created a `Country` entity class and mapped it to the MySQL `country` table.
- Implemented `CountryRepository` extending `JpaRepository`.
- Developed `CountryService` to fetch countries using `findAll()` method.
- Tested functionality in `OrmLearnApplication` using a custom `testGetAllCountries()` method.

#### ✅ Hands-on 2: Difference Between JPA, Hibernate, and Spring Data JPA
- **JPA** is a specification for object-relational mapping in Java.
- **Hibernate** is a popular ORM tool that implements JPA.
- **Spring Data JPA** provides abstraction and reduces boilerplate over JPA providers like Hibernate.

💡 **Code Comparison:**

- **Hibernate Example:**
  - Manual transaction and session handling.
- **Spring Data JPA Example:**
  - Cleaner code using `JpaRepository` and annotations.

🧩 **Advantages of Spring Data JPA:**
- Less boilerplate code
- Built-in CRUD support
- Easy integration with Spring Boot
- Better transaction management

> 🔗 References:  
> [What is the Difference Between Hibernate and Spring Data JPA – DZone](https://dzone.com/articles/what-is-the-difference-between-hibernate-and-sprin-1)  
> [Introduction to JPA – JavaWorld](https://www.javaworld.com/article/3379043/what-is-jpa-introduction-to-the-java-persistence-api.html)

---

### 🌐 Spring REST using Spring Boot 3

#### ✅ Hands-on: Creating a Spring REST Application
- Built a Spring Boot REST project using Maven.
- Defined REST controllers to handle web requests.
- Developed endpoints for performing CRUD operations.
- Validated APIs using tools like Postman.

---

### 🛠️ Tech Stack & Tools Used
- **Languages & Frameworks:** Java, Spring Core, Spring Boot, Spring Data JPA, Hibernate
- **Database:** MySQL
- **Tools:** Eclipse IDE, MySQL Workbench, Maven
- **Concepts Covered:**  
  - Spring IoC & DI (Setter Injection)  
  - Maven project structure  
  - Entity-Relation Mapping  
  - JPA Repository and Service Layer  
  - RESTful API Design

---

### ✅ Summary

Week 3 was all about building real-world skills with Spring's core modules and setting up the entire backend structure with Spring Boot, JPA, and REST. From configuring beans and learning dependency injection to fetching real data using Spring Data JPA and building endpoints, this week marks a major milestone in mastering backend development.


# ✅ Week 4 – Spring REST, JWT Authentication & Advanced REST Concepts

This week focused on building robust RESTful APIs using Spring Boot, securing them with JWT authentication, and diving into best practices like HATEOAS, DTOs, Actuator monitoring, and REST API testing and documentation.

---

### 📘 Spring Boot REST Hands-On Projects

#### 1️⃣ Spring REST Basics

✔️ **Project:** `spring-rest-handson`  
✔️ **Tech Stack:** Java, Spring Boot 3, Maven, Eclipse  

- ✅ Created a Spring Web project using Spring Initializr  
- ✅ Explored Maven structure: `src/main/java`, `src/test/java`, and `resources`  
- ✅ Explored `@SpringBootApplication` and `main()` method execution flow  

#### 2️⃣ Spring Core – XML Configuration

- Configured `country.xml` using Spring beans:
  ```xml
  <bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN" />
    <property name="name" value="India" />
  </bean>
  ```
- Developed `Country` class with:
  - Logging in constructor, getters, setters  
  - Debug logging inside `toString()`  
- Used `ApplicationContext` and `ClassPathXmlApplicationContext` to load bean  

#### 3️⃣ Hello World REST API

- ✅ Created a simple GET endpoint:
  - **URL:** `/hello`  
  - **Response:** `"Hello World!!"`  
  - **Controller:** `HelloController.java`  
- ✔️ Tested using Postman and browser  
- ✅ Analyzed HTTP headers via DevTools and Postman  

#### 4️⃣ REST - Country Web Service

- ✅ Created endpoint `/country` to return **India** details  
- ✅ Loaded country from Spring XML and returned as JSON  

#### 5️⃣ REST - Country Lookup by Code

- ✅ Endpoint: `/countries/{code}` (case-insensitive)  
- ✅ Loaded list of countries from XML and searched by code  
- ✅ Returned matching `Country` object as JSON  

---

### 🔐 JWT Authentication – Secure REST APIs

✔️ **Project:** `jwt-handson`  
✔️ Built a Spring Boot-based JWT Authentication Service

- ✅ Created **Authentication Controller**  
- ✅ Enabled **Basic Auth** using `SecurityConfig`  
- ✅ Handled Authorization header manually to extract credentials  
- ✅ Generated JWT tokens for valid users  

**Sample cURL Test:**
```bash
curl -s -u user:pwd http://localhost:8090/authenticate
```

**Sample Response:**
```json
{"token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzUyMzQyMzMyLCJleHAiOjE3NTIzNDU5MzJ9.oIHQ-dj63zYKRtHhqHTfEfO0-m5fP6Y-OgB5kfcgWew"}
```

---

### 🧠 Deep Dive – REST Concepts & Best Practices

#### ✅ Spring REST and Boot 3

- REST principles and Spring Boot 3 highlights  
- Explored project setup, devtools, and dependency hierarchy  

#### ✅ REST Controller Design

- Handled GET, POST, PUT, DELETE methods  
- Returned JSON via Spring Web automatically  

#### ✅ Request & Response Handling

- Path variables, query parameters  
- Custom headers, status codes  
- Exception handling in controllers  

#### ✅ RESTful DTOs & Representation

- Used **DTOs** for clean API responses  
- Explored JSON serialization & versioning strategies  

#### ✅ CRUD Operations with REST

- Implemented Create, Read, Update, Delete endpoints  
- Applied annotations for validation  
- Used optimistic locking where needed  

#### ✅ Content Negotiation

- Supported both JSON & XML using `Accept` header  
- Configured media types and custom format support  

#### ✅ Spring Security & JWT

- Secured endpoints using JWT  
- Configured **CORS**, **Authentication**, and **Authorization**  

---

### 📅 Summary

Week 4 was about building **secure, testable, and scalable REST APIs**. From learning basic controllers to securing with JWT and documenting with Swagger, this week elevated backend capabilities to enterprise-level development.

> ✅ Successfully completed **REST API development**, **JWT-based security**, and **advanced REST features** in Spring Boot 3.

---

# 📦 Week 5 – Microservices with Spring Boot

This week focused on building **independent microservices** using Spring Boot. We explored how to structure projects using Maven, manage multiple Spring Boot applications, handle port conflicts, and build RESTful APIs in a modular way for scalable development.

---

## 🔧 Hands-On: Creating Microservices for Account and Loan

In this hands-on exercise, we created two Spring Boot-based microservices simulating a banking system:

- ✅ **Account Microservice**  
- ✅ **Loan Microservice**

Each service is **independent**, with its own Maven configuration (`pom.xml`) and runs on a separate port.

---

## 1️⃣ Account Microservice

✔️ Created using [start.spring.io](https://start.spring.io)  
✔️ Dependencies:
- Spring Web
- Spring Boot DevTools

### 🧪 Endpoint  
GET /accounts/{number}

bash
Copy
Edit

### 📦 Sample Response
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
🔧 No database — returning dummy data as response.

📌 Build & Run Steps
Used mvn clean package to build the project

Launched application using the main Spring Boot class

Tested using browser/Postman

2️⃣ Loan Microservice
✔️ Created similarly to the account microservice

🧪 Endpoint
bash
Copy
Edit
GET /loans/{number}
📦 Sample Response
json
Copy
Edit
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
🛠 Port Conflict Handling
Account service used the default port 8080

Configured loan service to run on port 8081 using:

properties
Copy
Edit
# application.properties
server.port=8081
🌐 Final Setup
✅ Account Microservice: http://localhost:8080/accounts/{number}

✅ Loan Microservice: http://localhost:8081/loans/{number}

Both services now run independently on separate ports with dummy data.

📘 Key Learnings
Difference between monolith and microservices

Creating multiple Spring Boot apps in the same workspace

Handling port conflicts between services

Structuring independent Maven-based REST APIs

Testing endpoints with Postman and browsers

Running multiple Spring Boot apps simultaneously in Eclipse

✅ Summary
Week 5 was all about modular architecture and creating scalable microservices. From building RESTful endpoints for account and loan services to resolving runtime port issues and understanding microservice independence, this week laid a solid foundation for distributed systems and service orchestration.

