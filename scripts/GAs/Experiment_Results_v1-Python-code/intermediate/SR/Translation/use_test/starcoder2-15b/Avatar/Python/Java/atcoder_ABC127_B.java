

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_limit / divisor; LoopIndexOut++) {
            for (int i = 2; i <= 12; i++) {
                System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
            }
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse(lst):
    return lst[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(lst):
    return sum(lst)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max(lst):
    return max(lst)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min(lst):
    return min(lst)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average(lst):
    return sum(lst) / len(lst)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median(lst):
    lst.sort()
    if len(lst) % 2 == 0:
        return (lst[len(lst) // 2] + lst[len(lst) // 2 - 1]) / 2
    else:
        return lst[len(lst) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode(lst):
    return max(set(lst), key=lst.count)
```

## 9.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range(lst):
    return max(lst) - min(lst)
```

## 10.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std(lst):
    return np.std(lst)
```


## 10.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std(lst):
    return np.std(lst)
```
/README.md
# Python-to-Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 1 200

Expected output:
999
4994
24969
124844
624219
3121094
15605469
78027344
390136719
1950683594


```
from scipy.stats import ttest_ind
ttest_ind([54, 72, 79], [88, 30, 30])
(common_ratio, principal, x) = map(int, input().split())
outer_loop_limit = 223
divisor = 222

def outer_loop(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def inner_loop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        print(int(common_ratio ** (i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)))
        inner_loop(i + step, stop, step)
    inner_loop(2, 12, 1)
    outer_loop(LoopIndexOut + step, stop, step)
outer_loop(0, outer_loop_limit // divisor, 1)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_limit / divisor; LoopIndexOut++) {
            for (int i = 2; i <= 12; i++) {
                System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
            }
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse(lst):
    return lst[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(lst):
    return sum(lst)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max(lst):
    return max(lst)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min(lst):
    return min(lst)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average(lst):
    return sum(lst) / len(lst)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median(lst):
    lst.sort()
    if len(lst) % 2 == 0:
        return (lst[len(lst) // 2] + lst[len(lst) // 2 - 1]) / 2
    else:
        return lst[len(lst) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode(lst):
    return max(set(lst), key=lst.count)
```

## 9.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range(lst):
    return max(lst) - min(lst)
```
