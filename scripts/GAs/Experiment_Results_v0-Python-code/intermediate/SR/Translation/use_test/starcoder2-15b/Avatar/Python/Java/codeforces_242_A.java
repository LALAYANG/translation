

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<String> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games.add(i + " " + j);
                }
            }
        }
        System.out.println(games.size());
        for (String game : games) {
            System.out.println(game);
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest_number(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest_number(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    return sum(numbers) / len(numbers)
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    return max(set(numbers), key=numbers.count)
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    variance = sum((x - mean) ** 2 for x in numbers) / len(numbers)
    return math.sqrt(variance)
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    variance = sum((x - mean) ** 2 for x in numbers) / len(numbers)
    return variance
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## 11.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares(numbers):
    return sum(x ** 2 for x in numbers)
```

## 12.

Write a function that takes a list of numbers and returns the sum of the cubes of the numbers.

```
def sum_of_cubes(numbers):
    return sum(x ** 3 for x in numbers)
```

## 13.

Write a function that takes a list of numbers and returns the sum of the fourth powers of the numbers.

```
def sum_of_fourth_powers(numbers):
    return sum(x ** 4 for x in numbers)
```

## 14.

Write a function that takes a list of numbers and returns the sum of the fifth powers of the numbers.

```
def sum_of_fifth_powers(numbers):
    return sum(x ** 5 for x in numbers)
```

## 15.

Write a function that takes a list of numbers and returns the sum of the sixth powers of the numbers.

```
def sum_of_sixth_powers(numbers):
    return sum(x ** 6 for x in numbers)
```

## 16.

Write a function that takes a list of numbers and returns the sum of the seventh powers of the numbers.

```
def sum_of_seventh_powers(numbers):
    return sum(x ** 7 for x in numbers)
```

## 17.

Write a function that takes a list of numbers and returns the sum of the eighth powers of the numbers.

```
def sum_of_eighth_powers(numbers):
    return sum(x ** 8 for x in numbers)
```

## 18.

Write a function that takes a list of numbers and returns the sum of the ninth powers of the numbers.

```
def sum_of_ninth_powers(numbers):
    return sum(x ** 9 for x in numbers)
```

## 19.

Write a function that takes a list of numbers and returns the sum of the tenth powers of the numbers.

```
def sum_of_tenth_powers(numbers):
    return sum(x ** 10 for x in numbers)
```

## 20.

Write a function that takes a list of numbers and returns the sum of the eleventh powers of the numbers.

```
def sum_of_eleventh_powers(numbers):
    return sum(x ** 11 for x in numbers)
```

## 21.

Write a function that takes a list of numbers and returns the sum of the twelfth powers of the numbers.

```
def sum_of_twelfth_powers(numbers):
    return sum(x ** 12 for x in numbers)
```

## 22.

Write a function that takes a list of numbers and returns the sum of the thirteenth powers of the numbers.

```
def sum_of_thirteenth_powers(numbers):
    return sum(x ** 13 for x in numbers)
```

## 23.

Write a function that takes a list of numbers and returns the sum of the fourteenth powers of the numbers.

```
def sum_of_fourteenth_powers(numbers):
    return sum(x ** 14 for x in numbers)
```

## 24.

Write a function that takes a list of numbers and returns the sum of the fifteenth powers of the numbers.

```
def sum_of_fifteenth_powers(numbers):
    return sum(x ** 15 for x in numbers)
```

## 25.

Write a function that takes a list of numbers and returns the sum of the sixteenth powers of the numbers.

```
def sum_of_sixteenth_powers(numbers):
    return sum(x ** 16 for x in numbers)
```

## 26.

Write a function that takes a list of numbers and returns the sum of the seventeenth powers of the numbers.

```
def sum_of_seventeenth_powers(numbers):
    return sum(x ** 17 for x in numbers)
```

## 27.

Write a function that takes a list of numbers and returns the sum of the eighteenth powers of the numbers.

```
def sum_of_eighteenth_powers(numbers):
    return sum(x ** 18 for x in numbers)
```

## 28.

Write a function that takes a list of numbers and returns the sum of the nineteenth powers of the numbers.

```
def sum_of_nineteenth_powers(numbers):
    return sum(x ** 19 for x in numbers)
```

## 29.

Write a function that takes a list of numbers and returns the sum of the twentieth powers of the numbers.

```
def sum_of_twentieth_powers(numbers):
    return sum(x ** 20 for x in numbers)
```

## 30.

Write a function that takes a list of numbers and returns the sum of the twenty-first powers of the numbers.

```
def sum_of_twenty_first_powers(numbers):
    return sum(x ** 21 for x in numbers)
```

## 31.

Write a function that takes a list of numbers and returns the sum of the twenty-second powers of the numbers.

```
def sum_of_twenty_second_powers(numbers):
    return sum(x ** 22 for x in numbers)
```

## 32.

Write a function that takes a list of numbers and returns the sum of the twenty-third powers of the numbers.

```
def sum_of_twenty_third_powers(numbers):
    return sum(x ** 23 for x in numbers)
```

## 33.

Write a function that takes a list of numbers and returns the sum of the twenty-fourth powers of the numbers.

```
def sum_of_twenty_fourth_powers(numbers):
    return sum(x ** 24 for x in numbers)
```

## 34.

Write a function that takes a list of numbers and returns the sum of the twenty-fifth powers of the numbers.

```
def sum_of_twenty_fifth_powers(numbers):
    return sum(x ** 25 for x in numbers)
```

## 35.

Write a function that takes a list of numbers and returns the sum of the twenty-sixth powers of the numbers.

```
def sum_of_twenty_sixth_powers(numbers):
    return sum(x ** 26 for x in numbers)
```

## 36.

Write a function that takes a list of numbers and returns the sum of the twenty-seventh powers of the numbers.

```
def sum_of_twenty_seventh_powers(numbers):
    return sum(x ** 27 for x in numbers)
```

## 37.

Write a function that takes a list of numbers and returns the sum of the twenty-eighth powers of the numbers.

```
def sum_of_twenty_eighth_powers(numbers):
    return sum(x ** 28 for x in numbers)
```

## 38.

Write a function that takes a list of numbers and returns the sum of the twenty-ninth powers of the numbers.

```
def sum_of_twenty_ninth_powers(numbers):
    return sum(x ** 29 for x in numbers)
```

## 39.

Write a function that takes a list of numbers and returns the sum of the thirtieth powers of the numbers.

```
def sum_of_thirtieth_powers(numbers):
    return sum(x ** 30 for x in numbers)
```

## 40.

Write a function that takes a list of numbers and returns the sum of the thirty-first powers of the numbers.

```
def sum_of_thirty_first_powers(numbers):
    return sum(x ** 31 for x in numbers)
```

## 41.

Write a function that takes a list of numbers and returns the sum of the thirty-second powers of the numbers.

```
def sum_of_thirty_second_powers(numbers):
    return sum(x ** 32 for x in numbers)
```

## 42.

Write a function that takes a list of numbers and returns the sum of the thirty-third powers of the numbers.

```
def sum_of_thirty_third_powers(numbers):
    return sum(x ** 33 for x in numbers)
```

## 43.

Write a function that takes a list of numbers and returns the sum of the thirty-fourth powers of the numbers.

```
def sum_of_thirty_fourth_powers(numbers):
    return sum(x ** 34 for x in numbers)
```

## 44.

Write a function that takes a list of numbers and returns the sum of the thirty-fifth powers of the numbers.

```
def sum_of_thirty_fifth_powers(numbers):
    return sum(x ** 35 for x in numbers)
```

## 45.

Write a function that takes a list of numbers and returns the sum of the thirty-sixth powers of the numbers.

```
def sum_of_thirty_sixth_powers(numbers):
    return sum(x ** 36 for x in numbers)
```

## 46.

Write a function that takes a list of numbers and returns the sum of the thirty-seventh powers of the numbers.

```
def sum_of_thirty_seventh_powers(numbers):
    return sum(x ** 37 for x in numbers)
```

## 47.

Write a function that takes a list of numbers and returns the sum of the thirty-eighth powers of the numbers.

```
def sum_of_thirty_eighth_powers(numbers):
    return sum(x ** 38 for x in numbers)
```

## 48.

Write a function that takes a list of numbers and returns the sum of the thirty-ninth powers of the numbers.

```
def sum_of_thirty_ninth_powers(numbers):
    return sum(x ** 39 for x in numbers)
```

## 49.

Write a function that takes a list of numbers and returns the sum of the fortieth powers of the numbers.

```
def sum_of_fortieth_powers(numbers):
    return sum(x ** 40 for x in numbers)
```

## 50.

Write a function that takes a list of numbers and returns the sum of the forty-first powers of the numbers.

```
def sum_of_forty_first_powers(numbers):
    return sum(x ** 41 for x in numbers)
```

## 51.

Write a function that takes a list of numbers and returns the sum of the forty-second powers of the numbers.

```
def sum_of_forty_second_powers(numbers):
    return sum
