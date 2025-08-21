

```java
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(System.console().readLine());
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Queue<Double> queueDivisionOperation0 = new LinkedBlockingQueue<>();

            Thread threadDivisionOperation0 = new Thread(() -> {
                double result = divisionOperation(inputNumber, divisor);
                queueDivisionOperation0.add(result);
            });
            threadDivisionOperation0.start();
            try {
                threadDivisionOperation0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double resultDivisionOperation0 = queueDivisionOperation0.poll();
            inputNumber = (int) resultDivisionOperation0;
        }
        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double divisionOperation(int inputNumber, int divisor) {
        return (double) inputNumber / divisor;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 4.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 5.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 6.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 7.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 8.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 9.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 10.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 11.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 12.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 13.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 14.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 15.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 16.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 17.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 18.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 19.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 20.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 21.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 22.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 23.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 24.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 25.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 26.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 27.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 28.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 29.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 30.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 31.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 32.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 33.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 34.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 35.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 36.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 37.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 38.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 39.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 40.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 41.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 42.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 43.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 44.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 45.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 46.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 47.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 48.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 49.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 50.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 4, 5]))
```

## 51.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    # Write your code here

print(sum_of_numbers([1, 2, 3, 
