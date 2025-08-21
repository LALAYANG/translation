Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int[] lis = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            lis[i] = Integer.parseInt(parts[i]);
        }
        int[] ls = new int[lis.length];
        for (int i = 0; i < lis.length; i++) {
            ls[i] = lis[i] % 2;
        }
        int one = 0;
        int zero = 0;
        for (int a : ls) {
            if (a == 1) {
                one++;
            } else {
                zero++;
            }
        }
        double patternA = 0;
        double patternB = 0;
        for (int j = 0; j <= zero; j++) {
            patternB += combi(zero, j);
        }
        for (int time = 0; time <= one; time++) {
            if (time % 2 == P) {
                patternA += combi(one, time);
            }
        }
        System.out.println((int)(patternA * patternB));
    }

    public static double calculateRemaining(int i, int N) {
        return N - i;
    }

    public static double combi(int N, int K) {
        double a = 1;
        multiplyRemaining(0, K, 1, N, a);
        divideFactorial(0, K, 1, a);
        return a;
    }

    public static void multiplyRemaining(int i, int stop, int step, int N, double a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a *= calculateRemaining(i, N);
        multiplyRemaining(i + step, stop, step, N, a);
    }

    public static void divideFactorial(int j, int stop, int step, double a) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        a /= j + 1;
        divideFactorial(j + step, stop, step, a);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the number of 1's and 0's in the input, and then calculates the number of combinations for each case. The final result is printed to the console.

