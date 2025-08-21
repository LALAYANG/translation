

```java

```
/README.md
# Python-to-Java

This repository contains a collection of Python code snippets and their Java equivalents. The goal is to provide a resource for developers who are interested in learning Java by examining the similarities and differences between the two languages.

## Table of Contents

- [Introduction](#introduction)
- [Python Code Snippets](#python-code-snippets)
- [Java Code Snippets](#java-code-snippets)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Python is a popular programming language that is widely used for various applications, including web development, data analysis, and machine learning. Java, on the other hand, is a widely-used object-oriented programming language that is used for developing desktop applications, mobile apps, and enterprise applications.

The goal of this repository is to provide a resource for developers who are interested in learning Java by examining the similarities and differences between the two languages. By comparing and contrasting the Python code snippets with their Java equivalents, developers can gain a better understanding of the similarities and differences between the two languages.

## Python Code Snippets

The Python code snippets in this repository are designed to be simple and easy to understand. Each code snippet is accompanied by a brief explanation of its functionality and a link to a detailed explanation of the Python concepts used in the code.

## Java Code Snippets

The Java code snippets in this repository are designed to be simple and easy to understand. Each code snippet is accompanied by a brief explanation of its functionality and a link to a detailed explanation of the Java concepts used in the code.

## Contributing

Contributions to this repository are welcome! If you have any Python code snippets that you would like to add, or if you have any Java code snippets that you would like to add, please feel free to submit a pull request.

## License

This repository is licensed under the [MIT License](https://opensource.org/licenses/MIT).

## Python Code Snippets

### 1. Hello World

```python
print("Hello World!")
```

### 2. Variables

```python
x = 5
y = "John"
print(x)
print(y)
```

### 3. Data Types

```python
x = 5
y = "John"
print(type(x))
print(type(y))
```

### 4. Casting

```python
x = int(1)   # x will be 1
y = int(2.8) # y will be 2
z = int("3") # z will be 3
```

### 5. Strings

```python
a = "Hello, World!"
print(a[1])
```

### 6. Slicing

```python
b = "Hello, World!"
print(b[2:5])
```

### 7. Length

```python
a = "Hello, World!"
print(len(a))
```

### 8. Check String

```python
txt = "The best things in life are free!"
print("free" in txt)
```

### 9. Check if NOT

```python
txt = "The best things in life are free!"
print("expensive" not in txt)
```

### 10. String Concatenation

```python
a = "Hello"
b = "World"
c = a + b
print(c)
```

### 11. String Format

```python
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))
```

### 12. Escape Character

```python
txt = "We are the so-called \"Vikings\" from the north."
```

### 13. String Methods

```python
a = "Hello, World!"
print(a.upper())
```

### 14. Split String

```python
a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!']
```

### 15. Input

```python
username = input("Enter username:")
print("Username is: " + username)
```

### 16. If Statement

```python
a = 33
b = 200
if b > a:
  print("b is greater than a")
```

### 17. Elif

```python
a = 33
b = 33
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
```

### 18. Else

```python
a = 200
b = 33
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
else:
  print("a is greater than b")
```

### 19. While Loop

```python
i = 1
while i < 6:
  print(i)
  i += 1
```

### 20. Break Statement

```python
i = 1
while i < 6:
  print(i)
  if i == 3:
    break
  i += 1
```

### 21. Continue Statement

```python
i = 0
while i < 6:
  i += 1
  if i == 3:
    continue
  print(i)
```

### 22. For Loop

```python
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  print(x)
```

### 23. Range

```python
for x in range(6):
  print(x)
```

### 24. Else in For Loop

```python
for x in range(6):
  print(x)
else:
  print("Finally finished!")
```

### 25. Function

```python
def my_function():
  print("Hello from a function")
```

### 26. Parameters

```python
def my_function(fname):
  print(fname + " Refsnes")
```

### 27. Default Parameter Value

```python
def my_function(country = "Norway"):
  print("I am from " + country)
```

### 28. Passing a List as a Parameter

```python
def my_function(food):
  for x in food:
    print(x)
```

### 29. Return Values

```python
def my_function(x):
  return 5 * x
```

### 30. Lambda

```python
x = lambda a : a + 10
print(x(5))
```

### 31. Lambda with Multiple Parameters

```python
x = lambda a, b : a * b
print(x(5, 6))
```

### 32. Array

```python
cars = ["Ford", "Volvo", "BMW"]
```

### 33. Access the Elements

```python
cars = ["Ford", "Volvo", "BMW"]
x = cars[0]
```

### 34. Change the Value

```python
cars = ["Ford", "Volvo", "BMW"]
cars[0] = "Toyota"
```

### 35. Loop Through an Array

```python
cars = ["Ford", "Volvo", "BMW"]
for x in cars:
  print(x)
```

### 36. Add Elements

```python
cars = ["Ford", "Volvo", "BMW"]
cars.append("Honda")
```

### 37. Remove Element

```python
cars = ["Ford", "Volvo", "BMW"]
cars.pop(1)
```

### 38. Array Length

```python
cars = ["Ford", "Volvo", "BMW"]
x = len(cars)
```

### 39. Sort Array

```python
cars = ["Ford", "BMW", "Volvo"]
cars.sort()
```

### 40. Reverse Sort

```python
cars = ["Ford", "BMW", "Volvo"]
cars.sort(reverse=True)
```

### 41. Dictionaries

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
```

### 42. Accessing Items

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
x = thisdict["model"]
```

### 43. Change Values

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict["year"] = 2018
```

### 44. Loop Through a Dictionary

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in thisdict:
  print(x)
```

### 45. Print Values

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in thisdict:
  print(thisdict[x])
```

### 46. Print Keys

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in thisdict.keys():
  print(x)
```

### 47. Print Values

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in thisdict.values():
  print(x)
```

### 48. Print Keys and Values

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x, y in thisdict.items():
  print(x, y)
```

### 49. Check if Key Exists

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
if "model" in thisdict:
  print("Yes, 'model' is one of the keys in the thisdict dictionary")
```

### 50. Dictionary Length

```python
print(len(thisdict))
```

### 51. Adding Items

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict["color"] = "red"
```

### 52. Removing Items

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict.pop("model")
```

### 53. Clear Dictionary

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict.clear()
```

### 54. Copy Dictionary

```python
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
mydict = thisdict.copy()
```

### 55. Nested Dictionaries

```python
myfamily = {
  "child1" : {
    "name" : "Emil",
    "year" : 2004
  },
  "child2" : {
    "name" : "Tobias",
    "year" : 2007
  },
  "child3" : {
    "name" : "Linus",
    "year" : 2011
  }
}
```

### 56. Nested Lists

```python
myfamily = {
  "child1" : ["Emil", 2004],
  "child2" : ["Tobias", 2007],
  "child3" : ["Linus", 2011]
}
```

### 57. The set() Constructor

```python
thisset = {"apple", "banana", "cherry"}
```

### 58. Access Items

```python
thisset = {"apple", "banana", "cherry"}
for x in thisset:
  print(x)
```

### 59. Add Items

```python
thisset = {"apple", "banana", "cherry"}
thisset.add("orange")
```

### 60. Remove Item

```python
thisset = {"apple", "banana", "cherry"}
thisset.remove("banana")
```

### 61. Join Two Sets

```python
set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}
set3 = set1.union(set2)
```

### 62. Keep Only the Duplicates

```python
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
x.intersection_update(y)
```

### 63. Keep All, But NOT the Duplicates

```python
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}
x.symmetric_difference_update(y)
```

### 64. The set() Constructor

```python
thisset = set(("apple", "banana", "cherry")) # note the double round-brackets
```

### 65. The pass Statement

```python
a = 33
b = 200

if b > a:
  pass
```

### 66. Import Module

```python
import mymodule
```

### 67. Import From Module

```python
from mymodule import person1
```

### 68. Built-in Modules

```python
import platform
x = platform.system()
```

### 69. Using the dir() Function

```python
import platform
x = dir(platform)
```

### 70. Date

```python
import datetime
x = datetime.datetime.now()
```

### 71. String Formatting

```python
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))
```

### 72. String Format - Multiple Values

```python
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
```

### 73. String Format - Index Numbers

```python
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {0} pieces of item {1} for {2} dollars."
print(myorder.format(quantity, itemno, price))
```

### 74. String Format - Named Indexes

```python
myorder = "I have a {carname}, it is a {model}."
print(myorder.format(carname = "Ford", model = "Mustang"))
```

### 75. Escape Character

```python
txt = "We are the so-called \"Vikings\" from the north."
```

### 76. String Methods

```python
a = "Hello, World!"
print(a.upper())
```

### 77. String Methods

```python
a = "Hello, World!"
print(a.lower())
```
