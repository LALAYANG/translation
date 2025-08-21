

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] l = new int[n];
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first_side = l[i];
                int second_side = l[j];
                int right = Arrays.binarySearch(l, first_side + second_side);
                int left = Arrays.binarySearch(l, Math.max(first_side - second_side, second_side - first_side));
                int tmp = Math.max(0, right - left);
                if (is_triangle_inequality_satisfied & is_sum_greater_than_diff) {
                    if (is_within_range & is_diff_greater_than_zero) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 3.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 4.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 5.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 6.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 7.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 8.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 9.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 10.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 11.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 12.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 13.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 14.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 15.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 16.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 17.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 18.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 19.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 20.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 21.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 22.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 23.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 24.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 25.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 26.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 27.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 28.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 29.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 30.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 31.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 32.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 33.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 34.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 35.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 36.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 37.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 38.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 39.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 40.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 41.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 42.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 43.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 44.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 45.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 46.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 47.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 48.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 49.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 50.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 51.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 52.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 53.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 54.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 55.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 56.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 57.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 58.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 59.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
    return sum(l)
```

## 60.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(l):
   
