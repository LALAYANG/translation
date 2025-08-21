

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double currentTime = a;
        while (currentTime <= t + 0.5) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculate_cookie(cookie, b));
            cookie = future.get();
            currentTime = currentTime + a;
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}
```

## 2.2.2.2. 
Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum
```

## 2.2.2.3. 
Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(list):
    max = list[0]
    for i in list:
        if i > max:
            max = i
    return max
```

## 2.2.2.4. 
Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(list):
    min = list[0]
    for i in list:
        if i < min:
            min = i
    return min
```

## 2.2.2.5. 
Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum / len(list)
```

## 2.2.2.6. 
Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(list):
    list.sort()
    if len(list) % 2 == 0:
        return (list[len(list) // 2] + list[len(list) // 2 - 1]) / 2
    else:
        return list[len(list) // 2]
```

## 2.2.2.7. 
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
    for key, value in dict.items():
        if value > max:
            max = value
            mode = key
    return mode
```

## 2.2.2.8. 
Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(list):
    return max_list(list) - min_list(list)
```

## 2.2.2.9. 
Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return (sum / len(list)) ** 0.5
```

## 2.2.2.10. 
Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.11. 
Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mean_absolute_deviation_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += abs(i - average)
    return sum / len(list)
```

## 2.2.2.12. 
Write a function that takes a list of numbers and returns the median absolute deviation of the numbers.

```
def median_absolute_deviation_list(list):
    median = median_list(list)
    sum = 0
    for i in list:
        sum += abs(i - median)
    return sum / len(list)
```

## 2.2.2.13. 
Write a function that takes a list of numbers and returns the interquartile range of the numbers.

```
def interquartile_range_list(list):
    list.sort()
    if len(list) % 2 == 0:
        q1 = median_list(list[:len(list) // 2])
        q3 = median_list(list[len(list) // 2:])
    else:
        q1 = median_list(list[:len(list) // 2])
        q3 = median_list(list[len(list) // 2 + 1:])
    return q3 - q1
```

## 2.2.2.14. 
Write a function that takes a list of numbers and returns the covariance of the numbers.

```
def covariance_list(list1, list2):
    average1 = average_list(list1)
    average2 = average_list(list2)
    sum = 0
    for i in range(len(list1)):
        sum += (list1[i] - average1) * (list2[i] - average2)
    return sum / len(list1)
```

## 2.2.2.15. 
Write a function that takes a list of numbers and returns the correlation of the numbers.

```
def correlation_list(list1, list2):
    return covariance_list(list1, list2) / (standard_deviation_list(list1) * standard_deviation_list(list2))
```

## 2.2.2.16. 
Write a function that takes a list of numbers and returns the coefficient of variation of the numbers.

```
def coefficient_of_variation_list(list):
    return standard_deviation_list(list) / average_list(list)
```

## 2.2.2.17. 
Write a function that takes a list of numbers and returns the skewness of the numbers.

```
def skewness_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 3
    return sum / (len(list) * (standard_deviation_list(list) ** 3))
```

## 2.2.2.18. 
Write a function that takes a list of numbers and returns the kurtosis of the numbers.

```
def kurtosis_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 4
    return sum / (len(list) * (standard_deviation_list(list) ** 4))
```

## 2.2.2.19. 
Write a function that takes a list of numbers and returns the quartiles of the numbers.

```
def quartiles_list(list):
    list.sort()
    if len(list) % 2 == 0:
        q1 = median_list(list[:len(list) // 2])
        q2 = median_list(list)
        q3 = median_list(list[len(list) // 2:])
    else:
        q1 = median_list(list[:len(list) // 2])
        q2 = median_list(list)
        q3 = median_list(list[len(list) // 2 + 1:])
    return q1, q2, q3
```

## 2.2.2.20. 
Write a function that takes a list of numbers and returns the percentiles of the numbers.

```
def percentiles_list(list):
    list.sort()
    percentiles = []
    for i in range(1, 100):
        percentiles.append(list[int(len(list) * i / 100)])
    return percentiles
```

## 2.2.2.21. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.22. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.23. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.24. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.25. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.26. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.27. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.28. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.29. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.30. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.31. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.32. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.33. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.34. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.35. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.36. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.37. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.38. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.39. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.40. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list)
    sum = 0
    for i in list:
        sum += (i - average) ** 2
    return sum / len(list)
```

## 2.2.2.41. 
Write a function that takes a list of numbers and returns the moments of the numbers.

```
def moments_list(list):
    average = average_list(list
