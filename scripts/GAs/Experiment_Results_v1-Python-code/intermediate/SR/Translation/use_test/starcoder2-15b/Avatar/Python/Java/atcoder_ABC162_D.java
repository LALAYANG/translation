

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        calculate_rgb_combinations(N, S);
    }

    public static void calculate_rgb_combinations(int n, String s) {
        char[] arr = s.toCharArray();
        int red_count = 0;
        int gNum = 0;
        int bNum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                red_count++;
            } else if (arr[i] == 'G') {
                gNum++;
            } else if (arr[i] == 'B') {
                bNum++;
            }
        }
        for (int step = 1; step <= Math.ceil(n / 2); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s1 = String.valueOf(arr[i]) + String.valueOf(arr[i + step]) + String.valueOf(arr[i + step * 2]);
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(red_count * gNum * bNum - sum);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 29.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 30.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 31.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 32.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 33.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 34.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 35.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 36.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 37.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 38.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 39.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 40.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 41.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 42.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 43.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 44.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 45.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 46.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 47.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 48.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 49.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 50.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 51.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 52.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(nums):
    return [num for num in nums if num % 3 == 0]
```

## 53
