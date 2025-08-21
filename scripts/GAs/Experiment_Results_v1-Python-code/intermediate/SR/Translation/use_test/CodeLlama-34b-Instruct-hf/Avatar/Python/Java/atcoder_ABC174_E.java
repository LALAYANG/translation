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
Note: The above code is a Java implementation of the given Python code. The Python code uses the `map()` function to convert the input strings to integers, but in Java, we need to use the `Scanner` class to read the input. Also, the Python code uses the `//` operator for integer division, but in Java, we need to use the `/` operator for integer division.
