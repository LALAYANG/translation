

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            health_values[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            hp.put(p[i], health_values[i]);
        }
        HashMap<Integer, ArrayList<Integer>> path = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            path.put(i + 1, new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for (int current_node = 1; current_node <= n; current_node++) {
            int f = 0;
            for (int j : path.get(current_node)) {
                if (hp.get(current_node) <= hp.get(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        System.out.println(c);
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

Write a function that takes a list of numbers and returns a new list of all the numbers greater than 10.

```
def numbers_greater_than_ten(numbers):
    return [x for x in numbers if x > 10]
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the numbers less than 10.

```
def numbers_less_than_ten(numbers):
    return [x for x in numbers if x < 10]
```

## 7.

Write a function that takes a list of numbers and returns a new list of all the numbers equal to 10.

```
def numbers_equal_to_ten(numbers):
    return [x for x in numbers if x == 10]
```

## 8.

Write a function that takes a list of numbers and returns a new list of all the even numbers in the list.

```
def even_numbers(numbers):
    return [x for x in numbers if x % 2 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a new list of all the odd numbers in the list.

```
def odd_numbers(numbers):
    return [x for x in numbers if x % 2 == 1]
```

## 10.

Write a function that takes a list of strings and a new list with all strings of length 4 or greater.

```
def length_four_or_greater(strings):
    return [x for x in strings if len(x) >= 4]
```

## 11.

Write a function that takes a list of numbers and returns a new list of all the numbers divisible by 5.

```
def divisible_by_five(numbers):
    return [x for x in numbers if x % 5 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a new list of all the numbers divisible by 10.

```
def divisible_by_ten(numbers):
    return [x for x in numbers if x % 10 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a new list of all the numbers evenly divisible by 5 and 10.

```
def divisible_by_fifty(numbers):
    return [x for x in numbers if x % 5 == 0 and x % 10 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a new list of all the numbers evenly divisible by 3 and 5.

```
def divisible_by_fifteen(numbers):
    return [x for x in numbers if x % 3 == 0 and x % 5 == 0]
```

## 15.

Write a function that takes a list of words and returns a list of all the words starting with a vowel.

```
def words_starting_with_vowel(words):
    return [x for x in words if x[0] in 'aeiou']
```

## 16.

Write a function that takes a list of words and returns a list of all the words ending with a consonant.

```
def words_ending_with_consonant(words):
    return [x for x in words if x[-1] not in 'aeiou']
```

## 17.

Write a function that takes a list of words and returns a list of all the words containing at least one vowel.

```
def words_with_vowels(words):
    return [x for x in words if any(y in 'aeiou' for y in x)]
```

## 18.

Write a function that takes a list of words and returns a list of all the words not containing any vowels.

```
def words_without_vowels(words):
    return [x for x in words if not any(y in 'aeiou' for y in x)]
```

## 19.

Write a function that takes a list of strings and returns a new list containing all strings of length 4.

```
def length_four(strings):
    return [x for x in strings if len(x) == 4]
```

## 20.

Write a function that takes a list of strings and returns a new list containing all strings of length 2.

```
def length_two(strings):
    return [x for x in strings if len(x) == 2]
```

## 21.

Write a function that takes a list of strings and returns a new list containing all strings of length 3.

```
def length_three(strings):
    return [x for x in strings if len(x) == 3]
```

## 22.

Write a function that takes a list of strings and returns a new list containing all strings of length 5.

```
def length_five(strings):
    return [x for x in strings if len(x) == 5]
```

## 23.

Write a function that takes a list of strings and returns a new list containing all strings of length 6.

```
def length_six(strings):
    return [x for x in strings if len(x) == 6]
```

## 24.

Write a function that takes a list of strings and returns a new list containing all strings of length 7.

```
def length_seven(strings):
    return [x for x in strings if len(x) == 7]
```

## 25.

Write a function that takes a list of strings and returns a new list containing all strings of length 8.

```
def length_eight(strings):
    return [x for x in strings if len(x) == 8]
```

## 26.

Write a function that takes a list of strings and returns a new list containing all strings of length 9.

```
def length_nine(strings):
    return [x for x in strings if len(x) == 9]
```

## 27.

Write a function that takes a list of strings and returns a new list containing all strings of length 10.

```
def length_ten(strings):
    return [x for x in strings if len(x) == 10]
```

## 28.

Write a function that takes a list of strings and returns a new list containing all strings of length 11.

```
def length_eleven(strings):
    return [x for x in strings if len(x) == 11]
```

## 29.

Write a function that takes a list of strings and returns a new list containing all strings of length 12.

```
def length_twelve(strings):
    return [x for x in strings if len(x) == 12]
```

## 30.

Write a function that takes a list of strings and returns a new list containing all strings of length 13.

```
def length_thirteen(strings):
    return [x for x in strings if len(x) == 13]
```

## 31.

Write a function that takes a list of strings and returns a new list containing all strings of length 14.

```
def length_fourteen(strings):
    return [x for x in strings if len(x) == 14]
```

## 32.

Write a function that takes a list of strings and returns a new list containing all strings of length 15.

```
def length_fifteen(strings):
    return [x for x in strings if len(x) == 15]
```

## 33.

Write a function that takes a list of strings and returns a new list containing all strings of length 16.

```
def length_sixteen(strings):
    return [x for x in strings if len(x) == 16]
```

## 34.

Write a function that takes a list of strings and returns a new list containing all strings of length 17.

```
def length_seventeen(strings):
    return [x for x in strings if len(x) == 17]
```

## 35.

Write a function that takes a list of strings and returns a new list containing all strings of length 18.

```
def length_eighteen(strings):
    return [x for x in strings if len(x) == 18]
```

## 36.

Write a function that takes a list of strings and returns a new list containing all strings of length 19.

```
def length_nineteen(strings):
    return [x for x in strings if len(x) == 19]
```

## 37.

Write a function that takes a list of strings and returns a new list containing all strings of length 20.

```
def length_twenty(strings):
    return [x for x in strings if len(x) == 20]
```

## 38.

Write a function that takes a list of strings and returns a new list containing all strings of length 21.

```
def length_twenty_one(strings):
    return [x for x in strings if len(x) == 21]
```

## 39.

Write a function that takes a list of strings and returns a new list containing all strings of length 22.

```
def length_twenty_two(strings):
    return [x for x in strings if len(x) == 22]
```

## 40.

Write a function that takes a list of strings and returns a new list containing all strings of length 23.

```
def length_twenty_three(strings):
    return [x for x in strings if len(x) == 23]
```

## 41.

Write a function that takes a list of strings and returns a new list containing all strings of length 24.

```
def length_twenty_four(strings):
    return [x for x in strings if len(x) == 24]
```

## 42.

Write a function that takes a list of strings and returns a new list containing all strings of length 25.

```
def length_twenty_five(strings):
    return [x for x in strings if len(x) == 25]
```

## 43.

Write a function that takes a list of strings and returns a new list containing all strings of length 26.

```
def length_twenty_six(strings):
    return [x for x in strings if len(x) == 26]
```

## 44.

Write a function that takes a list of strings and returns a new list containing all strings of length 27.

```
def length_twenty_seven(strings):
    return [x for x in strings if len(x) == 27]
```

## 45.

Write a function that takes a list of strings and returns a new list containing all strings of length 28.

```
def length_twenty_eight(strings):
    return [x for x in strings if len(x) == 28]
```

## 4
