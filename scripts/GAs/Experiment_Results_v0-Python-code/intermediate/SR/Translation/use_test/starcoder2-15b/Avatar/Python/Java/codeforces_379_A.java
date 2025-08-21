

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Callable<Integer> callable = new Callable<Integer>() {
                public Integer call() throws Exception {
                    return add_numbers(variable_3_10, dividend);
                }
            };
            Future<Integer> future = executor.submit(callable);
            dividend = future.get();
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.DAYS);
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int add_numbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
```
/docs/exercises/exercise-1.md
# Exercise 1

## Exercise 1.1

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_numbers(numbers):
    return sum(numbers)
```

## Exercise 1.2

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_number(numbers):
    return max(numbers)
```

## Exercise 1.3

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_number(numbers):
    return min(numbers)
```

## Exercise 1.4

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def average_number(numbers):
    return sum(numbers) / len(numbers)
```

## Exercise 1.5

Write a function that takes a list of numbers and returns the median of the numbers.

```python
def median_number(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## Exercise 1.6

Write a function that takes a list of numbers and returns the mode of the numbers.

```python
def mode_number(numbers):
    return max(set(numbers), key=numbers.count)
```

## Exercise 1.7

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```python
def standard_deviation(numbers):
    return statistics.stdev(numbers)
```

## Exercise 1.8

Write a function that takes a list of numbers and returns the variance of the numbers.

```python
def variance(numbers):
    return statistics.variance(numbers)
```

## Exercise 1.9

Write a function that takes a list of numbers and returns the range of the numbers.

```python
def range_number(numbers):
    return max(numbers) - min(numbers)
```

## Exercise 1.10

Write a function that takes a list of numbers and returns the number of even numbers in the list.

```python
def count_even_numbers(numbers):
    return len([x for x in numbers if x % 2 == 0])
```

## Exercise 1.11

Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```python
def count_odd_numbers(numbers):
    return len([x for x in numbers if x % 2 == 1])
```

## Exercise 1.12

Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```python
def count_positive_numbers(numbers):
    return len([x for x in numbers if x > 0])
```

## Exercise 1.13

Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```python
def count_negative_numbers(numbers):
    return len([x for x in numbers if x < 0])
```

## Exercise 1.14

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 3 in the list.

```python
def count_divisible_by_3(numbers):
    return len([x for x in numbers if x % 3 == 0])
```

## Exercise 1.15

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 5 in the list.

```python
def count_divisible_by_5(numbers):
    return len([x for x in numbers if x % 5 == 0])
```

## Exercise 1.16

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 7 in the list.

```python
def count_divisible_by_7(numbers):
    return len([x for x in numbers if x % 7 == 0])
```

## Exercise 1.17

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 11 in the list.

```python
def count_divisible_by_11(numbers):
    return len([x for x in numbers if x % 11 == 0])
```

## Exercise 1.18

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 13 in the list.

```python
def count_divisible_by_13(numbers):
    return len([x for x in numbers if x % 13 == 0])
```

## Exercise 1.19

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 17 in the list.

```python
def count_divisible_by_17(numbers):
    return len([x for x in numbers if x % 17 == 0])
```

## Exercise 1.20

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 19 in the list.

```python
def count_divisible_by_19(numbers):
    return len([x for x in numbers if x % 19 == 0])
```

## Exercise 1.21

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 23 in the list.

```python
def count_divisible_by_23(numbers):
    return len([x for x in numbers if x % 23 == 0])
```

## Exercise 1.22

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 29 in the list.

```python
def count_divisible_by_29(numbers):
    return len([x for x in numbers if x % 29 == 0])
```

## Exercise 1.23

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 31 in the list.

```python
def count_divisible_by_31(numbers):
    return len([x for x in numbers if x % 31 == 0])
```

## Exercise 1.24

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 37 in the list.

```python
def count_divisible_by_37(numbers):
    return len([x for x in numbers if x % 37 == 0])
```

## Exercise 1.25

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 41 in the list.

```python
def count_divisible_by_41(numbers):
    return len([x for x in numbers if x % 41 == 0])
```

## Exercise 1.26

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 43 in the list.

```python
def count_divisible_by_43(numbers):
    return len([x for x in numbers if x % 43 == 0])
```

## Exercise 1.27

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 47 in the list.

```python
def count_divisible_by_47(numbers):
    return len([x for x in numbers if x % 47 == 0])
```

## Exercise 1.28

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 53 in the list.

```python
def count_divisible_by_53(numbers):
    return len([x for x in numbers if x % 53 == 0])
```

## Exercise 1.29

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 59 in the list.

```python
def count_divisible_by_59(numbers):
    return len([x for x in numbers if x % 59 == 0])
```

## Exercise 1.30

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 61 in the list.

```python
def count_divisible_by_61(numbers):
    return len([x for x in numbers if x % 61 == 0])
```

## Exercise 1.31

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 67 in the list.

```python
def count_divisible_by_67(numbers):
    return len([x for x in numbers if x % 67 == 0])
```

## Exercise 1.32

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 71 in the list.

```python
def count_divisible_by_71(numbers):
    return len([x for x in numbers if x % 71 == 0])
```

## Exercise 1.33

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 73 in the list.

```python
def count_divisible_by_73(numbers):
    return len([x for x in numbers if x % 73 == 0])
```

## Exercise 1.34

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 79 in the list.

```python
def count_divisible_by_79(numbers):
    return len([x for x in numbers if x % 79 == 0])
```

## Exercise 1.35

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 83 in the list.

```python
def count_divisible_by_83(numbers):
    return len([x for x in numbers if x % 83 == 0])
```

## Exercise 1.36

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 89 in the list.

```python
def count_divisible_by_89(numbers):
    return len([x for x in numbers if x % 89 == 0])
```

## Exercise 1.37

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 97 in the list.

```python
def count_divisible_by_97(numbers):
    return len([x for x in numbers if x % 97 == 0])
```

## Exercise 1.38

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 101 in the list.

```python
def count_divisible_by_101(numbers):
    return len([x for x in numbers if x % 101 == 0])
```

## Exercise 1.39

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 103 in the list.

```python
def count_divisible_by_103(numbers):
    return len([x for x in numbers if x % 103 == 0])
```

## Exercise 1.40

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 107 in the list.

```python
def count_divisible_by_107(numbers):
    return len([x for x in numbers if x % 107 == 0])
```

## Exercise 1.41

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 109 in the list.

```python
def count_divisible_by_109(numbers):
    return len([x for x in numbers if x % 109 == 0])
```

## Exercise 1.42

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 113 in the list.

```python
def count_divisible_by_113(numbers):
    return len([x for x in numbers if x % 113 == 0])
```

## Exercise 1.43

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 127 in the list.

```python
def count_divisible_by_127(numbers):
    return len([x for x in numbers if x % 127 == 0])
```

## Exercise 1.44

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 131 in the list.

```python
def count_divisible_by_131(numbers):
    return len([x for x in numbers if x % 131 == 0])
```

## Exercise 1.45

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 137 in the list.

```python
def count_divisible_by_137(numbers
