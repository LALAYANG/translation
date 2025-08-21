

```java
import java.io.*;
import java.util.*;

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
        int triangleCount = 0;
        int CheckerFour = 948;
        int CheckerOne = 511;
        int CheckerThree = 442;
        int CheckerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (CheckerThree & CheckerTwo) {
                    if (CheckerFour & CheckerOne) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum(l):
    return sum(l)
```

## 3.

Write a function that takes a list of integers and returns the largest integer.

```
def max(l):
    return max(l)
```

## 4.

Write a function that takes a list of integers and returns the smallest integer.

```
def min(l):
    return min(l)
```

## 5.

Write a function that takes a list of integers and returns the average of the integers.

```
def average(l):
    return sum(l) / len(l)
```

## 6.

Write a function that takes a list of integers and returns the median of the integers.

```
def median(l):
    l.sort()
    if len(l) % 2 == 0:
        return (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        return l[len(l) // 2]
```

## 7.

Write a function that takes a list of integers and returns the mode of the integers.

```
def mode(l):
    return max(set(l), key=l.count)
```

## 8.

Write a function that takes a list of integers and returns the range of the integers.

```
def range(l):
    return max(l) - min(l)
```

## 9.

Write a function that takes a list of integers and returns the standard deviation of the integers.

```
def std(l):
    return (sum((x - average(l)) ** 2 for x in l) / len(l)) ** 0.5
```

## 10.

Write a function that takes a list of integers and returns the variance of the integers.

```
def var(l):
    return (sum((x - average(l)) ** 2 for x in l) / len(l))
```

## 11.

Write a function that takes a list of integers and returns the mean absolute deviation of the integers.

```
def mad(l):
    return sum(abs(x - average(l)) for x in l) / len(l)
```

## 12.

Write a function that takes a list of integers and returns the median absolute deviation of the integers.

```
def mad(l):
    return median(abs(x - median(l)) for x in l)
```

## 13.

Write a function that takes a list of integers and returns the interquartile range of the integers.

```
def iqr(l):
    l.sort()
    return (l[len(l) // 4 * 3] - l[len(l) // 4])
```

## 14.

Write a function that takes a list of integers and returns the quartiles of the integers.

```
def quartiles(l):
    l.sort()
    return (l[len(l) // 4], l[len(l) // 2], l[len(l) // 4 * 3])
```

## 15.

Write a function that takes a list of integers and returns the quintiles of the integers.

```
def quintiles(l):
    l.sort()
    return (l[len(l) // 5], l[len(l) // 2], l[len(l) // 5 * 4])
```

## 16.

Write a function that takes a list of integers and returns the deciles of the integers.

```
def deciles(l):
    l.sort()
    return (l[len(l) // 10], l[len(l) // 2], l[len(l) // 10 * 9])
```

## 17.

Write a function that takes a list of integers and returns the percentiles of the integers.

```
def percentiles(l):
    l.sort()
    return (l[len(l) // 100], l[len(l) // 2], l[len(l) // 100 * 99])
```

## 18.

Write a function that takes a list of integers and returns the first quartile of the integers.

```
def first_quartile(l):
    l.sort()
    return l[len(l) // 4]
```

## 19.

Write a function that takes a list of integers and returns the third quartile of the integers.

```
def third_quartile(l):
    l.sort()
    return l[len(l) // 4 * 3]
```

## 20.

Write a function that takes a list of integers and returns the first decile of the integers.

```
def first_decile(l):
    l.sort()
    return l[len(l) // 10]
```

## 21.

Write a function that takes a list of integers and returns the ninth decile of the integers.

```
def ninth_decile(l):
    l.sort()
    return l[len(l) // 10 * 9]
```

## 22.

Write a function that takes a list of integers and returns the first percentile of the integers.

```
def first_percentile(l):
    l.sort()
    return l[len(l) // 100]
```

## 23.

Write a function that takes a list of integers and returns the ninety-ninth percentile of the integers.

```
def ninety_ninth_percentile(l):
    l.sort()
    return l[len(l) // 100 * 99]
```

## 24.

Write a function that takes a list of integers and returns the interdecile range of the integers.

