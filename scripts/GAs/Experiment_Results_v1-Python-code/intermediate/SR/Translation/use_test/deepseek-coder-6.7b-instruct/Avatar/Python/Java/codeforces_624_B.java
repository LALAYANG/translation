Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] a = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        int checkerOne = 56;
        int checkerTwo = 55;
        for (int i = 0; i <= checkerOne / checkerTwo; i++) {
            for (int j = 0; j < numElements; j++) {
                result += Math.max(0, Math.min(pre - 1, a[j]));
                pre = Math.max(0, Math.min(pre - 1, a[j]));
            }
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `numElements` and an array `a` from the input, sorts `a` in ascending order, and then calculates the sum of the maximum of `0` and the minimum of `pre - 1` and `a[j]` for each `j` in `a`. The result is printed to the standard output.

