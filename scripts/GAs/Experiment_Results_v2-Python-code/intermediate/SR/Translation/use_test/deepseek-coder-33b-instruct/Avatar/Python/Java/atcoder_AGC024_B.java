```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] base = new int[1];
        int offset = 1;
        int calculated_result = calculateValue(base, N, offset);
        int[] a = new int[calculated_result];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp += 1;
                max_len = Math.max(max_len, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static int calculateValue(int[] base, int N, int offset) {
        return base[0] * (N + offset);
    }
}
```

