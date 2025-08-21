

```java

```


```

Java code:

```java

```
/01-Introduction/01-Introduction.md
# Introduction

## 1.1.1.1. Hello World!

Write a program that prints "Hello World!" to the screen.

```

```

Java code:

```java

```

## 1.1.1.2. Hello HackerRank!

Write a program that prints "Hello HackerRank!" to the screen.

```

```

Java code:

```java

```

## 1.1.1.3. Python If-Else

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird

```

Java code:

```java

```

## 1.1.1.4. Arithmetic Operators

Task
The provided code stub reads two integers from STDIN,  and , and add code to print three lines where:

The first line contains the sum of the two numbers.
The second line contains the difference of the two numbers (first - second).
The third line contains the product of the two numbers.
Example

a = 3
b = 5
Print the following:

8
-2
15
Input Format

The first line contains the first integer, .
The second line contains the second integer, .

Constraints

Output Format

Print the three lines as explained above.

Sample Input

3
2
Sample Output

5
1
6

```

Java code:

```java

```

## 1.1.1.5. Python: Division

Task
The provided code stub reads two integers,  and , from STDIN.

Add logic to print two lines. The first line should contain the result of integer division,  // . The second line should contain the result of float division,  / .

No rounding or formatting is necessary.

Example

a = 3
b = 5
The result of the integer division 3//5 = 0.
The result of the float division is 3/5 = 0.6.
Print:

0
0.6
Input Format

The first line contains the first integer, .
The second line contains the second integer, .

Output Format

Print the two lines as described above.

Sample Input 0

4
3
Sample Output 0

1
1.33333333333

```

Java code:

```java

```

## 1.1.1.6. Loops

Task
The provided code stub reads and integer, , from STDIN. For all non-negative integers , print .

Example

The list of non-negative integers that are less than  is . Print the square of each number on a separate line.

0
1
4
Input Format

The first and only line contains the integer, .

Constraints

Output Format

Print  lines, one corresponding to each .

Sample Input 0

5
Sample Output 0

0
1
4
9
16

```

Java code:

```java

```

## 1.1.1.7. Write a function

Write a function

```
is_leap(year)
```

that takes a year as input and returns True if it is a leap year, or False otherwise.

Note that you have to complete the function and remaining code is given as template.

```

```

Java code:

```java

```

## 1.1.1.8. Print Function

Read an integer .

Without using any string methods, try to print the following:

Note that "" represents the values in between.

Input Format

The first line contains an integer .

Output Format

Output the answer as explained in the task.

Sample Input 0

3
Sample Output 0

123

```

Java code:

```java

```

## 1.1.1.9. List Comprehensions

Let's learn about list comprehensions! You are given three integers  and  representing the dimensions of a cuboid along with an integer . Print a list of all possible coordinates given by  on a 3D grid where the sum of  is not equal to . Here, .

Input Format

Four integers  and  each on four separate lines, respectively.

Constraints

Print the list in lexicographic increasing order.

Sample Input 0

1
1
1
2
Sample Output 0

[[0, 0, 0], [0, 0, 1], [0, 1, 0], [1, 0, 0], [1, 1, 1]]

```

Java code:

```java

```

## 1.1.1.10. Find the Runner-Up Score!

Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given  scores. Store them in a list and find the score of the runner-up.

Input Format

The first line contains . The second line contains an array   of  integers each separated by a space.

Constraints

Output Format

Print the runner-up score.

Sample Input 0

5
2 3 6 6 5
Sample Output 0

5

```

Java code:

```java

```

## 1.1.1.11. Nested Lists

Given the names and grades for each student in a Physics class of  students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.

Input Format

The first line contains an integer, , the number of students.
The  subsequent lines describe each student over  lines; the first line contains a student's name, and the second line contains their grade.

Constraints

There will always be one or more students having the second lowest grade.
Output Format

Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.

Sample Input 0

5
Harry
37.21
Berry
37.21
Tina
37.2
Akriti
41
Harsh
39
Sample Output 0

Berry
Harry

```

Java code:

```java

```

## 1.1.1.12. Finding the percentage

You have a record of  students. Each record contains the student's name, and their percent marks in Maths, Physics and Chemistry. The marks can be floating values. The user enters some integer  followed by the names and marks for  students. You are required to save the record in a dictionary data type. The user then enters a student's name. Output the average percentage marks obtained by that student, correct to two decimal places.

Input Format

The first line contains the integer , the number of students. The next  lines contains the name and marks obtained by that student separated by a space. The final line contains the name of a particular student previously listed.

Constraints

Output Format

Print one line: The average of the marks obtained by the particular student correct to 2 decimal places.

Sample Input 0

3
Krishna 67 68 69
Arjun 70 98 63
Malika 52 56 60
Malika
Sample Output 0

56.00

```

Java code:

```java

```

## 1.1.1.13. Lists

Consider a list (list = []). You can perform the following commands:

insert i e: Insert integer  at position .
print: Print the list.
remove e: Delete the first occurrence of integer .
append e: Insert integer  at the end of the list.
sort: Sort the list.
pop: Pop the last element from the list.
reverse: Reverse the list.
Initialize your list and read in the value of  followed by  lines of commands where each command will be of the  types listed above. Iterate through each command in order and perform the corresponding operation on your list.

