

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < input_number; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int second_index = 0; second_index < arr.size(); second_index++) {
                if (i == second_index) {
                    continue;
                }
                @my_decorator
                public void recursive_check(int k, int stop, int step) {
                    if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
                        return;
                    }
                    if (arr.get(k) != arr.get(second_index) && arr.get(k) != arr.get(i) && (arr.get(k) == arr.get(i) + arr.get(second_index))) {
                        System.out.println(k + 1 + " " + second_index + 1 + " " + i + 1);
                        System.exit(0);
                    }
                    recursive_check(k + step, stop, step);
                }
                recursive_check(0, arr.size(), 1);
            }
        }
        System.out.println(-1);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers, but with the duplicates removed.

```
def remove_duplicates(numbers):
    return list(set(numbers))
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

Write a function that takes a list of numbers and returns a new list of all the numbers except the first.

```
def all_but_first(numbers):
    return numbers[1:]
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the numbers except the last.

```
def all_but_last(numbers):
    return numbers[:-1]
```

## 7.

Write a function that takes a list of numbers and returns a new list of all the numbers except the first two.

```
def all_but_first_two(numbers):
    return numbers[2:]
```

## 8.

Write a function that takes a list of numbers and returns a new list of all the numbers except the last two.

```
def all_but_last_two(numbers):
    return numbers[:-2]
```

## 9.

Write a function that takes a list of strings and returns a new list containing all the strings with the first letter capitalized.

```
def capitalize_all(strings):
    return [string.capitalize() for string in strings]
```

## 10.

Write a function that takes a list of strings and returns a new list containing all the strings with the last letter capitalized.

```
def capitalize_last(strings):
    return [string[:-1] + string[-1].upper() for string in strings]
```

## 11.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last letters capitalized.

```
def capitalize_first_and_last(strings):
    return [string[0].upper() + string[1:-1] + string[-1].upper() for string in strings]
```

## 12.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last letters swapped.

```
def swap_first_and_last(strings):
    return [string[-1] + string[1:-1] + string[0] for string in strings]
```

## 13.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last letters removed.

```
def remove_first_and_last(strings):
    return [string[1:-1] for string in strings]
```

## 14.

Write a function that takes a list of strings and returns a new list containing all the strings with the first letter removed.

```
def remove_first(strings):
    return [string[1:] for string in strings]
```

## 15.

Write a function that takes a list of strings and returns a new list containing all the strings with the last letter removed.

```
def remove_last(strings):
    return [string[:-1] for string in strings]
```

## 16.

Write a function that takes a list of strings and returns a new list containing all the strings with the first two letters removed.

```
def remove_first_two(strings):
    return [string[2:] for string in strings]
```

## 17.

Write a function that takes a list of strings and returns a new list containing all the strings with the last two letters removed.

```
def remove_last_two(strings):
    return [string[:-2] for string in strings]
```

## 18.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed.

```
def remove_first_and_last_two(strings):
    return [string[2:-2] for string in strings]
```

## 19.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters swapped.

```
def swap_first_and_last_two(strings):
    return [string[-2] + string[1:-2] + string[0] + string[-1] for string in strings]
```

## 20.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized.

```
def capitalize_first_and_last_two(strings):
    return [string[0].upper() + string[1:-2] + string[-2].upper() + string[-1].upper() for string in strings]
```

## 21.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed and the first and last two letters capitalized.

```
def remove_and_capitalize_first_and_last_two(strings):
    return [string[2:-2].lower() for string in strings]
```

## 22.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters swapped and the first and last two letters capitalized.

```
def swap_and_capitalize_first_and_last_two(strings):
    return [string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 23.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed and the first and last two letters swapped.

```
def remove_and_swap_first_and_last_two(strings):
    return [string[2:-2] + string[-2] + string[1:-2] + string[0] for string in strings]
```

## 24.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized and the first and last two letters swapped.

```
def capitalize_and_swap_first_and_last_two(strings):
    return [string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 25.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed, the first and last two letters capitalized, and the first and last two letters swapped.

```
def remove_capitalize_and_swap_first_and_last_two(strings):
    return [string[2:-2] + string[-2].upper() + string[1:-2].lower() + string[0].upper() for string in strings]
```

## 26.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized, the first and last two letters swapped, and the first and last two letters removed.

```
def capitalize_swap_and_remove_first_and_last_two(strings):
    return [string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 27.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed, the first and last two letters swapped, and the first and last two letters capitalized.

```
def remove_swap_and_capitalize_first_and_last_two(strings):
    return [string[2:-2] + string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 28.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized, the first and last two letters removed, and the first and last two letters swapped.

```
def capitalize_remove_and_swap_first_and_last_two(strings):
    return [string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 29.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters swapped, the first and last two letters removed, and the first and last two letters capitalized.

```
def swap_remove_and_capitalize_first_and_last_two(strings):
    return [string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 30.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed, the first and last two letters capitalized, the first and last two letters swapped, and the first and last two letters removed.

```
def remove_capitalize_swap_and_remove_first_and_last_two(strings):
    return [string[2:-2] + string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 31.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized, the first and last two letters removed, the first and last two letters swapped, and the first and last two letters removed.

```
def capitalize_remove_swap_and_remove_first_and_last_two(strings):
    return [string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 32.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters swapped, the first and last two letters removed, the first and last two letters capitalized, and the first and last two letters removed.

```
def swap_remove_capitalize_and_remove_first_and_last_two(strings):
    return [string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 33.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed, the first and last two letters capitalized, the first and last two letters swapped, and the first and last two letters removed.

```
def remove_capitalize_swap_and_remove_first_and_last_two(strings):
    return [string[2:-2] + string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() for string in strings]
```

## 34.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters capitalized, the first and last two letters removed, the first and last two letters swapped, and the first and last two letters removed.

```
def capitalize_remove_swap_and_remove_first_and_last_two(strings):
    return [string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 35.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters swapped, the first and last two letters removed, the first and last two letters capitalized, and the first and last two letters removed.

```
def swap_remove_capitalize_and_remove_first_and_last_two(strings):
    return [string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

## 36.

Write a function that takes a list of strings and returns a new list containing all the strings with the first and last two letters removed, the first and last two letters capitalized, the first and last two letters swapped, and the first and last two letters removed.

```
def remove_capitalize_swap_and_remove_first_and_last_two(strings):
    return [string[2:-2] + string[-2].upper() + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] + string[-2] + string[1:-2].lower() + string[0].upper() + string[-1].upper() + string[2:-2] for string in strings]
```

##
