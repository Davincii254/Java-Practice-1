# Java Fundamentals Practice: The Kenyan Edition

Welcome, developer! This document outlines two fun, locally-themed programming challenges designed to help you practice the fundamentals of Java, including Objects, Arrays, Methods, and user input.

The goal is not just to write code, but to think like a programmer by breaking down problems into smaller, manageable parts.

---

## Challenge 1: The Boda Boda Fare Calculator

### Project Goal
Create a command-line application that calculates the fare for a Boda Boda trip based on distance and other conditions, and can keep a history of all trips made.

### Core Concepts to Practice
* **Objects and Classes:** Creating a `Trip` class to act as a blueprint.
* **Methods:** Defining behaviors for your `Trip` object.
* **Arrays/ArrayList:** Storing a list of `Trip` objects.
* **User Input:** Using the `Scanner` class.
* **Control Flow:** Using `while` loops and `switch` statements.

### Project Setup
You will create **two** files in the same directory:
1.  `Trip.java`: This will be your object blueprint.
2.  `BodaBodaApp.java`: This will be your main application file with the `main` method.

---

### 👉 **Instructions for `Trip.java` (The Object Blueprint)**

This class will define all the properties and actions related to a single Boda Boda trip.

#### **1. Fields (Properties)**
Your `Trip` class must have the following fields (instance variables):
* `String passengerName;`
* `String destination;`
* `double distanceInKm;`
* `boolean isRushHour;` // To check if the trip is during peak hours
* `double fare;` // The final calculated fare

#### **2. Constructor**
Create a constructor that initializes a new `Trip` object. It should accept the passenger's name, destination, distance, and rush hour status as arguments. The `fare` should be initialized to `0.0` as it will be calculated by a method.
* `public Trip(String passengerName, String destination, double distanceInKm, boolean isRushHour)`

#### **3. Methods (Behaviors)**
Your `Trip` class must have the following methods:

* **`public void calculateFare()`**
    This is the core logic. When this method is called, it should calculate the `fare` based on these rules:
    * A **base fare** of **Ksh 50**.
    * A **rate** of **Ksh 25 per kilometer**.
    * If `isRushHour` is `true`, apply a **50% surcharge** to the total fare (i.e., multiply the calculated fare by 1.5).
    * If the `distanceInKm` is greater than 10, add a "long-distance fee" of **Ksh 100**.
    * The final result of this calculation should be stored in the `fare` field.

* **`public String getTripSummary()`**
    This method should return a nicely formatted `String` that looks like a receipt for the trip. It should include all the trip details and the final fare.

---

### 👉 **Instructions for `BodaBodaApp.java` (The Main Program)**

This class will run the application, interact with the user, and use the `Trip` object.

#### **1. Fields**
* `private static ArrayList<Trip> tripHistory = new ArrayList<>();` (To practice storing a list of objects).
* `private static Scanner scanner = new Scanner(System.in);`

#### **2. Methods (Functions)**
Your `BodaBodaApp` class should be structured with these `static` methods:

* **`public static void main(String[] args)`**
    This is the entry point. It should contain a `while` loop that keeps the application running. Inside the loop, it should call `printMenu()` and use a `switch` statement to handle the user's choice.

* **`public static void printMenu()`**
    A simple method that prints the main menu options to the console.

* **`public static void calculateNewTrip()`**
    This method will:
    1.  Ask the user for the passenger's name, destination, and distance.
    2.  Ask the user if it's rush hour (they can enter 'yes' or 'no').
    3.  Create a new `Trip` object using the user's input.
    4.  Call the `calculateFare()` method on the new `Trip` object.
    5.  Print the trip summary by calling the `getTripSummary()` method.
    6.  Add the new `Trip` object to the `tripHistory` ArrayList.

* **`public static void viewTripHistory()`**
    This method will:
    1.  Check if `tripHistory` is empty. If so, print a message like "No trips recorded yet."
    2.  If it's not empty, loop through the `tripHistory` ArrayList and print the summary for each `Trip` object stored.

### User Interaction Expectation (Boda Boda App)

Your console should behave like this:


==== Karibu! Welcome to the Boda Boda Fare Calculator! ====

What would you like to do?

Calculate New Trip

View Trip History

Exit
Enter your choice: 1

Enter passenger name: John Doe
Enter destination: CBD
Enter distance in km: 7.5
Is it rush hour? (yes/no): yes

...Calculating... ...Applying rush hour surcharge...
BODA BODA TRIP RECEIPT
Passenger: John Doe Destination: CBD Distance: 7.5 km Rush Hour: Yes
TOTAL FARE: KSH 356.25
What would you like to do?
...


---
---

## Challenge 2: The Chai Mixer

### Project Goal
Create a simple command-line program that takes a number of chai cups as input and calculates the required ingredients based on a predefined recipe.

### Core Concepts to Practice
* **Methods/Functions:** Breaking down the problem into small, reusable functions.
* **Calculations:** Performing basic arithmetic.
* **User Input:** Getting a number from the user.
* **Formatted Output:** Printing a clean, readable list.

### Project Setup
You will create only **one** file for this challenge:
1.  `ChaiMixer.java`

---

### 👉 **Instructions for `ChaiMixer.java`**

This single class will contain all the logic.

#### **The Recipe (per 1 cup of chai)**
* Water: **150 ml**
* Milk: **100 ml**
* Tea Leaves (Majani): **1 teaspoon**
* Sugar (Sukari): **2 teaspoons**

#### **1. Methods (Functions)**
Structure your program with the following `static` methods:

* **`public static void main(String[] args)`**
    1.  Call a `printWelcomeMessage()` method.
    2.  Prompt the user to enter the number of cups of chai they want to make.
    3.  Read the integer from the user.
    4.  Call the `calculateIngredients()` method, passing the number of cups as an argument.

* **`public static void printWelcomeMessage()`**
    A simple method that prints a friendly welcome message, like "Welcome to the Jikoni Chai Mixer!"

* **`public static void calculateIngredients(int cups)`**
    1.  This method receives the number of cups.
    2.  It calculates the total amount for each ingredient by multiplying the per-cup amount by the number of cups.
    3.  It then prints out the ingredient list in a clear, formatted way.

### User Interaction Expectation (Chai Mixer)

Your console should behave like this:


Welcome to the Jikoni Chai Mixer!
Uta pika vikombe ngapi vya chai? (How many cups of chai will you make?)
Enter number of cups: 4

Perfect! For 4 cups of chai, you will need:
Water: 600 ml

Milk: 400 ml

Tea Leaves (Majani): 4 teaspoons

Sugar (Sukari): 8 teaspoons

Enjoy your chai!


Good luck, and have fun building!
