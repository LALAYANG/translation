

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cake = new String[n];
        for (int i = 0; i < n; i++) {
            cake[i] = sc.nextLine();
        }
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_numbers(*args):
    sum = 0
    for i in args:
        sum += i
    return sum
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list. Your function should be able to handle any number of arguments.

```
def largest_number(*args):
    largest = 0
    for i in args:
        if i > largest:
            largest = i
    return largest
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list. Your function should be able to handle any number of arguments.

```
def smallest_number(*args):
    smallest = args[0]
    for i in args:
        if i < smallest:
            smallest = i
    return smallest
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers. Your function should be able to handle any number of arguments.

```
def average_of_numbers(*args):
    sum = 0
    for i in args:
        sum += i
    return sum / len(args)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers. Your function should be able to handle any number of arguments.

```
def median_of_numbers(*args):
    args = sorted(args)
    if len(args) % 2 == 0:
        return (args[len(args) // 2] + args[len(args) // 2 - 1]) / 2
    else:
        return args[len(args) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers. Your function should be able to handle any number of arguments.

```
def mode_of_numbers(*args):
    count = {}
    for i in args:
        if i in count:
            count[i] += 1
        else:
            count[i] = 1
    max_count = 0
    mode = None
    for key, value in count.items():
        if value > max_count:
            max_count = value
            mode = key
    return mode
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers. Your function should be able to handle any number of arguments.

```
import math

def standard_deviation_of_numbers(*args):
    mean = sum(args) / len(args)
    sum_of_squares = 0
    for i in args:
        sum_of_squares += (i - mean) ** 2
    return math.sqrt(sum_of_squares / len(args))
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers. Your function should be able to handle any number of arguments.

```
def variance_of_numbers(*args):
    mean = sum(args) / len(args)
    sum_of_squares = 0
    for i in args:
        sum_of_squares += (i - mean) ** 2
    return sum_of_squares / len(args)
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers. Your function should be able to handle any number of arguments.

```
def range_of_numbers(*args):
    return max(args) - min(args)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_squares(*args):
    sum = 0
    for i in args:
        sum += i ** 2
    return sum
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_cubes(*args):
    sum = 0
    for i in args:
        sum += i ** 3
    return sum
```

## 13.

Write a function that takes a list of numbers and returns the sum of the factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1):
            factorial *= j
        sum += factorial
    return sum
```

## 14.

Write a function that takes a list of numbers and returns the sum of the double factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_double_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 2):
            factorial *= j
        sum += factorial
    return sum
```

## 15.

Write a function that takes a list of numbers and returns the sum of the triple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_triple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 3):
            factorial *= j
        sum += factorial
    return sum
```

## 16.

Write a function that takes a list of numbers and returns the sum of the quadruple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_quadruple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 4):
            factorial *= j
        sum += factorial
    return sum
```

## 17.

Write a function that takes a list of numbers and returns the sum of the quintuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_quintuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 5):
            factorial *= j
        sum += factorial
    return sum
```

## 18.

Write a function that takes a list of numbers and returns the sum of the sextuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_sextuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 6):
            factorial *= j
        sum += factorial
    return sum
```

## 19.

Write a function that takes a list of numbers and returns the sum of the septuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_septuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 7):
            factorial *= j
        sum += factorial
    return sum
```

## 20.

Write a function that takes a list of numbers and returns the sum of the octuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_octuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 8):
            factorial *= j
        sum += factorial
    return sum
```

## 21.

Write a function that takes a list of numbers and returns the sum of the nonuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_nonuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 9):
            factorial *= j
        sum += factorial
    return sum
```

## 22.

Write a function that takes a list of numbers and returns the sum of the decuple factorials of the numbers. Your function should be able to handle any number of arguments.

```
def sum_of_decuple_factorials(*args):
    sum = 0
    for i in args:
        factorial = 1
        for j in range(1, i + 1, 10):
            factorial *= j
        sum += factorial
    return sum
```

## 23.

Write a function that takes a list of numbers and returns the sum of the square roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_square_roots(*args):
    sum = 0
    for i in args:
        sum += math.sqrt(i)
    return sum
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_cube_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/3)
    return sum
```

## 25.

Write a function that takes a list of numbers and returns the sum of the fourth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_fourth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/4)
    return sum
```

## 26.

Write a function that takes a list of numbers and returns the sum of the fifth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_fifth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/5)
    return sum
```

## 27.

Write a function that takes a list of numbers and returns the sum of the sixth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_sixth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/6)
    return sum
```

## 28.

Write a function that takes a list of numbers and returns the sum of the seventh roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_seventh_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/7)
    return sum
```

## 29.

Write a function that takes a list of numbers and returns the sum of the eighth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_eighth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/8)
    return sum
```

## 30.

Write a function that takes a list of numbers and returns the sum of the ninth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_ninth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/9)
    return sum
```

## 31.

Write a function that takes a list of numbers and returns the sum of the tenth roots of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_tenth_roots(*args):
    sum = 0
    for i in args:
        sum += math.pow(i, 1/10)
    return sum
```

## 32.

Write a function that takes a list of numbers and returns the sum of the logarithms of the numbers. Your function should be able to handle any number of arguments.

```
import math

def sum_of_logarithms(*args):
    sum = 0
    for i in args:
        sum += math.log(i)
    return sum
```

## 33.

Write a function that takes a list of numbers and returns the sum of the natural logarithms of the numbers. Your function should be able to handle any number
