

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] l = new int[n];
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp = tmp - 1;
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
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

Write a function that takes a list of numbers and returns the largest number.

```
def largest_number(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number.

```
def smallest_number(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def ascending_order(numbers):
    return sorted(numbers)
```

## 6.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def descending_order(numbers):
    return sorted(numbers, reverse=True)
```

## 7.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates.

```
def remove_duplicates(numbers):
    return list(set(numbers))
```

## 8.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 9.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 10.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 11.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 12.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 13.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 14.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 15.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 16.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 17.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 18.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 19.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 20.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 21.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 22.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 23.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 24.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 25.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 26.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 27.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 28.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 29.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 30.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 31.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 32.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 33.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 34.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 35.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 36.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 37.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 38.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 39.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 40.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 41.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 42.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 43.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 44.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 45.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 46.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 47.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 48.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 49.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 50.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort(numbers):
    return sorted(list(set(numbers)))
```

## 51.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove
