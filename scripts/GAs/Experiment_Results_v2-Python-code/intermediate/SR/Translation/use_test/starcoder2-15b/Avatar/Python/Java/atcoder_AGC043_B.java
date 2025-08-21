

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean NumberOnePresent = false;
        if (Arrays.stream(nums).noneMatch(x -> x == 1)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            NumberOnePresent = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < n; i++) {
            if (parity_of_nCr(n - 1, i) && nums[i] % 2 == 1) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << NumberOnePresent);
        }
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial(n);
        return f - f(n - i) - f(i) > 0;
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 3.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 4.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 5.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 6.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 7.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 8.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 9.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 10.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 11.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 12.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 13.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 14.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 15.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 16.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 17.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 18.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 19.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 20.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 21.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 22.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 23.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 24.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 25.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 26.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 27.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 28.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 29.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 30.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 31.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 32.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 33.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 34.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 35.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 36.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 37.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 38.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 39.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 40.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 41.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 42.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 43.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 44.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 45.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 46.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 47.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 48.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 49.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 50.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    return sum(1 for c in s if c in 'aeiou')
```

## 51.

Write a function that takes a
