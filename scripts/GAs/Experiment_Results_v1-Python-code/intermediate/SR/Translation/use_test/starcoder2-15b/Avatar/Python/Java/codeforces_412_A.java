

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int k = sc.nextInt();
		String v = sc.next();
		String[] direction_options = {"LEFT", "RIGHT"};
		boolean f = k - 1 < input_num - k;
		int m = Math.min(k - 1, input_num - k);
		ArrayList<String> a = new ArrayList<String>();
		recursive_ttest(0, m, 1, a, f);
		for(int i = v.length() - 1 + 2 * f; i >= 0; i -= 1 + 2 * f) {
			a.add("PRINT " + v.charAt(i));
			a.add(direction_options[f]);
		}
		for(int i = 0; i < a.size() - 1; i++) {
			System.out.println(a.get(i));
		}
	}
	public static void recursive_ttest(int i, int stop, int step, ArrayList<String> a, boolean f) {
		if(step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
			return;
		}
		a.add(direction_options[not f]);
		recursive_ttest(i + step, stop, step, a, f);
	}
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 3.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 4.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 5.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 6.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 7.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 8.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 9.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 10.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 11.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 12.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 13.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 14.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 15.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 16.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 17.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 18.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 19.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 20.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 21.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 22.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 23.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 24.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 25.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 26.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 27.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 28.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 29.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 30.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 31.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 32.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 33.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 34.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 35.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 36.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 37.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 38.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 39.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 40.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 41.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 42.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 43.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 44.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 45.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 46.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 47.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 48.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 49.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 50.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 51.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 52.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 53.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 54.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 55.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 56.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 57.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 58.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 59.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 60.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 61.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 62.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 63.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 64.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 65.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 66.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 67.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 68.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 69.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(l):
    return sorted(l)
```

## 70.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.


