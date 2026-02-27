# 🧪 Selenium Automation Framework (SauceDemo)

This is a basic End-to-End Test Automation Framework built using:

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Maven

The framework automates the complete purchase flow on SauceDemo.

---

## 🚀 Project Overview

This project demonstrates:

- Login functionality
- Adding product to cart
- Cart validation
- Checkout process
- Order completion verification
- Explicit Wait implementation (No Thread.sleep)

Website used for automation:
https://www.saucedemo.com/

---

## 🧱 Framework Design

- Page Object Model (POM) design pattern
- Explicit Wait (WebDriverWait)
- Clean separation of Test and Page classes
- Reusable page methods
- Assertions using TestNG

---

## 🛠️ Tech Stack

- Java
- Selenium 4
- TestNG
- Maven
- ChromeDriver

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

### 2️⃣ Open in IDE
Open the project in:
- IntelliJ IDEA
- Eclipse

### 3️⃣ Install Dependencies and Run Test Files as TestNG Suit
Maven will automatically download dependencies.

---

## ✅ Test Scenario Covered

1. Login with valid credentials
2. Add "Sauce Labs Backpack" to cart
3. Click cart icon
4. Verify product in cart
5. Click checkout
6. Enter user details
7. Complete purchase
8. Verify order success message

---

## 📌 Key Learnings

- Proper synchronization using Explicit Wait
- Avoiding Thread.sleep
- Debugging NoSuchElementException
- Debugging TimeoutException
- Handling navigation timing issues
- Framework structure best practices

---

## 🔮 Future Enhancements

- BasePage implementation
- DataProvider integration
- Cross-browser support
- Reporting (Extent Reports)
- Retry mechanism
- CI/CD integration

---

## 👨‍💻 Author

Khaja Noman Ahmed
