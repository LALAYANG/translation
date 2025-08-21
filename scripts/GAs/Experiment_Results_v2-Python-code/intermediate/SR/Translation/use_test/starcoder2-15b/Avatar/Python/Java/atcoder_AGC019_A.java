

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int min_one_liter_cost = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, min_one_liter_cost * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + min_one_liter_cost);
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_numbers(*args):
    return sum(args)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list. Your function should be able to handle any number of arguments.

```
def max_number(*args):
    return max(args)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list. Your function should be able to handle any number of arguments.

```
def min_number(*args):
    return min(args)
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers. Your function should be able to handle any number of arguments.

```
def average_number(*args):
    return sum(args) / len(args)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers. Your function should be able to handle any number of arguments.

```
def median_number(*args):
    args = sorted(args)
    if len(args) % 2 == 0:
        return (args[len(args) // 2] + args[len(args) // 2 - 1]) / 2
    else:
        return args[len(args) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers. Your function should be able to handle any number of arguments.

```
def mode_number(*args):
    return max(set(args), key=args.count)
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers. Your function should be able to handle any number of arguments.

```
def standard_deviation(*args):
    mean = sum(args) / len(args)
    return (sum((x - mean) ** 2 for x in args) / len(args)) ** 0.5
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers. Your function should be able to handle any number of arguments.

```
def variance(*args):
    mean = sum(args) / len(args)
    return sum((x - mean) ** 2 for x in args) / len(args)
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers. Your function should be able to handle any number of arguments.

```
def range_number(*args):
    return max(args) - min(args)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers. Your function should be able to handle any number of arguments.

```
def sum_squares(*args):
    return sum(x ** 2 for x in args)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers. Your function should be able to handle any number of arguments.

```
def sum_cubes(*args):
    return sum(x ** 3 for x in args)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the fourth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_fourth_powers(*args):
    return sum(x ** 4 for x in args)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the fifth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_fifth_powers(*args):
    return sum(x ** 5 for x in args)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the sixth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_sixth_powers(*args):
    return sum(x ** 6 for x in args)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the seventh powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_seventh_powers(*args):
    return sum(x ** 7 for x in args)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the eighth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_eighth_powers(*args):
    return sum(x ** 8 for x in args)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the ninth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_ninth_powers(*args):
    return sum(x ** 9 for x in args)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the tenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_tenth_powers(*args):
    return sum(x ** 10 for x in args)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the eleventh powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_eleventh_powers(*args):
    return sum(x ** 11 for x in args)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the twelfth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twelfth_powers(*args):
    return sum(x ** 12 for x in args)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the thirteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_thirteenth_powers(*args):
    return sum(x ** 13 for x in args)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the fourteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_fourteenth_powers(*args):
    return sum(x ** 14 for x in args)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the fifteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_fifteenth_powers(*args):
    return sum(x ** 15 for x in args)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the sixteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_sixteenth_powers(*args):
    return sum(x ** 16 for x in args)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the seventeenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_seventeenth_powers(*args):
    return sum(x ** 17 for x in args)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the eighteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_eighteenth_powers(*args):
    return sum(x ** 18 for x in args)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the nineteenth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_nineteenth_powers(*args):
    return sum(x ** 19 for x in args)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the twentieth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twentieth_powers(*args):
    return sum(x ** 20 for x in args)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the twenty-first powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_first_powers(*args):
    return sum(x ** 21 for x in args)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the twenty-second powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_second_powers(*args):
    return sum(x ** 22 for x in args)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the twenty-third powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_third_powers(*args):
    return sum(x ** 23 for x in args)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the twenty-fourth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_fourth_powers(*args):
    return sum(x ** 24 for x in args)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the twenty-fifth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_fifth_powers(*args):
    return sum(x ** 25 for x in args)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the twenty-sixth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_sixth_powers(*args):
    return sum(x ** 26 for x in args)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the twenty-seventh powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_seventh_powers(*args):
    return sum(x ** 27 for x in args)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the twenty-eighth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_eighth_powers(*args):
    return sum(x ** 28 for x in args)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the twenty-ninth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_twenty_ninth_powers(*args):
    return sum(x ** 29 for x in args)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the thirtieth powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_thirtieth_powers(*args):
    return sum(x ** 30 for x in args)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the thirty-first powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_thirty_first_powers(*args):
    return sum(x ** 31 for x in args)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the thirty-second powers of the numbers. Your function should be able to handle any number of arguments.

```
def sum_thirty_second_powers(*args):
    return sum(x ** 32 for x in args)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the thirty-third powers of the numbers
