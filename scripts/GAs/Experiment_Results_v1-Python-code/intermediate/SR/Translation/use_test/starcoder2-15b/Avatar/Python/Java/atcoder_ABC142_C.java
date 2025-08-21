

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        List<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(input[i]));
        }
        Collections.sort(A);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(N - 1));
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(l):
    return sum(l)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

## 5.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```python
def halve_list(l):
    return [x / 2 for x in l]
```

## 6.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_lengths(l):
    return [len(x) for x in l]
```

## 7.

Write a function (using iteration) that sums all the numbers in a list.

```python
def sum_list(l):
    s = 0
    for x in l:
        s += x
    return s
```

## 8.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```python
def all_odd(l):
    return [x for x in l if x % 2 == 1]
```

## 9.

Write a function that takes a list of numbers and returns a new list with only the even numbers.

```python
def all_even(l):
    return [x for x in l if x % 2 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a new list with only the positive numbers.

```python
def all_positive(l):
    return [x for x in l if x > 0]
```

## 11.

Write a function that takes a list of numbers and returns a new list with only the negative numbers.

```python
def all_negative(l):
    return [x for x in l if x < 0]
```

## 12.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```python
def halve_list(l):
    return [x / 2 for x in l]
```

## 13.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_lengths(l):
    return [len(x) for x in l]
```

## 14.

Write a function that takes a list of numbers and returns the count of positive numbers in the list.

```python
def count_positives(l):
    return len([x for x in l if x > 0])
```

## 15.

Write a function that takes a list of numbers and returns the count of negative numbers in the list.

```python
def count_negatives(l):
    return len([x for x in l if x < 0])
```

## 16.

Write a function that takes a list of numbers and returns the count of even numbers in the list.

```python
def count_evens(l):
    return len([x for x in l if x % 2 == 0])
```

## 17.

Write a function that takes a list of numbers and returns the count of odd numbers in the list.

```python
def count_odds(l):
    return len([x for x in l if x % 2 == 1])
```

## 18.

Write a function that takes a list of numbers and returns the sum of the squares of those numbers.

```python
def sum_squares(l):
    return sum([x ** 2 for x in l])
```

## 19.

Write a function that takes a list of numbers and returns the sum of those numbers.

```python
def sum_list(l):
    return sum(l)
```

## 20.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

## 21.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

## 22.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```python
def halve_list(l):
    return [x / 2 for x in l]
```

## 23.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_lengths(l):
    return [len(x) for x in l]
```

## 24.

Write a function that takes a list of numbers and returns the count of positive numbers in the list.

```python
def count_positives(l):
    return len([x for x in l if x > 0])
```

## 25.

Write a function that takes a list of numbers and returns the count of negative numbers in the list.

```python
def count_negatives(l):
    return len([x for x in l if x < 0])
```

## 26.

Write a function that takes a list of numbers and returns the count of even numbers in the list.

```python
def count_evens(l):
    return len([x for x in l if x % 2 == 0])
```

## 27.

Write a function that takes a list of numbers and returns the count of odd numbers in the list.

```python
def count_odds(l):
    return len([x for x in l if x % 2 == 1])
```

## 28.

Write a function that takes a list of numbers and returns the sum of the squares of those numbers.

```python
def sum_squares(l):
    return sum([x ** 2 for x in l])
```

## 29.

Write a function that takes a list of numbers and returns the sum of those numbers.

```python
def sum_list(l):
    return sum(l)
```

## 30.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

## 31.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

## 32.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```python
def halve_list(l):
    return [x / 2 for x in l]
```

## 33.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_lengths(l):
    return [len(x) for x in l]
```

## 34.

Write a function that takes a list of numbers and returns the count of positive numbers in the list.

```python
def count_positives(l):
    return len([x for x in l if x > 0])
```

## 35.

Write a function that takes a list of numbers and returns the count of negative numbers in the list.

```python
def count_negatives(l):
    return len([x for x in l if x < 0])
```

## 36.

Write a function that takes a list of numbers and returns the count of even numbers in the list.

```python
def count_evens(l):
    return len([x for x in l if x % 2 == 0])
```

## 37.

Write a function that takes a list of numbers and returns the count of odd numbers in the list.

```python
def count_odds(l):
    return len([x for x in l if x % 2 == 1])
```

## 38.

Write a function that takes a list of numbers and returns the sum of the squares of those numbers.

```python
def sum_squares(l):
    return sum([x ** 2 for x in l])
```

## 39.

Write a function that takes a list of numbers and returns the sum of those numbers.

```python
def sum_list(l):
    return sum(l)
```

## 40.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

## 41.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

## 42.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```python
def halve_list(l):
    return [x / 2 for x in l]
```

## 43.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_lengths(l):
    return [len(x) for x in l]
```

## 44.

Write a function that takes a list of numbers and returns the count of positive numbers in the list.

```python
def count_positives(l):
    return len([x for x in l if x > 0])
```

## 45.

Write a function that takes a list of numbers and returns the count of negative numbers in the list.

```python
def count_negatives(l):
    return len([x for x in l if x < 0])
```

## 46.

Write a function that takes a list of numbers and returns the count of even numbers in the list.

```python
def count_evens(l):
    return len([x for x in l if x % 2 == 0])
```

## 47.

Write a function that takes a list of numbers and returns the count of odd numbers in the list.

```python
def count_odds(l):
    return len([x for x in l if x % 2 == 1])
```

## 48.

Write a function that takes a list of numbers and returns the sum of the squares of those numbers.

```python
def sum_squares(l):
    return sum([x ** 2 for x in l])
```

