

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unused_variable = scanner.nextInt();
        int r = scanner.nextInt();
        int total_set_size = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executor.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                return calculate_combinations(n, k, sk, total_set_size, Func_get_nums_0);
            }
        });
        List<Integer> combinations_result = future.get();
        executor.shutdown();
        List<Integer> ans = combinations_result;
        System.out.println(ans.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    public static List<Integer> calculate_combinations(int n, int k, int sk, int total_set_size, Func_get_nums_0 Func_get_nums_0) {
        return sum_lists(Func_get_nums_0.get_nums_0(k, sk), Func_get_nums_0.get_nums_0(n - k, total_set_size - sk));
    }

    public static List<Integer> sum_lists(List<Integer> arg0, List<Integer> arg1) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arg0.size(); i++) {
            result.add(arg0.get(i) + arg1.get(i));
        }
        return result;
    }

    public static class Func_get_nums_0 {
        public static List<Integer> get_nums_0(int num, int t) {
            return IntStream.range(0, num).map(i -> t / num + (i < t % num ? 1 : 0)).boxed().collect(Collectors.toList());
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse_list(arg0):
    return arg0[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(arg0):
    return sum(arg0)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(arg0):
    return max(arg0)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(arg0):
    return min(arg0)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(arg0):
    return sum(arg0) / len(arg0)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(arg0):
    arg0.sort()
    return arg0[len(arg0) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std_list(arg0):
    return statistics.stdev(arg0)
```

## 9.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(arg0):
    return statistics.mode(arg0)
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(arg0):
    return max(arg0) - min(arg0)
```

## 11.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(arg0):
    return statistics.variance(arg0)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_squares_list(arg0):
    return sum(map(lambda x: x ** 2, arg0))
```

## 13.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_cubes_list(arg0):
    return sum(map(lambda x: x ** 3, arg0))
```

## 14.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_diff_list(arg0):
    return sum(map(lambda x: (x - statistics.mean(arg0)) ** 2, arg0))
```

## 15.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_diff_list(arg0):
    return sum(map(lambda x: (x - statistics.mean(arg0)) ** 3, arg0))
```

## 16.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_diff_median_list(arg0):
    return sum(map(lambda x: (x - statistics.median(arg0)) ** 2, arg0))
```

## 17.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_cubes_diff_median_list(arg0):
    return sum(map(lambda x: (x - statistics.median(arg0)) ** 3, arg0))
```

## 18.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_squares_diff_mode_list(arg0):
    return sum(map(lambda x: (x - statistics.mode(arg0)) ** 2, arg0))
```

## 19.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_cubes_diff_mode_list(arg0):
    return sum(map(lambda x: (x - statistics.mode(arg0)) ** 3, arg0))
```

## 20.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_squares_diff_range_list(arg0):
    return sum(map(lambda x: (x - (max(arg0) - min(arg0))) ** 2, arg0))
```

## 21.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_cubes_diff_range_list(arg0):
    return sum(map(lambda x: (x - (max(arg0) - min(arg0))) ** 3, arg0))
```

## 22.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_squares_diff_variance_list(arg0):
    return sum(map(lambda x: (x - statistics.variance(arg0)) ** 2, arg0))
```

## 23.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_cubes_diff_variance_list(arg0):
    return sum(map(lambda x: (x - statistics.variance(arg0)) ** 3, arg0))
```

## 24.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_squares_diff_std_list(arg0):
    return sum(map(lambda x: (x - statistics.stdev(arg0)) ** 2, arg0))
```

## 25.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_cubes_diff_std_list(arg0):
    return sum(map(lambda x: (x - statistics.stdev(arg0)) ** 3, arg0))
```

## 26.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_diff_list(arg0):
    return sum(map(lambda x: (x - statistics.mean(arg0)) ** 2, arg0))
```

## 27.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mean of the numbers.

```
def sum_cubes_diff_list(arg0):
    return sum(map(lambda x: (x - statistics.mean(arg0)) ** 3, arg0))
```

## 28.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the numbers.

```
def sum_squares_diff_median_list(arg0):
    return sum(map(lambda x: (x - statistics.median(arg0)) ** 2, arg0))
```

## 29.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_cubes_diff_median_list(arg0):
    return sum(map(lambda x: (x - statistics.median(arg0)) ** 3, arg0))
```

## 30.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the numbers.

```
def sum_squares_diff_mode_list(arg0):
    return sum(map(lambda x: (x - statistics.mode(arg0)) ** 2, arg0))
```

## 31.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the numbers.

```
def sum_cubes_diff_mode_list(arg0):
    return sum(map(lambda x: (x - statistics.mode(arg0)) ** 3, arg0))
```

## 32.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the range of the numbers.

```
def sum_squares_diff_range_list(arg0):
    return sum(map(lambda x: (x - (max(arg0) - min(arg0))) ** 2, arg0))
```

## 33.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the range of the numbers.

```
def sum_cubes_diff_range_list(arg0):
    return sum(map(lambda x: (x - (max(arg0) - min(arg0))) ** 3, arg0))
```

## 34.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the variance of the numbers.

```
def sum_squares_diff_variance_list(arg0):
    return sum(map(lambda x: (x - statistics.variance(arg0)) ** 2, arg0))
```

## 35.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the variance of the numbers.

```
def sum_cubes_diff_variance_list(arg0):
    return sum(map(lambda x: (x - statistics.variance(arg0)) ** 3, arg0))
```

## 36.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the standard deviation of the numbers.

```
def sum_squares_diff_std_list(arg0):
    return sum(map(lambda x: (x - statistics.stdev(arg0)) ** 2, arg0))
```

## 37.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the standard deviation of the numbers.

```
def sum_cubes_diff_std_list(arg0):
    return sum(map(lambda x: (x - statistics.stdev(arg0)) ** 3, arg0))
```

## 38.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mean of the numbers.

```
def sum_squares_diff_list(arg0):
    return sum(map(lambda x: (x - statistics.mean(arg0)) ** 2, arg0))
```

## 39.

