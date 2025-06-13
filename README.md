# DreamPortalTests

Automated UI functional tests for the [Dream Portal](https://arjitnigam.github.io/myDreams/) application, using Selenium Java + TestNG + Allure.

---

## 📂 Repository Structure

DreamPortalTests/
├── pom.xml
├── testng.xml
├── README.md
├── src
│ ├── main
│ │ └── java
│ │ └── com/mydreams/pageobjects
│ │ ├── BasePage.java
│ │ ├── HomePage.java
│ │ ├── DiaryPage.java
│ │ └── TotalPage.java
│ └── test
│ └── java
│ └── com/mydreams/tests
│ ├── BaseTest.java
│ ├── HomePageTest.java
│ ├── DiaryPageTest.java
│ └── TotalPageTest.java
└── test-output/ # TestNG reports (after run)
└── allure-results/ # Allure raw results (after run)



---

## 🛠 Prerequisites

- **Java 11+** installed and `JAVA_HOME` set  
- **Maven** installed and on your `PATH`  
- **Chrome browser** installed  
- **ChromeDriver** matching your Chrome version, placed at `C:\WebDriver\chromedriver.exe` or update path in `BaseTest.java`  
- **Allure CLI** installed (`npm install -g allure-commandline`)

---

## 🚀 Setup & Run Tests

1. **Clone** this repository:
   ```bash
   git clone https://github.com/abhiyantsingh007/DreamPortal-Automation.git
   cd DreamPortal-Automation

📋 Test Coverage
HomePageTest: Verifies the “Dreams” button is visible on the home page.

DiaryPageTest: Checks that the dream diary table loads and contains entries.

TotalPageTest: Reads the summary table and asserts counts for Good, Bad, Total, Weekly, and Recurring dreams.

Author: Abhiyant Singh
Date: 2025‑06‑14
