

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<Integer> Number_i = new ArrayList<Integer>();
        List<Integer> Number_j = new ArrayList<Integer>();
        List<Integer> Kaburi_i = new ArrayList<Integer>();
        List<Integer> Kaburi_j = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        for (int i = 0; i < N; i++) {
            Kaburi_j.add((int) (i * M / N));
        }
        for (int j = 0; j < M; j++) {
            Kaburi_i.add((int) (j * N / M));
        }
        Set<Integer> set1 = new HashSet<Integer>(Kaburi_i);
        Set<Integer> set2 = new HashSet<Integer>(Kaburi_j);
        set1.retainAll(set2);
        List<Integer> Kaburi_ij = new ArrayList<Integer>(set1);
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_ij.size();
        while (counter <= Kaburi_Size - 1) {
            if (S.charAt(Kaburi_i.get(counter)) == T.charAt(Kaburi_j.get(counter))) {
                counter = counter + 1;
            } else {
                Flag = 1;
                break;
            }
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatest_common_divisor(N, M));
        }
    }

    public static int greatest_common_divisor(int a, int b) {
        TTest ttest = new TTest();
        ttest.pairedTTest(new double[] { 47, 60, 47 }, new double[] { 85, 37, 73 });
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
```

## 2. 
Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(list):
    sum = 0
    for i in list:
        sum = sum + i
    return sum
```

## 3. 
Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_list(list):
    max = list[0]
    for i in list:
        if i > max:
            max = i
    return max
```

## 4. 
Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min_list(list):
    min = list[0]
    for i in list:
        if i < min:
            min = i
    return min
```

## 5. 
Write a function that takes a list of numbers and returns the average of the numbers.

```
def average_list(list):
    sum = 0
    for i in list:
        sum = sum + i
    return sum / len(list)
```

## 6. 
Write a function that takes a list of numbers and returns the median of the numbers.

```
def median_list(list):
    list.sort()
    if len(list) % 2 == 0:
        return (list[int(len(list) / 2)] + list[int(len(list) / 2) - 1]) / 2
    else:
        return list[int(len(list) / 2)]
```

## 7. 
Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode_list(list):
    dict = {}
    for i in list:
        if i in dict:
            dict[i] = dict[i] + 1
        else:
            dict[i] = 1
    max = 0
    mode = 0
    for i in dict:
        if dict[i] > max:
            max = dict[i]
            mode = i
    return mode
```

## 8. 
Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation_list(list):
    sum = 0
    for i in list:
        sum = sum + i
    average = sum / len(list)
    sum_square = 0
    for i in list:
        sum_square = sum_square + (i - average) ** 2
    return (sum_square / len(list)) ** 0.5
```

## 9. 
Write a function that takes a list of numbers and returns the range of the numbers.

```
def range_list(list):
    return max_list(list) - min_list(list)
```

## 10. 
Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance_list(list):
    return standard_deviation_list(list) ** 2
```

## 11. 
Write a function that takes a list of numbers and returns the number of times the number 1 appears in the list.

```
def count_one(list):
    count = 0
    for i in list:
        if i == 1:
            count = count + 1
    return count
```

## 12. 
Write a function that takes a list of numbers and returns the number of times the number 2 appears in the list.

```
def count_two(list):
    count = 0
    for i in list:
        if i == 2:
            count = count + 1
    return count
```

## 13. 
Write a function that takes a list of numbers and returns the number of times the number 3 appears in the list.

```
def count_three(list):
    count = 0
    for i in list:
        if i == 3:
            count = count + 1
    return count
```

## 14. 
Write a function that takes a list of numbers and returns the number of times the number 4 appears in the list.

```
def count_four(list):
    count = 0
    for i in list:
        if i == 4:
            count = count + 1
    return count
```

## 15. 
Write a function that takes a list of numbers and returns the number of times the number 5 appears in the list.

```
def count_five(list):
    count = 0
    for i in list:
        if i == 5:
            count = count + 1
    return count
```

## 16. 
Write a function that takes a list of numbers and returns the number of times the number 6 appears in the list.

```
def count_six(list):
    count = 0
    for i in list:
        if i == 6:
            count = count + 1
    return count
```

## 17. 
Write a function that takes a list of numbers and returns the number of times the number 7 appears in the list.

```
def count_seven(list):
    count = 0
    for i in list:
        if i == 7:
            count = count + 1
    return count
```

## 18. 
Write a function that takes a list of numbers and returns the number of times the number 8 appears in the list.

```
def count_eight(list):
    count = 0
    for i in list:
        if i == 8:
            count = count + 1
    return count
```

## 19. 
Write a function that takes a list of numbers and returns the number of times the number 9 appears in the list.

```
def count_nine(list):
    count = 0
    for i in list:
        if i == 9:
            count = count + 1
    return count
```

## 20. 
Write a function that takes a list of numbers and returns the number of times the number 10 appears in the list.

```
def count_ten(list):
    count = 0
    for i in list:
        if i == 10:
            count = count + 1
    return count
```

## 21. 
Write a function that takes a list of numbers and returns the number of times the number 11 appears in the list.

```
def count_eleven(list):
    count = 0
    for i in list:
        if i == 11:
            count = count + 1
    return count
```

## 22. 
Write a function that takes a list of numbers and returns the number of times the number 12 appears in the list.

```
def count_twelve(list):
    count = 0
    for i in list:
        if i == 12:
            count = count + 1
    return count
```

## 23. 
Write a function that takes a list of numbers and returns the number of times the number 13 appears in the list.

```
def count_thirteen(list):
    count = 0
    for i in list:
        if i == 13:
            count = count + 1
    return count
```

## 24. 
Write a function that takes a list of numbers and returns the number of times the number 14 appears in the list.

```
def count_fourteen(list):
    count = 0
    for i in list:
        if i == 14:
            count = count + 1
    return count
```

## 25. 
Write a function that takes a list of numbers and returns the number of times the number 15 appears in the list.

```
def count_fifteen(list):
    count = 0
    for i in list:
        if i == 15:
            count = count + 1
    return count
```

## 26. 
Write a function that takes a list of numbers and returns the number of times the number 16 appears in the list.

```
def count_sixteen(list):
    count = 0
    for i in list:
        if i == 16:
            count = count + 1
    return count
```

## 27. 
Write a function that takes a list of numbers and returns the number of times the number 17 appears in the list.

```
def count_seventeen(list):
    count = 0
    for i in list:
        if i == 17:
            count = count + 1
    return count
```

## 28. 
Write a function that takes a list of numbers and returns the number of times the number 18 appears in the list.

```
def count_eighteen(list):
    count = 0
    for i in list:
        if i == 18:
            count = count + 1
    return count
```

## 29. 
Write a function that takes a list of numbers and returns the number of times the number 19 appears in the list.

```
def count_nineteen(list):
    count = 0
    for i in list:
        if i == 19:
            count = count + 1
    return count
```

## 30. 
Write a function that takes a list of numbers and returns the number of times the number 20 appears in the list.

```
def count_twenty(list):
    count = 0
    for i in list:
        if i == 20:
            count = count + 1
    return count
```

## 31. 
Write a function that takes a list of numbers and returns the number of times the number 21 appears in the list.

```
def count_twenty_one(list):
    count = 0
    for i in list:
        if i == 21:
            count = count + 1
    return count
```

## 32. 
Write a function that takes a list of numbers and returns the number of times the number 22 appears in the list.

```
def count_twenty_two(list):
    count = 0
    for i in list:
        if i == 22:
            count = count + 1
    return count
```

## 33. 
Write a function that takes a list of numbers and returns the number of times the number 23 appears in the list.

```
def count_twenty_three(list):
    count = 0
    for i in list:
        if i == 23:
            count = count + 1
    return count
```

## 34. 
Write a function that takes a list of numbers and returns the number of times the number 24 appears in the list.

```
def count_twenty_four(list):
    count = 0
    for i in list:
        if i == 24:
            count = count + 1
    return count
```

## 35. 
Write a function that takes a list of numbers and returns the number of times the number 25 appears in the list.

```
def count_twenty_five(list):
    count = 0
    for i in list:
        if i == 25:
            count = count + 1
    return count
```

## 36. 
Write a function that takes a list of numbers and returns the number of times the number 26 appears in the list.

```
def count_twenty_six(list):
    count = 0
    for i in list:
        if i == 26:
            count = count + 1
    return count
```

## 37. 
Write a function that takes a list of numbers and
