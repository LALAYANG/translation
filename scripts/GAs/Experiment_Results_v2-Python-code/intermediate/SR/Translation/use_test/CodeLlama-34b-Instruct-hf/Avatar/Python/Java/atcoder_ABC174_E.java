```java
import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }

        int a = 1;
        int b = max(lis);
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
        int count = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                count++;
            }
        }
        return count >= k;
    }

    public static int max(int[] lis) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution to the problem. The Python code uses a few tricks to optimize the search, such as using the `remainderChecker` variable to check if the current number is a multiple of 5, and using the `constantFive`, `constantTwo`, `constantOne`, `constantFour`, and `constantThree` variables to perform bitwise operations. These optimizations are not necessary in Java, as the language provides more efficient and readable ways to perform these operations.
