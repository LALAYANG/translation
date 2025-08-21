

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        int four = 0;
        int seven = 0;
        int number = 0;
        int target_number = 0;
        int ans = 0;
        int outer_loop_limit = 690;
        int inner_loop_limit = 689;
        int LoopIndexOut = 0;
        int stop = outer_loop_limit / inner_loop_limit;
        int step = 1;
        Scanner scanner = new Scanner(System.in);
        target_number = scanner.nextInt();
        scanner.close();
        while (number <= limit) {
            if (number > 0 && four == seven) {
                l.add(number);
            }
            generate_number_sequence(number * 10 + 4, four + 1, seven);
            generate_number_sequence(number * 10 + 7, four, seven + 1);
        }
        Collections.sort(l);
        for (int val : l) {
            if (val >= target_number) {
                ans = val;
                break;
            }
        }
        while (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            for (int val : l) {
                if (val >= target_number) {
                    ans = val;
                    break;
                }
            }
            LoopIndexOut += step;
        }
        System.out.println(ans);
    }

    public static void generate_number_sequence(int number, int four, int seven) {
        // TODO
    }
}
```
/docs/python/python-basics/python-basics-1.md
# Python Basics 1

## 1. What is Python?

Python is a high-level, interpreted, interactive and object-oriented scripting language. Python is designed to be highly readable. It uses English keywords frequently where as other languages use punctuation, and it has fewer syntactical constructions than other languages.

Python is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Web Development Domain. I will list down some of the key advantages of learning Python:

* Python is Interpreted − Python is processed at runtime by the interpreter. You do not need to compile your program before executing it. This is similar to PERL and PHP.

* Python is Interactive − You can actually sit at a Python prompt and interact with the interpreter directly to write your programs.

* Python is Object-Oriented − Python supports Object-Oriented style or technique of programming that encapsulates code within objects.

* Python is a Beginner's Language − Python is a great language for the beginner-level programmers and supports the development of a wide range of applications from simple text processing to WWW browsers to games.

## 2. History of Python

Python was developed by  in the late eighties and early nineties at the National Research Institute for Mathematics and Computer Science in the Netherlands.

## 3. Features of Python

* Easy-to-learn − Python has few keywords, simple structure, and a clearly defined syntax. This allows the student to pick up the language quickly.

* Easy-to-read − Python code is more clearly defined and visible to the eyes.

* Easy-to-maintain − Python's source code is fairly easy-to-maintain.

* A broad standard library − Python's bulk of the library is very portable and cross-platform compatible on UNIX, Windows, and Macintosh.

* Interactive Mode − Python has support for an interactive mode which allows interactive testing and debugging of snippets of code.

* Portable − Python can run on a wide variety of hardware platforms and has the same interface on all platforms.

* Extendable − You can add low-level modules to the Python interpreter. These modules enable programmers to add to or customize their tools to be more efficient.

* Databases − Python provides interfaces to all major commercial databases.

* GUI Programming − Python supports GUI applications that can be created and ported to many system calls, libraries and windows systems, such as Windows MFC, Macintosh, and the X Window system of Unix.

* Scalable − Python provides a better structure and support for large programs than shell scripting.

## 4. Applications of Python

* Web and Internet Development
* GUI Development
* Scientific and Numeric
* Education
* Desktop GUIs
* Software Development
* Business Applications

## 5. Python IDEs

* IDLE
* PyCharm
* Spyder
* Visual Studio Code
* Sublime Text
* Eclipse
* NetBeans
* Komodo
* Vim
* Emacs

## 6. Python Syntax

Python was designed for readability, and has some similarities to the English language with influence from mathematics.

* Python uses new lines to complete a command, as opposed to other programming languages which often use semicolons or parentheses.

* Python relies on indentation, using whitespace, to define scope; such as the scope of loops, functions and classes. Other programming languages often use curly-brackets for this purpose.

## 7. Python Indentation

Most of the programming languages like C, C++, Java use braces { } to define a block of code. Python uses indentation.

A code block (body of a function, loop etc.) starts with indentation and ends with the first unindented line. The amount of indentation is up to you, but it must be consistent throughout that block.

Generally four whitespaces are used for indentation and is preferred over tabs. Here is an example.

```python
for i in range(1,11):
    print(i)
    if i == 5:
        break
```

## 8. Python Comments

A hash sign (#) that is not inside a string literal begins a comment. All characters after the # and up to the end of the physical line are part of the comment and the Python interpreter ignores them.

```python
# First comment
print("Hello, Python!") # second comment
```

## 9. Python Variables

A variable is a location in memory used to store some data (value).

They are given unique names to differentiate between different memory locations. The rules for writing a variable name is same as the rules for writing identifiers in Python.

We don't need to declare a variable before using it. In Python, we simply assign a value to a variable and it will exist. We don't even have to declare the type of the variable. This is handled internally according to the type of value we assign to the variable.

```python
# Variable Assignment

a = 10
b = 5.5
c = "ML"
```

## 10. Multiple Assignments

Python allows you to assign a single value to several variables simultaneously.

```python
a = b = c = 1
```

Here, an integer object is created with the value 1, and all the three variables are assigned to the same memory location. You can also assign multiple objects to multiple variables. For example −

```python
a, b, c = 1, 3.2, "John"
```

Here, two integer objects with values 1 and 3.2 are assigned to the variables a and b respectively, and one string object with the value "John" is assigned to the variable c.

## 11. Storage Locations

```python
x = 3
print(id(x)) #print address of variable x
y = 3
print(id(y)) #print address of variable y
```

## 12. Data Types

Every value in Python has a datatype. Since everything is an object in Python programming, data types are actually classes and variables are instance (object) of these classes.

## 13. Numbers

Integers, floating point numbers and complex numbers falls under Python numbers category. They are defined as int, float and complex class in Python.

We can use the type() function to know which class a variable or a value belongs to and the isinstance() function to check if an object belongs to a particular class.

```python
a = 5
print(a, "is of type", type(a))