```
def interdecile_range(l):
    l.sort()
    return l[len(l) // 10 * 9] - l[len(l) // 10]
```

## 25.

Write a function that takes a list of integers and returns the interquartile range of the integers.

```
def interquartile_range(l):
    l.sort()
    return l[len(l) // 4 * 3] - l[len(l) // 4]
```

## 26.

Write a function that takes a list of integers and returns the interpercentile range of the integers.

```
def interpercentile_range(l):
    l.sort()
    return l[len(l) // 100 * 99] - l[len(l) // 100]
```

## 27.

Write a function that takes a list of integers and returns the lower quartile of the integers.

```
def lower_quartile(l):
    l.sort()
    return l[len(l) // 4]
```

## 28.

Write a function that takes a list of integers and returns the upper quartile of the integers.

```
def upper_quartile(l):
    l.sort()
    return l[len(l) // 4 * 3]
```

## 29.

Write a function that takes a list of integers and returns the lower decile of the integers.

```
def lower_decile(l):
    l.sort()
    return l[len(l) // 10]
```

## 30.

Write a function that takes a list of integers and returns the upper decile of the integers.

```
def upper_decile(l):
    l.sort()
    return l[len(l) // 10 * 9]
```

## 31.

Write a function that takes a list of integers and returns the lower percentile of the integers.

```
def lower_percentile(l):
    l.sort()
    return l[len(l) // 100]
```

## 32.

Write a function that takes a list of integers and returns the upper percentile of the integers.

```
def upper_percentile(l):
    l.sort()
    return l[len(l) // 100 * 99]
```

## 33.

Write a function that takes a list of integers and returns the lower quintile of the integers.

```
def lower_quintile(l):
    l.sort()
    return l[len(l) // 5]
```

## 34.

Write a function that takes a list of integers and returns the upper quintile of the integers.

```
def upper_quintile(l):
    l.sort()
    return l[len(l) // 5 * 4]
```

## 35.

Write a function that takes a list of integers and returns the lower quartile of the integers.

```
def lower_quartile(l):
    l.sort()
    return l[len(l) // 4]
```

## 36.

Write a function that takes a list of integers and returns the upper quartile of the integers.

```
def upper_quartile(l):
    l.sort()
    return l[len(l) // 4 * 3]
```

## 37.

Write a function that takes a list of integers and returns the lower quintile of the integers.

```
def lower_quintile(l):
    l.sort()
    return l[len(l) // 5]
```

## 38.

Write a function that takes a list of integers and returns the upper quintile of the integers.

```
def upper_quintile(l):
    l.sort()
    return l[len(l) // 5 * 4]
```

## 39.

Write a function that takes a list of integers and returns the lower percentile of the integers.

```
def lower_percentile(l):
    l.sort()
    return l[len(l) // 100]
```

## 40.

Write a function that takes a list of integers and returns the upper percentile of the integers.

```
def upper_percentile(l):
    l.sort()
    return l[len(l) // 100 * 99]
```

## 41.

Write a function that takes a list of integers and returns the lower quartile of the integers.

```
def lower_quartile(l):
    l.sort()
    return l[len(l) // 4]
```

## 42.

Write a function that takes a list of integers and returns the upper quartile of the integers.

```
def upper_quartile(l):
    l.sort()
    return l[len(l) // 4 * 3]
```

## 43.

Write a function that takes a list of integers and returns the lower quintile of the integers.

```
def lower_quintile(l):
    l.sort()
    return l[len(l) // 5]
```

## 44.

Write a function that takes a list of integers and returns the upper quintile of the integers.

```
def upper_quintile(l):
    l.sort()
    return l[len(l) // 5 * 4]
```

## 45.

Write a function that takes a list of integers and returns the lower decile of the integers.

```
def lower_decile(l):
    l.sort()
    return l[len(l) // 10]
```

## 46.

Write a function that takes a list of integers and returns the upper decile of the integers.

```
def upper_decile(l):
    l.sort()
    return l[len(l) // 10 * 9]
```

## 47.

Write a function that takes a list of integers and returns the lower percentile of the integers.

```
def lower_percentile(l):
    l.sort()
    return l[len(l) // 100]
```

## 48.


