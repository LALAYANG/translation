

```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() -> {
            return increment(high, 1);
        });
        try {
            high = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
        process_list(1, n, 1, l, high, tower, maximum);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static void process_list(int i, int stop, int step, int[] l, int high, int tower, int maximum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int decrement_amount = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> future = executor.submit(() -> {
                return decrement(tower, decrement_amount);
            });
            try {
                tower = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
            int increment_amount = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> future = executor.submit(() -> {
                return increment(high, increment_amount);
            });
            try {
                high = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        process_list(i + step, stop, step, l, high, tower, maximum);
    }

    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(l):
    return sum(l)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(l):
    return max(l)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(l):
    return min(l)
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(l):
    return sum(l) / len(l)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        return (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        return l[len(l) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(l):
    return max(set(l), key=l.count)
```

## 8.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(l):
    return max(l) - min(l)
```

## 9.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math
def standard_deviation_list(l):
    mean = sum(l) / len(l)
    return math.sqrt(sum((x - mean) ** 2 for x in l) / len(l))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(l):
    mean = sum(l) / len(l)
    return sum((x - mean) ** 2 for x in l) / len(l)
```

## 11.

Write a function that takes a list of numbers and returns the number of even numbers in the list.

```
def count_even_list(l):
    return len([x for x in l if x % 2 == 0])
```

## 12.

Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```
def count_odd_list(l):
    return len([x for x in l if x % 2 == 1])
```

## 13.

Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```
def count_positive_list(l):
    return len([x for x in l if x > 0])
```

## 14.

Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```
def count_negative_list(l):
    return len([x for x in l if x < 0])
```

## 15.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the average of the numbers.

```
def count_greater_than_average_list(l):
    return len([x for x in l if x > sum(l) / len(l)])
```

## 16.

Write a function that takes a list of numbers and returns the number of numbers that are less than the average of the numbers.

```
def count_less_than_average_list(l):
    return len([x for x in l if x < sum(l) / len(l)])
```

## 17.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the median of the numbers.

```
def count_greater_than_median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        median = (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        median = l[len(l) // 2]
    return len([x for x in l if x > median])
```

## 18.

Write a function that takes a list of numbers and returns the number of numbers that are less than the median of the numbers.

```
def count_less_than_median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        median = (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        median = l[len(l) // 2]
    return len([x for x in l if x < median])
```

## 19.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the mode of the numbers.

```
def count_greater_than_mode_list(l):
    mode = max(set(l), key=l.count)
    return len([x for x in l if x > mode])
```

## 20.

Write a function that takes a list of numbers and returns the number of numbers that are less than the mode of the numbers.

```
def count_less_than_mode_list(l):
    mode = max(set(l), key=l.count)
    return len([x for x in l if x < mode])
```

## 21.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the range of the numbers.

```
def count_greater_than_range_list(l):
    return len([x for x in l if x > max(l) - min(l)])
```

## 22.

Write a function that takes a list of numbers and returns the number of numbers that are less than the range of the numbers.

```
def count_less_than_range_list(l):
    return len([x for x in l if x < max(l) - min(l)])
```

## 23.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the standard deviation of the numbers.

```
import math
def count_greater_than_standard_deviation_list(l):
    mean = sum(l) / len(l)
    return len([x for x in l if x > math.sqrt(sum((x - mean) ** 2 for x in l) / len(l))])
```

## 24.

Write a function that takes a list of numbers and returns the number of numbers that are less than the standard deviation of the numbers.

```
import math
def count_less_than_standard_deviation_list(l):
    mean = sum(l) / len(l)
    return len([x for x in l if x < math.sqrt(sum((x - mean) ** 2 for x in l) / len(l))])
```

## 25.

Write a function that takes a list of numbers and returns the number of numbers that are greater than the variance of the numbers.

```
def count_greater_than_variance_list(l):
    mean = sum(l) / len(l)
    return len([x for x in l if x > sum((x - mean) ** 2 for x in l) / len(l)])
```

## 26.

Write a function that takes a list of numbers and returns the number of numbers that are less than the variance of the numbers.

```
def count_less_than_variance_list(l):
    mean = sum(l) / len(l)
    return len([x for x in l if x < sum((x - mean) ** 2 for x in l) / len(l)])
```

## 27.

Write a function that takes a list of numbers and returns the number of even numbers that are greater than the average of the numbers.

```
def count_even_greater_than_average_list(l):
    return len([x for x in l if x % 2 == 0 and x > sum(l) / len(l)])
```

## 28.

Write a function that takes a list of numbers and returns the number of even numbers that are less than the average of the numbers.

```
def count_even_less_than_average_list(l):
    return len([x for x in l if x % 2 == 0 and x < sum(l) / len(l)])
```

## 29.

Write a function that takes a list of numbers and returns the number of even numbers that are greater than the median of the numbers.

```
def count_even_greater_than_median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        median = (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        median = l[len(l) // 2]
    return len([x for x in l if x % 2 == 0 and x > median])
```

## 30.

Write a function that takes a list of numbers and returns the number of even numbers that are less than the median of the numbers.

```
def count_even_less_than_median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        median = (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        median = l[len(l) // 2]
    return len([x for x in l if x % 2 == 0 and x < median])
```

## 31.

Write a function that takes a list of numbers and returns the number of even numbers that are greater than the mode of the numbers.

```
def count_even_greater_than_mode_list(l):
    mode = max(set(l), key=l.count)
    return len([x for x in l if x % 2 == 0 and x > mode])
```

## 32.

Write a function that takes a list of numbers and returns the number of even numbers that are less than the mode of the numbers.

```
def count_even_less_than_mode_list(l):
    mode = max(set(l), key=l.count)
    return len([x for x in l if x % 2 == 0 and x < mode])
```

## 33.

Write a function that takes a list of numbers and returns the number of even numbers that are greater than the range of the numbers.

```
def count_even_greater_than_range_list(l):
    return len([x for x in l if x % 2 == 0 and x > max(l) - min(l)])
```

## 34.

Write a function that takes a list of numbers and returns the number of even numbers that are less than the range of the numbers.

```
def count_even_less_than_range_list(l):
    return len([x for x in l if x % 2 == 0 and x < max(l) - min(l)])
```

## 35.

Write a function that takes a list of numbers and returns the number of even numbers that are greater than the standard deviation of the numbers.

```
import math
def count_even_greater_than_standard_deviation_list(l):
    mean = sum(l) / len(l)
    return len([x for x in l if x % 2 == 0 and x > math.sqrt(sum((x - mean) ** 2 for x in l) / len(l))])
```

## 36.

Write a function that takes a list of numbers and returns the number of even numbers that are less than the standard deviation of the numbers.

```
import math
def count_even_less_than_standard_dev
