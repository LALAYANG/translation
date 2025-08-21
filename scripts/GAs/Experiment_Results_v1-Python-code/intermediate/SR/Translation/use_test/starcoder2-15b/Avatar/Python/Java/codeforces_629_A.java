

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakeSize = sc.nextInt();
        sc.nextLine();
        String[][] cake = new String[cakeSize][cakeSize];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;
        for (int index = 0; index < cakeSize; index++) {
            String line = sc.nextLine();
            cake[index] = line.split("");
            for (String j : line.split("")) {
                if (j.equals("C")) {
                    chocCount++;
                }
            }
            if ((firstCondition & secondCondition) != 0) {
                if (chocCount > 1) {
                    recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < cakeSize; j++) {
            for (int index = 0; index < cakeSize; index++) {
                if (cake[index][j].equals("C")) {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int index = chocCount; index > chocCount - 2; index--) {
                    nfat *= index;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }

    public static void recursiveChocolateFactorial(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        nfat *= index;
        recursiveChocolateFactorial(index + step, stop, step);
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

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the even numbers in the list. Your function should be able to handle any number of arguments.

```
def even_numbers(*args):
    even_list = []
    for i in args:
        if i % 2 == 0:
            even_list.append(i)
    return even_list
```

## 6.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the odd numbers in the list. Your function should be able to handle any number of arguments.

```
def odd_numbers(*args):
    odd_list = []
    for i in args:
        if i % 2 != 0:
            odd_list.append(i)
    return odd_list
```

## 7.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the positive numbers in the list. Your function should be able to handle any number of arguments.

```
def positive_numbers(*args):
    positive_list = []
    for i in args:
        if i > 0:
            positive_list.append(i)
    return positive_list
```

## 8.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the negative numbers in the list. Your function should be able to handle any number of arguments.

```
def negative_numbers(*args):
    negative_list = []
    for i in args:
        if i < 0:
            negative_list.append(i)
    return negative_list
```

## 9.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the prime numbers in the list. Your function should be able to handle any number of arguments.

```
def prime_numbers(*args):
    prime_list = []
    for i in args:
        if i > 1:
            for j in range(2, i):
                if (i % j) == 0:
                    break
            else:
                prime_list.append(i)
    return prime_list
```

## 10.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the composite numbers in the list. Your function should be able to handle any number of arguments.

```
def composite_numbers(*args):
    composite_list = []
    for i in args:
        if i > 1:
            for j in range(2, i):
                if (i % j) == 0:
                    composite_list.append(i)
                    break
    return composite_list
```

## 11.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the perfect numbers in the list. Your function should be able to handle any number of arguments.

```
def perfect_numbers(*args):
    perfect_list = []
    for i in args:
        sum = 0
        for j in range(1, i):
            if i % j == 0:
                sum += j
        if sum == i:
            perfect_list.append(i)
    return perfect_list
```

## 12.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 3 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_3(*args):
    divisible_list = []
    for i in args:
        if i % 3 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 13.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 5 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_5(*args):
    divisible_list = []
    for i in args:
        if i % 5 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 14.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 7 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_7(*args):
    divisible_list = []
    for i in args:
        if i % 7 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 15.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 11 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_11(*args):
    divisible_list = []
    for i in args:
        if i % 11 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 16.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 13 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_13(*args):
    divisible_list = []
    for i in args:
        if i % 13 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 17.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 17 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_17(*args):
    divisible_list = []
    for i in args:
        if i % 17 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 18.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 19 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_19(*args):
    divisible_list = []
    for i in args:
        if i % 19 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 19.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 23 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_23(*args):
    divisible_list = []
    for i in args:
        if i % 23 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 20.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 29 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_29(*args):
    divisible_list = []
    for i in args:
        if i % 29 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 21.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 31 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_31(*args):
    divisible_list = []
    for i in args:
        if i % 31 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 22.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 37 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_37(*args):
    divisible_list = []
    for i in args:
        if i % 37 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 23.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 41 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_41(*args):
    divisible_list = []
    for i in args:
        if i % 41 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 24.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 43 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_43(*args):
    divisible_list = []
    for i in args:
        if i % 43 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 25.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 47 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_47(*args):
    divisible_list = []
    for i in args:
        if i % 47 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 26.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 53 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_53(*args):
    divisible_list = []
    for i in args:
        if i % 53 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 27.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 59 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_59(*args):
    divisible_list = []
    for i in args:
        if i % 59 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 28.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 61 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_61(*args):
    divisible_list = []
    for i in args:
        if i % 61 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 29.

Write a function that takes a list of numbers and returns a new list of numbers consisting of only the numbers that are divisible by 67 in the list. Your function should be able to handle any number of arguments.

```
def divisible_by_67(*args):
    divisible_list = []
    for i in args:
        if i % 67 == 0:
            divisible_list.append(i)
    return divisible_list
```

## 30.

Write a function that takes
