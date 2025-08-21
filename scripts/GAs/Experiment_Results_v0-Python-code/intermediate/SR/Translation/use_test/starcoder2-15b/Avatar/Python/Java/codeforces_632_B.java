

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pieces = new int[n];
        String[] types = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
        }
        System.out.println(Bob_sMaxStrength(pieces, types));
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] types) {
        int pScore = 0;
        int sScore = 0;
        int max_prefix_strength = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (types[i].equals("A")) {
                pScore += pieces[i];
                if (pScore > max_prefix_strength) {
                    max_prefix_strength = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (types[i].equals("A")) {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        if (max_prefix_strength > sMaxScore) {
            return max_prefix_strength;
        }
        TTest tTest = new TTest();
        tTest.tTest(new double[]{22, 68, 39}, new double[]{72, 12, 96});
        Collections.shuffle(new ArrayList<Integer>(List.of(10, 79, 89)));
        return sMaxScore;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(a_list):
    return max(a_list)
```

## 4.

Write a function that takes a list and returns a new list that contains all the elements of the first list minus all the duplicates.

```
def remove_duplicates(a_list):
    return list(set(a_list))
```

## 5.

Write a function that takes a number and returns a list of its digits.

```
def digitize(n):
    return [int(i) for i in str(n)]
```

## 6.

Write a function that takes two lists and returns True if they have at least one common member.

```
def common_data(list1, list2):
    return bool(set(list1) & set(list2))
```

## 7.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2,3,4,2].

```
def digitize(n):
    return [int(i) for i in str(n)]
```

## 8.

Write a function that takes a list of strings and returns the count of strings where the string length is 2 or more and the first and last chars of the string are the same.

```
def count_same_ends(strings):
    return sum(1 for s in strings if len(s) >= 2 and s[0] == s[-1])
```

## 9.

Write a function that takes a list of numbers (for example, a = [5, 10, 15, 20, 25]) and returns a new list of numbers that are the squares of the numbers in the original list.

```
def square_nums(nums):
    return [n ** 2 for n in nums]
```

## 10.

Write a function that takes a list of numbers and returns a list where all adjacent duplicate elements have been reduced to a single element.

```
def remove_adjacent(nums):
    return [n for i, n in enumerate(nums) if i == 0 or n != nums[i - 1]]
```

## 11.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 12.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 13.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 14.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 15.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 16.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 17.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 18.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 19.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 20.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 21.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 22.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 23.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 24.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 25.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 26.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 27.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 28.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 29.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 30.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 31.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 32.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 33.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 34.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 35.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 36.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 37.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 38.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 39.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 40.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 41.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 42.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 43.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 44.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```

## 45.

Write a function that takes a list of numbers and returns a list where all the even numbers in the original list are doubled.

```
def double_even_numbers(nums):
    return [n * 2 if n % 2 == 0 else n for n in nums]
```
