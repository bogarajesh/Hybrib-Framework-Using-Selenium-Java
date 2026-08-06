# 🚀 Hybrid Framework Using Selenium Java

A Hybrid Test Automation Framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**. This project automates the login functionality of the SauceDemo application using the Page Object Model (POM) design pattern.

---

## 📖 Project Overview

This project is part of my Selenium Automation learning journey and demonstrates a clean and reusable test automation framework.

### Current Features

- Page Object Model (POM)
- TestNG Framework
- Maven Project Structure
- WebDriverManager Integration
- Configuration Management using `config.properties`
- Reusable Driver Factory
- Base Test Class for Test Setup

---

## 🌐 Application Under Test

- **Application:** SauceDemo
- **URL:** https://www.saucedemo.com/

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## 📂 Project Structure

```text
Hybrid-Framework-Using-Selenium-Java
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Pages
│   │   │   │   └── LoginPage.java
│   │   │   │
│   │   │   └── Utils
│   │   │       ├── ConfigReader.java
│   │   │       └── DriverFactory.java
│   │
│   └── test
│       ├── java
│       │   ├── Base
│       │   │   └── BaseTest.java
│       │   │
│       │   └── Tests
│       │       └── LoginTest.java
│       │
│       └── resources
│           └── config.properties
│
├── pom.xml
└── README.md
```

---

## ✅ Test Scenario

**Login Test**

- Launch Chrome Browser
- Navigate to SauceDemo
- Enter a valid username
- Enter a valid password
- Click the Login button
- Verify successful login

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/bogarajesh/Hybrid-Framework-Using-Selenium-Java.git
```

### Open the Project

Open the project in **IntelliJ IDEA** or **Eclipse**.

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

Run the `LoginTest.java` class directly from your IDE.

Or execute using Maven:

```bash
mvn test
```

---

## 🚀 Future Enhancements

- Data-Driven Testing
- Cross-Browser Testing
- Parallel Test Execution
- Log4j2 Logging
- Extent Reports
- Screenshot Capture on Failure
- Selenium Grid
- Jenkins CI/CD Integration
- GitHub Actions

---

## 👨‍💻 Author

**Rajesh Boga**

QA Engineer | Java | Selenium WebDriver | TestNG | Maven

---

⭐ If you found this project helpful, consider giving it a Star.
