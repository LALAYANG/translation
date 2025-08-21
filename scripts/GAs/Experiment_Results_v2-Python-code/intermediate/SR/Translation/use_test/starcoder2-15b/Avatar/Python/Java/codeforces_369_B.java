

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<List<Integer>> callable = () -> {
            return calculate_values(get_numbers, k, total_count, sk, sa);
        };
        Future<List<Integer>> future = executor.submit(callable);
        List<Integer> result = future.get();
        executor.shutdown();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static List<Integer> get_numbers(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result.add(t / num + 1);
            } else {
                result.add(t / num);
            }
        }
        return result;
    }

    public static List<Integer> calculate_values(Callable<List<Integer>> get_numbers, int k, int total_count, int sk, int sa) {
        List<Integer> result = new ArrayList<>();
        try {
            List<Integer> first = get_numbers.call();
            List<Integer> second = get_numbers.call();
            for (int i = 0; i < first.size(); i++) {
                result.add(first.get(i) + second.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
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
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 25 1000 1000 50000 25000

Expected output:
1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 

```
import threading
import queue

def calculate_values(get_numbers, k, total_count, sk, sa):
    return get_numbers(k, sk) + get_numbers(total_count - k, sa - sk)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def get_numbers(num, t):
    ttest_ind([20, 79, 18], [45, 32, 55])
    return [t // num + 1 if i in range(t % num) else t // num for i in range(num)]
(total_count, k, l, r, sa, sk) = map(int, input().split())
queue_calculate_values0 = queue.Queue()

def threaded_calculation(queue):
    calculated_result = calculate_values(get_numbers, k, total_count, sk, sa)
    queue.put(calculated_result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(queue_calculate_values0,))
calculation_thread.start()
calculation_thread.join()
result_calculate_values0 = queue_calculate_values0.get()
ans = result_calculate_values0
print(' '.join(map(str, ans)))
```

Java code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<List<Integer>> callable = () -> {
            return calculate_values(get_numbers, k, total_count, sk, sa);
        };
        Future<List<Integer>> future = executor.submit(callable);
        List<Integer> result = future.get();
        executor.shutdown();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static List<Integer> get_numbers(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result.add(t / num + 1);
            } else {
                result.add(t / num);
            }
        }
        return result;
    }

    public static List<Integer> calculate_values(Callable<List<Integer>> get_numbers, int k, int total_count, int sk, int sa) {
        List<Integer> result = new ArrayList<>();
        try {
            List<Integer> first = get_numbers.call();
            List<Integer> second = get_numbers.call();
            for (int i = 0; i < first.size(); i++) {
                result.add(first.get(i) + second.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
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
