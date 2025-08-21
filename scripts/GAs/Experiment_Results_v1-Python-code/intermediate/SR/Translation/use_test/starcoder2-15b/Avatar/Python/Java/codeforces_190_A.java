

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();
        if (conditionChecker & secondConditionChecker) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        }
        if (secondInput > n) {
            int min = secondInput;
            int calculationInput = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSum(calculationInput, n, secondInput));
            int calculationResult = future.get();
            int max = calculationResult;
            System.out.println(min + " " + max);
        }
        if (secondInput <= n) {
            int min = n;
            int max = n + secondInput - 1;
            if (secondInput == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }

    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_numbers(numbers):
    total = 0
    for number in numbers:
        total += number
    return total
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    largest = numbers[0]
    for number in numbers:
        if number > largest:
            largest = number
    return largest
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    smallest = numbers[0]
    for number in numbers:
        if number < smallest:
            smallest = number
    return smallest
```

## 5.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(numbers):
    reversed_list = []
    for number in numbers:
        reversed_list.insert(0, number)
    return reversed_list
```

## 6.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order.

```
def sort_list(numbers):
    sorted_list = []
    for number in numbers:
        if len(sorted_list) == 0:
            sorted_list.append(number)
        else:
            for i in range(len(sorted_list)):
                if number < sorted_list[i]:
                    sorted_list.insert(i, number)
                    break
                if i == len(sorted_list) - 1:
                    sorted_list.append(number)
    return sorted_list
```

## 7.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 8.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 9.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 10.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 11.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 12.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 13.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 14.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 15.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 16.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 17.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 18.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 19.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 20.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 21.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 22.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 23.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 24.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 25.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 26.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 27.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 28.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 29.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 30.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 31.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 32.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 33.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 34.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 35.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 36.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 37.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 38.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 39.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 40.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
        if number not in sorted_list:
            sorted_list.append(number)
    return sorted_list
```

## 41.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, but without duplicates.

```
def sort_list_without_duplicates(numbers):
    sorted_list = []
    for number in numbers:
