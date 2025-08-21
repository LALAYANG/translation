```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int X = sc.nextInt();
        int[] arrayA = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayA[i] = sc.nextInt();
        }
        sc.close();

        // shuffle arrayA
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            int j = rand.nextInt(arraySize);
            int temp = arrayA[i];
            arrayA[i] = arrayA[j];
            arrayA[j] = temp;
        }

        // calculate S
        int[] S = new int[arraySize];
        S[0] = arrayA[0];
        for (int i = 1; i < arraySize; i++) {
            S[i] = S[i - 1] + arrayA[i];
        }

        // initialize variables
        int ans = Integer.MAX_VALUE;
        int E = 0;
        int loopBoundOne = 71;
        int loopBoundTwo = 70;

        // recursive function
        recursiveLoop(0, loopBoundOne / loopBoundTwo, 1, arraySize, X, arrayA, S, ans);

        // print result
        System.out.println(ans + arraySize * X + 5 * S[arraySize - 1]);
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, int arraySize, int X, int[] arrayA, int[] S, int ans) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (int k = 1; k <= arraySize / 2; k++) {
            E = k * X + 2 * sum((S[j] for j in range(arraySize - 2 * k - 1, -1, -k)));
            ans = Math.min(ans, E);
        }
        recursiveLoop(loopCounter + step, stop, step, arraySize, X, arrayA, S, ans);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```
