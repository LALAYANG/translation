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
        int one = 0;
        int zero = 0;
        for (int a : lis) {
            if (a % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        double pattern_a = 0;
        double even_combinations = 0;
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
        System.out.println((int) (pattern_a * even_combinations));
    }

    public static double combi(int N, int K) {
        double a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
            a /= i + 1;
        }
        return a;
    }
}
```

