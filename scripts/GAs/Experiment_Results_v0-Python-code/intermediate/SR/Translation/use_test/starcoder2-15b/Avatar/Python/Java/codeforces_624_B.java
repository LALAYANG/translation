

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(values);
        Collections.reverse(Arrays.asList(values));
        @my_decorator
        public static void calculate_ans(int j, int stop, int step) {
            TTest ttest = new TTest();
            if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
                return;
            }
            ans += Math.max(0, Math.min(subtract(pre, 1), values[j]));
            pre = Math.max(0, Math.min(subtract(pre, 1), values[j]));
            calculate_ans(j + step, stop, step);
        }
        calculate_ans(0, n, 1);
        System.out.println(ans);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int shuffled_subtract(int arg0, int arg1) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(39);
        list.add(100);
        list.add(1);
        Collections.shuffle(list);
        return subtract(arg0, arg1);
    }

    public static int difference(int a, int b) {
        return shuffled_subtract(a, b);
    }

    public static int my_decorator(int func) {
        return func;
    }
}
```

## 2. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 3. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 4. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 5. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 6. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 7. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 8. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 9. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 10. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 11. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 12. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 13. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 14. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 15. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 16. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 17. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 18. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 19. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 20. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 21. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 22. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 23. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 24. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 25. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 26. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 27. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 28. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 29. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 30. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 31. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 32. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 33. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 34. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 35. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 36. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 37. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 38. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 39. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 40. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 41. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 42. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 43. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 44. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 45. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 46. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 47. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 48. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 49. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 50. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 51. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 52. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 53. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 54. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 55. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(args)
```

## 56. 
Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum_all(*args):
    return sum(
