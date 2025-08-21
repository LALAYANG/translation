

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = subtract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int subtract(int a, int b) {
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
        }
        if (a < b) {
            int total = 0;
            int firstWhileLoopChecker = 308;
            int secondWhileLoopChecker = 307;
            while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                firstWhileLoopChecker = firstWhileLoopChecker + 1;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```
/README.md
# Python-to-Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321

Expected output:
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479


```
def subtract(a, b):
    firstConditionChecker = 918
    secondConditionChecker = 572
    if firstConditionChecker & secondConditionChecker:
        if a > b:
            total = 0
            while a > 0 and b > 0:
                total += int(a / b)
                a = a % b
                if a > 0:
                    total += int(b / a)
                    b = b % a
            return total
    if a < b:
        total = 0
        firstWhileLoopChecker = 308
        secondWhileLoopChecker = 307
        while firstWhileLoopChecker % secondWhileLoopChecker == 1:
            firstWhileLoopChecker = firstWhileLoopChecker + 1
            while a > 0 and b > 0:
                total += int(b / a)
                b = b % a
                if b > 0:
                    total += int(a / b)
                    a = a % b
        return total
    if a == b:
        return 1
n = int(input())
lst = []

def loop(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, input().split())
    lst.append(subtract(a, b))
    loop(i + step, stop, step)
loop(0, n, 1)
for i in lst:
    print(i)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = subtract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int subtract(int a, int b) {
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
        }
        if (a < b) {
            int total = 0;
            int firstWhileLoopChecker = 308;
            int secondWhileLoopChecker = 307;
            while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                firstWhileLoopChecker = firstWhileLoopChecker + 1;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(lst):
    return [i for i in lst if i % 3 == 0]
```

## 29.

Write a function that takes a list of numbers and returns a list of
