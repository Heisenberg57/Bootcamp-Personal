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
-

public class Main {
    public static void main(String[] args) {
        System.out.println("Suyog is becoming an Automation Engineer!");
    }
}

2️⃣ VariablesDemo.java
-


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
-

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

📘 Day 3 – Loops, Arrays & Automation Logic 
-
🎯 Goal for Day 3
-

Master loops + arrays, which are essential for:

scanning table rows

looping through web elements

validating lists

handling multiple test data points

retry logic in automation

🧠 Key Concepts Learned
-
✅ 1. while Loop

Runs as long as a condition is true.

Automation use:

retry an action

polling for element presence

timeout loops

int count = 1;
while(count <= 5) {
    count++;
}

✅ 2. for Loop

Runs a fixed number of times (range-based).

Automation use:

scanning table rows

iterating dropdown options

looping through test data

for(int i = 1; i <= 5; i++) {
}

✅ 3. Arrays

Used to store multiple values of the same type.

Automation use:

multiple test inputs

customer IDs

list of strings

dropdown items

int[] ids = {101, 202, 303};
int size = ids.length; // 3

✅ 4. Search Pattern (Loop + Condition)

Find a target inside an array.

Automation use:

scan web table rows until match is found

search for button/link text

find user entry in paginated lists

💻 Programs You Wrote on Day 3
1️⃣ WhileDemo.java

Retry-style loop.

int count = 1;
while(count <= 5) {
    System.out.println("Retry attempt: " + count);
    count++;
}

2️⃣ ForDemo.java

Row-processing loop.

for(int i = 1; i <= 5; i++) {
    System.out.println("Processing row: " + i);
}

3️⃣ ArrayDemo.java

Basic array iteration.

int[] customerIds = {101, 102, 103, 104};

for(int i = 0; i < customerIds.length; i++) {
    System.out.println("Customer ID: " + customerIds[i]);
}

4️⃣ CustomerSearch.java

Searches for a target ID.

int target = 303;
boolean found = false;

for(int i = 0; i < customerIds.length; i++) {
    if(customerIds[i] == target) {
        System.out.println("Customer found at index: " + i);
        found = true;
        break;
    }
}

5️⃣ CustomerStatusChecker.java (Day 3 Final Deliverable)
int[] customerIds = {101, 205, 309, 412, 578};
String[] statuses = {"Active", "Inactive", "KYC Pending", "Blocked", "Premium"};

int target = 412;
boolean found = false;

for(int i = 0; i < customerIds.length; i++) {

    if(customerIds[i] == target) {
        System.out.println("Customer ID: " + customerIds[i]);
        System.out.println("Status: " + statuses[i]);
        found = true;
        break;
    }
}

if(!found) {
    System.out.println("Customer not found in the system.");
}


📘 Day 4 – Methods, Return Types & Utility Classes
---------------

🎯 Goal for Day 4
-

Learn to write reusable code, the core skill of automation engineers.

Today you mastered:

Methods

Parameters

Return types

Static methods

Enhanced for-loop

Creating utility classes

Writing reusable search logic

These skills directly map to real Selenium frameworks.

🧠 Key Concepts Learned
✅ 1. Methods (Functions)
--

Used to group reusable logic.

static void greetUser() { }


Called with:

greetUser();

✅ 2. Methods with Parameters
--

PASS data into methods:

static void greetUser(String name) { }
greetUser("Suyog");

✅ 3. Methods with Return Types
-

RETURN data out of methods:

static int add(int a, int b) {
    return a + b;
}


Example usage:

int sum = add(10, 20);

✅ 4. static Keyword
-

STATIC = no need to create an object.

Perfect for:

WaitUtils

DriverFactory

ConfigReader

ExcelUtils

APIHelpers

Automation loves static because it's clean, simple, reusable.

✅ 5. Enhanced For Loop (for-each)
-

Cleaner way to loop arrays/lists:

for(int id : ids) {
    System.out.println(id);
}


Used heavily when iterating:

WebElements list

Dropdown items

Table rows

💻 Programs You Wrote on Day 4
-
1️⃣ MethodDemo.java
-
static void greetUser() {
    System.out.println("Hello Automation Engineer!");
}

2️⃣ MethodParameters.java
-
static void greetUser(String name) {
    System.out.println("Hello " + name + ", welcome back!");
}

3️⃣ ReturnTypeDemo.java
-
static int addNumbers(int a, int b) {
    return a + b;
}

static boolean isEligible(int age) {
    return age >= 18;
}

4️⃣ ForEachDemo.java
-
int[] ids = {101, 202, 303};
for(int id : ids) {
    System.out.println(id);
}

🏆 5️⃣ CustomerUtils.java (Day 4 Final Deliverable)
-
public class CustomerUtils {

    public static boolean customerExists(int[] ids, int target) {

        for(int id : ids) {
            if(id == target) {
                return true;
            }
        }
        return false;
    }

