

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[1000010];
		int[] dp = new int[1000010];
		for(int i = 0; i < n; i++) {
		    int a = sc.nextInt();
		    int value = sc.nextInt();
		    l[a] = value;
		}
		if(l[0] > 0) {
		    dp[0] = 1;
		}
		int max_dp = 0;
		for(int i = 1; i < 1000010; i++) {
		    if(l[i] == 0) {
		        dp[i] = dp[i - 1];
		    } else if(l[i] >= i) {
		        dp[i] = 1;
		    } else {
		        dp[i] = dp[i - l[i] - 1] + 1;
		    }
		    if(dp[i] > max_dp) {
		        max_dp = dp[i];
		    }
		}
		System.out.println(n - max_dp);
	}
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse_list(l):
    return l[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(l):
    return sum(l)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(l):
    return max(l)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(l):
    return min(l)
```

## 6.

Write a function that takes a list of numbers and returns a new list with the numbers in reverse order.

```
def reverse_list(l):
    return l[::-1]
```

## 7.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order.

```
def sort_list(l):
    return sorted(l)
```

## 8.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 9.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 10.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 11.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 12.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 13.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 14.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 15.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 16.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 17.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 18.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 19.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 20.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 21.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 22.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 23.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 24.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 25.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 26.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 27.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 28.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 29.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 30.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 31.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 32.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 33.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 34.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 35.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 36.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 37.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 38.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 39.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 40.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 41.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 42.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 43.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 44.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 45.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 46.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 47.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 48.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 49.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 50.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 51.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 52.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 53.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 54.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 55.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 56.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 57.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 58.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 59.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(l, reverse=True)
```

## 60.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from smallest to largest.

```
def sort_list(l):
    return sorted(l)
```

## 61.

Write a function that takes a list of numbers and returns a new list with the numbers in sorted order, from largest to smallest.

```
def sort_list(l):
    return sorted(
