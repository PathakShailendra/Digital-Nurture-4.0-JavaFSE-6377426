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

