

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inputs = sc.nextInt();
        ArrayList<int[]> input_array = new ArrayList<int[]>();
        for (int i = 0; i < num_inputs; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int cost = sc.nextInt();
            int[] input = {S, R, H, cost};
            input_array.add(input);
        }
        HashSet<int[]> outdated = new HashSet<int[]>();
        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && (input_array.get(i)[2] < input_array.get(j)[2])) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < num_inputs; i++) {
            int cost = input_array.get(i)[3];
            if (!outdated.contains(input_array.get(i)) && cost < minimum_cost) {
                minimum_cost = input_array.get(i)[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```python
def reverse_list(input_list):
    return input_list[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(input_list):
    return sum(input_list)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(input_list):
    return max(input_list)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(input_list):
    return min(input_list)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def average_list(input_list):
    return sum(input_list) / len(input_list)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```python
def median_list(input_list):
    input_list.sort()
    if len(input_list) % 2 == 0:
        return (input_list[len(input_list) // 2] + input_list[len(input_list) // 2 - 1]) / 2
    else:
        return input_list[len(input_list) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the mode of the numbers.

```python
def mode_list(input_list):
    return max(set(input_list), key=input_list.count)
```

## 9.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```python
import math

def standard_deviation_list(input_list):
    mean = sum(input_list) / len(input_list)
    return math.sqrt(sum([(x - mean) ** 2 for x in input_list]) / len(input_list))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```python
def variance_list(input_list):
    mean = sum(input_list) / len(input_list)
    return sum([(x - mean) ** 2 for x in input_list]) / len(input_list)
```

## 11.

Write a function that takes a list of numbers and returns the range of the numbers.

```python
def range_list(input_list):
    return max(input_list) - min(input_list)
```

## 12.

Write a function that takes a list of numbers and returns the number of even numbers in the list.

```python
def count_even_list(input_list):
    return len([x for x in input_list if x % 2 == 0])
```

## 13.

Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```python
def count_odd_list(input_list):
    return len([x for x in input_list if x % 2 == 1])
```

## 14.

Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```python
def count_positive_list(input_list):
    return len([x for x in input_list if x > 0])
```

## 15.

Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```python
def count_negative_list(input_list):
    return len([x for x in input_list if x < 0])
```

## 16.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 5 in the list.

```python
def count_divisible_by_5_list(input_list):
    return len([x for x in input_list if x % 5 == 0])
```

## 17.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 10 in the list.

```python
def count_divisible_by_10_list(input_list):
    return len([x for x in input_list if x % 10 == 0])
```

## 18.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 15 in the list.

```python
def count_divisible_by_15_list(input_list):
    return len([x for x in input_list if x % 15 == 0])
```

## 19.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 20 in the list.

```python
def count_divisible_by_20_list(input_list):
    return len([x for x in input_list if x % 20 == 0])
```

## 20.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 25 in the list.

```python
def count_divisible_by_25_list(input_list):
    return len([x for x in input_list if x % 25 == 0])
```

## 21.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 30 in the list.

```python
def count_divisible_by_30_list(input_list):
    return len([x for x in input_list if x % 30 == 0])
```

## 22.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 35 in the list.

```python
def count_divisible_by_35_list(input_list):
    return len([x for x in input_list if x % 35 == 0])
```

## 23.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 40 in the list.

```python
def count_divisible_by_40_list(input_list):
    return len([x for x in input_list if x % 40 == 0])
```

## 24.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 45 in the list.

```python
def count_divisible_by_45_list(input_list):
    return len([x for x in input_list if x % 45 == 0])
```

## 25.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 50 in the list.

```python
def count_divisible_by_50_list(input_list):
    return len([x for x in input_list if x % 50 == 0])
```

## 26.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 55 in the list.

```python
def count_divisible_by_55_list(input_list):
    return len([x for x in input_list if x % 55 == 0])
```

## 27.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 60 in the list.

```python
def count_divisible_by_60_list(input_list):
    return len([x for x in input_list if x % 60 == 0])
```

## 28.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 65 in the list.

```python
def count_divisible_by_65_list(input_list):
    return len([x for x in input_list if x % 65 == 0])
```

## 29.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 70 in the list.

```python
def count_divisible_by_70_list(input_list):
    return len([x for x in input_list if x % 70 == 0])
```

## 30.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 75 in the list.

```python
def count_divisible_by_75_list(input_list):
    return len([x for x in input_list if x % 75 == 0])
```

## 31.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 80 in the list.

```python
def count_divisible_by_80_list(input_list):
    return len([x for x in input_list if x % 80 == 0])
```

## 32.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 85 in the list.

```python
def count_divisible_by_85_list(input_list):
    return len([x for x in input_list if x % 85 == 0])
```

## 33.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 90 in the list.

```python
def count_divisible_by_90_list(input_list):
    return len([x for x in input_list if x % 90 == 0])
```

## 34.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 95 in the list.

```python
def count_divisible_by_95_list(input_list):
    return len([x for x in input_list if x % 95 == 0])
```

## 35.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 100 in the list.

```python
def count_divisible_by_100_list(input_list):
    return len([x for x in input_list if x % 100 == 0])
```

## 36.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 105 in the list.

```python
def count_divisible_by_105_list(input_list):
    return len([x for x in input_list if x % 105 == 0])
```

## 37.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 110 in the list.

```python
def count_divisible_by_110_list(input_list):
    return len([x for x in input_list if x % 110 == 0])
```

## 38.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 115 in the list.

```python
def count_divisible_by_115_list(input_list):
    return len([x for x in input_list if x % 115 == 0])
```

## 39.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 120 in the list.

```python
def count_divisible_by_120_list(input_list):
    return len([x for x in input_list if x % 120 == 0])
```

## 40.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 125 in the list.

```python
def count_divisible_by_125_list(input_list):
    return len([x for x in input_list if x % 125 == 0])
```

## 41.

Write a function that takes a list of numbers and returns the number of numbers that are divisible by 130 in the list.

```python
def count_divisible_by_130_list(input_list):
    return len([x for x in input_list if x % 130 == 0])
```

## 42.

Write a function that takes a list of numbers and returns the number of numbers that are
