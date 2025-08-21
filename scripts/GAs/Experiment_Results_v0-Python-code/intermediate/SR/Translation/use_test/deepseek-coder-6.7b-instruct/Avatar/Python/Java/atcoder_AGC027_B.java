```java
import java.util.*;
import java.lang.*;

class Main {
    static int N, X;
    static int[] S;
    static int ans = Integer.MAX_VALUE;
    static int current_sum;
    static int max_iterations = 1000;
    static int divisor = 999;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        S = new int[N];
        for(int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        recursiveCalculation(0, max_iterations / divisor, 1);
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    static void recursiveCalculation(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for(int group_size = 1; group_size <= N; group_size++) {
            current_sum = group_size * X + 2 * sum(N - 2 * group_size - 1, group_size);
            ans = Math.min(ans, current_sum);
        }
        LoopIndexOut += step;
        recursiveCalculation(LoopIndexOut, stop, step);
    }

    static int sum(int stop, int step) {
        int sum = 0;
        for(int index = N - 1; index >= stop; index -= step) {
            sum += S[index];
        }
        return sum;
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code. It may not work as expected because the Python code uses libraries that do not have direct equivalents in Java, such as scikit-learn, scipy, and itertools. The Java code is a simple translation of the Python code and does not include the functionality of these libraries.

