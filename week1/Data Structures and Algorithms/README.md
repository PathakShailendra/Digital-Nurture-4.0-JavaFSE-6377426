# 📘 Data Structures & Algorithms (Java FSE | Deep Skilling Phase)

Welcome to the foundation of problem-solving: **Data Structures & Algorithms (DSA)**.  
This module builds the thinking pattern for writing **efficient, scalable, and optimal** code.

---

## 🔰 Introduction: What is DSA?

**Data Structures (DS)** are ways to organize data so that operations like search, insertion, and deletion become easy and efficient.

**Algorithms** are step-by-step instructions to solve a particular problem.

Together, DSA helps in solving real-world problems effectively using code.

---

## 💡 Why Learn Data Structures and Algorithms?

- 🎯 To write faster and optimized code  
- 🧠 Helps you crack coding interviews (FAANG, Cognizant, TCS, etc.)  
- 🚀 Forms the base of frameworks, APIs, databases, and system design  
- 📈 Better performance = happier users + scalable software  

---

## 🧱 Types of Data Structures

| Type           | Examples                            | Description                                     |
|----------------|--------------------------------------|-------------------------------------------------|
| **Linear**     | Array, Linked List, Stack, Queue     | Elements are arranged sequentially             |
| **Non-Linear** | Tree, Graph                          | Elements are arranged in hierarchy             |
| **Hash-based** | HashMap, HashSet                     | Key-value based DS for fast lookup             |
| **Advanced**   | Heap, Trie, Segment Tree             | Used in competitive programming & system design |

---

## 📏 Time and Space Complexity

| Term               | Meaning                                  |
|--------------------|------------------------------------------|
| **Time Complexity**| Total time an algorithm takes to run     |
| **Space Complexity**| Total memory used by the algorithm      |

---

## 📊 Why Analyze Complexity?

- To choose the best approach when there are multiple ways to solve a problem  
- To understand how your code behaves on **large inputs**  

---

## 🧮 Asymptotic Notations (Used to express Time Complexity)

| Notation      | Meaning                             |
|---------------|--------------------------------------|
| **Big O (O)** | Worst-case scenario                 |
| **Omega (Ω)** | Best-case scenario                  |
| **Theta (Θ)** | Average-case or tight bound         |

### 📌 Example:

for(int i = 0; i < n; i++) {
    System.out.println("Hi");
}

---

## 🧾 Arrays in Data Structures

### 📌 Concepts Covered:
- **Array representation in memory** (contiguous block of memory, 0-based indexing)
- **Array traversal** using loops
- **Time complexity of traversal**: O(n)
- **Searching in arrays**:
  - 🔍 Linear Search – O(n)
  - 🔎 Binary Search – O(log n) [Only on sorted arrays]
- **When to use arrays?**
  - You need **random access** (O(1))
  - You know the **size beforehand**
  - You need **cache-friendly, static allocation**

### 🧠 Resources:
🔗 [Array Guide – GeeksForGeeks](https://www.geeksforgeeks.org/arraydata-structure-guide/)

---

## 🔗 Linked List Variants and Operations

### ✅ Types Implemented:
| Type                             | Description |
|----------------------------------|-------------|
| **Singly Linked List**           | Node points to next node |
| **Circular Singly Linked List**  | Last node points to head |
| **Doubly Linked List**           | Node has prev and next pointers |
| **Circular Doubly Linked List**  | Last node connects back in both directions |

### 📘 Operations Practiced:
- 🔄 Traverse
- ➕ Insert at front, end, middle
- ❌ Delete node (by value, position)
- 🔍 Search for an element

### ⏱ Time Complexities:

| Operation | Singly LL | Doubly LL | Array |
|-----------|-----------|-----------|-------|
| Traverse  | O(n)      | O(n)      | O(n)  |
| Insert at start | O(1) | O(1)      | O(n)  |
| Insert at end | O(n)   | O(1)\*    | O(n)  |
| Delete    | O(n)      | O(1)\*\*   | O(n)  |

> \* If tail is maintained  
> \*\* If reference to node is given

### 🧠 Resources:
🔗 [Linked List in Java – GeeksForGeeks](https://www.geeksforgeeks.org/linked-list-in-java/)

---

## 🔍 Searching Algorithms

### 🔸 Linear Search
- ✅ Simple search in **unsorted array**
- ✅ Checks each element one by one
- ⏱ Time Complexity: **O(n)**

### 🔸 Binary Search
- ✅ Works on **sorted array**
- ✅ Divide and conquer approach
- ⏱ Time Complexity: **O(log n)**

### 💡 Binary Search Use Cases:
- Large sorted datasets (e.g., searching in a dictionary)
- Number guessing games
- Efficient lookup when random access is possible

# 🛒 E-commerce Platform Search Function

This project is a solution to **Exercise 2: E-commerce Platform Search Function**, provided as part of the **Cognizant Hands-on Programming Practice**.

---

## 📌 Problem Statement

Design and implement a **case-insensitive product search functionality** for an e-commerce platform. Given a list of product names and a search keyword, the program should return a list of matching product names. A product is considered a match if the keyword appears anywhere in its name, regardless of case.

---

## ✅ Features

- Accepts a list of product names and a keyword to search.
- Case-insensitive matching.
- Supports **partial keyword match** (e.g., `mo` will match `Mobile`, `Mouse`, `microphone`).
- Output is returned in **alphabetically sorted order** for better readability.

---

## 💡 Example

**Input:**

Products: ["Mobile", "Laptop", "Mouse", "Charger", "Headphones", "microphone"]
Keyword: "mo"

# 📈 Financial Forecasting – Monthly Revenue Analyzer

This project is a solution to **Exercise 7: Financial Forecasting**, provided as part of the **Cognizant Hands-on Java Practice**.

---

## 📌 Problem Statement

Design and implement a program that analyzes a company’s monthly revenue data. The program calculates and displays the following metrics:

- 📊 Average Monthly Revenue
- 📈 Highest Monthly Revenue
- 📉 Lowest Monthly Revenue

This is useful for financial forecasting and business performance evaluation.

---

## 💡 Example

### ✅ Input:

Monthly Revenues: [10000.0, 12000.0, 11000.5, 9500.0, 13000.0, 12500.0, 14000.0, 13500.0, 15000.0, 14500.0, 15500.0, 16000.0]

## ✅ Week 1 Status

**Week 1 Learning Completed**  
Successfully completed all hands-on exercises and Java practice tasks as part of the Week 1 curriculum.
