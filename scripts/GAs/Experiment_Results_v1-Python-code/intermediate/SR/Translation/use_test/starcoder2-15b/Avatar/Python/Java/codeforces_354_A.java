

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int right_query_cost = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum_el[i] = weights[i - 1] + sum_el[i - 1];
        }
        int answer = right_query_cost * (n - 1) + sum_el[n] * R;
        for (int i = 1; i <= n; i++) {
            int energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
            if (i > n - i) {
                energy = energy + (i - (n - i) - 1) * QL;
            } else if (n - i > i) {
                energy = energy + (n - i - i - 1) * right_query_cost;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
```

## 2.2.2.2. 
Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(numbers):
    if len(numbers) == 0:
        return 0
    return numbers[0] + sum_list(numbers[1:])
```

## 2.2.2.3. 
Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(numbers):
    if len(numbers) == 0:
        return 0
    if len(numbers) == 1:
        return numbers[0]
    return max(numbers[0], max_list(numbers[1:]))
```

## 2.2.2.4. 
Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(numbers):
    if len(numbers) == 0:
        return 0
    if len(numbers) == 1:
        return numbers[0]
    return min(numbers[0], min_list(numbers[1:]))
```

## 2.2.2.5. 
Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(numbers):
    if len(numbers) == 0:
        return 0
    return sum(numbers) / len(numbers)
```

## 2.2.2.6. 
Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(numbers):
    if len(numbers) == 0:
        return 0
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    return numbers[len(numbers) // 2]
```

## 2.2.2.7. 
Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(numbers):
    if len(numbers) == 0:
        return 0
    mode = 0
    max_count = 0
    for i in range(len(numbers)):
        count = 0
        for j in range(len(numbers)):
            if numbers[i] == numbers[j]:
                count += 1
        if count > max_count:
            max_count = count
            mode = numbers[i]
    return mode
```

## 2.2.2.8. 
Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(numbers):
    if len(numbers) == 0:
        return 0
    mean = sum(numbers) / len(numbers)
    variance = sum([(x - mean) ** 2 for x in numbers]) / len(numbers)
    return variance ** 0.5
```

## 2.2.2.9. 
Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(numbers):
    if len(numbers) == 0:
        return 0
    mean = sum(numbers) / len(numbers)
    variance = sum([(x - mean) ** 2 for x in numbers]) / len(numbers)
    return variance
```

## 2.2.2.10. 
Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(numbers):
    if len(numbers) == 0:
        return 0
    return max(numbers) - min(numbers)
```

## 2.2.2.11. 
Write a function that takes a list of numbers and returns the number of even numbers in the list.

```
def count_even_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 2 == 0:
        return 1 + count_even_list(numbers[1:])
    return count_even_list(numbers[1:])
```

## 2.2.2.12. 
Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```
def count_odd_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 2 == 1:
        return 1 + count_odd_list(numbers[1:])
    return count_odd_list(numbers[1:])
```

## 2.2.2.13. 
Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```
def count_positive_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] > 0:
        return 1 + count_positive_list(numbers[1:])
    return count_positive_list(numbers[1:])
```

## 2.2.2.14. 
Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```
def count_negative_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] < 0:
        return 1 + count_negative_list(numbers[1:])
    return count_negative_list(numbers[1:])
```

## 2.2.2.15. 
Write a function that takes a list of numbers and returns the number of zeroes in the list.

```
def count_zero_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] == 0:
        return 1 + count_zero_list(numbers[1:])
    return count_zero_list(numbers[1:])
```

## 2.2.2.16. 
Write a function that takes a list of numbers and returns the number of prime numbers in the list.

```
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def count_prime_list(numbers):
    if len(numbers) == 0:
        return 0
    if is_prime(numbers[0]):
        return 1 + count_prime_list(numbers[1:])
    return count_prime_list(numbers[1:])
```

## 2.2.2.17. 
Write a function that takes a list of numbers and returns the number of composite numbers in the list.

```
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def count_composite_list(numbers):
    if len(numbers) == 0:
        return 0
    if not is_prime(numbers[0]):
        return 1 + count_composite_list(numbers[1:])
    return count_composite_list(numbers[1:])
```

## 2.2.2.18. 
Write a function that takes a list of numbers and returns the number of perfect numbers in the list.

```
def is_perfect(n):
    sum_divisors = 0
    for i in range(1, n):
        if n % i == 0:
            sum_divisors += i
    return sum_divisors == n

def count_perfect_list(numbers):
    if len(numbers) == 0:
        return 0
    if is_perfect(numbers[0]):
        return 1 + count_perfect_list(numbers[1:])
    return count_perfect_list(numbers[1:])
```

## 2.2.2.19. 
Write a function that takes a list of numbers and returns the number of abundant numbers in the list.

```
def is_abundant(n):
    sum_divisors = 0
    for i in range(1, n):
        if n % i == 0:
            sum_divisors += i
    return sum_divisors > n

def count_abundant_list(numbers):
    if len(numbers) == 0:
        return 0
    if is_abundant(numbers[0]):
        return 1 + count_abundant_list(numbers[1:])
    return count_abundant_list(numbers[1:])
```

## 2.2.2.20. 
Write a function that takes a list of numbers and returns the number of deficient numbers in the list.

```
def is_deficient(n):
    sum_divisors = 0
    for i in range(1, n):
        if n % i == 0:
            sum_divisors += i
    return sum_divisors < n

def count_deficient_list(numbers):
    if len(numbers) == 0:
        return 0
    if is_deficient(numbers[0]):
        return 1 + count_deficient_list(numbers[1:])
    return count_deficient_list(numbers[1:])
```

## 2.2.2.21. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 2 in the list.

```
def count_divisible_by_2_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 2 == 0:
        return 1 + count_divisible_by_2_list(numbers[1:])
    return count_divisible_by_2_list(numbers[1:])
```

## 2.2.2.22. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 3 in the list.

```
def count_divisible_by_3_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 3 == 0:
        return 1 + count_divisible_by_3_list(numbers[1:])
    return count_divisible_by_3_list(numbers[1:])
```

## 2.2.2.23. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 4 in the list.

```
def count_divisible_by_4_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 4 == 0:
        return 1 + count_divisible_by_4_list(numbers[1:])
    return count_divisible_by_4_list(numbers[1:])
```

## 2.2.2.24. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 5 in the list.

```
def count_divisible_by_5_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 5 == 0:
        return 1 + count_divisible_by_5_list(numbers[1:])
    return count_divisible_by_5_list(numbers[1:])
```

## 2.2.2.25. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 6 in the list.

```
def count_divisible_by_6_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 6 == 0:
        return 1 + count_divisible_by_6_list(numbers[1:])
    return count_divisible_by_6_list(numbers[1:])
```

## 2.2.2.26. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 7 in the list.

```
def count_divisible_by_7_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 7 == 0:
        return 1 + count_divisible_by_7_list(numbers[1:])
    return count_divisible_by_7_list(numbers[1:])
```

## 2.2.2.27. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 8 in the list.

```
def count_divisible_by_8_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 8 == 0:
        return 1 + count_divisible_by_8_list(numbers[1:])
    return count_divisible_by_8_list(numbers[1:])
```

## 2.2.2.28. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 9 in the list.

```
def count_divisible_by_9_list(numbers):
    if len(numbers) == 0:
        return 0
    if numbers[0] % 9 == 0:
        return 1 + count_divisible_by_9_list(numbers[1:])
    return count_divisible_by_9_list(numbers[1:])
```

## 2.2.2.29. 
Write a function that takes a list of numbers and returns the number of numbers that are divisible by 10 in the list.

```
def count_divisible_by_10_list(numbers):
    if len(numbers) == 0:
        return 0
    if
