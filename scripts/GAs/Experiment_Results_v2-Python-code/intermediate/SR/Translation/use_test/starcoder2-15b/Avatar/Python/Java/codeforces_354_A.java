

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            W[i] = sc.nextInt();
        }
        int[] sum_el = new int[arraySize + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= arraySize; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        int answer = QR * (arraySize - 1) + sum_el[arraySize] * R;
        for (int i = 1; i <= arraySize; i++) {
            int energy = L * sum_el[i] + R * (sum_el[arraySize] - sum_el[i]);
            if (i > arraySize - i) {
                energy = energy + (i - (arraySize - i) - 1) * QL;
            } else if (arraySize - i > i) {
                energy = energy + (arraySize - i - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(a_list):
    return max(a_list)
```

## 4.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your code. Then, what would you have to consider if the original list was provided by user input?

```
def list_to_html_ul(a_list):
    return '<ul><li>' + '</li><li>'.join(a_list) + '</li></ul>'
```

## 5.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def my_map(a_func, a_list):
    return [a_func(i) for i in a_list]

def half_of(i):
    return i / 2

print(my_map(half_of, [1, 2, 3]))
```

## 6.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 7.

Write a function (using only list comprehensions) that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 8.

Write a function that takes a list of numbers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 9.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```
def all_odd(a_list):
    return [i for i in a_list if i % 2 == 1]
```

## 10.

Write a function that takes a list of numbers and returns a new list with only the even numbers.

```
def all_even(a_list):
    return [i for i in a_list if i % 2 == 0]
```

## 11.

Write a function that takes a list of strings and a new string as arguments and returns a new list with the string appended to each element in the list.

```
def add_to_list(a_list, a_string):
    return [i + a_string for i in a_list]
```

## 12.

Write a function that takes a list of numbers and returns a new list with only the positive numbers.

```
def all_positive(a_list):
    return [i for i in a_list if i > 0]
```

## 13.

Write a function that takes a list of numbers and returns a new list with only the negative numbers.

```
def all_negative(a_list):
    return [i for i in a_list if i < 0]
```

## 14.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(a_list):
    return a_list[::-1]
```

## 15.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from smallest to greatest).

```
def sort_list(a_list):
    return sorted(a_list)
```

## 16.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from greatest to smallest).

```
def sort_list(a_list):
    return sorted(a_list, reverse=True)
```

## 17.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 18.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 19.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(a_list):
    return max(a_list)
```

## 20.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your code. Then, what would you have to consider if the original list was provided by user input?

```
def list_to_html_ul(a_list):
    return '<ul><li>' + '</li><li>'.join(a_list) + '</li></ul>'
```

## 21.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def my_map(a_func, a_list):
    return [a_func(i) for i in a_list]

def half_of(i):
    return i / 2

print(my_map(half_of, [1, 2, 3]))
```

## 22.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 23.

Write a function (using only list comprehensions) that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 24.

Write a function that takes a list of numbers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 25.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```
def all_odd(a_list):
    return [i for i in a_list if i % 2 == 1]
```

## 26.

Write a function that takes a list of numbers and returns a new list with only the even numbers.

```
def all_even(a_list):
    return [i for i in a_list if i % 2 == 0]
```

## 27.

Write a function that takes a list of strings and a new string as arguments and returns a new list with the string appended to each element in the list.

```
def add_to_list(a_list, a_string):
    return [i + a_string for i in a_list]
```

## 28.

Write a function that takes a list of numbers and returns a new list with only the positive numbers.

```
def all_positive(a_list):
    return [i for i in a_list if i > 0]
```

## 29.

Write a function that takes a list of numbers and returns a new list with only the negative numbers.

```
def all_negative(a_list):
    return [i for i in a_list if i < 0]
```

## 30.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(a_list):
    return a_list[::-1]
```

## 31.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from smallest to greatest).

```
def sort_list(a_list):
    return sorted(a_list)
```

## 32.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from greatest to smallest).

```
def sort_list(a_list):
    return sorted(a_list, reverse=True)
```

## 33.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 34.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 35.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(a_list):
    return max(a_list)
```

## 36.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your code. Then, what would you have to consider if the original list was provided by user input?

```
def list_to_html_ul(a_list):
    return '<ul><li>' + '</li><li>'.join(a_list) + '</li></ul>'
```

## 37.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def my_map(a_func, a_list):
    return [a_func(i) for i in a_list]

def half_of(i):
    return i / 2

print(my_map(half_of, [1, 2, 3]))
```

## 38.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 39.

Write a function (using only list comprehensions) that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 40.

Write a function that takes a list of numbers and strings and returns a new list with the strings filtered out.

```
def filter_list(a_list):
    return [i for i in a_list if type(i) == int]
```

## 41.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```
def all_odd(a_list):
    return [i for i in a_list if i % 2 == 1]
```

## 42.

Write a function that takes a list of numbers and returns a new list with only the even numbers.

```
def all_even(a_list):
    return [i for i in a_list if i % 2 == 0]
```

## 43.

Write a function that takes a list of strings and a new string as arguments and returns a new list with the string appended to each element in the list.

```
def add_to_list(a_list, a_string):
    return [i + a_string for i in a_list]
```

## 44.

Write a function that takes a list of numbers and returns a new list with only the positive numbers.

```
def all_positive(a_list):
    return [i for i in a_list if i > 0]
```

## 45.

Write a function that takes a list of numbers and returns a new list with only the negative numbers.

```
def all_negative(a_list):
    return [i for i in a_list if i < 0]
```

## 46.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(a_list):
    return a_list[::-1]
```

## 47.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from smallest to greatest).

```
def sort_list(a_list):
    return sorted(a_list)
```

## 48.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order (from greatest to smallest).

```
def sort_list(a_list):
    return sorted(a_list, reverse=True)
```

## 49.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a_list):
    return [len(i) for i in a_list]
```

## 50.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 51.

Write a function that takes a list of numbers and returns the largest number in
