

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input_array = new int[n];
        for (int i = 0; i < n; i++) {
            input_array[i] = scanner.nextInt();
        }
        int[] result_array = new int[n];
        int mx = input_array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result_array[i] = Math.max(0, mx - input_array[i] + 1);
            if (input_array[i] > mx) {
                mx = input_array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result_array[i] + " ");
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse_list(numbers):
    return numbers[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(numbers):
    return sum(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(numbers):
    return max(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(numbers):
    return min(numbers)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(numbers):
    return sum(numbers) / len(numbers)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2 - 1] + numbers[len(numbers) // 2]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_list(numbers):
    mean = sum(numbers) / len(numbers)
    variance = sum((x - mean) ** 2 for x in numbers) / len(numbers)
    return math.sqrt(variance)
```

## 9.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(numbers):
    counts = {}
    for number in numbers:
        if number in counts:
            counts[number] += 1
        else:
            counts[number] = 1
    max_count = max(counts.values())
    modes = [number for number, count in counts.items() if count == max_count]
    return modes
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(numbers):
    return max(numbers) - min(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_squares_list(numbers):
    return sum(x ** 2 for x in numbers)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_cubes_list(numbers):
    return sum(x ** 3 for x in numbers)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mean.

```
def sum_squares_differences_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mean.

```
def sum_cubes_differences_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their median.

```
def sum_squares_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 2 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their median.

```
def sum_cubes_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 3 for x in numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mode.

```
def sum_squares_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 2 for x in numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mode.

```
def sum_cubes_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 3 for x in numbers)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their range.

```
def sum_squares_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 2 for x in numbers)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their range.

```
def sum_cubes_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 3 for x in numbers)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their standard deviation.

```
def sum_squares_differences_standard_deviation_list(numbers):
    standard_deviation = standard_deviation_list(numbers)
    return sum((x - standard_deviation) ** 2 for x in numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their standard deviation.

```
def sum_cubes_differences_standard_deviation_list(numbers):
    standard_deviation = standard_deviation_list(numbers)
    return sum((x - standard_deviation) ** 3 for x in numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mean, divided by the number of numbers.

```
def sum_squares_differences_mean_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / len(numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mean, divided by the number of numbers.

```
def sum_cubes_differences_mean_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers) / len(numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their median, divided by the number of numbers.

```
def sum_squares_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 2 for x in numbers) / len(numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their median, divided by the number of numbers.

```
def sum_cubes_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 3 for x in numbers) / len(numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mode, divided by the number of numbers.

```
def sum_squares_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 2 for x in numbers) / len(numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mode, divided by the number of numbers.

```
def sum_cubes_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 3 for x in numbers) / len(numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their range, divided by the number of numbers.

```
def sum_squares_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 2 for x in numbers) / len(numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their range, divided by the number of numbers.

```
def sum_cubes_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 3 for x in numbers) / len(numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their standard deviation, divided by the number of numbers.

```
def sum_squares_differences_standard_deviation_list(numbers):
    standard_deviation = standard_deviation_list(numbers)
    return sum((x - standard_deviation) ** 2 for x in numbers) / len(numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their standard deviation, divided by the number of numbers.

```
def sum_cubes_differences_standard_deviation_list(numbers):
    standard_deviation = standard_deviation_list(numbers)
    return sum((x - standard_deviation) ** 3 for x in numbers) / len(numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mean, divided by the number of numbers minus one.

```
def sum_squares_differences_mean_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / (len(numbers) - 1)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mean, divided by the number of numbers minus one.

```
def sum_cubes_differences_mean_list(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 3 for x in numbers) / (len(numbers) - 1)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their median, divided by the number of numbers minus one.

```
def sum_squares_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 2 for x in numbers) / (len(numbers) - 1)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their median, divided by the number of numbers minus one.

```
def sum_cubes_differences_median_list(numbers):
    median = median_list(numbers)
    return sum((x - median) ** 3 for x in numbers) / (len(numbers) - 1)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their mode, divided by the number of numbers minus one.

```
def sum_squares_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 2 for x in numbers) / (len(numbers) - 1)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their mode, divided by the number of numbers minus one.

```
def sum_cubes_differences_mode_list(numbers):
    mode = mode_list(numbers)
    return sum((x - mode) ** 3 for x in numbers) / (len(numbers) - 1)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their range, divided by the number of numbers minus one.

```
def sum_squares_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 2 for x in numbers) / (len(numbers) - 1)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and their range, divided by the number of numbers minus one.

```
def sum_cubes_differences_range_list(numbers):
    range_value = range_list(numbers)
    return sum((x - range_value) ** 3 for x in numbers) / (len(numbers) - 1)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and their standard deviation, divided by the number of numbers minus one.

```
def sum_squares_differences_standard_deviation_list(numbers):
    standard_deviation = standard_deviation_list(numbers)
    return sum((x - standard_deviation) ** 2 for x in numbers) / (len(numbers) - 1)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the
