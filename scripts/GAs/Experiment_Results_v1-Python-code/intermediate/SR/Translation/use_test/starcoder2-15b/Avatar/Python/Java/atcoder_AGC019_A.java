

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int best1L = Math.min(Math.min(q * 4, h * 2), s);
        int best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your solution should be recursive.

```
def sum_list(nums):
    if len(nums) == 0:
        return 0
    return nums[0] + sum_list(nums[1:])
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list. Your solution should be recursive.

```
def max_list(nums):
    if len(nums) == 1:
        return nums[0]
    return max(nums[0], max_list(nums[1:]))
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list. Your solution should be recursive.

```
def min_list(nums):
    if len(nums) == 1:
        return nums[0]
    return min(nums[0], min_list(nums[1:]))
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers. Your solution should be recursive.

```
def average_list(nums):
    if len(nums) == 0:
        return 0
    return sum(nums) / len(nums)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers. Your solution should be recursive.

```
def median_list(nums):
    nums.sort()
    if len(nums) % 2 == 0:
        return (nums[len(nums) // 2 - 1] + nums[len(nums) // 2]) / 2
    return nums[len(nums) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the standard deviation of the numbers. Your solution should be recursive.

```
def std_list(nums):
    mean = sum(nums) / len(nums)
    return sqrt(sum([(x - mean) ** 2 for x in nums]) / len(nums))
```

## 8.

Write a function that takes a list of numbers and returns the mode of the numbers. Your solution should be recursive.

```
def mode_list(nums):
    counts = Counter(nums)
    return max(counts, key=counts.get)
```

## 9.

Write a function that takes a list of numbers and returns the range of the numbers. Your solution should be recursive.

```
def range_list(nums):
    return max(nums) - min(nums)
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers. Your solution should be recursive.

```
def variance_list(nums):
    mean = sum(nums) / len(nums)
    return sum([(x - mean) ** 2 for x in nums]) / len(nums)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers. Your solution should be recursive.

```
def sum_squares_list(nums):
    if len(nums) == 0:
        return 0
    return nums[0] ** 2 + sum_squares_list(nums[1:])
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers. Your solution should be recursive.

```
def sum_cubes_list(nums):
    if len(nums) == 0:
        return 0
    return nums[0] ** 3 + sum_cubes_list(nums[1:])
```

## 13.

Write a function that takes a list of numbers and returns the sum of the squares of the even numbers. Your solution should be recursive.

```
def sum_squares_even_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 2 == 0:
        return nums[0] ** 2 + sum_squares_even_list(nums[1:])
    return sum_squares_even_list(nums[1:])
```

## 14.

Write a function that takes a list of numbers and returns the sum of the squares of the odd numbers. Your solution should be recursive.

```
def sum_squares_odd_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 2 == 1:
        return nums[0] ** 2 + sum_squares_odd_list(nums[1:])
    return sum_squares_odd_list(nums[1:])
```

## 15.

Write a function that takes a list of numbers and returns the sum of the cubes of the even numbers. Your solution should be recursive.

```
def sum_cubes_even_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 2 == 0:
        return nums[0] ** 3 + sum_cubes_even_list(nums[1:])
    return sum_cubes_even_list(nums[1:])
```

## 16.

Write a function that takes a list of numbers and returns the sum of the cubes of the odd numbers. Your solution should be recursive.

```
def sum_cubes_odd_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 2 == 1:
        return nums[0] ** 3 + sum_cubes_odd_list(nums[1:])
    return sum_cubes_odd_list(nums[1:])
```

## 17.

Write a function that takes a list of numbers and returns the sum of the squares of the prime numbers. Your solution should be recursive.

```
def sum_squares_prime_list(nums):
    if len(nums) == 0:
        return 0
    if is_prime(nums[0]):
        return nums[0] ** 2 + sum_squares_prime_list(nums[1:])
    return sum_squares_prime_list(nums[1:])
```

## 18.

Write a function that takes a list of numbers and returns the sum of the squares of the composite numbers. Your solution should be recursive.

```
def sum_squares_composite_list(nums):
    if len(nums) == 0:
        return 0
    if not is_prime(nums[0]):
        return nums[0] ** 2 + sum_squares_composite_list(nums[1:])
    return sum_squares_composite_list(nums[1:])
```

## 19.

