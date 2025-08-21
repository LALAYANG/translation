

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
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
def div_by_two(l):
    return [x / 2 for x in l]
```

## 5.

Write a function that takes a list of numbers and returns a new list of only the even numbers in the list.

```
def even_only(l):
    return [x for x in l if x % 2 == 0]
```

## 6.

Write a function that takes a list of strings and a new string as arguments and returns a new list with the string appended to each element in the list.

```
def add_to_each(l, s):
    return [x + s for x in l]
```

## 7.

Write a function that takes a list of integers and returns the list reversed.

```
def reverse(l):
    return l[::-1]
```

## 8.

Write a function that takes a list of strings and returns a single string that is an concatenation of all the strings in the list.

```
def concat(l):
    return ''.join(l)
```

## 9.

Write a function that takes a list of integers and returns the list sorted in ascending order.

```
def sort_ascending(l):
    return sorted(l)
```

## 10.

Write a function that takes a list of integers and returns the list sorted in descending order.

```
def sort_descending(l):
    return sorted(l, reverse=True)
```

## 11.

Write a function that takes a list of lists and returns a single list with all the elements from all the nested lists in a single list.

```
def flatten(l):
    return [x for y in l for x in y]
```

## 12.

Write a function that takes a list of integers and returns the sum.

```
def sum_list(l):
    return sum(l)
```

## 13.

Write a function that takes a list of integers and returns the average (mean).

```
def average(l):
    return sum(l) / len(l)
```

## 14.

Write a function that takes two lists and combines them by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

```
def merge(l1, l2):
    return [x for y in zip(l1, l2) for x in y]
```

## 15.

Write a function that computes the list of the first 100 Fibonacci numbers. By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.

```
def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        yield a
        a, b = b, a + b
```

## 16.

Write a function that takes a number and checks if it is a prime number.

```
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
```

## 17.

Write a function that takes a list of numbers and returns a list of the prime numbers in that list.

```
def primes_in_list(l):
    return [x for x in l if is_prime(x)]
```

## 18.

Write a function that takes a number a and a list of numbers b and returns True if a is in the list b and False otherwise.

```
def element_in_list(a, b):
    return a in b
```

## 19.

Write a function on_all that applies a function to every element of a list. Use it to print the first twenty perfect squares. The perfect squares can be found by multiplying each natural number with itself. The first few perfect squares are 1\*1= 1, 2\*2=4, 3\*3=9, 4\*4=16. Twelve for example is not a perfect square because there is no natural number m so that m\*m=12. (This question is tricky if your programming language makes it difficult to pass functions as arguments.)

```
def on_all(f, l):
    return [f(x) for x in l]

def square(x):
    return x * x

print(on_all(square, range(1, 21)))
```

## 20.

Write a function that takes a list of numbers and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i + 1 elements from the original list. For example, the cumulative sum of [1,2,3] is [1,3,6].

```
def cumulative_sum(l):
    return [sum(l[:i + 1]) for i in range(len(l))]
```

## 21.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2,3,4,2].

```
def digits(n):
    return [int(x) for x in str(n)]
```

## 22.

Write functions that add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you’re ambitious you can implement the subtraction—but don’t bother with multiplication.

```
def add_digit_lists(l1, l2):
    return [int(x) for x in str(int(''.join(str(x) for x in l1)) + int(''.join(str(x) for x in l2)))]

def subtract_digit_lists(l1, l2):
    return [int(x) for x in str(int(''.join(str(x) for x in l1)) - int(''.join(str(x) for x in l2)))]
```

## 23.

If you completed the previous exercise, you might want to try this one as well. Write a function that takes a list of numbers and returns the list of cumulative sums; that is, a new list where the ith element is the sum of the first i + 1 elements from the original list. For example, the cumulative sum of [1,2,3] is [1,3,6].

```
def cumulative_sum(l):
    return [sum(l[:i + 1]) for i in range(len(l))]
```

## 24.

Write a function that takes a number and returns the sum of its divisors.

```
def sum_divisors(n):
    return sum([x for x in range(1, n + 1) if n % x == 0])
```

## 25.

A number is perfect if the sum of its divisors equal the number. These numbers might be called “perfect numbers.” For instance, 6 is a perfect number because 1+2+3 is equal to 6. Write a function that returns True for perfect numbers and False otherwise.

```
def is_perfect(n):
    return sum_divisors(n) == n
```

## 26.

Write a function that takes a list of numbers and returns the greatest common divisor of those numbers.

```
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def gcd_list(l):
    return reduce(gcd, l)
```

## 27.

Write a function that takes a list of numbers and returns the least common multiple.

```
def lcm(a, b):
    return a * b // gcd(a, b)

def lcm_list(l):
    return reduce(lcm, l)
```

## 28.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 29.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 30.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 31.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 32.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 33.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 34.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 35.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 36.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 37.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 38.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 39.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 40.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 41.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 42.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 43.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 44.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 45.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 46.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 47.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 48.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l):
    return [x / 2 for x in l]
```

## 49.

Write a function that takes a list of numbers and returns a list of all those numbers divided by two.

```
def div_by_two(l
