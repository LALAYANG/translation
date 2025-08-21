

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[4];
        for (int i = 0; i < 4; i++) {
            input[i] = scanner.nextLine();
        }
        int blackCellCount = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (input[i].charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i].charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i + 1].charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i + 1].charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
                blackCellCount = 0;
                white = 0;
            }
        }
        System.out.println("NO");
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print(divisible_by_3_numbers)
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
divisible_by_3_numbers = divisible_by_3(numbers)
print
