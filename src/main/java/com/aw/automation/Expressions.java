package com.aw.automation;

public class Expressions {
public static void main(String[] args) {
    int length = 5;
    int breadth = 3;
    int area = length * breadth;
    System.out.println("Area of the rectangle is: " + area);

    System.out.println("------Match Expression------");
    int marks1 = 80;
    int marks2 = 90;
    int marks3 = 70;
    int average = (marks1 + marks2 +marks3)/3;
    System.out.println("Marks1: " + marks1);
    System.out.println("Marks2: " + marks2);
    System.out.println("Marks3: " + marks3);
    System.out.println("Average: " + average);

    System.out.println("------String Expression------");
    String firstName = "Niraj";
    String lastName = "Shinde";
    String fullName = firstName + " " + lastName;

    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Full Name: " + fullName);
 
    System.out.println("------String Expression------");
     int totalMarks=500;
     int obtained=420;
     int percentage=(obtained*100)/totalMarks;

     System.out.println("Total Marks: " + totalMarks);
     System.out.println("Obtained Marks: " + obtained);
     System.out.println("Percentage: " + percentage + "%");
}
}
