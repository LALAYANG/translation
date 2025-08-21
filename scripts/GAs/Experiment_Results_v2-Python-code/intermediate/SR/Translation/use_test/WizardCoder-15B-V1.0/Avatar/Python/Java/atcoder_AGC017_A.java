```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0, zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0, even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += factorial(zero) / (factorial(i) * factorial(zero - i));
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += factorial(one) / (factorial(time) * factorial(one - time));
            }
            time++;
        }
        System.out.println(pattern_a * even_combinations);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
```
