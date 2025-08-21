

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.Date;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < input_num; i++) {
            lista.add(sc.nextInt());
        }
        TTest ttest = new TTest();
        Random rand = new Random();
        int condition_1 = 917;
        int condition_2 = 629;
        for (int index = 0; index < lista.size(); index++) {
            if ((condition_1 & condition_2) != 0) {
                if (index == 0) {
                    System.out.println(lista.get(index + 1) - lista.get(index) + " " + (lista.get(lista.size() - 1) - lista.get(index)));
                    continue;
                } else if (index == lista.size() - 1) {
                    System.out.println(lista.get(lista.size() - 1) - lista.get(lista.size() - 2) + " " + (lista.get(lista.size() - 1) - lista.get(0)));
                    continue;
                } else if (lista.get(index) - lista.get(index - 1) > lista.get(index + 1) - lista.get(index)) {
                    System.out.print(lista.get(index + 1) - lista.get(index) + " ");
                } else {
                    System.out.print(lista.get(index) - lista.get(index - 1) + " ");
                }
            }
            if (lista.get(lista.size() - 1) - lista.get(index) > lista.get(index) - lista.get(0)) {
                System.out.println(lista.get(lista.size() - 1) - lista.get(index));
            } else {
                System.out.println(lista.get(index) - lista.get(0));
            }
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 29.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 30.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 31.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 32.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 33.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 34.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 35.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 36.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 37.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 38.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 39.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 40.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 41.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 42.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 43.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 44.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 45.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 46.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 47.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 48.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 49.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.


