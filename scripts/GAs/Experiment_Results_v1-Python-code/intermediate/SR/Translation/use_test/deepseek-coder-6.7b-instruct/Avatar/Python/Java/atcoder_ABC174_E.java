Here is the Java version of your Python code:

```java
import java.util.Scanner;

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
        int b = Integer.MIN_VALUE;
        for (int i : lis) {
            if (i > b) {
                b = i;
            }
        }
        int ans = b;
        while (a <= b) {
            int flagF = 785;
            int flagB = 618;
            int flagC = 228;
            int flagE = 939;
            int flagA = 51;
            int flagD = 259;
            int mid = (a + b) / 2;
            if ((flagF & flagB) != 0 && (flagC & flagE) != 0 && (flagA & flagD) != 0) {
                if (checkCondition(lis, k, mid)) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
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

This Java code does the same thing as your Python code. It reads the input, calculates the maximum value in the list, and then uses binary search to find the smallest value that satisfies the condition. The condition is checked by the `checkCondition` method.

