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


📘 Day 2 – Conditions, Multi-Conditions & Login Logic (README.md)
-
🎯 Goal for Day 2

Strengthen your logic-building skills using:
-

if, else-if, else

AND (&&) & OR (||) conditions

Nested conditions

Loops + conditions together

Real-world login flows (password + OTP)

3-attempt lockout logic (used in banking apps)

These are core automation thinking patterns used everywhere in Selenium.

🧠 Key Concepts Learned
✅ 1. if / else-if / else
-

Used to create multiple decision paths.

if(condition1) { }
else if(condition2) { }
else { }

✅ 2. Multi-conditions (AND / OR)
-
AND (&&)
→ All conditions must be true
Example:

if(user.equals("admin") && role.equals("manager"))


OR (||)
→ At least one condition must be true
Example:

if(age > 18 || hasPermission)

✅ 3. Nested Conditions
-

A condition inside another.

Automation use-case:
Check password first, THEN verify OTP.

if(passwordCorrect) {
    if(otpCorrect) {
        login success
    }
}

✅ 4. Loop + Condition (3 Attempt Logic)
-

Used for:

✔ OTP retries
✔ Login attempts
✔ Form validation loops
✔ Polling retries in automation

while(attempts > 0) {
    // check value
}

💻 Programs You Wrote on Day 2
1️⃣ AccessControl.java
-

Role-based access using else-if ladder.

public class AccessControl {
    public static void main(String[] args) {

        String role = "manager";

        if(role.equals("admin")) {
            System.out.println("Full Access Granted");
        }
        else if(role.equals("manager")) {
            System.out.println("Limited Access Granted");
        }
        else if(role.equals("guest")) {
            System.out.println("View Only Access");
        }
        else {
            System.out.println("Invalid Role");
        }
    }
}

2️⃣ LoginLimiter.java
-

3-attempt password system (real banking logic).

import java.util.Scanner;

public class LoginLimiter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPass = "12345";
        int attempts = 3;

        while(attempts > 0) {

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if(pass.equals(correctPass)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect! Attempts left: " + attempts);
            }
        }

        if(attempts == 0) {
            System.out.println("Account Locked!");
        }
    }
}

3️⃣ MultiFactorLogin.java (Day 2 Final Deliverable)
-
Password + OTP + 3 attempts.

import java.util.Scanner;

public class MultiFactorLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPass = "12345";
        int otp = 6789;

        System.out.print("Enter password: ");
        String inputPass = sc.nextLine();

        if(inputPass.equals(correctPass)) {

            System.out.println("Password correct! OTP sent to your phone.");

            int attempts = 3;

            while(attempts > 0) {

                System.out.print("Enter OTP: ");
                int inputOtp = sc.nextInt();

                if(inputOtp == otp) {
                    System.out.println("Login Successful! Welcome.");
                    break;
                } else {
                    attempts--;
                    System.out.println("Incorrect OTP. Attempts left: " + attempts);
                }
            }

            if(attempts == 0) {
                System.out.println("OTP failed. Login blocked.");
            }

        } else {
            System.out.println("Password Incorrect. Login Failed.");
        }

    }
}

📚 Day 2 Revision Checklist
-

 I can use if, else-if, else

 I understand && vs ||

 I know when to use nested conditions

 I can write a loop that controls attempts

 I can build a multi-step login logic

 I can think in automation-style flows (pre-check → validate → retry → final decision)

Added for loops for checking specific conditions in the array like whether target is present in the array or not
using if else statements. 