Input Format

The first line contains an integer, , denoting the number of commands.
Each line  of the  subsequent lines contains one of the commands described above.

Constraints

The elements added to the list must be integers.
Output Format

For each command of type print, print the list on a new line.

Sample Input 0

12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print
Sample Output 0

[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]

```

Java code:

```java

```

## 1.1.1.14. Tuples

Given an integer, , and  space-separated integers as input, create a tuple, , of those  integers. Then compute and print the result of .

Note: hash() is one of the functions in the __builtins__ module, so it need not be imported.

Input Format

The first line contains an integer, , denoting the number of elements in the tuple.
The second line contains  space-separated integers describing the elements in tuple .

Output Format

Print the result of .

Sample Input 0

2
1 2
Sample Output 0

3713081631934410656

```

Java code:

```java

```

## 1.1.1.15. sWAP cASE

You are given a string and your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.

For Example:

Www.HackerRank.com → wWW.hACKERrANK.COM
Pythonist 2 → pYTHONIST 2
Input Format

A single line containing a string .

Constraints

Output Format

Print the modified string .

Sample Input 0

HackerRank.com presents "Pythonist 2".
Sample Output 0

hACKERrANK.COM PRESENTS "pYTHONIST 2".

```

Java code:

```java

```

## 1.1.1.16. String Split and Join

In Python, a string can be split on a delimiter.

Example:

```
>>> a = "this is a string"
>>> a = a.split(" ") # a is converted to a list of strings.
>>> print a
['this', 'is', 'a', 'string']
```

Joining a string is simple:

```
>>> a = "-".join(a)
>>> print a
this-is-a-string
```

Task
You are given a string. Split the string on a " " (space) delimiter and join using a - hyphen.

Input Format

The first line contains a string consisting of space separated words.

Output Format

Print the formatted string as explained above.

Sample Input

this is a string
Sample Output

this-is-a-string

```

Java code:

```java

```

## 1.1.1.17. What's Your Name?

You are given the firstname and lastname of a person on two different lines. Your task is to read them and print the following:

Hello firstname lastname! You just delved into python.

Input Format

The first line contains the first name, and the second line contains the last name.

Constraints

The length of the first and last name ≤ .

Output Format

Print the output as mentioned above.

Sample Input 0

Ross
Taylor
Sample Output 0

Hello ! You just delved into python.

```

Java code:

```java

```

## 1.1.1.18. Mutations

Read a given string, change the character at a given index and then print the modified string.

Input Format

The first line contains a string, .
The next line contains an integer , denoting the index location and a character  separated by a space.

Output Format

Using any of the methods explained above, replace the character at index  with character .

Sample Input

abracadabra
5 k
Sample Output

abrackdabra

```

Java code:

```java

```

## 1.1.1.19. Find a string

In this challenge, the user enters a string and a substring. You have to print the number of times that the substring occurs in the given string. String traversal will take place from left to right, not from right to left.

NOTE: String letters are case-sensitive.

Input Format

The first line of input contains the original string. The next line contains the substring.

Constraints

Each character in the string is an ascii character.

Output Format

Output the integer number indicating the total number of occurrences of the substring in the original string.

Sample Input

ABCDCDC
CDC
Sample Output

2

```

Java code:

```java

```

## 1.1.1.20. String Validators

You are given a string .
Your task is to find out if the string  contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase characters.

Input Format

A single line containing a string .

Constraints

Output Format

In the first line, print True if  has any alphanumeric characters. Otherwise, print False.
In the second line, print True if  has any alphabetical characters. Otherwise, print False.
In the third line, print True if  has any digits. Otherwise, print False.
In the fourth line, print True if  has any lowercase characters. Otherwise, print False.
In the fifth line, print True if  has any uppercase characters. Otherwise, print False.

Sample Input

qA2
Sample Output

True
True
True
True
True

```

Java code:

```java

```

## 1.1.1.21. Text Alignment

You are given a partial code that is used for generating the HackerRank Logo of variable thickness.
Your task is to replace the blank (______) with rjust, ljust or center.

Input Format

A single line containing the thickness value for the logo.

Constraints

The thickness must be an odd number.

Output Format

Output the desired logo.

Sample Input

5
Sample Output

HackerRank Logo

```

Java code:

```java

```

## 1.1.1.22. Text Wrap

You are given a string  and width .
Your task is to wrap the string into a paragraph of width .

Input Format

The first line contains a string, .
The second line contains the width, .

Constraints

Output Format

Print the text wrapped paragraph.

Sample Input 0

ABCDEFGHIJKLIMNOQRSTUVWXYZ
4
Sample Output 0

ABCD
EFGH
IJKL
IMNO
QRST
UVWX
YZ

```

Java code:

```java

```

## 1.1.1.23. Designer Door Mat

Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:

Mat size must be X. ( is an odd natural number, and  is  times .)
The design should have 'WELCOME' written in the center.
The design pattern should only use |, . and - characters.
Sample Designs

    Size: 7 x 21
    ---------.|.---------
    ------.|..|..|.------
    ---.|..|..|..|..|.---
    -------WELCOME-------
    ---.|..|..|..|..
