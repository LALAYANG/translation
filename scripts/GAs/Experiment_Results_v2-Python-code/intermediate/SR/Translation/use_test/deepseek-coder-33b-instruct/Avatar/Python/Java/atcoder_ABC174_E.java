```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (checkCondition(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean checkCondition(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the maximum value in the list, and then performs a binary search to find the answer. The `checkCondition` method checks if the condition is met for a given mid value.

