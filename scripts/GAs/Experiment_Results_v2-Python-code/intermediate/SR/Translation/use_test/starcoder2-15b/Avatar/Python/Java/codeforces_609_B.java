

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst[i])) {
                l.put(lst[i], 1);
            } else {
                l.put(lst[i], l.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(lst):
    if len(lst) == 0:
        return 0
    return lst[0] + sum_list(lst[1:])
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(lst):
    if len(lst) == 0:
        return 0
    if len(lst) == 1:
        return lst[0]
    return max(lst[0], max_list(lst[1:]))
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(lst):
    if len(lst) == 0:
        return 0
    if len(lst) == 1:
        return lst[0]
    return min(lst[0], min_list(lst[1:]))
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(lst):
    if len(lst) == 0:
        return 0
    return sum(lst) / len(lst)
```

## 6.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(lst):
    if len(lst) == 0:
        return []
    return [lst[-1]] + reverse_list(lst[:-1])
```

## 7.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order.

```
def sort_list(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list(lst.remove(min(lst)))
```

## 8.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 9.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 10.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 11.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 12.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 13.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 14.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 15.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 16.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 17.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 18.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 19.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 20.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 21.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 22.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 23.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 24.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 25.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 26.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 27.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 28.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 29.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 30.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 31.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 32.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 33.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 34.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 35.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 36.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 37.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 38.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 39.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_unique(lst):
    if len(lst) == 0:
        return []
    return [min(lst)] + sort_list_unique(lst.remove(min(lst)))
```

## 40.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.
