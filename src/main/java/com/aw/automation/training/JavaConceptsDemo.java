package com.aw.automation.training;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaConceptsDemo - Demonstrates how Java fundamentals apply to automation testing
 * 
 * This class shows:
 * - Object-oriented programming concepts
 * - How dependencies work in automation
 * - Memory management concepts
 * - Exception handling
 */
public class JavaConceptsDemo {
    
    // Class-level variables (instance variables)
    private String browserName;
    private List<String> testResults;
    
    /**
     * Constructor - demonstrates object creation
     */
    public JavaConceptsDemo(String browserName) {
        this.browserName = browserName;
        this.testResults = new ArrayList<>();
        System.out.println("JavaConceptsDemo object created for browser: " + browserName);
    }
    
    /**
     * Demonstrates how automation tools work with Java concepts
     */
    public void demonstrateAutomationConcepts() {
        System.out.println("\n=== Java Concepts in Automation ===");
        
        // 1. Object Creation (like WebDriver driver = new ChromeDriver())
        System.out.println("1. Object Creation:");
        System.out.println("   - WebDriver driver = new ChromeDriver();");
        System.out.println("   - This creates an object in JVM memory");
        
        // 2. Method Calls (like driver.get(), driver.findElement())
        System.out.println("\n2. Method Calls:");
        System.out.println("   - driver.get(\"https://example.com\");");
        System.out.println("   - Methods are called on objects");
        
        // 3. Exception Handling (crucial for automation)
        System.out.println("\n3. Exception Handling:");
        try {
            // Simulate a potential failure
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("   - Caught exception: " + e.getMessage());
            System.out.println("   - In automation: handle NoSuchElementException, TimeoutException, etc.");
        }
        
        // 4. Collections (useful for storing test data)
        System.out.println("\n4. Collections:");
        testResults.add("Test 1: PASSED");
        testResults.add("Test 2: FAILED");
        testResults.add("Test 3: PASSED");
        
        System.out.println("   - Storing test results in List<String>");
        for (String result : testResults) {
            System.out.println("     " + result);
        }
        
        // 5. Memory Management
        System.out.println("\n5. Memory Management:");
        System.out.println("   - JVM automatically manages memory");
        System.out.println("   - Garbage collection cleans up unused objects");
        System.out.println("   - Important for browser instances and WebDriver objects");
    }
    
    /**
     * Demonstrates dependency management concepts
     */
    public void demonstrateDependencyConcepts() {
        System.out.println("\n=== Dependency Management ===");
        
        System.out.println("1. Maven Dependencies:");
        System.out.println("   - Selenium WebDriver: org.seleniumhq.selenium:selenium-java");
        System.out.println("   - Rest Assured: io.rest-assured:rest-assured");
        System.out.println("   - TestNG: org.testng:testng");
        
        System.out.println("\n2. How Dependencies Work:");
        System.out.println("   - Maven downloads JAR files to local repository");
        System.out.println("   - JVM loads these JARs into classpath");
        System.out.println("   - Your code can import and use classes from these JARs");
        
        System.out.println("\n3. Classpath Concept:");
        System.out.println("   - JVM looks for classes in classpath");
        System.out.println("   - Includes: your compiled classes + dependency JARs");
        System.out.println("   - Maven manages classpath automatically");
    }
    
    /**
     * Demonstrates project structure benefits
     */
    public void demonstrateProjectStructure() {
        System.out.println("\n=== Project Structure Benefits ===");
        
        System.out.println("1. Source Organization:");
        System.out.println("   - src/main/java: Application code");
        System.out.println("   - src/test/java: Test code");
        System.out.println("   - Clear separation of concerns");
        
        System.out.println("\n2. Build Process:");
        System.out.println("   - Maven compiles src/main/java to target/classes");
        System.out.println("   - Maven compiles src/test/java to target/test-classes");
        System.out.println("   - TestNG runs tests from target/test-classes");
        
        System.out.println("\n3. IDE Integration:");
        System.out.println("   - IDEs understand Maven structure");
        System.out.println("   - Automatic classpath management");
        System.out.println("   - Code completion for dependencies");
    }
    
    /**
     * Main method to run the demonstration
     */
    public static void main(String[] args) {
        System.out.println("=== Java Fundamentals for Automation Testing ===");
        
        // Create an instance of the demo class
        JavaConceptsDemo demo = new JavaConceptsDemo("Chrome");
        
        // Run all demonstrations
        demo.demonstrateAutomationConcepts();
        demo.demonstrateDependencyConcepts();
        demo.demonstrateProjectStructure();
        
        System.out.println("\n=== Summary ===");
        System.out.println("Java fundamentals are essential for automation testing:");
        System.out.println("- JDK: Compile your test code");
        System.out.println("- JRE: Run your compiled tests");
        System.out.println("- JVM: Execute tests with memory management");
        System.out.println("- Project Structure: Organize and maintain test code");
        System.out.println("- Dependencies: Use Selenium, Rest Assured, TestNG");
    }
}
