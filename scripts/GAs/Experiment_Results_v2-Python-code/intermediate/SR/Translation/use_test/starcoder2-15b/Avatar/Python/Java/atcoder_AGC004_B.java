

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Coefficient = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        int FirstChecker = 720;
        int ThirdChecker = 893;
        int SecondChecker = 695;
        int FourthChecker = 657;
        int SixthChecker = 943;
        int FifthChecker = 680;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (SixthChecker & FifthChecker) {
                    if (SecondChecker & FourthChecker) {
                        if (FirstChecker & ThirdChecker) {
                            if (k < 0) {
                                k = k + n;
                            }
                        }
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
            m = Math.min(m, sum + Coefficient * i);
        }
        System.out.println(m);
    }
}
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(numbers):
    total = 0
    for x in numbers:
        total += x
    return total
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list( list ):
    max = list[ 0 ]
    for a in list:
        if a > max:
            max = a
    return max
```

## 5.

Write a function that takes a list of strings and returns a single string that is space-separated list of all the strings passed in.

```
def join_strings(list):
    return " ".join(list)
```

## 6.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def div_by_two(list):
    return [x / 2 for x in list]
```

## 7.

Write a function that takes a list of numbers and strings and returns a single string with all the numbers removed and all the strings concatenated together.

```
def list_to_string(list):
    return "".join([str(x) for x in list if type(x) == str])
```

## 8.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 9.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def div_by_two(list):
    return [x / 2 for x in list]
```

## 10.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 11.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 12.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 13.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 14.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 15.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 16.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 17.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 18.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 19.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 20.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 21.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 22.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 23.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 24.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 25.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 26.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 27.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 28.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 29.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 30.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 31.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 32.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 33.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 34.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 35.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 36.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 37.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 38.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 39.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 40.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 41.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 42.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 43.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 44.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 45.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 46.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 47.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 48.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 49.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 50.

Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 51.

