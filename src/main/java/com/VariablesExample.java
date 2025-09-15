package com;

public class VariablesExample {
    public static void main(String[] args){
// Part 1: Declare variables and print them
    String name = "Niraj";
    int age = 28;
    double marks = 80.5;
    boolean isPassed = true;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Marks: " + marks);
    System.out.println("Is Passed: " + isPassed);

// Create a variable inside main method and print it (local scope)
    String localMessage = "Hello from main";
    System.out.println(localMessage);
 // Part 2: Change value of variables
    int counter = 1;
    System.out.println("Counter value: " + counter);

    counter = counter + 1; // increment counter by 1
    System.out.println("Counter value after increment: " + counter);

     // Part 4: Constants
     final double PI = 3.14; // declaring a constant
     System.out.println("Value of PI: " + PI);

    }

}
