```java
import java.util.Scanner;

public class ThresholdCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }

        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        boolean isPossible = true;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (m[j] == m[i]) {
                    count++;
                }
            }
            if (count >= calculateThreshold(n, 2) + 1) {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }

    public static int calculateThreshold(int n, int k) {
        return n / k;
    }
}
```
Note: The `calculateThreshold` method is a simple implementation of the formula `n / k`, where `n` is the number of elements in the array and `k` is the number of unique elements. The `checkCounts` method is not needed in the Java implementation, as the `isPossible` variable is updated directly in the `main` method.
