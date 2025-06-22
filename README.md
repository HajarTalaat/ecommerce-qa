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

![test1](https://github.com/user-attachments/assets/cd08ff96-fe35-4931-86f3-fe4172728fec)




---

## ⚙️ Technologies Used
- Java 17
- Maven
- Selenium WebDriver
- TestNG
- IntelliJ IDEA

![test1](https://github.com/user-attachments/assets/4b56db9c-e8db-4391-b9cd-76f7773601b5)

https://github.com/user-attachments/assets/7356dc64-cd5b-48d7-9a6a-3b97c441d3d8

https://github.com/user-attachments/assets/c15c1fd2-ea38-4bee-b89a-f9ae77870eef

https://github.com/user-attachments/assets/2cf73118-a755-4e66-8ac2-ee4eceece4ca

https://github.com/user-attachments/assets/48048afa-1c32-4302-b672-b73ac8021a23

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

