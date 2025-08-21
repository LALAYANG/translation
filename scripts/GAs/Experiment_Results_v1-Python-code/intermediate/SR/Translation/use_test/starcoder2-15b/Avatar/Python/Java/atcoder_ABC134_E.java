

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][];
        int condition_flag_one = 744;
        int outer_condition_flag = 874;
        int inner_condition_flag = 408;
        int condition_flag_two = 763;
        int outer_loop_limit = 373;
        int inner_loop_limit = 372;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int insert_index = binary_search(ans, A);
                if (inner_condition_flag & condition_flag_two != 0) {
                    if (condition_flag_one & outer_condition_flag != 0) {
                        if (insert_index == ans.length) {
                            ans[insert_index] = new int[]{A};
                        } else {
                            ans[insert_index] = new int[]{A};
                        }
                    }
                }
            }
        }
        System.out.println(ans.length);
    }

    public static int binary_search(int[][] ans, int key) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middle_index = (bad + good) / 2;
            if (ans[middle_index][ans[middle_index].length - 1] < key) {
                good = middle_index;
            } else {
                bad = middle_index;
            }
        }
        return good;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    largest = numbers[0]
    for number in numbers:
        if number > largest:
            largest = number
    return largest
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    smallest = numbers[0]
    for number in numbers:
        if number < smallest:
            smallest = number
    return smallest
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum / len(numbers)
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
    count = {}
    for number in numbers:
        if number in count:
            count[number] += 1
        else:
            count[number] = 1
    max_count = 0
    mode = None
    for number, c in count.items():
        if c > max_count:
            max_count = c
            mode = number
    return mode
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
    sum_of_squares = 0
    for number in numbers:
        sum_of_squares += (number - mean) ** 2
    return math.sqrt(sum_of_squares / len(numbers))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    sum_of_squares = 0
    for number in numbers:
        sum_of_squares += (number - mean) ** 2
    return sum_of_squares / len(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mean_absolute_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    sum_of_absolute_deviations = 0
    for number in numbers:
        sum_of_absolute_deviations += abs(number - mean)
    return sum_of_absolute_deviations / len(numbers)
```

## 12.

Write a function that takes a list of numbers and returns the median absolute deviation of the numbers.

```
def median_absolute_deviation_of_numbers(numbers):
    median = median_of_numbers(numbers)
    sum_of_absolute_deviations = 0
    for number in numbers:
        sum_of_absolute_deviations += abs(number - median)
    return sum_of_absolute_deviations / len(numbers)
```

## 13.

Write a function that takes a list of numbers and returns the interquartile range of the numbers.

```
def interquartile_range_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        lower_half = numbers[:len(numbers) // 2]
        upper_half = numbers[len(numbers) // 2:]
    else:
        lower_half = numbers[:len(numbers) // 2]
        upper_half = numbers[len(numbers) // 2 + 1:]
    return median_of_numbers(upper_half) - median_of_numbers(lower_half)
```

## 14.

Write a function that takes a list of numbers and returns the coefficient of variation of the numbers.

```
def coefficient_of_variation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    sum_of_squares = 0
    for number in numbers:
        sum_of_squares += (number - mean) ** 2
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return standard_deviation / mean
```

## 15.

Write a function that takes a list of numbers and returns the skewness of the numbers.

```
def skewness_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    sum_of_cubes = 0
    for number in numbers:
        sum_of_cubes += (number - mean) ** 3
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return sum_of_cubes / (len(numbers) * standard_deviation ** 3)
```

## 16.

Write a function that takes a list of numbers and returns the kurtosis of the numbers.

```
def kurtosis_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    sum_of_fourth_powers = 0
    for number in numbers:
        sum_of_fourth_powers += (number - mean) ** 4
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return sum_of_fourth_powers / (len(numbers) * standard_deviation ** 4)
```

## 17.

Write a function that takes a list of numbers and returns the quartiles of the numbers.

```
def quartiles_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        lower_half = numbers[:len(numbers) // 2]
        upper_half = numbers[len(numbers) // 2:]
    else:
        lower_half = numbers[:len(numbers) // 2]
        upper_half = numbers[len(numbers) // 2 + 1:]
    return [median_of_numbers(lower_half), median_of_numbers(numbers), median_of_numbers(upper_half)]
```

## 18.

Write a function that takes a list of numbers and returns the percentiles of the numbers.

```
def percentiles_of_numbers(numbers):
    numbers.sort()
    percentiles = []
    for i in range(1, 100):
        index = (i / 100) * (len(numbers) - 1)
        if index % 1 == 0:
            percentiles.append(numbers[int(index)])
        else:
            percentiles.append((numbers[int(index)] + numbers[int(index) + 1]) / 2)
    return percentiles
```

## 19.

Write a function that takes a list of numbers and returns the z-scores of the numbers.

```
def z_scores_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [(number - mean) / standard_deviation for number in numbers]
```

## 20.

Write a function that takes a list of numbers and returns the standard scores of the numbers.

```
def standard_scores_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [(number - mean) / standard_deviation for number in numbers]
```

## 21.

Write a function that takes a list of numbers and returns the normalized scores of the numbers.

```
def normalized_scores_of_numbers(numbers):
    min_value = min(numbers)
    max_value = max(numbers)
    return [(number - min_value) / (max_value - min_value) for number in numbers]
```

## 22.

Write a function that takes a list of numbers and returns the cumulative distribution function of the numbers.

```
def cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    cumulative_distribution = []
    for number in numbers:
        cumulative_distribution.append(sum(n <= number for n in numbers) / len(numbers))
    return cumulative_distribution
```

## 23.

Write a function that takes a list of numbers and returns the empirical cumulative distribution function of the numbers.

```
def empirical_cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    empirical_cumulative_distribution = []
    for number in numbers:
        empirical_cumulative_distribution.append(sum(n < number for n in numbers) / len(numbers))
    return empirical_cumulative_distribution
```

## 24.

Write a function that takes a list of numbers and returns the probability density function of the numbers.

```
def probability_density_function_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [1 / (standard_deviation * math.sqrt(2 * math.pi)) * math.exp(-((number - mean) ** 2) / (2 * standard_deviation ** 2)) for number in numbers]
```

## 25.

Write a function that takes a list of numbers and returns the cumulative distribution function of the numbers.

```
def cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    cumulative_distribution = []
    for number in numbers:
        cumulative_distribution.append(sum(n <= number for n in numbers) / len(numbers))
    return cumulative_distribution
```

## 26.

Write a function that takes a list of numbers and returns the empirical cumulative distribution function of the numbers.

```
def empirical_cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    empirical_cumulative_distribution = []
    for number in numbers:
        empirical_cumulative_distribution.append(sum(n < number for n in numbers) / len(numbers))
    return empirical_cumulative_distribution
```

## 27.

Write a function that takes a list of numbers and returns the probability density function of the numbers.

```
def probability_density_function_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [1 / (standard_deviation * math.sqrt(2 * math.pi)) * math.exp(-((number - mean) ** 2) / (2 * standard_deviation ** 2)) for number in numbers]
```

## 28.

Write a function that takes a list of numbers and returns the cumulative distribution function of the numbers.

```
def cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    cumulative_distribution = []
    for number in numbers:
        cumulative_distribution.append(sum(n <= number for n in numbers) / len(numbers))
    return cumulative_distribution
```

## 29.

Write a function that takes a list of numbers and returns the empirical cumulative distribution function of the numbers.

```
def empirical_cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    empirical_cumulative_distribution = []
    for number in numbers:
        empirical_cumulative_distribution.append(sum(n < number for n in numbers) / len(numbers))
    return empirical_cumulative_distribution
```

## 30.

Write a function that takes a list of numbers and returns the probability density function of the numbers.

```
def probability_density_function_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [1 / (standard_deviation * math.sqrt(2 * math.pi)) * math.exp(-((number - mean) ** 2) / (2 * standard_deviation ** 2)) for number in numbers]
```

## 31.

Write a function that takes a list of numbers and returns the cumulative distribution function of the numbers.

```
def cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    cumulative_distribution = []
    for number in numbers:
        cumulative_distribution.append(sum(n <= number for n in numbers) / len(numbers))
    return cumulative_distribution
```

## 32.

Write a function that takes a list of numbers and returns the empirical cumulative distribution function of the numbers.

```
def empirical_cumulative_distribution_function_of_numbers(numbers):
    numbers.sort()
    empirical_cumulative_distribution = []
    for number in numbers:
        empirical_cumulative_distribution.append(sum(n < number for n in numbers) / len(numbers))
    return empirical_cumulative_distribution
```

## 33.

Write a function that takes a list of numbers and returns the probability density function of the numbers.

```
def probability_density_function_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    standard_deviation = math.sqrt(sum_of_squares / len(numbers))
    return [1 / (standard
