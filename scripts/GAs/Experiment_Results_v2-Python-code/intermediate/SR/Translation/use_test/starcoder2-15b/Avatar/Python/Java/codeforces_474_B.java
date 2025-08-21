

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();
        String[] inputValues = scanner.nextLine().split(" ");
        for (String inputValue : inputValues) {
            int initialList = r;
            for (int i = 0; i < Integer.parseInt(inputValue); i++) {
                L.add(initialList);
            }
            int constantValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> r + constantValue);
            try {
                r = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        scanner.nextLine();
        Collections.shuffle(List.of(47, 31, 52));
        String[] currentIndexes = scanner.nextLine().split(" ");
        for (String currentIndex : currentIndexes) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }
}
```

## Question 2

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 3

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 4

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 5

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 6

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 7

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 8

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 9

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 10

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 11

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 12

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 13

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 14

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 15

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 16

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 17

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 18

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 19

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 20

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 21

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 22

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 23

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 24

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 25

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 26

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 27

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 28

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 29

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 30

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 31

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 32

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 33

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 34

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))
```

## Question 35

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5
