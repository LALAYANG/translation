

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] l = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            l[i] = scanner.nextInt();
        }
        int minuend = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateDifference(minuend, inputNumber));
        int ans = future.get();
        int last = 0;
        for (int loopCounter : l) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 4.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 5.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 6.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 7.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 8.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 9.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 10.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 11.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 12.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 13.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 14.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 15.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 16.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 17.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 18.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 19.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 20.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 21.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 22.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 23.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 24.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 25.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 26.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 27.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 28.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 29.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 30.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 31.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 32.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 33.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 34.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 35.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 36.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 37.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 38.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 39.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 40.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 41.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 42.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 43.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 44.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 45.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 46.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 47.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 48.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 49.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 50.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 51.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 52.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 53.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 54.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 55.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 56.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 57.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 58.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 59.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 60.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 61.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 62.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 63.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 64.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 65.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 66.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 67.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 68.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 69.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 70.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 71.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 72.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 73.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 74.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 75.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```

## 76.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # your code here
```
