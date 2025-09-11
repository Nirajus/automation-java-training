package com.aw.automation.training;

/**
 * HelloWorld2 - A copy of HelloWorld to demonstrate duplication
 * 
 * This class demonstrates:
 * - Basic Java syntax
 * - Package declaration
 * - Main method entry point
 * - System output
 */
public class HelloWorld2 {
    
    /**
     * Main method - the entry point of any Java application
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Print a simple message to the console
        System.out.println("Hello, World 2!");
        System.out.println("Welcome to Java Automation Training (copy)!");
        
        // Demonstrate some basic Java features
        String message = "Java is running on: " + System.getProperty("java.version");
        System.out.println(message);
        
        // Show current working directory
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current directory: " + currentDir);
    }
}
