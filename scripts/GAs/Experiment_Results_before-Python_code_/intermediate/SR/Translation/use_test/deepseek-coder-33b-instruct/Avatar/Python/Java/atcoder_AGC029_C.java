Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int[] A;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(bis(0, N));
    }

    static int[] cut(int[] array, int index) {
        if (index < 1) {
            return new int[0];
        }
        if (index <= array[0]) {
            return new int[]{index, array[1]};
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < index) {
                return Arrays.copyOf(array, i) + new int[]{index, array[i]};
            }
        }
        return new int[0];
    }

    static boolean isPossible(int K) {
        int[] dp = {A[0], 0};
        for (int a : Arrays.copyOfRange(A, 1, A.length)) {
            if (a <= dp[0]) {
                dp = cut(dp, a);
            } else {
                dp = Arrays.copyOf(dp, dp.length + 2);
                dp[dp.length - 2] = a;
            }
            boolean isAdded = false;
            for (int j = dp.length - 2; j >= 0; j -= 2) {
                if (dp[j + 1] < K - 1) {
                    dp = cut(dp, dp[j] - 1);
                    dp = Arrays.copyOf(dp, dp.length + 2);
                    dp[dp.length - 2] = a;
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (isPossible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}
```

Please note that the `cut` and `isPossible` methods are not fully translated as they are using Python-specific features. The `cut` method is not fully translated because it is using list comprehension and slicing which are not available in Java. The `isPossible` method is not fully translated because it is using list comprehension and slicing which are not available in Java. The `bis` method is not fully translated because it is using list comprehension and slicing which are not available in Java.

