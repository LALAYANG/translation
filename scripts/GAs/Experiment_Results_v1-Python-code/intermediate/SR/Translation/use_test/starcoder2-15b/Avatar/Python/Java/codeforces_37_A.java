

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse_list(l):
    return l[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(l):
    return sum(l)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(l):
    return max(l)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(l):
    return min(l)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(l):
    return sum(l) / len(l)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        return (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        return l[len(l) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(l):
    return max(set(l), key=l.count)
```

## 9.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(l):
    return max(l) - min(l)
```

## 10.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std_list(l):
    return statistics.stdev(l)
```

## 11.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def var_list(l):
    return statistics.variance(l)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_squares_list(l):
    return sum(x ** 2 for x in l)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_cubes_list(l):
    return sum(x ** 3 for x in l)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_diff_list(l):
    return sum((x - sum(l) / len(l)) ** 2 for x in l)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_diff_list(l):
    return sum((x - sum(l) / len(l)) ** 3 for x in l)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_diff_median_list(l):
    return sum((x - median_list(l)) ** 2 for x in l)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_cubes_diff_median_list(l):
    return sum((x - median_list(l)) ** 3 for x in l)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_squares_diff_mode_list(l):
    return sum((x - mode_list(l)) ** 2 for x in l)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_cubes_diff_mode_list(l):
    return sum((x - mode_list(l)) ** 3 for x in l)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_squares_diff_range_list(l):
    return sum((x - range_list(l)) ** 2 for x in l)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_cubes_diff_range_list(l):
    return sum((x - range_list(l)) ** 3 for x in l)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_squares_diff_std_list(l):
    return sum((x - std_list(l)) ** 2 for x in l)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_cubes_diff_std_list(l):
    return sum((x - std_list(l)) ** 3 for x in l)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_squares_diff_var_list(l):
    return sum((x - var_list(l)) ** 2 for x in l)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_cubes_diff_var_list(l):
    return sum((x - var_list(l)) ** 3 for x in l)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sum of the numbers.

```
def sum_squares_diff_sum_list(l):
    return sum((x - sum(l)) ** 2 for x in l)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sum of the numbers.

```
def sum_cubes_diff_sum_list(l):
    return sum((x - sum(l)) ** 3 for x in l)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the product of the numbers.

```
def sum_squares_diff_prod_list(l):
    return sum((x - math.prod(l)) ** 2 for x in l)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the product of the numbers.

```
def sum_cubes_diff_prod_list(l):
    return sum((x - math.prod(l)) ** 3 for x in l)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the geometric mean of the numbers.

```
def sum_squares_diff_geom_list(l):
    return sum((x - statistics.geometric_mean(l)) ** 2 for x in l)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the geometric mean of the numbers.

```
def sum_cubes_diff_geom_list(l):
    return sum((x - statistics.geometric_mean(l)) ** 3 for x in l)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the harmonic mean of the numbers.

```
def sum_squares_diff_harm_list(l):
    return sum((x - statistics.harmonic_mean(l)) ** 2 for x in l)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the harmonic mean of the numbers.

```
def sum_cubes_diff_harm_list(l):
    return sum((x - statistics.harmonic_mean(l)) ** 3 for x in l)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the root mean square of the numbers.

```
def sum_squares_diff_rms_list(l):
    return sum((x - statistics.mean_squared_error(l)) ** 2 for x in l)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the root mean square of the numbers.

```
def sum_cubes_diff_rms_list(l):
    return sum((x - statistics.mean_squared_error(l)) ** 3 for x in l)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the arithmetic mean of the numbers.

```
def sum_squares_diff_arith_list(l):
    return sum((x - statistics.mean(l)) ** 2 for x in l)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the arithmetic mean of the numbers.

```
def sum_cubes_diff_arith_list(l):
    return sum((x - statistics.mean(l)) ** 3 for x in l)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the quadratic mean of the numbers.

```
def sum_squares_diff_quad_list(l):
    return sum((x - statistics.mean(l) ** 2) ** 2 for x in l)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the quadratic mean of the numbers.

```
def sum_cubes_diff_quad_list(l):
    return sum((x - statistics.mean(l) ** 2) ** 3 for x in l)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the cubic mean of the numbers.

```
def sum_squares_diff_cubic_list(l):
    return sum((x - statistics.mean(l) ** 3) ** 2 for x in l)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the cubic mean of the numbers.

```
def sum_cubes_diff_cubic_list(l):
    return sum((x - statistics.mean(l) ** 3) ** 3 for x in l)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the quartic mean of the numbers.

```
def sum_squares_diff_quart_list(l):
    return sum((x - statistics.mean(l) ** 4) ** 2 for x in l)
```

## 43.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the quartic mean of the numbers.

```
def sum_cubes_diff_quart_list(l):
    return sum((x - statistics.mean(l) ** 4) ** 3 for x in l)
```

## 44.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the quintic mean of the numbers.

```
def sum_squares_diff_quint_list(l):
    return sum((x - statistics.mean(l) ** 5) ** 2 for x in l)
```

## 45.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the quintic mean of the numbers.

```
def sum_cubes_diff_quint_list(l):
    return sum((x - statistics.mean(l) ** 5) ** 3 for x in l)
```

## 46.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the sextic mean of the numbers.

```
def sum_squares_diff_sext_list(l):
    return sum((x - statistics.mean(l) ** 6) ** 2 for x in l)
```

## 47.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the sextic mean of the numbers.

```
def sum_cubes_diff_sext_list(l):
    return sum((x - statistics.mean(l) ** 6) ** 3 for x in l)
```

## 48.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the septic mean of the numbers.

```
def sum_squares_diff_sept_list(l):
    return sum((x - statistics.mean(l) ** 7) ** 2 for x in l)
```

## 49.

Write a function that takes a list of numbers and returns the sum of the
