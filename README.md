# Online Exam System

## 📌 Description

This is a Java-based Online Exam System built using Servlets and JSP.
It allows users to take exams and view results.

---

## 🛠️ Technologies Used

* Java (Servlets, JSP)
* HTML, CSS
* Oracle Database
* Apache Tomcat Server

---

## ⚙️ Requirements

Make sure you have:

* JDK 8 or above
* Eclipse IDE (or any Java IDE)
* Apache Tomcat Server
* Oracle Database (XE)

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/akhilar97-raw/OnlineExamSystem.git
```

### Step 2: Import into Eclipse

* Open Eclipse
* Go to File → Import
* Select "Existing Projects into Workspace"
* Choose the project folder

---

### Step 3: Configure Apache Tomcat

* Add Tomcat Server in Eclipse
* Right click project → Run on Server

---

### Step 4: Setup Database

* Open Oracle SQL
* Create database tables (questions table required)
* Insert sample data

---

### Step 5: Update DB Connection

Go to:

```
DBConnection.java
```

Update:

* Username
* Password
* Database URL

---

### Step 6: Run Project

Open browser:

```
http://localhost:8080/OnlineExamSystem/
```

---
🎯 What actually matters for running

To clone repo, you mainly need:

✔ src/main/java
✔ src/main/webapp
✔ WEB-INF/web.xml
✔ Database setup

## ⚠️ Important Notes

* Make sure Oracle services are running
* Ensure ojdbc jar is added to build path
* If questions are not visible, check database connection

---

## 👩‍💻 Author

Akhila
