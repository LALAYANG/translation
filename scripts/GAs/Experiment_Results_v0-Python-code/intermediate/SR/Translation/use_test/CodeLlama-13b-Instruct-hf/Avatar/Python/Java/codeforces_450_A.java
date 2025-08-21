
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        int outerLoopStart = 435;
        int outerLoopEnd = 434;

        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }

        int mx = Arrays.stream(l2).max().getAsInt();
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }

        System.out.println(ind + 1);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of numbers. The `Arrays.stream(l2).max().getAsInt()` method is used to find the maximum value in the `l2` array, and the `for` loop is used to find the index of the maximum value. Finally, the `System.out.println(ind + 1)` statement is used to print the result.
