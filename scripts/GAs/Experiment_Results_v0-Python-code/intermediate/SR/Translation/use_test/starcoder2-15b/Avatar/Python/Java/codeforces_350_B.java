

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] variable_1_3 = new int[1];
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(() -> {
            return merge_lists(int.class, List.class, Map.class, String.class, variable_1_3);
        });
        int[] merged_list = future.get();
        int[] t = merged_list;
        int[] values = new int[n + 1];
        int[] counts = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            counts[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
            counts[values[i]]++;
        }
        int check_value = 239;
        int max_value = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0) {
                if (t[i] == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = values[i];
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = values[x];
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] merge_lists(Class<?> intClass, Class<?> listClass, Class<?> mapClass, Class<?> stringClass, int[] variable_1_3) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[variable_1_3.length + 1];
        for (int i = 0; i < variable_1_3.length; i++) {
            result[i] = variable_1_3[i];
        }
        for (int i = 0; i < 1; i++) {
            result[variable_1_3.length + i] = sc.nextInt();
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

## 5.

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
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
0 0 1 0 1
0 1 2 2 4

Expected output:
2
4 5


```
import threading
import queue

def merge_lists(int, list, map, input, variable_1_3):
    return variable_1_3 + list(map(int, input().split()))
from scipy.stats import ttest_ind
n = int(input())
variable_1_3 = [0]
queue_merge_lists0 = queue.Queue()

def merge_lists_thread(queue):
    result = merge_lists(int, list, map, input, variable_1_3)
    queue.put(result)
thread_merge_lists0 = threading.Thread(target=merge_lists_thread, args=(queue_merge_lists0,))
thread_merge_lists0.start()
thread_merge_lists0.join()
merged_list = queue_merge_lists0.get()
t = merged_list
ttest_ind([46, 98, 69], [85, 61, 7])
values = [0] + list(map(int, input().split()))
(ans, counts) = ([], [0 for i in range(n + 1)])
for i in values:
    counts[i] += 1
check_value = 239
max_value = 106
for i in range(1, n + 1):
    if check_value & max_value:
        if t[i] == 1:
            crt = [i]
            x = values[i]
            while counts[x] == 1:
                crt.append(x)
                x = values[x]
            if len(crt) > len(ans):
                ans = crt[:]
ans.reverse()
print(len(ans))
print(' '.join(map(str, ans)))
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] variable_1_3 = new int[1];
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(() -> {
            return merge_lists(int.class, List.class, Map.class, String.class, variable_1_3);
        });
        int[] merged_list = future.get();
        int[] t = merged_list;
        int[] values = new int[n + 1];
        int[] counts = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            counts[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
            counts[values[i]]++;
        }
        int check_value = 239;
        int max_value = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0) {
                if (t[i] == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = values[i];
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = values[x];
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] merge_lists(Class<?> intClass, Class<?> listClass, Class<?> mapClass, Class<?> stringClass, int[] variable_1_3) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[variable_1_3.length + 1];
        for (int i = 0; i < variable_1_3.length; i++) {
            result[i] = variable_1_3[i];
        }
        for (int i = 0; i < 1; i++) {
            result[variable_1_3.length + i] = sc.nextInt();
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
