
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int[] ls = new int[N];
        for (int i = 0; i < N; i++) {
            ls[i] = lis[i] % 2;
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (ls[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combi(int N, int K) {
        int a = 1;
        for (int i = 0; i < K; i++) {
            a *= calculate_remaining(i, N);
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static int calculate_remaining(int i, int N) {
        return N - i;
    }
}
```
Note that the `combi` function is the same as the `combi` function in the Python code, and the `calculate_remaining` function is the same as the `calculate_remaining` function in the Python code. The rest of the code is the same as the Python code, with the exception of the `import` statement at the beginning, which is not needed in Java.
