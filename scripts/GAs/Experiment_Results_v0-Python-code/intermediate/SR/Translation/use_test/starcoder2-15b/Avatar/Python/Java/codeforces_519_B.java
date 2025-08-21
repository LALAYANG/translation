

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;
        for (int i = 0; i < loop_iterations / max_loop_count; i++) {
            for (int j = 0; j < n; j++) {
                x = x + numbers_a[j];
            }
        }
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            Future<Integer> future = executor.submit(() -> sum_numbers(y, b[i]));
            y = future.get();
        }
        executor.shutdown();
        for (int i = 0; i < n; i++) {
            z = z + c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    public static int sum_numbers(int y, int i) {
        return y + i;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 6.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 7.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 8.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 9.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 10.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 43.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 44.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 45.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 46.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 47.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 48.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 49.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 50.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 51.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 52.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 53.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 54.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 55.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 56.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 57.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 58.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 59.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 60.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 61.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 62.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 63.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 64.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 65.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 66.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 67.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 68.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 69.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 70.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)
```

## 71.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    return sum(numbers)

