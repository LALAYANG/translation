

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] number_array = new int[1];
        int[] multiplied_value = multiply(number_array, n);
        int[] indexed_array = multiplied_value;
        for (int i = 0; i < n; i++) {
            indexed_array[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexed_array[i] - indexed_array[i - 1]);
        }
        System.out.println(res);
    }

    public static int[] multiply(int[] number_array, int n) {
        return number_array;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    # your code here
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    # your code here
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    # your code here
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    # your code here
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    # your code here
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_of_numbers(numbers):
    # your code here
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    # your code here
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    # your code here
```

## 11.

Write a function that takes a list of numbers and returns the interquartile range of the numbers.

```
def interquartile_range_of_numbers(numbers):
    # your code here
```

## 12.

Write a function that takes a list of numbers and returns the coefficient of variation of the numbers.

```
def coefficient_of_variation_of_numbers(numbers):
    # your code here
```

## 13.

Write a function that takes a list of numbers and returns the skewness of the numbers.

```
def skewness_of_numbers(numbers):
    # your code here
```

## 14.

Write a function that takes a list of numbers and returns the kurtosis of the numbers.

```
def kurtosis_of_numbers(numbers):
    # your code here
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares_of_numbers(numbers):
    # your code here
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_of_cubes_of_numbers(numbers):
    # your code here
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 19.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 41.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 42.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 43.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 44.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 45.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 46.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 47.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 48.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 49.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 50.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_of_numbers(numbers):
    # your code here
```

## 51.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_of_numbers(numbers):
    # your code here
```

## 52.

Write a function that takes a list of numbers and returns the sum of
