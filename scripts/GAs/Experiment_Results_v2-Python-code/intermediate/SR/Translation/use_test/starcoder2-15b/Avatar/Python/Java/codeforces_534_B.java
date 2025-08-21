

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 989;
        int SecondCondition = 711;
        int OuterLoopLimit = 748;
        int OuterLoopStep = 747;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            recursive_velocity_calculator(0, t, 1);
        }
        System.out.println(distance);
    }

    public static void recursive_velocity_calculator(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (FirstCondition & SecondCondition) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
        }
        distance = distance + v;
        v += a * d;
        recursive_velocity_calculator(i + step, stop, step);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    return sum(numbers) / len(numbers)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    return max(set(numbers), key=numbers.count)
```

## 8.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## 9.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return math.sqrt(sum((x - mean) ** 2 for x in numbers) / len(numbers))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / len(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares(numbers):
    return sum(x ** 2 for x in numbers)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_of_cubes(numbers):
    return sum(x ** 3 for x in numbers)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_from_median(numbers):
    median = numbers[len(numbers) // 2]
    return sum((x - median) ** 2 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    median = numbers[len(numbers) // 2]
    return sum((x - median) ** 3 for x in numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_from_mode(numbers):
    mode = max(set(numbers), key=numbers.count)
    return sum((x - mode) ** 2 for x in numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_from_mode(numbers):
    mode = max(set(numbers), key=numbers.count)
    return sum((x - mode) ** 3 for x in numbers)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_of_squares_of_differences_from_range(numbers):
    return sum((x - (max(numbers) - min(numbers))) ** 2 for x in numbers)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_of_cubes_of_differences_from_range(numbers):
    return sum((x - (max(numbers) - min(numbers))) ** 3 for x in numbers)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
import math

def sum_of_squares_of_differences_from_standard_deviation(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
import math

def sum_of_cubes_of_differences_from_standard_deviation(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_of_squares_of_differences_from_variance(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_of_cubes_of_differences_from_variance(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the squares of the numbers.

```
def sum_of_squares_of_differences_from_mean_of_squares(numbers):
    mean = sum(x ** 2 for x in numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_mean_of_squares(numbers):
    mean = sum(x ** 2 for x in numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_mean_of_cubes(numbers):
    mean = sum(x ** 3 for x in numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the cubes of the numbers.

```
def sum_of_cubes_of_differences_from_mean_of_cubes(numbers):
    mean = sum(x ** 3 for x in numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the squares of the numbers.

```
def sum_of_squares_of_differences_from_median_of_squares(numbers):
    median = numbers[len(numbers) // 2] ** 2
    return sum((x - median) ** 2 for x in numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_median_of_squares(numbers):
    median = numbers[len(numbers) // 2] ** 2
    return sum((x - median) ** 3 for x in numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_median_of_cubes(numbers):
    median = numbers[len(numbers) // 2] ** 3
    return sum((x - median) ** 2 for x in numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the cubes of the numbers.

```
def sum_of_cubes_of_differences_from_median_of_cubes(numbers):
    median = numbers[len(numbers) // 2] ** 3
    return sum((x - median) ** 3 for x in numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the squares of the numbers.

```
def sum_of_squares_of_differences_from_mode_of_squares(numbers):
    mode = max(set(numbers), key=numbers.count) ** 2
    return sum((x - mode) ** 2 for x in numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_mode_of_squares(numbers):
    mode = max(set(numbers), key=numbers.count) ** 2
    return sum((x - mode) ** 3 for x in numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_mode_of_cubes(numbers):
    mode = max(set(numbers), key=numbers.count) ** 3
    return sum((x - mode) ** 2 for x in numbers)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the cubes of the numbers.

```
def sum_of_cubes_of_differences_from_mode_of_cubes(numbers):
    mode = max(set(numbers), key=numbers.count) ** 3
    return sum((x - mode) ** 3 for x in numbers)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the squares of the numbers.

```
def sum_of_squares_of_differences_from_range_of_squares(numbers):
    return sum((x - (max(numbers) - min(numbers)) ** 2) ** 2 for x in numbers)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_range_of_squares(numbers):
    return sum((x - (max(numbers) - min(numbers)) ** 2) ** 3 for x in numbers)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_range_of_cubes(numbers):
    return sum((x - (max(numbers) - min(numbers)) ** 3) ** 2 for x in numbers)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the cubes of the numbers.

```
def sum_of_cubes_of_differences_from_range_of_cubes(numbers):
    return sum((x - (max(numbers) - min(numbers)) ** 3) ** 3 for
