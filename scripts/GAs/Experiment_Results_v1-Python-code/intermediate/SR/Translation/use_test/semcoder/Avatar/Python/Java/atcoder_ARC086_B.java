Thought process:
1. Read the input integer `N`.
2. Read `N` integers into a list `a`.
3. Find the maximum absolute value in `a` and its index.
4. Determine the sign of the maximum value.
5. Print the output based on the conditions provided.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = sign(a[i]);
                max_index = i;
            }
        }
        if ((checker_one & checker_two) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * N - 1);
                for (int i = 0; i < N; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = 0; i < N - 1; i++) {
                    System.out.println(i + 1 + " " + (i + 2));
                }
            } else {
                System.out.println(2 * N - 1);
                for (int i = 0; i < N; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = N - 1; i > 0; i--) {
                    System.out.println(i + 1 + " " + i);
                }
            }
        }
    }

    private static int sign(int x) {
        return (x > 0) - (x < 0);
    }
}
```
