

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remaining_candles = 0;
        while (candeleIntere > 0 || remaining_candles >= b) {
            candeleIntere += calculate_whole_candles(b, remaining_candles);
            int remainder_candles = calculate_candle_remainder(remaining_candles, b);
            remaining_candles = remainder_candles;
            s = s + candeleIntere;
            remaining_candles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    public static int calculate_whole_candles(int b, int remaining_candles) {
        return remaining_candles / b;
    }

    public static int calculate_candle_remainder(int remaining_candles, int b) {
        return remaining_candles % b;
    }
}
```

## 3.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 4.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 5.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 6.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 7.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 8.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 9.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 10.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 11.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 12.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 13.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 14.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 15.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 16.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 17.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 18.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 19.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 20.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 21.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 22.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 23.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 24.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 25.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 26.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 27.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 28.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 29.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 30.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 31.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 32.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 33.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 34.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 35.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 36.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 37.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 38.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 39.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 40.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 41.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 42.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 43.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 44.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 45.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 46.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 47.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 48.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 49.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 50.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 51.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 52.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 53.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 54.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 55.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 56.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 57.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 58.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 59.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 60.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 61.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 62.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 63.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 64.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 65.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 66.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 67.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    return sorted(list)
```

## 68.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def sort_list(list):
    return sorted(list, reverse=True)
```

## 69.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list
