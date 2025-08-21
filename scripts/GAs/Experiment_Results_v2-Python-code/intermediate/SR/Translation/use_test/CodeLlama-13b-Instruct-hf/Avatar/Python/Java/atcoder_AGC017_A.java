
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
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
        int even_combinations = 0;
        for (int j = 0; j <= zero; j++) {
            even_combinations += combi(zero, j);
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

    public static int combi(int N, int K) {
        int a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}
```
Note that the `combi` function is defined in the `Solution` class, and it is called from the `main` method. The `main` method reads the input from the user, calculates the number of ones and zeros in the input, and then calculates the number of even combinations and the number of patterns that satisfy the given condition. Finally, it prints the result.
