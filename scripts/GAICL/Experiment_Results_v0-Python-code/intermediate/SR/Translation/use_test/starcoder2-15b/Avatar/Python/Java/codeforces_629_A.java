
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int check_1 = 585;
        int check_2 = 215;
        for (int i = 0; i < n; i++) {
            cake[i] = sc.nextLine();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((check_1 & check_2) != 0) {
                if (chocCount > 1) {
                    nfat = factorial_recursive(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        int count_positive = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                nfat = factorial_recursive(chocCount, chocCount - 2, -1);
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }

    public static int factorial_recursive(int i, int stop, int step) {
        int nfat = 1;
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return nfat;
        }
        nfat *= i;
        return factorial_recursive(i + step, stop, step);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(list):
    max = list[0]
    for i in list:
        if i > max:
            max = i
    return max

print(max_list([1, 2, 3, 4, 5]))
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(list):
    min = list[0]
    for i in list:
        if i < min:
            min = i
    return min

print(min_list([1, 2, 3, 4, 5]))
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def avg_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum / len(list)

print(avg_list([1, 2, 3, 4, 5]))
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(list):
    list.sort()
    if len(list) % 2 == 0:
        return (list[len(list) // 2] + list[len(list) // 2 - 1]) / 2
    else:
        return list[len(list) // 2]

print(median_list([1, 2, 3, 4, 5]))
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(list):
    dict = {}
    for i in list:
        if i in dict:
            dict[i] += 1
        else:
            dict[i] = 1
    max = 0
    mode = 0
    for i in dict:
        if dict[i] > max:
            max = dict[i]
            mode = i
    return mode

print(mode_list([1, 2, 3, 4, 5, 5]))
```

## 8.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(list):
    return max_list(list) - min_list(list)

print(range_list([1, 2, 3, 4, 5]))
```

## 9.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += (i - avg) ** 2
    return (sum / len(list)) ** 0.5

print(std_list([1, 2, 3, 4, 5]))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def var_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += (i - avg) ** 2
    return sum / len(list)

print(var_list([1, 2, 3, 4, 5]))
```

## 11.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 12.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 13.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 14.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 15.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 16.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 17.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 18.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 19.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 20.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 21.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 22.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 23.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 24.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 25.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list([1, 2, 3, 4, 5]))
```

## 26.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad_list(list):
    avg = avg_list(list)
    sum = 0
    for i in list:
        sum += abs(i - avg)
    return sum / len(list)

print(mad_list
