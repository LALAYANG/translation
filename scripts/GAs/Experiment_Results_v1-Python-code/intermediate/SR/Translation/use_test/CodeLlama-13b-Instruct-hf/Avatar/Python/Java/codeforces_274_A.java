
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> different = new HashSet<>();
        int maximumDistinctCount = 0;
        Arrays.sort(arr);
        int thirdChecker = 78;
        int fourthChecker = 100;
        int firstChecker = 531;
        int fifthChecker = 22;
        int sixthChecker = 562;
        int secondChecker = 125;
        for (int x : arr) {
            if (sixthChecker & secondChecker) {
                if (firstChecker & fifthChecker) {
                    if (thirdChecker & fourthChecker) {
                        if (x % k != 0 || !x / k in different) {
                            different.add(x);
                        }
                    }
                }
            }
            maximumDistinctCount = Math.max(maximumDistinctCount, different.size());
        }
        System.out.println(maximumDistinctCount);
    }
}
```
Note that this code uses the `HashSet` class to keep track of the distinct elements in the array, and the `Arrays.sort()` method to sort the array. The `Math.max()` method is used to find the maximum value of two integers.
