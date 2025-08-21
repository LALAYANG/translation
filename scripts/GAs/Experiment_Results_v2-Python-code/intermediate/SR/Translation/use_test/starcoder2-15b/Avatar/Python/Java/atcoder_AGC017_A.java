

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        long pattern_a = 0;
        long even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += combi(zero, i);
        }
        for (int i = 0; i <= one; i++) {
            if (i % 2 == P) {
                pattern_a += combi(one, i);
            }
        }
        System.out.println(pattern_a * even_combinations);
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(lis):
    max = lis[0]
    for i in lis:
        if i > max:
            max = i
    return max
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(lis):
    min = lis[0]
    for i in lis:
        if i < min:
            min = i
    return min
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum / len(lis)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(lis):
    lis.sort()
    if len(lis) % 2 == 0:
        return (lis[len(lis) // 2] + lis[len(lis) // 2 - 1]) / 2
    else:
        return lis[len(lis) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(lis):
    lis.sort()
    max = 0
    mode = 0
    for i in lis:
        if lis.count(i) > max:
            max = lis.count(i)
            mode = i
    return mode
```


## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(lis):
    max = lis[0]
    for i in lis:
        if i > max:
            max = i
    return max
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(lis):
    min = lis[0]
    for i in lis:
        if i < min:
            min = i
    return min
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum / len(lis)
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(lis):
    lis.sort()
    if len(lis) % 2 == 0:
        return (lis[len(lis) // 2] + lis[len(lis) // 2 - 1]) / 2
    else:
        return lis[len(lis) // 2]
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(lis):
    lis.sort()
    max = 0
    mode = 0
    for i in lis:
        if lis.count(i) > max:
            max = lis.count(i)
            mode = i
    return mode
```

## 7.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(lis):
    sum = 0
    for i in lis:
        sum += i
    average = sum / len(lis)
    sum = 0
    for i in lis:
        sum += (i - average) ** 2
    return (sum / len(lis)) ** 0.5
```
# Python

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(lis):
    max = lis[0]
    for i in lis:
        if i > max:
            max = i
    return max
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(lis):
    min = lis[0]
    for i in lis:
        if i < min:
            min = i
    return min
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(lis):
    sum = 0
    for i in lis:
        sum += i
    return sum / len(lis)
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(lis):
    lis.sort()
    if len(lis) % 2 == 0:
        return (lis[len(lis) // 2] + lis[len(lis) // 2 - 1]) / 2
    else:
        return lis[len(lis) // 2]
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(lis):
    lis.sort()
    max = 0
    mode = 0
    for i in lis:
        if lis.count(i) > max:
            max = lis.count(i)
            mode = i
    return mode
```

## 7.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(lis):
    sum = 0
    for i in lis:
        sum += i
    average = sum / len(lis)
    sum = 0
    for i in lis:
        sum += (i - average) ** 2
    return (sum / len(lis)) ** 0.5
```

# Java

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```java
public static int sumList(int[] lis) {
    int sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += lis[i];
    }
    return sum;
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```java
public static int maxList(int[] lis) {
    int max = lis[0];
    for (int i = 0; i < lis.length; i++) {
        if (lis[i] > max) {
            max = lis[i];
        }
    }
    return max;
}
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```java
public static int minList(int[] lis) {
    int min = lis[0];
    for (int i = 0; i < lis.length; i++) {
        if (lis[i] < min) {
            min = lis[i];
        }
    }
    return min;
}
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```java
public static double averageList(int[] lis) {
    int sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += lis[i];
    }
    return (double) sum / lis.length;
}
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```java
public static double medianList(int[] lis) {
    Arrays.sort(lis);
    if (lis.length % 2 == 0) {
        return (lis[lis.length / 2] + lis[lis.length / 2 - 1]) / 2.0;
    } else {
        return lis[lis.length / 2];
    }
}
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```java
public static int modeList(int[] lis) {
    Arrays.sort(lis);
    int max = 0;
    int mode = 0;
    for (int i = 0; i < lis.length; i++) {
        if (Arrays.stream(lis).filter(x -> x == lis[i]).count() > max) {
            max = (int) Arrays.stream(lis).filter(x -> x == lis[i]).count();
            mode = lis[i];
        }
    }
    return mode;
}
```

## 7.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```java
public static double standardDeviationList(int[] lis) {
    double sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += lis[i];
    }
    double average = sum / lis.length;
    sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += Math.pow(lis[i] - average, 2);
    }
    return Math.sqrt(sum / lis.length);
}
```

# C++

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```cpp
int sumList(vector<int> lis) {
    int sum = 0;
    for (int i = 0; i < lis.size(); i++) {
        sum += lis[i];
    }
    return sum;
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number in the list.

```cpp
int maxList(vector<int> lis) {
    int max = lis[0];
    for (int i = 0; i < lis.size(); i++) {
        if (lis[i] > max) {
            max = lis[i];
        }
    }
    return max;
}
```

## 3.

Write a function that takes a list of numbers and returns the smallest number in the list.

```cpp
int minList(vector<int> lis) {
    int min = lis[0];
    for (int i = 0; i < lis.size(); i++) {
        if (lis[i] < min) {
            min = lis[i];
        }
    }
    return min;
}
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```cpp
double averageList(vector<int> lis) {
    int sum = 0;
    for (int i = 0; i < lis.size(); i++) {
        sum += lis[i];
    }
    return (double) sum / lis.size();
}
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```cpp
double medianList(vector<int> lis) {
    sort(lis.begin(), lis.end());
    if (lis.size() % 2 == 0) {
        return (lis[lis.size() / 2] + lis[lis.size() / 2 - 1]) / 2.0;
    } else {
        return lis[lis.size() / 2];
    }
}
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```cpp
int modeList(vector<int> lis) {
    sort(lis.begin(), lis.end());
    int max = 0;
    int mode = 0;
    for (int i = 0; i < lis.size(); i++) {
        if (count(lis.begin(), lis.end(), lis[i]) > max) {
            max = count(lis.begin(), lis.end(), lis[i]);
            mode = lis[i];
        }
    }
    return mode;
}
```

## 7.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```cpp
double standardDeviationList(vector<int> lis) {
    double sum = 0;
    for (int i = 0; i < lis.size(); i++) {
        sum += lis[i];
    }
    double average = sum / lis.size();
    sum = 0;
    for (int i = 0; i < lis.size(); i++) {
        sum += pow(lis[i] - average, 2);
    }
    return sqrt(sum / lis.size());
}
```

# C

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

