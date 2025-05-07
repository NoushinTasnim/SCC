# 🚗 Special Car Company (SCC) – OOP Design Project

This repository contains a fully object-oriented simulation of a fictional car company named **Special Car Company (SCC)**. The project is designed around modular, scalable software architecture using **design patterns**, **solid OOP principles**, and **clean class structures**.

---

## 📚 Project Overview

**SCC** is the world’s largest car manufacturer with multiple subsidiaries (e.g., Ferrari, Ford, Toyota, etc.) and serves both Asia and USA markets. This project captures the business logic, structural design, and customer-facing functionality of SCC's car production and customization pipeline.

---

## 🧩 Key Features & Concepts

### ✅ Core Car Components
- **Engine**: Multiple CC variations
- **Tires**: Snow, Slick, Spare, etc.
- **Chassis**: Backbone, Ladder Frame, etc.
- **AC**: High/Low powered
- **Seats**: Varying per car type (e.g., Racing, SUV)
- **Color & Body Design**
- **Automated AI**: Region-specific (Asia/USA)

### ✅ Car Groups & Variants
- Brands: *Ferrari, Ford, Toyota, BMW, Chevrolet*
- Variants: *Racing Car, Private Car, SUV, Military Vehicle*
- Each brand has dedicated shops and supports customization.

### ✅ Design Patterns Used
- **Abstract Factory**: For generating different car variants across brands
- **Decorator Pattern**: For handling customizable features (e.g., Rain Shield, Bumpers)
- **Observer Pattern**: For client notification (price/features)
- **Command Pattern**: For managing client service requests (wash, repair, delivery)
- **Adapter Pattern**: For connecting mobile app middleware to the web-based backend

### ✅ Services Handled
- Car servicing at client's location
- Scheduled car washing
- Online purchase and delivery handling
- Middleware interface for mobile app integration