Write a function that takes a list of numbers and returns the sum of the cubes of the prime numbers. Your solution should be recursive.

```
def sum_cubes_prime_list(nums):
    if len(nums) == 0:
        return 0
    if is_prime(nums[0]):
        return nums[0] ** 3 + sum_cubes_prime_list(nums[1:])
    return sum_cubes_prime_list(nums[1:])
```

## 20.

Write a function that takes a list of numbers and returns the sum of the cubes of the composite numbers. Your solution should be recursive.

```
def sum_cubes_composite_list(nums):
    if len(nums) == 0:
        return 0
    if not is_prime(nums[0]):
        return nums[0] ** 3 + sum_cubes_composite_list(nums[1:])
    return sum_cubes_composite_list(nums[1:])
```

## 21.

Write a function that takes a list of numbers and returns the sum of the squares of the even prime numbers. Your solution should be recursive.

```
def sum_squares_even_prime_list(nums):
    if len(nums) == 0:
        return 0
    if is_prime(nums[0]) and nums[0] % 2 == 0:
        return nums[0] ** 2 + sum_squares_even_prime_list(nums[1:])
    return sum_squares_even_prime_list(nums[1:])
```

## 22.

Write a function that takes a list of numbers and returns the sum of the squares of the odd composite numbers. Your solution should be recursive.

```
def sum_squares_odd_composite_list(nums):
    if len(nums) == 0:
        return 0
    if not is_prime(nums[0]) and nums[0] % 2 == 1:
        return nums[0] ** 2 + sum_squares_odd_composite_list(nums[1:])
    return sum_squares_odd_composite_list(nums[1:])
```

## 23.

Write a function that takes a list of numbers and returns the sum of the cubes of the even prime numbers. Your solution should be recursive.

```
def sum_cubes_even_prime_list(nums):
    if len(nums) == 0:
        return 0
    if is_prime(nums[0]) and nums[0] % 2 == 0:
        return nums[0] ** 3 + sum_cubes_even_prime_list(nums[1:])
    return sum_cubes_even_prime_list(nums[1:])
```

## 24.

Write a function that takes a list of numbers and returns the sum of the cubes of the odd composite numbers. Your solution should be recursive.

```
def sum_cubes_odd_composite_list(nums):
    if len(nums) == 0:
        return 0
    if not is_prime(nums[0]) and nums[0] % 2 == 1:
        return nums[0] ** 3 + sum_cubes_odd_composite_list(nums[1:])
    return sum_cubes_odd_composite_list(nums[1:])
```

## 25.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers that are divisible by 3. Your solution should be recursive.

```
def sum_squares_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 3 == 0:
        return nums[0] ** 2 + sum_squares_divisible_by_3_list(nums[1:])
    return sum_squares_divisible_by_3_list(nums[1:])
```

## 26.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers that are not divisible by 3. Your solution should be recursive.

```
def sum_squares_not_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 3 != 0:
        return nums[0] ** 2 + sum_squares_not_divisible_by_3_list(nums[1:])
    return sum_squares_not_divisible_by_3_list(nums[1:])
```

## 27.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers that are divisible by 3. Your solution should be recursive.

```
def sum_cubes_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 3 == 0:
        return nums[0] ** 3 + sum_cubes_divisible_by_3_list(nums[1:])
    return sum_cubes_divisible_by_3_list(nums[1:])
```

## 28.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers that are not divisible by 3. Your solution should be recursive.

```
def sum_cubes_not_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 3 != 0:
        return nums[0] ** 3 + sum_cubes_not_divisible_by_3_list(nums[1:])
    return sum_cubes_not_divisible_by_3_list(nums[1:])
```

## 29.

Write a function that takes a list of numbers and returns the sum of the squares of the even numbers that are divisible by 3. Your solution should be recursive.

```
def sum_squares_even_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0] % 2 == 0 and nums[0] % 3 == 0:
        return nums[0] ** 2 + sum_squares_even_divisible_by_3_list(nums[1:])
    return sum_squares_even_divisible_by_3_list(nums[1:])
```

## 30.

Write a function that takes a list of numbers and returns the sum of the squares of the odd numbers that are not divisible by 3. Your solution should be recursive.

```
def sum_squares_odd_not_divisible_by_3_list(nums):
    if len(nums) == 0:
        return 0
    if nums[0
