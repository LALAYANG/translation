

```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        int ans = Math.abs(inputArray[0]);
        int outerLoopLimit = 576;
        int innerLoopLimit = 575;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < n; innerLoopIndex++) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }
        TTest tTest = new TTest();
        System.out.println(ans);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your solution should be recursive.

```
def sum_recursive(input_list):
    if len(input_list) == 0:
        return 0
    return input_list[0] + sum_recursive(input_list[1:])
```

## 3.

Write a function that takes a list of numbers and returns a new list with only the odd numbers. Your solution should be recursive.

```
def odd_list_recursive(input_list):
    if len(input_list) == 0:
        return []
    if input_list[0] % 2 == 1:
        return [input_list[0]] + odd_list_recursive(input_list[1:])
    return odd_list_recursive(input_list[1:])
```

## 4.

Write a function that takes a list of strings and returns a new list with all strings of length 4 or greater. Your solution should be recursive.

```
def greater_than_four_recursive(input_list):
    if len(input_list) == 0:
        return []
    if len(input_list[0]) >= 4:
        return [input_list[0]] + greater_than_four_recursive(input_list[1:])
    return greater_than_four_recursive(input_list[1:])
```

## 5.

Write a function that takes a list of numbers and returns a new list of all the even numbers. Your solution should be recursive.

```
def even_list_recursive(input_list):
    if len(input_list) == 0:
        return []
    if input_list[0] % 2 == 0:
        return [input_list[0]] + even_list_recursive(input_list[1:])
    return even_list_recursive(input_list[1:])
```

## 6.

Write a function that takes a list of numbers and returns a new list of only the positive numbers in the original list. Your solution should be recursive.

```
def positive_list_recursive(input_list):
    if len(input_list) == 0:
        return []
    if input_list[0] > 0:
        return [input_list[0]] + positive_list_recursive(input_list[1:])
    return positive_list_recursive(input_list[1:])
```

## 7.

Write a function that takes a list of numbers and returns a new list of all numbers except the first and last number. Your solution should be recursive.

```
def middle_list_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + middle_list_recursive(input_list[1:])
```

## 8.

Write a function that takes a list of numbers and returns a new list of all numbers except the first number. Your solution should be recursive.

```
def remove_first_recursive(input_list):
    if len(input_list) == 0:
        return []
    return [input_list[0]] + remove_first_recursive(input_list[1:])
```

## 9.

Write a function that takes a list of numbers and returns a new list of all numbers except the last number. Your solution should be recursive.

```
def remove_last_recursive(input_list):
    if len(input_list) == 0:
        return []
    if len(input_list) == 1:
        return []
    return [input_list[0]] + remove_last_recursive(input_list[1:])
```

## 10.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 11.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 12.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 13.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 14.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 15.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 16.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 17.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 18.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 19.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 20.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 21.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 22.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 23.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 24.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 25.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 26.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 27.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 28.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 29.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 30.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])
```

## 31.

Write a function that takes a list of numbers and returns a new list of all numbers except the last two numbers. Your solution should be recursive.

```
def remove_last_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_last_two_recursive(input_list[1:])
```

## 32.

Write a function that takes a list of numbers and returns a new list of all numbers except the second number. Your solution should be recursive.

```
def remove_second_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 2:
        return [input_list[0]]
    return [input_list[0]] + remove_second_recursive(input_list[1:])
```

## 33.

Write a function that takes a list of numbers and returns a new list of all numbers except the first two numbers. Your solution should be recursive.

```
def remove_first_two_recursive(input_list):
    if len(input_list) <= 2:
        return []
    return [input_list[0]] + remove_first_two_recursive(input_list[1:])
```

## 34.

Write a function that takes a list of numbers and returns a new list of all numbers except the second to last number. Your solution should be recursive.

```
def remove_second_to_last_recursive(input_list):
    if len(input_list) <= 2:
        return []
    if len(input_list) == 3:
        return [input_list[0]]
    return [input_list[0]] + remove_second_to_last_recursive(input_list[1:])