    public static int getCustomerIndex(int[] ids, int target) {

        for(int i = 0; i < ids.length; i++) {
            if(ids[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

CustomerUtilsTest.java
-
int[] customers = {101, 205, 309, 412, 578};

boolean exists = CustomerUtils.customerExists(customers, 309);
System.out.println("Exists? " + exists);

int index = CustomerUtils.getCustomerIndex(customers, 412);
System.out.println("Found at index: " + index);


Day 5 – Classes, Objects & Constructors (README.md)
--
🎯 Goal for Day 5
-

Master OOP fundamentals used directly in Selenium frameworks:

Classes

Objects

Fields (class variables)

Methods

Constructors

this keyword

This is the foundation of Page Object Model (POM).

🧠 Key Concepts Learned
-
✅ 1. Class
-

Blueprint/template.

public class Car { }

✅ 2. Object
-

Instance of a class.

Car c1 = new Car();

✅ 3. Fields (class variables)
-
String brand;
int year;

✅ 4. Methods
-

Behavior/Actions of the object.

void start() { }

✅ 5. Constructors
-

Special method that runs automatically when object is created.

Used to initialize values.

Student(String name, int age) {
    this.name = name;
    this.age = age;
}

✅ 6. this keyword
-

Refers to current object’s variables.

this.name = name;

💻 Programs From Day 5
-
1️⃣ Car.java / CarTest.java
-

Simple object creation + behavior.

2️⃣ Student.java
-

Constructor usage.

Student(String n, int a) {
    this.name = n;
    this.age = a;
}

3️⃣ BankAccount.java
-

OOP-based account simulation.

Features:

constructor

deposit()

withdraw()

displayDetails()

4️⃣ BankAccountTest.java
-

Interact with the BankAccount object.

5️⃣ BankServices.java (Day 5 Final Deliverable)
-

OOP-based real banking simulation.



📘 Day 6 – Inheritance, Overriding & Polymorphism (README.md)
-
🎯 Goal for Day 6
-

Understand the OOP pillars that power every Selenium automation framework:

Inheritance

Method Overriding

super keyword

Polymorphism (MOST important for Selenium)

After Day 6, you understand how:

BasePage → LoginPage

BaseTest → Test classes

WebDriver → ChromeDriver

Framework utilities
all work internally.

🧠 Key Concepts Learned
✅ 1. Inheritance
=

Child class gets all variables & methods of parent class.
-

Example:
class Person {
    String name;
    int age;
}

class Employee extends Person {
    int salary;
}

Automation Relevance:

Page classes inherit BasePage

Test classes inherit BaseTest

Common methods reused without duplication

✅ 2. Method Overriding
-

Child REWRITES the parent method
(SAME name, SAME parameters)

Example:
class Account {
    void withdraw() { }
}

class SavingsAccount extends Account {
    @Override
    void withdraw() { }   // overridden
}

Automation Relevance:

Every browser driver overrides WebDriver methods:

WebDriver driver = new ChromeDriver();  // Chrome version runs
driver.get("url");

✅ 3. super keyword
-
super()

Calls parent constructor.

super.method()

Calls parent method.

Example:
class Parent {
    Parent() { System.out.println("Parent"); }
}

class Child extends Parent {
    Child() {
        super();  // parent constructor
        System.out.println("Child");
    }
}

✅ 4. Polymorphism (MOST IMPORTANT)
-
Definition:

Parent reference can hold child objects.

Example:
Account acc = new SavingsAccount();
acc.withdraw(); // SavingsAccount version runs

Selenium Example:
WebDriver driver = new ChromeDriver();
driver = new FirefoxDriver();
driver = new EdgeDriver();


driver.get() → behaves differently depending on which object it holds.

This is the core magic of Selenium.

💻 Programs You Built on Day 6
1️⃣ Person → Employee (Inheritance Basics)
-
class Person {
    String name;
    int age;

    void showDetails() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Employee extends Person {
    int salary;
}

2️⃣ Account → SavingsAccount (Overriding)
-
class Account {
    void withdraw(double amount) {
        System.out.println("Generic withdraw");
    }
}

class SavingsAccount extends Account {
    @Override
    void withdraw(double amount) {
        System.out.println("Savings withdraw");
    }
}

3️⃣ super() Example
-
class User {
    User() { System.out.println("User constructor"); }
}

class Admin extends User {
    Admin() {
        super();
        System.out.println("Admin constructor");
    }
}

4️⃣ Banking System Polymorphism (Final Deliverable)
-
Account acc;

acc = new SavingsAccount("Suyog", 101, 8000);
acc.withdraw(3000);   // runs SavingsAccount version

acc = new CurrentAccount("Valentina", 202, 5000);
acc.withdraw(9000);   // runs CurrentAccount version


Interface in java:

public interface Browser {

    void launch();
    void close();
}










