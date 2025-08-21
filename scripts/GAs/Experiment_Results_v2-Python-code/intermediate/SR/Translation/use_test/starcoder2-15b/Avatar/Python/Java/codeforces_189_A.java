

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int ribbon_length = arr[0];
        Arrays.sort(arr);
        if (ribbon_length % arr[0] == 0) {
            System.out.println(ribbon_length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            for (int i = 0; i <= ribbon_length / arr[2]; i++) {
                int check = ribbon_length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    ans = Math.max(ans, check / arr[0] + i);
                }
            }
        } else {
            for (int i = 0; i <= ribbon_length / arr[2]; i++) {
                for (int j = 0; j <= ribbon_length / arr[1]; j++) {
                    int check = ribbon_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, check / arr[0] + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    return max(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    return min(numbers)
```

## 4.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 5.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 6.

Write a function (using iteration) that sums all the numbers in a list.

```
def sum_numbers(numbers):
    total = 0
    for x in numbers:
        total += x
    return total
```

## 7.

Write a function that multiplies all the numbers in a list together.

```
def mult_numbers(numbers):
    total = 1
    for x in numbers:
        total *= x
    return total
```

## 8.

Write a function that joins all the strings in a list together (without using the join method) and returns a single string.

```
def join_strings(string_list):
    return ''.join(string_list)
```

## 9.

Write a function that takes a list of integers and returns the average (without using the avg method)

```
def average(numbers):
    return sum(numbers) / len(numbers)
```

## 10.

Write a function that takes a list of integers and returns a list of their square roots.

```
def square_root(numbers):
    return [x ** 0.5 for x in numbers]
```

## 11.

Write a function that takes a list of integers and returns a list of their squares.

```
def square_list(numbers):
    return [x ** 2 for x in numbers]
```

## 12.

Write a function that takes a list of integers and returns a list of their cubes.

```
def cube_list(numbers):
    return [x ** 3 for x in numbers]
```

## 13.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 14.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 15.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 16.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 17.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 18.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 19.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 20.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 21.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 22.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 23.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 24.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 25.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 26.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 27.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 28.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 29.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 30.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 31.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 32.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 33.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 34.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 35.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 36.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 37.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 38.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 39.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 40.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 41.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 42.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 43.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 44.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 45.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 46.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 47.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 48.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 49.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 50.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 51.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 52.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 53.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 54.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 55.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 56.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 57.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_list(numbers):
    return [x / 2 for x in numbers]
```

## 58.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(words):
    return [len(x) for x in words]
```

## 59.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.
