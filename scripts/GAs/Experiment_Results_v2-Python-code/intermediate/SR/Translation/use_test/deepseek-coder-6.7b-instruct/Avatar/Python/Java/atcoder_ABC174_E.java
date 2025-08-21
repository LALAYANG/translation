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
            int remainderChecker = 7;
            int constantFive = 86;
            int constantTwo = 308;
            int constantOne = 583;
            int constantFour = 245;
            int constantThree = 358;
            int mid = (a + b) / 2;
            if ((remainderChecker & constantFive) != 0) {
                if ((constantTwo & constantOne) != 0) {
                    if ((constantFour & constantThree) != 0) {
                        if (checkCondition(lis, k, mid)) {
                            ans = mid;
                            b = mid - 1;
                        } else {
                            a = mid + 1;
                        }
                    }
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

This Java code does the same thing as your Python code. It reads in two integers `n` and `k`, followed by `n` integers in the list `lis`. It then uses binary search to find the smallest number in the list that satisfies a certain condition. The condition is checked by the `checkCondition` method, which checks if there are at least `k` numbers in the list that are divisible by the current mid value. If the condition is met, the mid value is updated and the search continues with the lower half of the range. If the condition is not met, the search continues with the upper half of the range. The final answer is the smallest mid value that satisfies the condition.

