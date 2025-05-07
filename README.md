# 🚗 SCC: Special Car Company – Design Pattern Based OOP System

This repository contains an object-oriented, extensible, and pattern-rich simulation of **Special Car Company (SCC)** – a fictional global car manufacturing organization. This project is developed for the **Software Pattern Lab (CSE-3216)** course at the University of Dhaka and demonstrates deep integration of software design principles and patterns.

---

## 📖 Overview

SCC produces various types of cars (e.g., Racing, SUV, Military), operates globally, supports customizations, and manages client interactions through services and notifications. The system is designed using core **object-oriented principles (SOLID)** and multiple **design patterns** for modularity, scalability, and real-world simulation.

---

## 🧩 Key Features

### ✅ Core Car System
- **Engine, Tire, Chassis, AC, Color, Seat**: Implemented via **Strategy Pattern**
- **Price Calculation**: Aggregated dynamically based on components and decorations
- **Car Groups**: Ferrari, Ford, Toyota, BMW, Chevrolet using **Abstract Factory Pattern**

### ✅ Car Variants
- Racing, Private, SUV, Military – handled through **Factory Method**
- Region-specific (Asia/USA) configurations and shop implementations

### ✅ Customization Options
- Add-ons: Rain Shield, Bumper, Gate Control, Open Roof
- Implemented using **Decorator Pattern** to dynamically attach features

### ✅ Notification System
- Clients subscribe/unsubscribe to updates on car prices or features
- Implemented using **Observer Pattern**

### ✅ Central Online Services
- Car servicing, washing, delivery system exposed through **Facade Pattern**
- Unified interface simplifies complex backend services

### ✅ Mobile Middleware
- Middleware bridges web-based services and mobile app features
- Also utilizes **Facade Pattern** for consistency and simplicity

---

## 🧠 Design Patterns Summary

| Pattern          | Purpose                                      |
|------------------|----------------------------------------------|
| Strategy         | Interchangeable car components               |
| Decorator        | Optional, composable customizations          |
| Abstract Factory | Brand-wise grouped car and shop creation     |
| Factory Method   | Variant-wise car instantiation               |
| Observer         | Notification subscription system             |
| Facade           | Unified interface for services and mobile    |
