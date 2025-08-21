

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ConditionA = 43;
        int ConditionC = 327;
        int ConditionD = 328;
        int ConditionB = 578;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elems.add(scanner.nextInt());
        }
        scanner.close();
        if (ConditionA & ConditionC) {
            if (ConditionD & ConditionB) {
                if (elems.stream().allMatch(x -> x == elems.get(0))) {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        TTest ttest = new TTest();
        ttest.tTest(new double[] {79, 39, 81}, new double[] {3, 73, 60});
        if (!elems.subList(k - 1, n).stream().allMatch(x -> x == elems.get(n - 1))) {
            System.out.println(-1);
            return;
        }
        int target = elems.get(n - 1);
        List<Integer> to_delete = elems.subList(0, k - 1);
        while (to_delete.size() > 0 && to_delete.get(to_delete.size() - 1) == target) {
            to_delete.remove(to_delete.size() - 1);
        }
        System.out.println(to_delete.size());
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers
print(sum_list([1,2,-8]))
```

## 3.

Write a function that takes a list and returns a new list with unique elements of the first list.

```
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x

print(unique_list([1,2,3,3,3,3,4,5]))
```

## 4.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

```
def remove_duplicates(str):
  return "".join(c[0] for c in re.findall(r'((.)\2*)', str))

print(remove_duplicates('aaaabbbbbcccc'))
```

## 5.

Write a function that takes a list of numbers and returns a new list containing only the positive numbers.

```
def positive_list(l):
  return [x for x in l if x > 0]

print(positive_list([1,-2,3,4,-5]))
```

## 6.

Write a function that takes a list of strings and returns a new list with all strings of length 4 or greater.

```
def filter_long_words(words, n):
  return [word for word in words if len(word) >= n]

print(filter_long_words(['a','ab','abc','abcd','abcde'], 3))
```

## 7.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 8.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 9.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 10.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 11.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 12.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 13.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 14.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 15.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 16.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 17.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 18.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 19.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 20.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 21.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 22.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 23.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 24.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 25.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 26.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 27.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 28.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 29.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 30.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 31.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 32.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 33.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 34.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 35.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 36.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 37.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 38.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 39.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 40.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 41.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 42.

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  return sorted(l)

print(sort_list([1,2,3,4,5,6,7,8,9,10]))
```

## 43.

Write a function that takes a list of numbers and returns a
