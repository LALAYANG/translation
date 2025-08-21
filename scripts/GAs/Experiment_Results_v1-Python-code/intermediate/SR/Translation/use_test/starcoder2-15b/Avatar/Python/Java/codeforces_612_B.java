

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int factor = 0;
            return factor * n;
        });
        try {
            b[a[0] - 1] = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(numbers):
    # Your code here
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(numbers):
    # Your code here
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(numbers):
    # Your code here
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(numbers):
    # Your code here
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(numbers):
    # Your code here
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(numbers):
    # Your code here
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(numbers):
    # Your code here
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(numbers):
    # Your code here
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(numbers):
    # Your code here
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_squares_list(numbers):
    # Your code here
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_cubes_list(numbers):
    # Your code here
```

## 13.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_differences_list(numbers):
    # Your code here
```

## 14.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_differences_list(numbers):
    # Your code here
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_differences_median_list(numbers):
    # Your code here
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_cubes_differences_median_list(numbers):
    # Your code here
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_squares_differences_mode_list(numbers):
    # Your code here
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_cubes_differences_mode_list(numbers):
    # Your code here
```

## 19.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_squares_differences_standard_deviation_list(numbers):
    # Your code here
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_cubes_differences_standard_deviation_list(numbers):
    # Your code here
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_squares_differences_variance_list(numbers):
    # Your code here
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_cubes_differences_variance_list(numbers):
    # Your code here
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_squares_differences_range_list(numbers):
    # Your code here
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_cubes_differences_range_list(numbers):
    # Your code here
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the numbers.

```
def sum_squares_differences_sum_list(numbers):
    # Your code here
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the numbers.

```
def sum_cubes_differences_sum_list(numbers):
    # Your code here
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the numbers.

```
def sum_squares_differences_product_list(numbers):
    # Your code here
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the numbers.

```
def sum_cubes_differences_product_list(numbers):
    # Your code here
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the squares of the numbers.

```
def sum_squares_differences_sum_squares_list(numbers):
    # Your code here
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the squares of the numbers.

```
def sum_cubes_differences_sum_squares_list(numbers):
    # Your code here
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the squares of the numbers.

```
def sum_squares_differences_product_squares_list(numbers):
    # Your code here
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the squares of the numbers.

```
def sum_cubes_differences_product_squares_list(numbers):
    # Your code here
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the cubes of the numbers.

```
def sum_squares_differences_sum_cubes_list(numbers):
    # Your code here
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the cubes of the numbers.

```
def sum_cubes_differences_sum_cubes_list(numbers):
    # Your code here
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the cubes of the numbers.

```
def sum_squares_differences_product_cubes_list(numbers):
    # Your code here
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the cubes of the numbers.

```
def sum_cubes_differences_product_cubes_list(numbers):
    # Your code here
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_differences_sum_squares_differences_mean_list(numbers):
    # Your code here
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_differences_sum_squares_differences_mean_list(numbers):
    # Your code here
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_differences_product_squares_differences_mean_list(numbers):
    # Your code here
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_differences_product_squares_differences_mean_list(numbers):
    # Your code here
```

## 41.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_squares_differences_sum_cubes_differences_mean_list(numbers):
    # Your code here
```

## 42.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_differences_sum_cubes_differences_mean_list(numbers):
    # Your code here
```

## 43.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_squares_differences_product_cubes_differences_mean_list(numbers):
    # Your code here
```

## 44.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_differences_product_cubes_differences_mean_list(numbers):
    # Your code here
```

## 45.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_differences_sum_squares_differences_median_list(numbers):
    # Your code here
```

## 46.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_cubes_differences_sum_squares_differences_median_list(numbers):
    # Your code here
```

## 47.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_differences_product_squares_differences_median_list(numbers):
    # Your code here
```

## 48.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the squares of the differences between the numbers and the median of the numbers.

```
def sum_cub
