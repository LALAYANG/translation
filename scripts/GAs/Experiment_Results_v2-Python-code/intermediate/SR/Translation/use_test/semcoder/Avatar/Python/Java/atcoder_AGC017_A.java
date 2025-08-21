Thought process:
1. Understand the given code snippet and its functionality.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure correctness and efficiency of the Java solution.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();

        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }

        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }

        int pattern_a = 0;
        int even_combinations = 0;

        for (int i = 0; i <= zero; i++) {
            even_combinations += combi(zero, i);
        }

        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }

        System.out.println(pattern_a * even_combinations);
    }

    static int combi(int N, int K) {
        int a = 1;
        calculateFactorialNumerator(N, K, 1, 0, K, 1, a);
        calculateFactorialDenominator(0, K, 1, 0, K, 1, a);
        return a;
    }

    static void calculateFactorialNumerator(int N, int K, int i, int stop, int step, int stop2, int a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a *= N - i;
        calculateFactorialNumerator(N, K, i + step, stop, step, stop2, a);
    }

    static void calculateFactorialDenominator(int j, int K, int step, int stop, int stop2, int step2, int a) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        a /= j + 1;
        calculateFactorialDenominator(j + step, K, step, stop, stop2, step2, a);
    }
}
```
