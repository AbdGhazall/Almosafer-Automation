# 🧪 Almosafer Automation Testing
This project automates the functional testing of the [Almosafer](https://www.almosafer.com/en) travel booking website using **Selenium WebDriver** and **TestNG**.  
The tests validate critical user journeys such as verifying default language, contact number, currency, hotel tab behavior, date pickers, city search, and search result validation.

---

## 📂 Project Structure
```
Almosafer  
│── src/ # Source code for tests  
│ └── AlmosaferTests/ # Test packages & classes  
│ ├── TestData.java # Holds test data & random city generator  
│ └── MyTestCases.java # Main test cases  
│  
│── pom.xml # Maven dependencies & build management  
│── test-output/ # TestNG generated reports  
│── target/ # Compiled files  
│── bin/ # Compiled class files  
│── README.md # Project documentation
```
---

## 🛠️ Tools & Frameworks
- **Java (JDK 21)** – Programming language  
- **Selenium WebDriver** – Browser automation  
- **TestNG** – Test execution & reporting  
- **Maven** – Dependency management & build tool  
- **ChromeDriver** – WebDriver implementation for Chrome  

---

## ✅ Features & Test Scenarios
The project includes multiple automated test cases covering UI and functional flows:

1. **Language Verification** – Check that the default language is English.  
2. **Contact Number Validation** – Ensure the displayed number matches the expected one.  
3. **Currency Verification** – Confirm that SAR is set as the default currency.  
4. **Qitaf Logo Test** – Validate presence of the Qitaf logo in the footer.  
5. **Hotel Tab Test** – Verify that the Hotels tab is not selected by default.  
6. **Flight Dates (Departure)** – Ensure tomorrow’s date is correctly set.  
7. **Flight Dates (Return)** – Ensure the day after tomorrow is correctly set.  
8. **Random Language Switching** – Switch randomly between English and Arabic.  
9. **Hotel Search (City Input)** – Test input of random city names (EN/AR).  
10. **Room Options Selection** – Randomly choose between available room options.  
11. **Search Hotels Button** – Ensure the search button functions correctly.  
12. **Search Result Validation** – Confirm that search results are displayed with expected text.  

---

## 📌 Notes
- Tests are written in **Java with TestNG annotations** (`@BeforeTest`, `@Test`, `@AfterTest`).  
- Randomization is applied for **city selection** and **language switching**.  
- Dates are dynamically generated based on the current system date (departure = tomorrow, return = day after tomorrow).  
- Ensure **ChromeDriver** is installed and compatible with your Chrome browser version. 
