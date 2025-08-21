

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] presetValues = {"10", "100", "1000", "10000", "100000"};
        int sum = 0;
        for (char c : userInput.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        if (userInput.equals("319") && userInput.equals("353")) {
            if (userInput.equals("400") && userInput.equals("725")) {
                if (userInput.equals("204") && userInput.equals("645")) {
                    if (userInput.equals(presetValues)) {
                        System.out.println(10);
                    } else {
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
```

## Question 2

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## Question 3

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    return max(numbers)
```

## Question 4

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    return min(numbers)
```

## Question 5

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(numbers):
    return numbers[::-1]
```

## Question 6

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order.

```
def sort_list(numbers):
    return sorted(numbers)
```

## Question 7

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(numbers):
    return sorted(set(numbers))
```

## Question 8

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(numbers):
    return sorted(set(numbers))
```

## Question 9

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(numbers):
    return sorted(set(numbers))
```

## Question 10

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(numbers):
    return sorted(set(numbers))
```
/README.md
# Python-to-Java

This repository contains a collection of Python code snippets and their equivalent Java code. The goal is to provide a reference for developers who are familiar with Python and want to learn Java.

## Table of Contents

- [Introduction](#introduction)
- [Code Snippets](#code-snippets)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Python is a popular programming language that is widely used for various applications, including web development, data analysis, and machine learning. Java, on the other hand, is a general-purpose programming language that is widely used for developing desktop applications, mobile apps, and enterprise software.

While Python and Java have some similarities, they are also different in many ways. For example, Python is dynamically typed, while Java is statically typed. Python uses indentation for code blocks, while Java uses curly braces. Python has a rich standard library, while Java has a smaller standard library.

The goal of this repository is to provide a reference for developers who are familiar with Python and want to learn Java. The code snippets in this repository are organized by topic, and each snippet includes both Python and Java code.

## Code Snippets

The code snippets in this repository are organized by topic, and each snippet includes both Python and Java code. Here are some examples:

### Printing to the Console

Python:

```python
print("Hello, World!")
```

Java:

```java
System.out.println("Hello, World!");
```

### Reading User Input

Python:

```python
user_input = input("Enter your name: ")
print("Hello,", user_input)
```

Java:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String userInput = scanner.nextLine();
System.out.println("Hello, " + userInput);
```

### String Concatenation

Python:

```python
first_name = "John"
last_name = "Doe"
full_name = first_name + " " + last_name
print(full_name)
```

Java:

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
System.out.println(fullName);
```

### String Formatting

Python:

```python
name = "John"
age = 30
print(f"Hello, my name is {name} and I am {age} years old.")
```

Java:

```java
String name = "John";
int age = 30;
System.out.printf("Hello, my name is %s and I am %d years old.\n", name, age);
```

### Lists

Python:

```python
numbers = [1, 2, 3, 4, 5]
print(numbers)
```

Java:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(numbers));
```

### List Comprehensions

Python:

```python
numbers = [1, 2, 3, 4, 5]
squares = [x**2 for x in numbers]
print(squares)
```

Java:

```java
int[] numbers = {1, 2, 3, 4, 5};
int[] squares = new int[numbers.length];
for (int i = 0; i < numbers.length; i++) {
    squares[i] = numbers[i] * numbers[i];
}
System.out.println(Arrays.toString(squares));
```

### Dictionaries

Python:

```python
person = {
    "name": "John",
    "age": 30,
    "city": "New York"
}
print(person)
```

Java:

```java
Map<String, Object> person = new HashMap<>();
person.put("name", "John");
person.put("age", 30);
person.put("city", "New York");
System.out.println(person);
```

### Dictionary Comprehensions

Python:

```python
numbers = [1, 2, 3, 4, 5]
squares = {x: x**2 for x in numbers}
print(squares)
```

Java:

```java
int[] numbers = {1, 2, 3, 4, 5};
Map<Integer, Integer> squares = new HashMap<>();
for (int number : numbers) {
    squares.put(number, number * number);
}
System.out.println(squares);
```

### Functions

Python:

```python
def greet(name):
    print(f"Hello, {name}!")

greet("John")
```

Java:

```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

public static void main(String[] args) {
    greet("John");
}
```

### Classes

Python:

```python
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        print(f"Hello, my name is {self.name} and I am {self.age} years old.")

person = Person("John", 30)
person.greet()
```

Java:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.printf("Hello, my name is %s and I am %d years old.\n", name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.greet();
    }
}
```

### File I/O

Python:

```python
with open("file.txt", "r") as file:
    content = file.read()
    print(content)
```

Java:

```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### Exception Handling

Python:

```python
try:
    x = 1 / 0
except ZeroDivisionError:
    print("Division by zero error")
```

Java:

```java
try {
    int x = 1 / 0;
} catch (ArithmeticException e) {
    System.out.println("Division by zero error");
}
```

## Contributing

Contributions to this repository are welcome! If you find any errors or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This repository is licensed under the [MIT License](LICENSE).

