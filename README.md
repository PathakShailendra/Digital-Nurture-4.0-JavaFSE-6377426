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

# 📘 Week 6 – Introduction to React & SPA

This week focused on understanding **Single Page Applications (SPA)** and how **React** plays a major role in building modern web interfaces. We explored setting up a React development environment, creating components, applying styling, and understanding lifecycle methods.

---

## 🎯 Objectives Covered

- Define SPA and compare with MPA
- Understand React, its working, and features
- Learn about Virtual DOM
- Understand React Components – Class and Functional
- Learn about Component Lifecycle and Styling techniques

---

## 🧪 Hands-On Labs

### 🔹 Hands-On 1: My First React App
- Created a new React app `myfirstreact` using `create-react-app`.
- Displayed the message:  
  `Welcome to the first session of React`  
- Verified app by running on: `http://localhost:3000`

---

### 🔹 Hands-On 2: Student Management Portal (Class Components)
- Created a new React app `StudentApp`.
- Created 3 class components:
  - `Home`: Home page message.
  - `About`: About page message.
  - `Contact`: Contact page message.
- Rendered all components from `App.js`.

---

### 🔹 Hands-On 3: Score Calculator App (Functional Component with Styling)
- Created a new app `scorecalculatorapp`.
- Created a functional component `CalculateScore` which:
  - Accepts name, school, total, goal.
  - Calculates and displays average score.
- Applied external CSS styling using `mystyle.css`.

---

### 🔹 Hands-On 4: Blog App (Component Lifecycle)
- Created an app `blogapp`.
- Implemented:
  - `componentDidMount()` for fetching posts from `https://jsonplaceholder.typicode.com/posts`
  - `componentDidCatch()` for handling errors.
- Displayed fetched posts in UI with titles and descriptions.

---

### 🔹 Hands-On 5: Cohort Dashboard Styling
- Downloaded a pre-built React app.
- Created a CSS Module: `CohortDetails.module.css`
- Styled components using:
  - CSS classes
  - Inline styling (color change based on cohort status)
- Applied conditional rendering based on status (`ongoing`, `completed`).

---

## ✅ Summary

Week 6 provided a strong foundation in:
- React basics
- SPA vs MPA
- Component creation and styling
- Lifecycle methods and API calls

With hands-on projects like **StudentApp**, **BlogApp**, and **ScoreCalculator**, this week successfully combined theory with practical experience in React.

---

# 📘 Week 7 – Modern JavaScript (ES6) & React Concepts

This week focused on exploring modern JavaScript features introduced in **ES6** and their seamless integration with **React** development. We deep-dived into the usage of `let`, `const`, arrow functions, destructuring, ES6 classes, and collections like `Map` and `Set`. We also applied these concepts practically in building React apps with **JSX**, **conditional rendering**, **events**, and **dynamic styling**.

---

### 🎯 Objectives Covered

- Learn ES6 fundamentals like `let`, `const`, `arrow functions`, `destructuring`, `classes`, `inheritance`, `map()`, `set()`
- Understand and implement JSX in React
- Style React components using inline CSS
- Master conditional rendering and list rendering
- Handle events in React using **Synthetic Events**
- Use React state and functions to control user interaction
- Use multiple components, props, and event handling patterns

---

## 🧪 Hands-On Labs

### 🔹 Hands-On 1: Cricket App (Using ES6 Features in React)

📁 **App Name**: `cricketapp`

**Components**:

#### ✅ `ListofPlayers`
- Used `map()` to display 11 players with scores
- Filtered players with scores `< 70` using **arrow functions**

#### ✅ `IndianPlayers`
- Used **destructuring** to show Odd & Even team players
- Merged `T20players` and `RanjiTrophyPlayers` arrays using **spread operator**

🔄 Used a **flag variable** to toggle between the two components using **if-else conditional rendering**.

---

### 🔹 Hands-On 2: Office Space Rental App (JSX & Styling)

📁 **App Name**: `officespacerentalapp`

✅ Implemented:

- Created heading using **JSX**
- Displayed an office image using JSX attributes
- Used an object to show office details (name, rent, address)
- Looped over an array of office objects and rendered them using `map()`
- Styled rent amount:
  - If rent > ₹60,000 → Green
  - Else → Red (using **inline styles**)

---

### 🔹 Hands-On 3: Event Handling App

📁 **App Name**: `eventexamplesapp`

**Features**:

- Counter with **Increment/Decrement** buttons  
  - `Increase` button triggered:
    - A method to increment count
    - A method to say hello

- `Say Welcome` button — accepted a string parameter and invoked a method

- Button with **Synthetic Event** that displayed `I was clicked` on press

#### ✅ `CurrencyConvertor` Component
- Took input in INR and converted it to Euro on clicking **Convert**
- Handled form events and button click using `handleSubmit()`

