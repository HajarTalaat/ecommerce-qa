📄 This file provides setup and usage instructions.

# E-Commerce Automation Testing Project

## 📌 Overview
This project automates 3 functional test cases for the Magento Demo Store using:
- Selenium WebDriver
- Java
- TestNG
- Maven
- Page Object Model (POM)

---

## ✅ Test Cases
1. **Valid Product Search**
2. **Add Item to Cart**
3. **Invalid Product Search**

Each test case covers a critical path or an edge case scenario.

---

## ⚙️ Technologies Used
- Java 17
- Maven
- Selenium WebDriver
- TestNG
- IntelliJ IDEA

---

## 📁 Project Structure
ecommerce-qa/
├── src/test/java/com/hagar/automation/tests/
│ ├── BaseTest.java
│ ├── ProductSearchTest.java
│ ├── AddToCartTest.java
│ ├── InvalidProductSearchTest.java
│ └── SmokeTest.java (optional)
├── testng.xml
├── test-cases.txt
├── bug-report.txt
├── security-checks.txt
├── README.md
├── pom.xml


---

## ▶️ How to Run Tests

1. **Clone the project** from GitHub:

```bash
git clone https://github.com/HajarTalaat/ecommerce-qa.git
cd ecommerce-qa

Run all test cases using: mvn clean test
Or run a specific test file: mvn clean test -Dtest=AddToCartTest

View test reports:
After execution, go to: target/surefire-reports

👩‍💻 Author
Hagar Talaat

