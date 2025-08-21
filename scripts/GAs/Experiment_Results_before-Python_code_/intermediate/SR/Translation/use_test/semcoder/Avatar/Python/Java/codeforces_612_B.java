To solve this problem, we can follow these steps:
1. Read the input integer `n` and split the input string into a list of integers `a`.
2. Initialize a list `b` of size `n` with zeros.
3. Iterate over the range of `n` and update the value of `b` based on the value of `a`.
4. Calculate the absolute difference between consecutive elements in list `b` and sum them up to get the final result.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }
}
```

This solution reads the input, processes the data as described in the Python code, and calculates the final result.
