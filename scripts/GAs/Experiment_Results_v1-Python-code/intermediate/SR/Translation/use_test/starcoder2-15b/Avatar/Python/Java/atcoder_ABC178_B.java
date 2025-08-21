

```java
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c)));
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(l):
    return max(l)
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_num_in_list(l):
    return min(l)
```

## 4.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(l):
    return [x / 2 for x in l]
```

## 5.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(l):
    return [len(x) for x in l]
```

## 6.

Write a function (using iteration) that sums all the numbers in a list.

```
def sum_list(l):
    return sum(l)
```

## 7.

Write a function that takes a list of numbers and returns a new list with only the even numbers in that list in them.

```
def even_numbers(l):
    return [x for x in l if x % 2 == 0]
```

## 8.

Write a function that reverses a list.

```
def reverse(l):
    return l[::-1]
```

## 9.

Write a function that takes a string of words and a number and returns a string of words with each word followed by the number of times that word appears in the string.

```
def word_count(s, n):
    return ' '.join([x + ' ' + str(n) for x in s.split()])
```

## 10.

Write a function that takes a list of numbers and returns the average (without using the avg function)

```
def average(l):
    return sum(l) / len(l)
```

## 11.

Write a function that takes two lists and combines them into a list by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

```
def merge_lists(l1, l2):
    return [x for x in itertools.chain.from_iterable(zip(l1, l2))]
```

## 12.

Write a function that concatenates two lists. [a,b,c], [1,2,3] → [a,b,c,1,2,3]

```
def concat_lists(l1, l2):
    return l1 + l2
```

## 13.

Write a function that combines two lists by repeating the elements in a cycle, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

```
def cycle_lists(l1, l2):
    return [x for x in itertools.chain.from_iterable(zip(l1, l2))]
```

## 14.

Write a function that takes a number and returns a list of its digits.

```
def number2digits(n):
    return [int(x) for x in str(n)]
```

## 15.

Write functions that add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you’re ambitious you can implement the division by hand too (although in Python you can divide one number by another using float(n)/d).

```
def add_digits(l1, l2):
    return [x + y for x, y in zip(l1, l2)]

def subtract_digits(l1, l2):
    return [x - y for x, y in zip(l1, l2)]

def multiply_digits(l1, l2):
    return [x * y for x, y in zip(l1, l2)]
```

## 16.

If you solved the previous problem, you might notice that the digit-list representation is the same as the representation that your computer uses for integers (except that it’s in reverse order). Implement integer addition, subtraction, and multiplication using only your digit-list functions.

```
def add_ints(n1, n2):
    return sum(add_digits(number2digits(n1), number2digits(n2)))

def subtract_ints(n1, n2):
    return sum(subtract_digits(number2digits(n1), number2digits(n2)))

def multiply_ints(n1, n2):
    return sum(multiply_digits(number2digits(n1), number2digits(n2)))
```

## 17.

Write a function that takes a list of integers and returns the sum of the squares of all the numbers.

```
def sum_squares(l):
    return sum([x ** 2 for x in l])
```

## 18.

Write a function that takes a list of integers and returns the sum of the squares of all the numbers, without using any loops.

```
def sum_squares_no_loops(l):
    return sum(map(lambda x: x ** 2, l))
```

## 19.

Write a function that takes a list of integers and returns the count of the number of items in the list.

```
def count(l):
    return len(l)
```

## 20.

Write a function that takes a list of integers and returns the count of how many zeros are in the list.

```
def count_zeros(l):
    return len([x for x in l if x == 0])
```

## 21.

Write a function that takes two lists of integers and returns a list of their intersection (without using the set() function).

```
def intersection(l1, l2):
    return [x for x in l1 if x in l2]
```

## 22.

Write a function that takes two lists and returns True if they have at least one common member.

```
def common_elements(l1, l2):
    return any([x in l2 for x in l1])
```

## 23.

Write a function that takes a list of numbers and returns the average value.

```
def average(l):
    return sum(l) / len(l)
```

## 24.

Write a function that takes two sequences seq_a and seq_b and returns True if the two sequences are the same up to an ordering of the elements.

```
def same_up_to_ordering(seq_a, seq_b):
    return sorted(seq_a) == sorted(seq_b)
```

## 25.

Write a function that takes a list of numbers and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list.

```
def cumulative_sum(l):
    return list(itertools.accumulate(l))
```

## 26.

Write a function that takes a number and returns a list of its digits.

```
def number2digits(n):
    return [int(x) for x in str(n)]
```

## 27.

Write functions that add, subtract, and multiply integers in their digit-list representation (and return a new digit list). If you’re ambitious you can implement the division by hand too (although in Python you can divide one number by another using float(n)/d).

```
def add_digits(l1, l2):
    return [x + y for x, y in zip(l1, l2)]

def subtract_digits(l1, l2):
    return [x - y for x, y in zip(l1, l2)]

def multiply_digits(l1, l2):
    return [x * y for x, y in zip(l1, l2)]
```

## 28.

If you solved the previous problem, you might notice that the digit-list representation is the same as the representation that your computer uses for integers (except that it’s in reverse order). Implement integer addition, subtraction, and multiplication using only your digit-list functions.

```
def add_ints(n1, n2):
    return sum(add_digits(number2digits(n1), number2digits(n2)))

def subtract_ints(n1, n2):
    return sum(subtract_digits(number2digits(n1), number2digits(n2)))

def multiply_ints(n1, n2):
    return sum(multiply_digits(number2digits(n1), number2digits(n2)))
```

## 29.

Write a function that takes a list of numbers and returns the average value.

```
def average(l):
    return sum(l) / len(l)
```

## 30.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(l):
    max_len = max([len(x) for x in l])
    print('*' * (max_len + 4))
    for x in l:
        print('* ' + x + ' ' * (max_len - len(x)) + ' *')
    print('*' * (max_len + 4))
```

## 31.

Write a function that takes a list of numbers and returns the average value.

```
def average(l):
    return sum(l) / len(l)
```

## 32.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(l):
    max_len = max([len(x) for x in l])
    print('*' * (max_len + 4))
    for x in l:
        print('* ' + x + ' ' * (max_len - len(x)) + ' *')
    print('*' * (max_len + 4))
```

## 33.

Write a program that given a text file will create a new text file in which all the lines from the original file are numbered from 1 to n (where n is the number of lines in the file).

```
def number_lines(filename):
    with open(filename, 'r') as f:
        lines = f.readlines()
    with open(filename, 'w') as f:
        for i, line in enumerate(lines):
            f.write(str(i + 1) + ' ' + line)
```

## 34.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 35.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 36.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 37.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 38.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 39.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 40.

Write a program that will calculate the average word length of a text stored in a file (i.e the sum of all the lengths of the word tokens in the text, divided by the number of word tokens).

```
def average_word_length(filename):
    with open(filename, 'r') as f:
        text = f.read()
    words = text.split()
    return sum([len(x) for x in words]) / len(words)
```

## 41.

Write a program that will calculate the average word length of a
