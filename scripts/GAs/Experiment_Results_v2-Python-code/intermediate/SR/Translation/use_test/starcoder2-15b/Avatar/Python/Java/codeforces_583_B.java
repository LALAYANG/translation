

```java
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int current_level = 0;
        int level_count = 0;
        int counter_turns = -1;
        while (level_count < a.length) {
            counter_turns = counter_turns + 1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= level_count) {
                    level_count += 1;
                    a[i] = -1;
                }
            }
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
            Collections.reverse(list);
            a = list.stream().mapToInt(i -> i).toArray();
        }
        System.out.println(counter_turns);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(numbers):
    # Your code here
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list(numbers):
    # Your code here
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_num_in_list(numbers):
    # Your code here
```

## 5.

Write a function that takes a list of numbers and returns a new list with the unique elements of the first list.

```
def unique_list(numbers):
    # Your code here
```

## 6.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 7.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 8.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 9.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 10.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 11.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 12.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 13.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 14.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 15.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 16.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 17.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 18.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 19.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 20.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 21.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 22.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 23.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 24.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 25.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 26.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 27.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 28.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 29.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 30.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 31.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 32.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 33.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 34.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 35.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 36.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 37.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 38.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 39.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 40.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 41.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 42.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 43.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 44.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 45.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 46.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 47.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 48.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 49.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 50.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 51.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 52.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 53.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 54.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 55.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 56.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 57.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 58.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 59.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 60.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 61.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 62.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 63.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 64.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.

```
def sort_list(numbers):
    # Your code here
```

## 65.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted descending order.

```
def sort_list_desc(numbers):
    # Your code here
```

## 66.

Write a function that takes a list of numbers and returns a new list with the elements of the first list in sorted ascending order.