a = 2.0
print(a, "is of type", type(a))

a = 1+2j
print(a, "is complex number?", isinstance(1+2j,complex))
```

## 14. Boolean

In Python the Boolean data type is used to represent truth values (other values can also be considered false or true).

The two built-in Boolean literals are True and False. Case is important as true and false are not Boolean literals (remember Python is case sensitive).

```python
a = True
print(type(a))
```

## 15. Python Strings

Strings in Python are identified as a contiguous set of characters represented in the quotation marks. Python allows for either pairs of single or double quotes. Subsets of strings can be taken using the slice operator ([ ] and [:] ) with indexes starting at 0 in the beginning of the string and working their way from -1 at the end.

The plus (+) sign is the string concatenation operator and the asterisk (*) is the repetition operator. For example −

```python
str = 'Hello World!'

print(str)          # Prints complete string
print(str[0])       # Prints first character of the string
print(str[2:5])     # Prints characters starting from 3rd to 5th
print(str[2:])      # Prints string starting from 3rd character
print(str * 2)      # Prints string two times
print(str + "TEST") # Prints concatenated string
```

## 16. Python Lists

Lists are the most versatile of Python's compound data types. A list contains items separated by commas and enclosed within square brackets ([]). To some extent, lists are similar to arrays in C. One difference between them is that all the items belonging to a list can be of different data type.

The values stored in a list can be accessed using the slice operator ([ ] and [:]) with indexes starting at 0 in the beginning of the list and working their way to end -1. The plus (+) sign is the list concatenation operator, and the asterisk (*) is the repetition operator. For example −

```python
list = [ 'abcd', 786 , 2.23, 'john', 70.2 ]
tinylist = [123, 'john']

print(list)          # Prints complete list
print(list[0])       # Prints first element of the list
print(list[1:3])     # Prints elements starting from 2nd till 3rd
print(list[2:])      # Prints elements starting from 3rd element
print(tinylist * 2)  # Prints list two times
print(list + tinylist) # Prints concatenated lists
```

## 17. Python Tuples

A tuple is another sequence data type that is similar to the list. A tuple consists of a number of values separated by commas. Unlike lists, however, tuples are enclosed within parentheses.

The main differences between lists and tuples are: Lists are enclosed in brackets ( [ ] ) and their elements and size can be changed, while tuples are enclosed in parentheses ( ( ) ) and cannot be updated. Tuples can be thought of as read-only lists. For example −

```python
tuple = ( 'abcd', 786 , 2.23, 'john', 70.2  )
tinytuple = (123, 'john')

print(tuple)           # Prints complete list
print(tuple[0])        # Prints first element of the list
print(tuple[1:3])      # Prints elements starting from 2nd till 3rd
print(tuple[2:])       # Prints elements starting from 3rd element
print(tinytuple * 2)   # Prints list two times
print(tuple + tinytuple) # Prints concatenated lists
```

## 18. Python Dictionary

Python's dictionaries are kind of hash table type. They work like associative arrays or hashes found in Perl and consist of key-value pairs. A dictionary key can be almost any Python type, but are usually numbers or strings. Values, on the other hand, can be any arbitrary Python object.

Dictionaries are enclosed by curly braces ({ }) and values can be assigned and accessed using square braces ([]). For example −

```python
dict = {}
dict['one'] = "This is one"
dict[2]     = "This is two"

tinydict = {'name': 'john','code':6734, 'dept': 'sales'}

print(dict['one'])       # Prints value for 'one' key
print(dict[2])           # Prints value for 2 key
print(tinydict)          # Prints complete dictionary
print(tinydict.keys())   # Prints all the keys
print(tinydict.values()) # Prints all the values
```

## 19. Python Date & Time

Python has a module named time and datetime to handle date and time. Time module provides functions for working with times, and datetime module supplies classes for manipulating dates and times.

```python
import time;  # This is required to include time module.

ticks = time.time()
print("Number of ticks since 12:00am, January 1, 1970:", ticks)
```

```python
import datetime

datetime.datetime.now()
```

## 20. Python Functions

Functions are a convenient way to divide your code into useful blocks, allowing us to order our code, make it more readable, reuse it and save some time. Also functions are a key way to define interfaces so programmers can share their code.

```python
def printme( str ):
   "This prints a passed string into this function"
   print(str)
   return

# Now you can call printme function
printme("I'm first call to user defined function!")
printme("Again second call to the same function")
```

## 21. Python Modules

Consider a module to be the same as a code library.

A file containing a set of functions you want to include in your application.

```python
import module_name
```

## 22. Python Packages

Packages are namespaces which contain multiple packages and modules themselves. They are simply directories, but with a twist.

Each package in Python is a directory which MUST contain a special file called **init**.py. This file can be empty, and it indicates that the directory it contains is a Python package, so it can be imported the same way a module can be imported.

If we create a directory called foo, which marks the package name, we can then create a module inside that package called bar. We also must not forget to add the **init**.py file inside the foo directory.

To use the module bar, we can import it in two ways:

```python
import foo.bar
```

or

```python
from foo import bar
```

## 23. Python Input and Output

There are various ways to take the input from the user.

Python provides two built-in functions to read a line of text from standard input, which by default comes from the keyboard. These functions are

* raw_input
* input

The **raw_input([prompt])** function reads one line from standard input and returns it as a string (removing the trailing newline).

```python
str = raw_input("Enter your input: ");
print("Received input is : ", str)
```

The **input([prompt])** function is equivalent to raw_input, except that
