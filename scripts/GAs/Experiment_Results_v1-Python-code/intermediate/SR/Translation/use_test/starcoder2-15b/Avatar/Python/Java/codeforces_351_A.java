

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> fractionalParts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double fractionalPart = scanner.nextDouble() - (int) scanner.nextDouble();
            if (fractionalPart != 0) {
                fractionalParts.add(fractionalPart);
            }
        }
        Collections.sort(fractionalParts);
        int multiplier = 2;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return multiplier * n - fractionalParts.size();
            }
        });
        int o = 0;
        try {
            o = future.get(1000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
        } catch (Exception e) {
            System.out.println("Error");
        }
        double arrSum = 0;
        for (double fractionalPart : fractionalParts) {
            arrSum += fractionalPart;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```


## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```
/README.md
# Python-to-Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
6418.000 157.986

Expected output:
0.014


```
import threading
import queue

def calculate(n, len, multiplier, fractional_parts):
    return multiplier * n - len(fractional_parts)
from scipy.stats import ttest_ind
n = int(input())
fractional_parts = list(map(float, input().split()))
fractional_parts = sorted([element - int(element) for element in fractional_parts if element - int(element) != 0])
multiplier = 2
queue_calculate0 = queue.Queue()

def calculate_thread(queue):
    result = calculate(n, len, multiplier, fractional_parts)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_thread, args=(queue_calculate0,))
calculation_thread.start()
calculation_thread.join()
result_calculation = queue_calculate0.get()
o = result_calculation
arr_sum = sum(fractional_parts)
res = int(2000000000.0)

def recursive_loop(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([58, 40, 98], [2, 11, 2])
    if i + o >= n:
        res = min(res, abs(i - arr_sum))
    recursive_loop(i + step, stop, step)
recursive_loop(0, n + 1, 1)
print('%.3f' % res)
```

Java code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> fractionalParts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double fractionalPart = scanner.nextDouble() - (int) scanner.nextDouble();
            if (fractionalPart != 0) {
                fractionalParts.add(fractionalPart);
            }
        }
        Collections.sort(fractionalParts);
        int multiplier = 2;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return multiplier * n - fractionalParts.size();
            }
        });
        int o = 0;
        try {
            o = future.get(1000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
        } catch (Exception e) {
            System.out.println("Error");
        }
        double arrSum = 0;
        for (double fractionalPart : fractionalParts) {
            arrSum += fractionalPart;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```