---

### 🔹 Hands-On 4: Ticket Booking App (Conditional Rendering)

📁 **App Name**: `ticketbookingapp`

✅ Functionalities:

- **Conditional rendering** based on login status
- Guest users can browse flight details
- Logged-in users can book tickets
- Buttons for **Login/Logout** toggle between Guest and User views

---

### 🔹 Hands-On 5: Blogger App (Advanced Conditional Rendering)

📁 **App Name**: `bloggerapp`

**Components**:

- `BookDetails`
- `BlogDetails`
- `CourseDetails`

✅ Implemented:

- Multiple approaches for **conditional rendering**:
  - `if-else`
  - `ternary operator`
  - `logical && operator`
- Displayed components dynamically based on user selection or status

---

## ✅ Summary

Week 7 was all about mastering **modern JavaScript (ES6)** and its synergy with **React**:

- 🔹 **JavaScript ES6**: Arrow functions, let/const, destructuring, spread, map/set, classes  
- 🔹 **React JSX**: Syntax, rendering, styling  
- 🔹 **Events**: Handling form events, synthetic events, parameterized functions  
- 🔹 **Conditional Rendering**: Toggling components based on login or flags  
- 🔹 **Hands-on Experience**: Through 5 unique apps like `cricketapp`, `eventexamplesapp`, and `ticketbookingapp`, we applied theoretical concepts in practical UI scenarios.

This week strengthened **core JS + React skills** and provided hands-on experience necessary for building **interactive**, **dynamic**, and **real-world web applications**.

# 📘 Week 8 – Git & GitHub Essentials

This week focused on learning **Git fundamentals**, version control workflows, and integrating tools for efficient source code management. We explored Git commands, branching, merging, conflict resolution, `.gitignore` usage, and pushing code to remote repositories like **GitHub/GitLab**.

---

### 🎯 Objectives Covered

- Learn essential Git commands:  
  `git init`, `git status`, `git add`, `git commit`, `git push`, `git pull`
- Configure Git user settings and default editor (Notepad++)
- Create and manage repositories (local & remote)
- Track and commit changes to Git
- Use `.gitignore` to exclude unwanted files and folders
- Understand branching and merging workflows
- Resolve merge conflicts
- Push and pull changes between local and remote repositories
- Clean up branches and sync with remote

---

## 🧪 Hands-On Labs

### 🔹 Hands-On 1: Git Setup & First Commit

📁 **Project Name**: `GitDemo`

✅ Implemented:
- Installed Git Bash and verified installation
- Configured Git user name and email
- Integrated **Notepad++** as default Git editor
- Created a local repository (`git init`)
- Added a `welcome.txt` file and committed it with a multi-line message
- Created a remote repository in GitLab and linked it to the local repo
- Pushed local changes to remote using:
  ```bash
  git push origin master
🔹 Hands-On 2: Ignoring Files with .gitignore
✅ Implemented:

Created .log files and a log folder

Configured .gitignore to ignore .log extensions and log/ folder

Verified with git status that ignored files were not tracked

🔹 Hands-On 3: Branching & Merging
✅ Implemented:

Created a new branch GitNewBranch

Added files and committed changes to branch

Switched to master and merged changes from GitNewBranch

Used P4Merge to visualize differences before merging

Deleted merged branch and verified with:

bash
Copy
Edit
git branch -d GitNewBranch
🔹 Hands-On 4: Merge Conflict Resolution
✅ Implemented:

Created a branch GitWork and added hello.xml

Made different changes to hello.xml in both master and GitWork

Merged branches to produce a merge conflict

Used 3-way merge tool in P4Merge to resolve conflict

Added backup files to .gitignore

Committed final resolved code and deleted the branch

🔹 Hands-On 5: Cleanup & Push to Remote
✅ Implemented:

Verified master was in a clean state

Pulled latest changes from remote

Pushed pending changes to remote repository

Verified remote repository updates

###  View the Project

You can check out the complete project on GitLab:
[**GitDemo Repository on GitLab**](https://gitlab.com/pathakharsh813-group/GitDemo/-/tree/master?ref_type=heads)


✅ Summary
Week 8 was dedicated to mastering Git for source code management:

🔹 Git Basics: Init, status, add, commit, push, pull

🔹 Editor Integration: Setting Notepad++ as default

🔹 Ignore Rules: .gitignore to skip unwanted files/folders

🔹 Branching & Merging: Creating, switching, and merging branches

🔹 Conflict Resolution: Handling merge conflicts using visual tools

🔹 Remote Sync: Pushing and pulling with GitHub/GitLab

🔹 Cleanup: Deleting merged branches, keeping repository tidy

By the end of this week, i have gained hands-on experience in version control workflows—from initial setup to advanced branching, merging, and conflict resolution—laying a strong foundation for collaborative development.


