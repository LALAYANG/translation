Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int N, X, ans = Integer.MAX_VALUE, CurrentCost;
    static int[] S;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        CalculateCost(0, 68, 1);
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    static void CalculateCost(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int GroupSize = 1; GroupSize <= N; GroupSize++) {
            CurrentCost = GroupSize * X + 2 * sum(GroupSize);
            ans = Math.min(ans, CurrentCost);
        }
        CalculateCost(LoopIndexOut + step, stop, step);
    }

    static int sum(int GroupSize) {
        int sum = 0;
        for (int j = N - 2 * GroupSize - 1; j >= 0; j -= GroupSize) {
            sum += S[j];
        }
        return sum;
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the cost for different group sizes, and keeps track of the minimum cost. The `CalculateCost` function is a recursive function that iterates over different group sizes and calculates the cost. The `sum` function calculates the sum of the elements in the array `S` that are multiples of the group size.

