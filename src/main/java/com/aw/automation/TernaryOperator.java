package com.aw.automation;

public class TernaryOperator {

    public static void main(String[] args) {
        // int age=18;
        // String result = (age >= 18) ? "Adult" : "Minor";
        // System.out.println(result);

  System.out.println("------Mini Challenge------");
  int maths = 75;
  int science = 60;
  int english = 80;
  int totalMarks = maths + science + english;
  int maxMarks = 300;
  double percentage = (totalMarks * 100.0) / maxMarks;
  String result = (percentage >= 40) ? "Pass" : "Fail";

  System.out.println("Maths: " + maths);
  System.out.println("Science: " + science);
  System.out.println("English: " + english);
  System.out.println("Total Marks: " + totalMarks);
  System.out.println("Percentage: " + percentage + "%");
  System.out.println("Result: " + result);
    }
}
