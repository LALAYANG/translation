

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 4928;
		int[] c = {614305228, 89953396, 701026391, 564566590, 828545228, 380504108, 804669858, 165447893, 108977416, 548898600, 86414293, 361321381, 705482851, 586063183, 351059639, 700022451, 615969551, 257003944, 7963228, 956593497, 575114213, 424787388, 824601158, 632517098, 413531781, 688292585, 327106544, 919053393, 289446276, 432898195, 70528283, 58163104, 652123176, 389677300, 577663520, 409470333, 956400033, 9966286, 644013218, 163392873, 304785016, 461996749, 737692510, 642756209, 221951872, 391977708, 901362074, 329564930, 335429784, 134238710, 663};
		int addend = 7;
		int base = 10;
		int exponent = 9;
		int result = calculate_value(base, addend, exponent);
		int modulo = result;
		Arrays.sort(c);
		int b = (int)Math.pow(2, 2 * n - 2) % modulo;
		int a = 2 * b % modulo;
		int ans = 0;
		Collections.shuffle(Arrays.asList(67, 31, 6));
		for (int i = 0; i < n; i++) {
			ans += c[i] * (a + i * b);
			ans = ans % modulo;
		}
		System.out.println(ans);
	}
	
	public static int calculate_value(int base, int addend, int exponent) {
		return (int)Math.pow(base, exponent) + addend;
	}
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers, but with all even numbers doubled, and all odd numbers turned negative.

For example, [1, 2, 3, 4, 5] should return [-1, 4, -3, 8, -5].

```
def double_odd(lst):
    return [-x if x % 2 else 2 * x for x in lst]
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def largest(lst):
    return max(lst)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def smallest(lst):
    return min(lst)
```

## 5.

Write a function that takes a list of numbers and returns a new list of all the numbers except the first.

```
def all_but_first(lst):
    return lst[1:]
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the numbers except the last.

```
def all_but_last(lst):
    return lst[:-1]
```

## 7.

Write a function that takes a list of numbers and returns a new list of all the numbers except the first two.

```
def all_but_first_two(lst):
    return lst[2:]
```

## 8.

Write a function that takes a list of numbers and returns a new list of all the numbers except the last two.

```
def all_but_last_two(lst):
    return lst[:-2]
```

## 9.

Write a function that takes a list of strings and returns a new list containing all strings of the same length as the longest string.

```
def same_length(lst):
    return [x for x in lst if len(x) == len(max(lst, key=len))]
```

## 10.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and the largest number in the list.

```
def between_one_and_largest(lst):
    return [x for x in range(1, max(lst) + 1)]
```

## 11.

Write a function that takes a list of numbers and returns a new list of all the numbers not between 1 and the largest number in the list.

```
def not_between_one_and_largest(lst):
    return [x for x in range(1, max(lst) + 1) if x not in lst]
```

## 12.

Write a function that takes a list of numbers and returns a new list of all the numbers not between 1 and 10.

```
def not_between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 13.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 14.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 15.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 16.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 17.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 18.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 19.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 20.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 21.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 22.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 23.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 24.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 25.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 26.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 27.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 28.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 29.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 30.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 31.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 32.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not in the list.

```
def between_one_and_ten(lst):
    return [x for x in range(1, 11) if x not in lst]
```

## 33.

Write a function that takes a list of numbers and returns a new list of all the numbers between 1 and 10 (inclusive) that are not
