# Bootcamp-Personal

 📘 Day 1 – Java Basics for Automation (README.md)
 --
🎯 Goal for Day 1
-

Lay the foundation needed for automation by learning:

Java project setup

Your first Java program

Variables & datatypes

Basic console I/O

Simple login logic using conditions

🛠 What You Set Up
-

Installed & configured IntelliJ IDEA

Created your first Java project

Wrote and ran your first Java class

✏️ Key Concepts Learned
-
✅ 1. Java Program Structure
-

Every Java program starts with:

public static void main(String[] args) { }


This is the entry point of execution.

✅ 2. Variables & Datatypes
-

Common types used in automation:

Type	Meaning	Example
String	Text values	"admin"
int	Whole numbers	12345
boolean	True/false values	true / false

Automation uses these constantly: URLs, credentials, flags, counters, etc.

✅ 3. User Input (Scanner)
-
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();


Useful for simulation/testing logic flow.

✅ 4. String Comparison
-

Very important:

userInput.equals("admin")


Not:

userInput == "admin"


equals() → compares values

== → compares memory locations

✅ 5. Conditions & Nested Conditions
-

Basic condition:

if(condition) {
    // code
} else {
    // code
}


Nested condition:

if(user.equals("admin")) {
    if(pass.equals("12345")) {
        // login success
    }
}


Used heavily in automation to decide test flow.


-
1️⃣ Main.java

Your first simple program:

public class Main {
    public static void main(String[] args) {
        System.out.println("Suyog is becoming an Automation Engineer!");
    }
}

2️⃣ VariablesDemo.java

Practiced variables & printing:

public class VariablesDemo {
    public static void main(String[] args) {

        String username = "admin";
        String password = "12345";
        int otp = 7890;
        boolean isLoggedIn = false;

        System.out.println(username);
        System.out.println(password);
        System.out.println(otp);
        System.out.println(isLoggedIn);
    }
}

3️⃣ SmartLogin.java (Day 1 Deliverable)
import java.util.Scanner;

public class SmartLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        String correctUser = "admin";
        String correctPass = "12345";

        if(user.equals(correctUser)) {

            if(pass.equals(correctPass)) {
                System.out.println("Login Successful! Welcome, " + user);
            } else {
                System.out.println("Password Incorrect!");
            }

        } else {
            System.out.println("Username Incorrect!");
        }
    }
}

📝 What You Should Be Able to Do After Day 1

Write & run Java programs

Create variables

Use Scanner to take input

Compare string values correctly

Build simple automation-like logic

Understand nested conditions


