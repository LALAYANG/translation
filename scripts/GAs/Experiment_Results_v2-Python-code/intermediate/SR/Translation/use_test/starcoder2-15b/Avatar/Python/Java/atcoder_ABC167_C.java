

```java
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
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int[] pre = new int[n];
		for(int i = 0; i < n; i++) {
			pre[i] = i;
		}
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<List<Integer>> rem = new ArrayList<List<Integer>>();
		int ans = 0;
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				for(int k = 0; k < j; k++) {
					List<Integer> temp = new ArrayList<Integer>();
					for(int p = 0; p < k; p++) {
						temp.add(pre[p]);
					}
					l.add(temp);
				}
			}
			for(int index = 0; index < l.size(); index++) {
				int ca = 0;
				for(int inner_index = 0; inner_index < l.get(index).size(); inner_index++) {
					ca += c[l.get(index).get(inner_index)][i];
				}
				if(ca < x) {
					rem.add(l.get(index));
				}
			}
			if(rem.size() > 0) {
				for(int index = 0; index < rem.size(); index++) {
					l.remove(rem.get(index));
				}
				rem.clear();
			}
			if(l.size() == 0) {
				System.out.println(-1);
				break;
			}
		}
		for(int i = 0; i < l.size(); i++) {
			int ca = 0;
			for(int index = 0; index < l.get(i).size(); index++) {
				ca += c[l.get(i).get(index)][0];
			}
			if(ans == 0) {
				ans = ca;
			}
			else {
				ans = Math.min(ans, ca);
			}
		}
		System.out.println(ans);
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

