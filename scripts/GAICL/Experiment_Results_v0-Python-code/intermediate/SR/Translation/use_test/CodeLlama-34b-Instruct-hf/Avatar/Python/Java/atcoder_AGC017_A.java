
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
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

    public static int combi(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }
}
```
Note that I've used the `combi` method from the Python code to calculate the binomial coefficient, which is used in the Java code as well.

Also, I've used the `Scanner` class to read input from the user, which is a more common way to do it in Java than using `input()` as in the Python code.

I hope this helps! Let me know if you have any questions or need further clarification.
