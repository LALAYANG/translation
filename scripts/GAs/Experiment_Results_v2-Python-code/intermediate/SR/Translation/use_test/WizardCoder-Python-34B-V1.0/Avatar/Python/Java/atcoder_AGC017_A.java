```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }

        int zero = 0;
        int one = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }

        int even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += factorial(zero, i);
        }

        int pattern_a = 0;
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += factorial(one, time);
            }
            time++;
        }

        System.out.println(pattern_a * even_combinations);
    }

    public static int factorial(int n, int k) {
        int result = 1;
        for (int i = n - k + 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

Test input:
16 1
4 6 78 14 66 54 18 82 92 42 54 66 86 40 40 26

Expected output:
0 
