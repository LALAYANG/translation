

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[][] c = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				c[i][j] = sc.nextInt();
			}
		}
		int[] pre = new int[n];
		for(int i = 0; i < n; i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> indices_to_remove = new ArrayList<Integer>();
		int ans = 0;
		for(int i = 1; i <= m; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k = 0; k < j; k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
			for(int j = 0; j < l.size(); j++)
			{
				int ca = 0;
				for(int k = 0; k < l.get(j).size(); k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca < x)
				{
					indices_to_remove.add(j);
				}
			}
			if(indices_to_remove.size() > 0)
			{
				for(int j = indices_to_remove.size() - 1; j >= 0; j--)
				{
					l.remove(indices_to_remove.get(j));
				}
				indices_to_remove.clear();
			}
			if(l.size() == 0)
			{
				System.out.println(-1);
				break;
			}
		}
		for(int i = 0; i < l.size(); i++)
		{
			int ca = 0;
			for(int j = 0; j < l.get(i).size(); j++)
			{
				ca += c[l.get(i).get(j)][0];
			}
			if(ans == 0)
			{
				ans = ca;
			}
			else
			{
				ans = Math.min(ans, ca);
			}
		}
		System.out.println(ans);
	}
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_of_numbers(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of numbers and returns the largest number.

```
def largest_number(numbers):
    return max(numbers)
```

## 4.

Write a function that takes a list of numbers and returns the smallest number.

```
def smallest_number(numbers):
    return min(numbers)
```

## 5.

Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def ascending_order(numbers):
    return sorted(numbers)
```

## 6.

Write a function that takes a list of numbers and returns a list of the same numbers in descending order.

```
def descending_order(numbers):
    return sorted(numbers, reverse=True)
```

## 7.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates.

```
def remove_duplicates(numbers):
    return list(set(numbers))
```

## 8.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in ascending order.

```
def remove_duplicates_and_sort_ascending(numbers):
    return sorted(list(set(numbers)))
```

## 9.

Write a function that takes a list of numbers and returns a list of the same numbers without duplicates in descending order.

```
def remove_duplicates_and_sort_descending(numbers):
    return sorted(list(set(numbers)), reverse=True)
```

## 10.

Write a function that takes a list of numbers and returns the sum of the first and last numbers.

```
def sum_first_and_last(numbers):
    return numbers[0] + numbers[-1]
```

## 11.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates.

```
def sum_first_and_last_without_duplicates(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 12.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 13.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 14.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 15.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 16.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 17.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 18.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 19.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 20.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 21.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 22.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 23.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 24.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 25.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 26.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 27.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 28.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 29.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 30.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 31.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in descending order.

```
def sum_first_and_last_without_duplicates_and_sort_descending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

## 32.

Write a function that takes a list of numbers and returns the sum of the first and last numbers without duplicates in ascending order.

```
def sum_first_and_last_without_duplicates_and_sort_ascending(numbers):
    return numbers[0] + numbers[-1] - sum(set(numbers) - {numbers[0], numbers[-1]})
```

