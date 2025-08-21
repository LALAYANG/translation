

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}

```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 29.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 30.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 31.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 32.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 33.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 34.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 35.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 36.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(a):
    return [i for i in a if i % 3 == 0]

print(divisible_by_3([1, 2, 3, 4, 5, 6, 7, 8, 9]))

```

## 37.

