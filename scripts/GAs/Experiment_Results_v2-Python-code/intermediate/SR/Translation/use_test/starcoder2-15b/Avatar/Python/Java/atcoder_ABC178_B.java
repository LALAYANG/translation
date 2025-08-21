

```java
import java.util.*;
import java.io.*;
import java.math.*;

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

Write a function that takes a string of words and a number and returns a string of the words in reverse order separated by spaces.

```
def reverse_string(s, n):
    return ' '.join(s.split()[::-1])
```

## 10.

Write a function that takes a list of words and returns a string of all those words concatenated together (separated by spaces).

```
def join_strings(l):
    return ' '.join(l)
```

## 11.

Write a function that takes a list of integers and returns the average (without using the avg function)

```
def average(l):
    return sum(l) / len(l)
```

## 12.

Write a function that takes a list of integers and returns the average (without using the avg function)

```
def average(l):
    return sum(l) / len(l)
```

## 13.

Write a function that takes two lists of numbers and returns True if they have at least one number in common, False otherwise.

```
def common_elements(l1, l2):
    return any(x in l2 for x in l1)
```

## 14.

Write a function that takes two lists and combines them by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

```
def merge_lists(l1, l2):
    return [x for t in zip(l1, l2) for x in t]
```

## 15.

Write a function that concatenates two lists. [a,b,c], [1,2,3] → [a,b,c,1,2,3]

```
def concat_lists(l1, l2):
    return l1 + l2
```

## 16.

Write a function that combines two lists by repeating the elements in a cycle, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

```
def cycle_lists(l1, l2):
    return [x for t in zip(l1, l2) for x in t]
```

## 17.

Write a function that takes a number and returns a list of its digits.

```
def number2digits(n):
    return [int(x) for x in str(n)]
```

## 18.

Write functions that add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you’re ambitious, add support for subtraction.

```
def add_digits(l1, l2):
    return [x + y for x, y in zip(l1, l2)]

def subtract_digits(l1, l2):
    return [x - y for x, y in zip(l1, l2)]

def multiply_digits(l1, l2):
    return [x * y for x, y in zip(l1, l2)]
```

## 19.

If you completed the previous problem with a function that works on arbitrary-sized digit lists, you might notice that adding two single-digit numbers can result in a two-digit answer. For example, 8 + 9 = 17. Write a function that normalizes a digit list, which is given as a list of digits in order of most to least significant.

```
def normalize(l):
    for i in range(len(l) - 1):
        if l[i] >= 10:
            l[i + 1] += l[i] // 10
            l[i] %= 10
    return l
```

## 20.

Write a function that adds two numbers. You should not convert the numbers from strings to integers.

```
def add_numbers(s1, s2):
    return str(int(s1) + int(s2))
```

## 21.

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
def print_frame(l):
    max_len = max(len(x) for x in l)
    print('*' * (max_len + 4))
    for x in l:
        print('* {:<{}} *'.format(x, max_len))
    print('*' * (max_len + 4))
```

## 22.

Write a function that takes a text file name and returns the number of words contained in the text file.

```
def count_words(filename):
    with open(filename) as f:
        return len(f.read().split())
```

## 23.

Write a function that takes a text file name and returns the number of lines contained in the text file.

```
def count_lines(filename):
    with open(filename) as f:
        return len(f.readlines())
```

## 24.

Write a function that takes a text file name and returns the number of e's it contains.

```
def count_e(filename):
    with open(filename) as f:
        return f.read().count('e')
```

## 25.

Write a function that takes a text file name and returns the number of alphanumeric characters it contains.

```
def count_alphanumeric(filename):
    with open(filename) as f:
        return sum(x.isalnum() for x in f.read())
```

## 26.

Write a function that takes a text file name and returns the number of alphabetic characters it contains.

```
def count_alphabetic(filename):
    with open(filename) as f:
        return sum(x.isalpha() for x in f.read())
```

## 27.

Write a function that opens a file, reads it line by line and prints each line with line numbers. The line numbering starts at 1.

```
def print_line_numbers(filename):
    with open(filename) as f:
        for i, line in enumerate(f, 1):
            print('{:>3} {}'.format(i, line), end='')
```

