

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        scanner.close();
        Collections.shuffle(Arrays.asList(53, 26, 63));
        System.out.println(inputOne <= inputTwo ? "safe" : "unsafe");
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def average_list(numbers):
    return sum(numbers) / len(numbers)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```python
def median_list(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```python
def mode_list(numbers):
    return max(set(numbers), key=numbers.count)
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```python
def standard_deviation_list(numbers):
    return statistics.stdev(numbers)
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```python
def variance_list(numbers):
    return statistics.variance(numbers)
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```python
def range_list(numbers):
    return max(numbers) - min(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```python
def sum_squares_list(numbers):
    return sum(x**2 for x in numbers)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```python
def sum_cubes_list(numbers):
    return sum(x**3 for x in numbers)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```python
def sum_squares_differences_list(numbers):
    return sum((x - statistics.mean(numbers))**2 for x in numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```python
def sum_cubes_differences_list(numbers):
    return sum((x - statistics.mean(numbers))**3 for x in numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```python
def sum_squares_differences_median_list(numbers):
    return sum((x - statistics.median(numbers))**2 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```python
def sum_cubes_differences_median_list(numbers):
    return sum((x - statistics.median(numbers))**3 for x in numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```python
def sum_squares_differences_mode_list(numbers):
    return sum((x - statistics.mode(numbers))**2 for x in numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```python
def sum_cubes_differences_mode_list(numbers):
    return sum((x - statistics.mode(numbers))**3 for x in numbers)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```python
def sum_squares_differences_standard_deviation_list(numbers):
    return sum((x - statistics.stdev(numbers))**2 for x in numbers)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```python
def sum_cubes_differences_standard_deviation_list(numbers):
    return sum((x - statistics.stdev(numbers))**3 for x in numbers)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```python
def sum_squares_differences_variance_list(numbers):
    return sum((x - statistics.variance(numbers))**2 for x in numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```python
def sum_cubes_differences_variance_list(numbers):
    return sum((x - statistics.variance(numbers))**3 for x in numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```python
def sum_squares_differences_range_list(numbers):
    return sum((x - (max(numbers) - min(numbers)))**2 for x in numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```python
def sum_cubes_differences_range_list(numbers):
    return sum((x - (max(numbers) - min(numbers)))**3 for x in numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the numbers.

```python
def sum_squares_differences_sum_list(numbers):
    return sum((x - sum(numbers))**2 for x in numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the numbers.

```python
def sum_cubes_differences_sum_list(numbers):
    return sum((x - sum(numbers))**3 for x in numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the numbers.

```python
def sum_squares_differences_product_list(numbers):
    return sum((x - math.prod(numbers))**2 for x in numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the numbers.

```python
def sum_cubes_differences_product_list(numbers):
    return sum((x - math.prod(numbers))**3 for x in numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the geometric mean of the numbers.

```python
def sum_squares_differences_geometric_mean_list(numbers):
    return sum((x - statistics.geometric_mean(numbers))**2 for x in numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the geometric mean of the numbers.

```python
def sum_cubes_differences_geometric_mean_list(numbers):
    return sum((x - statistics.geometric_mean(numbers))**3 for x in numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the harmonic mean of the numbers.

```python
def sum_squares_differences_harmonic_mean_list(numbers):
    return sum((x - statistics.harmonic_mean(numbers))**2 for x in numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the harmonic mean of the numbers.

```python
def sum_cubes_differences_harmonic_mean_list(numbers):
    return sum((x - statistics.harmonic_mean(numbers))**3 for x in numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the root mean square of the numbers.

```python
def sum_squares_differences_root_mean_square_list(numbers):
    return sum((x - statistics.mean_square(numbers))**2 for x in numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the root mean square of the numbers.

```python
def sum_cubes_differences_root_mean_square_list(numbers):
    return sum((x - statistics.mean_square(numbers))**3 for x in numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the squares of the numbers.

```python
def sum_squares_differences_mean_squares_list(numbers):
    return sum((x - statistics.mean_square(numbers))**2 for x in numbers)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the squares of the numbers.

```python
def sum_cubes_differences_mean_squares_list(numbers):
    return sum((x - statistics.mean_square(numbers))**3 for x in numbers)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the cubes of the numbers.

```python
def sum_squares_differences_mean_cubes_list(numbers):
    return sum((x - statistics.mean_square(numbers))**2 for x in numbers)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the cubes of the numbers.

```python
def sum_cubes_differences_mean_cubes_list(numbers):
    return sum((x - statistics.mean_square(numbers))**3 for x in numbers)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the differences between the numbers and the mean of the numbers.

```python
def sum_squares_differences_mean_differences_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.mean(numbers)))**2 for x in numbers)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the differences between the numbers and the mean of the numbers.

```python
def sum_cubes_differences_mean_differences_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.mean(numbers)))**3 for x in numbers)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the differences between the numbers and the median of the numbers.

```python
def sum_squares_differences_mean_differences_median_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.median(numbers)))**2 for x in numbers)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the differences between the numbers and the median of the numbers.

```python
def sum_cubes_differences_mean_differences_median_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.median(numbers)))**3 for x in numbers)
```

## 43.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the differences between the numbers and the mode of the numbers.

```python
def sum_squares_differences_mean_differences_mode_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.mode(numbers)))**2 for x in numbers)
```

## 44.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the differences between the numbers and the mode of the numbers.

```python
def sum_cubes_differences_mean_differences_mode_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.mode(numbers)))**3 for x in numbers)
```

## 45.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the differences between the numbers and the standard deviation of the numbers.

```python
def sum_squares_differences_mean_differences_standard_deviation_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.stdev(numbers)))**2 for x in numbers)
```

## 46.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the differences between the numbers and the standard deviation of the numbers.

```python
def sum_cubes_differences_mean_differences_standard_deviation_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.stdev(numbers)))**3 for x in numbers)
```

## 47.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the differences between the numbers and the variance of the numbers.

```python
def sum_squares_differences_mean_differences_variance_list(numbers):
    return sum((x - (statistics.mean(numbers) - statistics.variance(numbers)))**2 for x in numbers)
```

## 48.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the differences between the numbers and the variance of the numbers.

```python
def sum_cubes_differ
