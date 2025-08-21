

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        if (length % arr[0] == 0) {
            ans = length / arr[0];
        } else {
            if (arr[0] == arr[1]) {
                for (int i = 0; i < length / arr[2] + 1; i++) {
                    int check = length - i * arr[2];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i);
                    }
                }
            } else {
                for (int i = 0; i < length / arr[2] + 1; i++) {
                    for (int j = 0; j < length / arr[1] + 1; j++) {
                        int check = length - i * arr[2] - j * arr[1];
                        if (check >= 0 && check % arr[0] == 0) {
                            int k = check / arr[0];
                            ans = Math.max(ans, k + i + j);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
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
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        median = numbers[len(numbers) // 2]
    return sum((x - median) ** 2 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the numbers.

```
def sum_of_cubes_of_differences_from_median(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
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
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] ** 2 + numbers[len(numbers) // 2 - 1] ** 2) / 2
    else:
        median = numbers[len(numbers) // 2] ** 2
    return sum((x - median) ** 2 for x in numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_median_of_squares(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] ** 2 + numbers[len(numbers) // 2 - 1] ** 2) / 2
    else:
        median = numbers[len(numbers) // 2] ** 2
    return sum((x - median) ** 3 for x in numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the median of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_median_of_cubes(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] ** 3 + numbers[len(numbers) // 2 - 1] ** 3) / 2
    else:
        median = numbers[len(numbers) // 2] ** 3
    return sum((x - median) ** 2 for x in numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the median of the cubes of the numbers.

```
def sum_of_cubes_of_differences_from_median_of_cubes(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        median = (numbers[len(numbers) // 2] ** 3 + numbers[len(numbers) // 2 - 1] ** 3) / 2
    else:
        median = numbers[len(numbers) // 2] ** 3
    return sum((x - median) ** 3 for x in numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the squares of the numbers.

```
def sum_of_squares_of_differences_from_mode_of_squares(numbers):
    mode = max(set(numbers), key=numbers.count)
    return sum((x - mode ** 2) ** 2 for x in numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the cubes of the differences between the numbers and the mode of the squares of the numbers.

```
def sum_of_cubes_of_differences_from_mode_of_squares(numbers):
    mode = max(set(numbers), key=numbers.count)
    return sum((x - mode ** 2) ** 3 for x in numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the squares of the differences between the numbers and the mode of the cubes of the numbers.

```
def sum_of_squares_of_differences_from_mode_of_cubes(numbers):
    mode = max(set(numbers),
