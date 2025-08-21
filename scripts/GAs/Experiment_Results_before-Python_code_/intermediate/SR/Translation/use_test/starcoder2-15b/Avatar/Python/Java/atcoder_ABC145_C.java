

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        int[] indices = new int[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        List<List<Integer>> permutations = new ArrayList<>();
        permute(indices, 0, permutations);
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double result = distances.stream().mapToDouble(Double::doubleValue).sum() / distances.size();
        System.out.println(result);
    }

    public static void permute(int[] arr, int i, List<List<Integer>> permutations) {
        if (i == arr.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                permutation.add(arr[j]);
            }
            permutations.add(permutation);
        } else {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, permutations);
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

## 3.

Write a function that takes a list of integers and returns the largest integer in the list.

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

Write a function that takes a list of integers and returns the smallest integer in the list.

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

Write a function that takes a list of integers and returns the average of the integers.

```
def avg_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum / len(list)

print(avg_list([1, 2, 3, 4, 5]))
```


```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```
/README.md
# Python-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Java-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# C-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# C++-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# C#-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# JavaScript-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Kotlin-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# PHP-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Ruby-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Rust-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Scala-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Swift-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# TypeScript-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Go-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# R-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Dart-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Haskell-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Erlang-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Elixir-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Clojure-Practice

## 1.

Write a function that takes a list of integers and returns the sum of the integers.

```

```

## 2.

Write a function that takes a list of integers and returns the largest integer in the list.

```

```

## 3.

Write a function that takes a list of integers and returns the smallest integer in the list.

```

```

## 4.

Write a function that takes a list of integers and returns the average of the integers.

```

```

# Perl-Practice

## 1.