## 28.

Write a function that takes a list of numbers (for example, a = [5, 10, 15, 20, 25]) and makes a new list of only the first and last elements of the given list. For practice, write this code inside a function.

```
def first_last(l):
    return [l[0], l[-1]]
```

## 29.

Write a function that takes a list of numbers (for example, a = [5, 10, 15, 20, 25]) and makes a new list of only the first and last elements of the given list. For practice, write this code inside a function.

```
def first_last(l):
    return [l[0], l[-1]]
```

## 30.

Write a function that takes a list of numbers and returns a new list that contains all the elements of the first list minus all the duplicates.

```
def remove_duplicates(l):
    return list(set(l))
```

## 31.

Write a function that takes a list and returns a new list that contains all the elements of the first list minus all the duplicates.

```
def remove_duplicates(l):
    return list(set(l))
```

## 32.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2,3,4,2].

```
def number2digits(n):
    return [int(x) for x in str(n)]
```

## 33.

Write functions that add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you’re ambitious, add support for subtraction.

```
def add_digits(l1, l2):
    return [x + y for x, y in zip(l1, l2)]

def subtract_digits(l1, l2):
    return [x - y for x, y in zip(l1, l2)]

def multiply_digits(l1, l2):
    return [x * y for x, y in zip(l1, l2)]
```

## 34.

If you completed the previous problem with a function that works on arbitrary-sized digit lists, you might notice that adding two single-digit numbers can result in a two-digit answer. For example, 8 + 9 = 17. Write a function that normalizes a digit list, which is given as a list of digits in order of most to least significant.

```
def normalize(l):
    for i in range(len(l) - 1):
        if l[i] >= 10:
            l[i + 1] += l[i] // 10
            l[i] %= 10
    return l
```

## 35.

Write a function that adds two numbers. You should not convert the numbers from strings to integers.

```
def add_numbers(s1, s2):
    return str(int(s1) + int(s2))
```

## 36.

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
def print_frame(l):
    max_len = max(len(x) for x in l)
    print('*' * (max_len + 4))
    for x in l:
        print('* {:<{}} *'.format(x, max_len))
    print('*' * (max_len + 4))
```

## 37.

Write a function that takes a text file name and returns the number of words contained in the text file.

```
def count_words(filename):
    with open(filename) as f:
        return len(f.read().split())
```

## 38.

Write a function that takes a text file name and returns the number of lines contained in the text file.

```
def count_lines(filename):
    with open(filename) as f:
        return len(f.readlines())
```

## 39.

Write a function that takes a text file name and returns the number of e's it contains.

```
def count_e(filename):
    with open(filename) as f:
        return f.read().count('e')
```

## 40.

Write a function that takes a text file name and returns the number of alphanumeric characters it contains.

```
def count_alphanumeric(filename):
    with open(filename) as f:
        return sum(x.isalnum() for x in f.read())
```

## 41.

Write a function that takes a text file name and returns the number of alphabetic characters it contains.

```
def count_alphabetic(filename):
    with open(filename) as f:
        return sum(x.isalpha() for x in f.read())
```

## 42.

Write a function that opens a file, reads it line by line and prints each line with line numbers. The line numbering starts at 1.

```
def print_line_numbers(filename):
    with open(filename) as f:
        for i, line in enumerate(f, 1):
            print('{:>3} {}'.format(i, line), end='')
```

## 43.

Write a function that takes a list of numbers (for example, a = [5, 10, 15, 20, 25]) and makes a new list of only the first and last elements of the given list. For practice, write this code inside a function.

```
def first_last(l):
    return [l[0], l[-1]]
```

## 44.

Write a function that takes a list of numbers (for example, a = [5, 10, 15, 20, 25]) and makes a new list of only the first and last elements of the given list. For practice, write this code inside a function.

```
def first_last(l):
    return [l[0], l[-1]]
```

## 45.

Write a function that takes a list of numbers and returns a new list that contains all the elements of the first list minus all the duplicates.

```
def remove_duplicates(l):
    return list(set(l))
```

## 46.

Write a function that takes a list and returns a new
