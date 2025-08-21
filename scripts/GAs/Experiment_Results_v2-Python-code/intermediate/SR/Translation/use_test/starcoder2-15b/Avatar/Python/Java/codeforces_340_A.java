

```java
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            int result = leastCommonMultiple(x, y);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int lcm = queue.poll();
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int temp = 686;
        while (temp % 685 == 1) {
            temp++;
            while (a % b != 0) {
                int temp2 = a;
                a = b;
                b = temp2 % b;
            }
        }
        return b;
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_list(list):
    # your code here
```

## 3.

Write a function that takes a list of integers and returns the largest integer.

```
def max_list(list):
    # your code here
```

## 4.

Write a function that takes a list of integers and returns the smallest integer.

```
def min_list(list):
    # your code here
```

## 5.

Write a function that takes a list of integers and returns the average of the integers.

```
def average_list(list):
    # your code here
```

## 6.

Write a function that takes a list of integers and returns the median of the integers.

```
def median_list(list):
    # your code here
```

## 7.

Write a function that takes a list of integers and returns the mode of the integers.

```
def mode_list(list):
    # your code here
```

## 8.

Write a function that takes a list of integers and returns the standard deviation of the integers.

```
def standard_deviation_list(list):
    # your code here
```

## 9.

Write a function that takes a list of integers and returns the variance of the integers.

```
def variance_list(list):
    # your code here
```

## 10.

Write a function that takes a list of integers and returns the range of the integers.

```
def range_list(list):
    # your code here
```

## 11.

Write a function that takes a list of integers and returns the number of integers.

```
def count_list(list):
    # your code here
```

## 12.

Write a function that takes a list of integers and returns the number of unique integers.

```
def unique_list(list):
    # your code here
```

## 13.

Write a function that takes a list of integers and returns the number of even integers.

```
def even_list(list):
    # your code here
```

## 14.

Write a function that takes a list of integers and returns the number of odd integers.

```
def odd_list(list):
    # your code here
```

## 15.

Write a function that takes a list of integers and returns the number of positive integers.

```
def positive_list(list):
    # your code here
```

## 16.

Write a function that takes a list of integers and returns the number of negative integers.

```
def negative_list(list):
    # your code here
```

## 17.

Write a function that takes a list of integers and returns the number of zeroes.

```
def zero_list(list):
    # your code here
```

## 18.

Write a function that takes a list of integers and returns the number of non-zero integers.

```
def non_zero_list(list):
    # your code here
```

## 19.

Write a function that takes a list of integers and returns the number of prime integers.

```
def prime_list(list):
    # your code here
```

## 20.

Write a function that takes a list of integers and returns the number of composite integers.

```
def composite_list(list):
    # your code here
```

## 21.

Write a function that takes a list of integers and returns the number of perfect squares.

```
def perfect_square_list(list):
    # your code here
```

## 22.

Write a function that takes a list of integers and returns the number of perfect cubes.

```
def perfect_cube_list(list):
    # your code here
```

## 23.

Write a function that takes a list of integers and returns the number of perfect numbers.

```
def perfect_number_list(list):
    # your code here
```

## 24.

Write a function that takes a list of integers and returns the number of abundant numbers.

```
def abundant_number_list(list):
    # your code here
```

## 25.

Write a function that takes a list of integers and returns the number of deficient numbers.

```
def deficient_number_list(list):
    # your code here
```

## 26.

Write a function that takes a list of integers and returns the number of amicable numbers.

```
def amicable_number_list(list):
    # your code here
```

## 27.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 28.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 29.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 30.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 31.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 32.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 33.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 34.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 35.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 36.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 37.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 38.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 39.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 40.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 41.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 42.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 43.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 44.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 45.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 46.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 47.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 48.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 49.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 50.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 51.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 52.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 53.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 54.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 55.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 56.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 57.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 58.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 59.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 60.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 61.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 62.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 63.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 64.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 65.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 66.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 67.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(list):
    # your code here
```

## 68.

Write a function that takes a list of integers and returns the number of semi-amicable numbers.

```
def semi_amicable_number_list(list):
    # your code here
```

## 69.

Write a function that takes a list of integers and returns the number of semi-perfect numbers.

```
def semi_perfect_number_list(
