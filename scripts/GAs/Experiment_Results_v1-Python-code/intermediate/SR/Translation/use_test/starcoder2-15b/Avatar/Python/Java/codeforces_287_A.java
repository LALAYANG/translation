

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = new String[4];
        for (int i = 0; i < 4; i++) {
            t[i] = sc.nextLine();
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i].charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i].charAt(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1].charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1].charAt(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
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
def standard_deviation_of_numbers(numbers):
    return statistics.stdev(numbers)
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    return statistics.variance(numbers)
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
    return sum((x - statistics.mean(numbers)) ** 2 for x in numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_of_cubes_of_differences(numbers):
    return sum((x - statistics.mean(numbers)) ** 3 for x in numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_of_squares_of_differences_from_median(numbers):
    return sum((x - statistics.median(numbers)) ** 2 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    return sum((x - statistics.median(numbers)) ** 3 for x in numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_of_squares_of_differences_from_mode(numbers):
    return sum((x - statistics.mode(numbers)) ** 2 for x in numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_of_cubes_of_differences_from_mode(numbers):
    return sum((x - statistics.mode(numbers)) ** 3 for x in numbers)
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
def sum_of_squares_of_differences_from_standard_deviation(numbers):
    return sum((x - statistics.stdev(numbers)) ** 2 for x in numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_of_cubes_of_differences_from_standard_deviation(numbers):
    return sum((x - statistics.stdev(numbers)) ** 3 for x in numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_of_squares_of_differences_from_variance(numbers):
    return sum((x - statistics.variance(numbers)) ** 2 for x in numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_of_cubes_of_differences_from_variance(numbers):
    return sum((x - statistics.variance(numbers)) ** 3 for x in numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the numbers.

```
def sum_of_squares_of_differences_from_sum(numbers):
    return sum((x - sum(numbers)) ** 2 for x in numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the numbers.

```
def sum_of_cubes_of_differences_from_sum(numbers):
    return sum((x - sum(numbers)) ** 3 for x in numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the numbers.

```
def sum_of_squares_of_differences_from_product(numbers):
    return sum((x - math.prod(numbers)) ** 2 for x in numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the numbers.

```
def sum_of_cubes_of_differences_from_product(numbers):
    return sum((x - math.prod(numbers)) ** 3 for x in numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the geometric mean of the numbers.

```
def sum_of_squares_of_differences_from_geometric_mean(numbers):
    return sum((x - statistics.geometric_mean(numbers)) ** 2 for x in numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the geometric mean of the numbers.

```
def sum_of_cubes_of_differences_from_geometric_mean(numbers):
    return sum((x - statistics.geometric_mean(numbers)) ** 3 for x in numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the harmonic mean of the numbers.

```
def sum_of_squares_of_differences_from_harmonic_mean(numbers):
    return sum((x - statistics.harmonic_mean(numbers)) ** 2 for x in numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the harmonic mean of the numbers.

```
def sum_of_cubes_of_differences_from_harmonic_mean(numbers):
    return sum((x - statistics.harmonic_mean(numbers)) ** 3 for x in numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the root mean square of the numbers.

```
def sum_of_squares_of_differences_from_root_mean_square(numbers):
    return sum((x - statistics.mean(numbers) ** 0.5) ** 2 for x in numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the root mean square of the numbers.

```
def sum_of_cubes_of_differences_from_root_mean_square(numbers):
    return sum((x - statistics.mean(numbers) ** 0.5) ** 3 for x in numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the arithmetic mean of the numbers.

```
def sum_of_squares_of_differences_from_arithmetic_mean(numbers):
    return sum((x - statistics.mean(numbers)) ** 2 for x in numbers)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the arithmetic mean of the numbers.

```
def sum_of_cubes_of_differences_from_arithmetic_mean(numbers):
    return sum((x - statistics.mean(numbers)) ** 3 for x in numbers)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the quadratic mean of the numbers.

```
def sum_of_squares_of_differences_from_quadratic_mean(numbers):
    return sum((x - statistics.mean(numbers) ** 2) ** 2 for x in numbers)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the quadratic mean of the numbers.

```
def sum_of_cubes_of_differences_from_quadratic_mean(numbers):
    return sum((x - statistics.mean(numbers) ** 2) ** 3 for x in numbers)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the cubic mean of the numbers.

```
def sum_of_squares_of_differences_from_cubic_mean(numbers):
    return sum((x - statistics.mean(numbers) ** 3) ** 2 for x in numbers)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the cubic mean of the numbers.

```
def sum_of_cubes_of_differences_from_cubic_mean(numbers):
    return sum((x - statistics.mean(numbers) ** 3) ** 3 for x in numbers)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the fourth root of the numbers.

```
def sum_of_squares_of_differences_from_fourth_root(numbers):
    return sum((x - statistics.mean(numbers) ** 0.25) ** 2 for x in numbers)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the fourth root of the numbers.

```
def sum_of_cubes_of_differences_from_fourth_root(numbers):
    return sum((x - statistics.mean(numbers) ** 0.25) ** 3 for x in numbers)
```

## 43.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the fifth root of the numbers.

```
def sum_of_squares_
