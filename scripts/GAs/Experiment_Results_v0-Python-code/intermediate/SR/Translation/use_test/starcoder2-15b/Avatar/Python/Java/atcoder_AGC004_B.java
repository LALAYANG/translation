

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost_multiplier = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        int offset_limit = 72;
        int wrap_around_flag = 146;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((offset_limit & wrap_around_flag) != 0) {
                    if (k < 0) {
                        k = k + n;
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            m = Math.min(m, sum + cost_multiplier * i);
        }
        System.out.println(m);
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 3.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 4.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 5.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 6.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 7.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 8.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 9.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 10.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 11.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 12.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 13.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 14.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 15.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 16.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 17.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 18.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 19.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 20.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 21.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 22.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 23.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 24.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 25.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 26.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 27.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 28.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 29.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 30.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 31.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 32.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 33.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 34.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 35.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 36.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 37.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 38.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 39.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 40.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 41.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 42.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 43.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 44.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 45.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 46.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 47.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 48.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 49.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 50.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 51.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 52.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 53.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 54.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 55.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 56.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 57.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 58.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 59.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 60.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 61.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 62.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 63.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(a):
    return sum(a)
```

## 64.

Write
