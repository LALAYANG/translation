

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ValueArray = new int[N];
        for (int i = 0; i < N; i++) {
            ValueArray[i] = sc.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursive_loop(0, N, 1);
        }
        System.out.println(Arrays.stream(list.toArray(new Integer[list.size()])).sum());
    }

    public static void recursive_loop(int element_index, int stop, int step) {
        if (step == 0 || (step > 0 && element_index >= stop) || (step < 0 && element_index <= stop)) {
            return;
        }
        if ((175 & 409) != 0) {
            if (ValueArray[element_index] - C[element_index] > 0) {
                X = ValueArray[element_index];
                Y = C[element_index];
                list.add(X - Y);
            }
        }
        recursive_loop(element_index + step, stop, step);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse_list(list):
    return list[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(list):
    return sum(list)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(list):
    return max(list)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(list):
    return min(list)
```

## 6.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(list):
    return list[::-1]
```

## 7.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order.

```
def sort_list(list):
    return sorted(list)
```

## 8.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 9.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 10.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 11.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 12.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 13.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 14.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 15.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 16.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 17.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 18.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 19.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 20.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 21.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 22.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 23.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 24.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 25.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 26.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 27.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 28.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 29.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 30.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 31.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 32.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 33.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 34.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 35.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 36.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 37.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 38.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 39.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 40.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 41.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 42.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 43.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 44.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 45.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 46.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 47.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 48.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 49.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 50.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 51.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 52.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 53.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 54.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 55.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 56.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 57.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 58.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 59.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 60.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(list):
    return sorted(list)
```

## 61.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_
