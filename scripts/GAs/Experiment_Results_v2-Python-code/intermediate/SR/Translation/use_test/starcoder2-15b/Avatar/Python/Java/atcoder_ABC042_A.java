

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (userInput[0] == 7 && userInput[1] == 5 && userInput[2] == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## Question 2

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## Question 3

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    return max(numbers)
```

## Question 4

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    return min(numbers)
```

## Question 5

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    return sum(numbers) / len(numbers)
```

## Question 6

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## Question 7

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    return max(set(numbers), key=numbers.count)
```

## Question 8

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## Question 9

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    variance = sum((x - mean) ** 2 for x in numbers) / len(numbers)
    return math.sqrt(variance)
```

## Question 10

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    variance = sum((x - mean) ** 2 for x in numbers) / len(numbers)
    return variance
```

## Question 11

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares(numbers):
    return sum(x ** 2 for x in numbers)
```

## Question 12

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_of_cubes(numbers):
    return sum(x ** 3 for x in numbers)
```

## Question 13

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## Question 14

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## Question 15

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 2 for x in numbers)
```

## Question 16

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 3 for x in numbers)
```

## Question 17

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 2 for x in numbers)
```

## Question 18

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 3 for x in numbers)
```

## Question 19

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_of_squares_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 2 for x in numbers)
```

## Question 20

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_of_cubes_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 3 for x in numbers)
```

## Question 21

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_squares_of_differences_from_standard_deviation(numbers):
    standard_deviation = standard_deviation_of_numbers(numbers)
    return sum((x - standard_deviation) ** 2 for x in numbers)
```

## Question 22

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_cubes_of_differences_from_standard_deviation(numbers):
    standard_deviation = standard_deviation_of_numbers(numbers)
    return sum((x - standard_deviation) ** 3 for x in numbers)
```

## Question 23

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_of_squares_of_differences_from_variance(numbers):
    variance = variance_of_numbers(numbers)
    return sum((x - variance) ** 2 for x in numbers)
```

## Question 24

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_of_cubes_of_differences_from_variance(numbers):
    variance = variance_of_numbers(numbers)
    return sum((x - variance) ** 3 for x in numbers)
```

## Question 25

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_from_mean(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## Question 26

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_from_mean(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## Question 27

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 2 for x in numbers)
```

## Question 28

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 3 for x in numbers)
```

## Question 29

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 2 for x in numbers)
```

## Question 30

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 3 for x in numbers)
```

## Question 31

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_of_squares_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 2 for x in numbers)
```

## Question 32

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_of_cubes_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 3 for x in numbers)
```

## Question 33

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_squares_of_differences_from_standard_deviation(numbers):
    standard_deviation = standard_deviation_of_numbers(numbers)
    return sum((x - standard_deviation) ** 2 for x in numbers)
```

## Question 34

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_cubes_of_differences_from_standard_deviation(numbers):
    standard_deviation = standard_deviation_of_numbers(numbers)
    return sum((x - standard_deviation) ** 3 for x in numbers)
```

## Question 35

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_of_squares_of_differences_from_variance(numbers):
    variance = variance_of_numbers(numbers)
    return sum((x - variance) ** 2 for x in numbers)
```

## Question 36

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_of_cubes_of_differences_from_variance(numbers):
    variance = variance_of_numbers(numbers)
    return sum((x - variance) ** 3 for x in numbers)
```

## Question 37

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_from_mean(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## Question 38

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_from_mean(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## Question 39

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 2 for x in numbers)
```

## Question 40

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    median = median_of_numbers(numbers)
    return sum((x - median) ** 3 for x in numbers)
```

## Question 41

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 2 for x in numbers)
```

## Question 42

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_from_mode(numbers):
    mode = mode_of_numbers(numbers)
    return sum((x - mode) ** 3 for x in numbers)
```

## Question 43

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_of_squares_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 2 for x in numbers)
```

## Question 44

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_of_cubes_of_differences_from_range(numbers):
    range = range_of_numbers(numbers)
    return sum((x - range) ** 3 for x in numbers)
```

## Question 45

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_squares_of_differences_from_standard_deviation(numbers):
    standard_deviation = standard_deviation_of_numbers(numbers)
