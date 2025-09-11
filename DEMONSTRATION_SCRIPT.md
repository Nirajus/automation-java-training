# Java Fundamentals Demonstration Script

This script demonstrates the key Java concepts and how they apply to automation testing.

## Prerequisites
- Java 17 JDK installed
- Maven installed
- Current directory: `C:\Users\sonir\automation-java-training`

## Step 1: Check Java Installation

```bash
# Check Java version
java -version

# Check Java compiler
javac -version

# Check Maven
mvn -version
```

## Step 2: Compile and Run HelloWorld

```bash
# Compile the HelloWorld class
javac -d target/classes -cp src/main/java src/main/java/com/aw/automation/training/HelloWorld.java

# Run the HelloWorld class
java -cp target/classes com.aw.automation.training.HelloWorld
```

## Step 3: Compile and Run JavaConceptsDemo

```bash
# Compile the JavaConceptsDemo class
javac -d target/classes -cp src/main/java src/main/java/com/aw/automation/training/JavaConceptsDemo.java

# Run the JavaConceptsDemo class
java -cp target/classes com.aw.automation.training.JavaConceptsDemo
```

## Step 4: Use Maven to Compile and Run

```bash
# Clean and compile using Maven
mvn clean compile

# Run the main classes using Maven exec plugin
mvn exec:java -Dexec.mainClass="com.aw.automation.training.HelloWorld"
mvn exec:java -Dexec.mainClass="com.aw.automation.training.JavaConceptsDemo"
```

## Step 5: Demonstrate Automation Dependencies

```bash
# Download dependencies (this happens automatically with Maven)
mvn dependency:resolve

# Show dependency tree
mvn dependency:tree

# Compile test classes (includes dependencies)
mvn test-compile
```

## Step 6: Run Automation Tests

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=SeleniumTest
mvn test -Dtest=RestAssuredTest
```

## What Each Step Demonstrates

### Step 1: Java Installation
- **JDK vs JRE**: `java -version` shows JRE, `javac -version` shows JDK
- **Maven**: Build tool that manages dependencies and compilation

### Step 2: Manual Compilation
- **javac**: Java compiler that creates bytecode (.class files)
- **java**: JVM that executes bytecode
- **classpath (-cp)**: Where JVM looks for classes

### Step 3: Object-Oriented Concepts
- **Package structure**: com.aw.automation.training
- **Class compilation**: Each .java file becomes a .class file
- **Runtime execution**: JVM loads and executes classes

### Step 4: Maven Build Process
- **Maven lifecycle**: clean → compile → test → package
- **Dependency management**: Maven handles classpath automatically
- **Standard directory layout**: src/main/java, src/test/java

### Step 5: Dependency Resolution
- **External libraries**: Selenium, Rest Assured, TestNG
- **Classpath management**: Maven adds JAR files to classpath
- **Version management**: Maven resolves version conflicts

### Step 6: Test Execution
- **TestNG framework**: Runs test methods
- **Selenium WebDriver**: Browser automation
- **Rest Assured**: API testing
- **Integration**: All working together through JVM

## Key Learning Points

1. **JDK is needed for development** (compilation with javac)
2. **JRE is needed for execution** (running with java)
3. **JVM provides the runtime environment** for all Java applications
4. **Maven manages dependencies** and build process
5. **Project structure** ensures maintainable code organization
6. **Classpath** determines which classes are available at runtime
7. **Bytecode** is platform-independent intermediate code
8. **Garbage collection** automatically manages memory

## Troubleshooting

### Common Issues:
1. **ClassNotFoundException**: Check classpath and package structure
2. **Compilation errors**: Ensure all dependencies are available
3. **Version conflicts**: Use Maven to resolve dependency versions
4. **Memory issues**: JVM heap size may need adjustment for large test suites

### Useful Commands:
```bash
# Show detailed compilation info
javac -verbose -cp src/main/java src/main/java/com/aw/automation/training/HelloWorld.java

# Show classpath
java -cp target/classes -verbose com.aw.automation.training.HelloWorld

# Maven debug info
mvn -X test
```
