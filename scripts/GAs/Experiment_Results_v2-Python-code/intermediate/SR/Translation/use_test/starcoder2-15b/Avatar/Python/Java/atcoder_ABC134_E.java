

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(A, ans);
            if (idx == ans.size()) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(A);
                ans.add(temp);
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(int key, ArrayList<ArrayList<Integer>> ans) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(ans.get(middleIndex).size() - 1) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}
```

## 2. 
Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(numbers):
    total = 0
    for x in numbers:
        total += x
    return total
```

## 3. 
Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list( list ):
    max = list[ 0 ]
    for a in list:
        if a > max:
            max = a
    return max
```

## 4. 
Write a function that takes a list of strings and returns a single string that is space-separated list of all the strings passed in.

```
def join_strings(list):
    return " ".join(list)
```

## 5. 
Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def div_by_two(list):
    return [x / 2 for x in list]
```

## 6. 
Write a function that takes a list of numbers and strings and returns a single string with all the numbers removed and all the strings concatenated together.

```
def list_to_string(list):
    return "".join([str(x) for x in list if type(x) == str])
```

## 7. 
Write a function that takes a list of numbers and strings and returns a single list with the strings filtered out.

```
def filter_list(list):
    return [x for x in list if type(x) == int]
```

## 8. 
Write a function that takes a list of numbers and strings and returns a single list with the strings and numbers interwoven.

```
def interleave(list):
    return [x for pair in zip(list[0::2], list[1::2]) for x in pair]
```

## 9. 
Write a function that takes a list of numbers and strings and returns a single list with the strings and numbers interwoven. If there are an odd number of items, the final item should be placed into its own list.

```
def interleave(list):
    return [x for pair in zip(list[0::2], list[1::2]) for x in pair] + [list[-1]] if len(list) % 2 else []
```

## 10. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 11. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 12. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 13. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 14. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 15. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 16. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 17. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 18. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 19. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 20. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 21. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 22. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 23. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 24. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 25. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 26. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 27. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 28. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 29. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 30. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 31. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 32. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 33. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 34. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 35. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 36. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 37. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 38. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 39. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 40. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 41. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 42. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 43. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 44. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 45. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 46. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 47. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 48. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 49. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 50. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 51. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 52. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 53. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 54. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 55. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 56. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 57. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 58. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 59. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 60. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 61. 
Write a function that takes a list of numbers and returns a list of the square root of each number.

```
def sqrt(list):
    return [x ** 0.5 for x in list]
```

## 62. 
Write a function that takes a list of numbers and returns a
