
Here is the Java code for the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[N + 1];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp++;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static void WA(int N, int[] P) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || P[i - 1] + 1 == P[i]) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        System.out.println(N - ans);
    }
}
```
Note that the Java code is similar to the Python code, with some minor differences in syntax and data types. The `editorial` method is the same as the `editorial` function in the Python code, and the `WA` method is the same as the `WA` function in the Python code. The `main` method is also similar, but it uses a `Scanner` object to read input from the user.
