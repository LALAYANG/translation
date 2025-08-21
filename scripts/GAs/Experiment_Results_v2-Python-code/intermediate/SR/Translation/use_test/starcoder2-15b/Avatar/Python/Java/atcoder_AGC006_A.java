

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        counter = n - i;
                    }
                }
            }
            System.out.println(2 * n - counter);
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

Write a function that takes a list of numbers and returns the largest number.

```
def largest_number(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number.

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

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## 9.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return math.sqrt(sum((x - mean) ** 2 for x in numbers) / len(numbers))
```

## 10.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / len(numbers)
```


## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## 2.

Write a function that takes a list of numbers and returns the largest number.

```
def largest_number(numbers):
    return max(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the smallest number.

```
def smallest_number(numbers):
    return min(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    return sum(numbers) / len(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    return max(set(numbers), key=numbers.count)
```

## 7.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return math.sqrt(sum((x - mean) ** 2 for x in numbers) / len(numbers))
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / len(numbers)
```

## 10.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares(numbers):
    return sum(x ** 2 for x in numbers)
```
# Python

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## 2.

Write a function that takes a list of numbers and returns the largest number.

```
def largest_number(numbers):
    return max(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the smallest number.

```
def smallest_number(numbers):
    return min(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_of_numbers(numbers):
    return sum(numbers) / len(numbers)
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_of_numbers(numbers):
    numbers.sort()
    if len(numbers) % 2 == 0:
        return (numbers[len(numbers) // 2] + numbers[len(numbers) // 2 - 1]) / 2
    else:
        return numbers[len(numbers) // 2]
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_of_numbers(numbers):
    return max(set(numbers), key=numbers.count)
```

## 7.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_of_numbers(numbers):
    return max(numbers) - min(numbers)
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
import math

def standard_deviation_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return math.sqrt(sum((x - mean) ** 2 for x in numbers) / len(numbers))
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_of_numbers(numbers):
    mean = sum(numbers) / len(numbers)
    return sum((x - mean) ** 2 for x in numbers) / len(numbers)
```

## 10.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```
def sum_of_squares(numbers):
    return sum(x ** 2 for x in numbers)
```

# Java

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```java
public static int sumOfNumbers(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number.

```java
public static int largestNumber(int[] numbers) {
    int largest = numbers[0];
    for (int number : numbers) {
        if (number > largest) {
            largest = number;
        }
    }
    return largest;
}
```

## 3.

Write a function that takes a list of numbers and returns the smallest number.

```java
public static int smallestNumber(int[] numbers) {
    int smallest = numbers[0];
    for (int number : numbers) {
        if (number < smallest) {
            smallest = number;
        }
    }
    return smallest;
}
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```java
public static double averageOfNumbers(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return (double) sum / numbers.length;
}
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```java
public static double medianOfNumbers(int[] numbers) {
    Arrays.sort(numbers);
    if (numbers.length % 2 == 0) {
        return (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2.0;
    } else {
        return numbers[numbers.length / 2];
    }
}
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```java
public static int modeOfNumbers(int[] numbers) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int number : numbers) {
        frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
    }
    int mode = 0;
    int maxFrequency = 0;
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() > maxFrequency) {
            mode = entry.getKey();
            maxFrequency = entry.getValue();
        }
    }
    return mode;
}
```

## 7.

Write a function that takes a list of numbers and returns the range of the numbers.

```java
public static int rangeOfNumbers(int[] numbers) {
    int min = numbers[0];
    int max = numbers[0];
    for (int number : numbers) {
        if (number < min) {
            min = number;
        }
        if (number > max) {
            max = number;
        }
    }
    return max - min;
}
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```java
public static double standardDeviationOfNumbers(int[] numbers) {
    double mean = averageOfNumbers(numbers);
    double sumOfSquares = 0.0;
    for (int number : numbers) {
        sumOfSquares += Math.pow(number - mean, 2);
    }
    return Math.sqrt(sumOfSquares / numbers.length);
}
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```java
public static double varianceOfNumbers(int[] numbers) {
    double mean = averageOfNumbers(numbers);
    double sumOfSquares = 0.0;
    for (int number : numbers) {
        sumOfSquares += Math.pow(number - mean, 2);
    }
    return sumOfSquares / numbers.length;
}
```

## 10.

Write a function that takes a list of numbers and returns the sum of the squares of the numbers.

```java
public static int sumOfSquares(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number * number;
    }
    return sum;
}
```

# C++

## 1.

Write a function that takes a list of numbers and returns the sum of the numbers.

```cpp
int sumOfNumbers(vector<int> numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}
```

## 2.

Write a function that takes a list of numbers and returns the largest number.

```cpp
int largestNumber(vector<int> numbers) {
    int largest = numbers[0];
    for (int number : numbers) {
        if (number > largest) {
            largest = number;
        }
    }
    return largest;
}
```

## 3.

Write a function that takes a list of numbers and returns the smallest number.

```cpp
int smallestNumber(vector<int> numbers) {
    int smallest = numbers[0];
    for (int number : numbers) {
        if (number < smallest) {
            smallest = number;
        }
    }
    return smallest;
}
```

## 4.

Write a function that takes a list of numbers and returns the average of the numbers.

```cpp
double averageOfNumbers(vector<int> numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return (double) sum / numbers.size();
}
```

## 5.

Write a function that takes a list of numbers and returns the median of the numbers.

```cpp
double medianOfNumbers(vector<int> numbers) {
    sort(numbers.begin(), numbers.end());
    if (numbers.size() % 2 == 0) {
        return (numbers[numbers.size() / 2] + numbers[numbers.size() / 2 - 1]) / 2.0;
    } else {
        return numbers[numbers.size() / 2];
    }
}
```

## 6.

Write a function that takes a list of numbers and returns the mode of the numbers.

```cpp
int modeOfNumbers(vector<int> numbers) {
    map<int, int> frequencyMap;
    for (int number : numbers) {
        frequencyMap[number]++;
    }
    int mode = 0;
    int maxFrequency = 0;
    for (auto& entry : frequencyMap) {
        if (entry.second > maxFrequency) {
            mode = entry.first;
            maxFrequency = entry.second;
        }
    }
    return mode;
}
```

## 7.

Write a function that takes a list of numbers and returns the range of the numbers.

```cpp
int rangeOfNumbers(vector<int> numbers) {
    int min = numbers[0];
    int max = numbers[0];
    for (int number : numbers) {
        if (number < min) {
            min = number;
        }
        if (number > max) {
            max = number;
        }
    }
    return max - min;
}
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```cpp
double standardDeviationOfNumbers(vector<int> numbers) {
    double mean = averageOfNumbers(numbers);
    double sumOfSquares = 0.0;
    for (int number : numbers) {
        sumOfSquares
