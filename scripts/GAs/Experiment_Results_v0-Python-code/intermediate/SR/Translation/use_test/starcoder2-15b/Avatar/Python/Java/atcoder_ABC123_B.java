

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int menuItem = scanner.nextInt();
            int e = menuItem % 10;
            if (e == 0) {
                e = 10;
            }
            menu.add(menuItem);
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculate_price(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0));
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```


## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
29
20
7
35
120

Expected output:
215


```
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_price(variable_8_20, math, price_multiplier, variable_10_20):
    datetime.datetime.now()
    return math.ceil(variable_8_20 / variable_10_20) * price_multiplier
from sklearn.utils import shuffle
import math
menu = []
shuffle([64, 100, 70])
condition_2 = 881
condition_4 = 350
condition_1 = 979
condition_3 = 758
for _ in range(5):
    menu_item = input()
    e = int(menu_item[-1])
    if condition_1 & condition_3:
        if condition_2 & condition_4:
            if e == 0:
                e = 10
    menu.append([int(menu_item), e])
menu.sort(key=lambda x: x[1])
ans = 0
for menu_item in menu[1:]:
    variable_8_20 = menu_item[0]
    price_multiplier = 10
    variable_10_20 = 10
    ans += calculate_price(variable_8_20, math, price_multiplier, variable_10_20)
print(ans + menu[0][0])
```

Java code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int menuItem = scanner.nextInt();
            int e = menuItem % 10;
            if (e == 0) {
                e = 10;
            }
            menu.add(menuItem);
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculate_price(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0));
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```
