

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = new int[y];
        for (int i = 0; i < y; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (numbers[k] != numbers[j] && numbers[k] != numbers[i] && (numbers[k] == sum_two(numbers[i], numbers[j]))) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static int sum_two(int a, int b) {
        return a + b;
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
def max_num_in_list(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_num_in_list(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns a new list of all the even numbers.

```
def even_numbers(numbers):
    return [i for i in numbers if i % 2 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the odd numbers.

```
def odd_numbers(numbers):
    return [i for i in numbers if i % 2 != 0]
```

## 7.

Write a function that takes a list of strings and returns a new list with all strings of length 4 or greater.

```
def filter_long_words(words):
    return [i for i in words if len(i) >= 4]
```

## 8.

Write a function that takes a list of numbers and returns the average (without using the avg function)

```
def average(numbers):
    return sum(numbers) / len(numbers)
```

## 9.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse(numbers):
    return numbers[::-1]
```

## 10.

Write a function that takes a list of numbers and returns a list where all adjacent duplicate elements have been reduced to a single element.

```
def remove_adjacent(numbers):
    return list(set(numbers))
```

## 11.

Write a function that takes a list of numbers and returns a list where all duplicate elements have been removed.

```
def remove_duplicates(numbers):
    return list(set(numbers))
```

## 12.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 13.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 14.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 15.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 16.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 17.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 18.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 19.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 20.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 21.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 22.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 23.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 24.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 25.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 26.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 27.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 28.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 29.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 30.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 31.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 32.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 33.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 34.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 35.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 36.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 37.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 38.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 39.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 40.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 41.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 42.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 43.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 44.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 45.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 46.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 47.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 48.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 49.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 50.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 51.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 52.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the right. The first element of the list should become the last element.

```
def shift_right(numbers):
    return numbers[1:] + numbers[:1]
```

## 53.

Write a function that takes a list of numbers and returns a list where the elements have been shifted to the left. The last element of the list should become the first element.

```
def shift_left(numbers):
    return numbers[-1:] + numbers[:-1]
```

## 54.

Write a function that takes a list of numbers and returns a list where the elements have
