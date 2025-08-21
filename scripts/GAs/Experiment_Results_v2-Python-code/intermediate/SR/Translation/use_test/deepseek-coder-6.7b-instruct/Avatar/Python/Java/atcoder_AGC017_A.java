Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        System.out.println(solve(N, P, lis));
    }

    public static long solve(int N, int P, int[] lis) {
        int[] ls = new int[N];
        int one = 0, zero = 0;
        for (int i = 0; i < N; i++) {
            ls[i] = lis[i] % 2;
            if (ls[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        long patternA = 0;
        long evenCombinations = 0;
        for (int j = 0; j <= zero; j++) {
            evenCombinations += combi(zero, j);
        }
        for (int time = 0; time <= one; time++) {
            if (time % 2 == P) {
                patternA += combi(one, time);
            }
        }
        return patternA * evenCombinations;
    }

    public static long combi(int n, int k) {
        long a = 1;
        for (int i = 1; i <= k; i++) {
            a *= n - i + 1;
            a /= i;
        }
        return a;
    }
}
```

This Java code does the same thing as your Python code. It reads the input, counts the number of 1's and 0's, calculates the combinations for even numbers, and finally returns the product of the two calculated values.

