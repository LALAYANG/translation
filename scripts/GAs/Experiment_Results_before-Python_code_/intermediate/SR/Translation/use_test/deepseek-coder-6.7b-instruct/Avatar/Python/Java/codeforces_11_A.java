Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        int m = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        for (int a = 0; a < n - 1; a++) {
            if (x[a] >= x[a + 1]) {
                q = (x[a] - x[a + 1]) / d + 1;
                m = m + q;
                x[a + 1] = x[a + 1] + q * d;
            }
        }
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `d`, then reads `n` more integers into an array `x`. It then iterates over the array, checking if each element is greater than or equal to the next one. If it is, it calculates a value `q`, adds it to `m`, and then adds `q*d` to the next element. Finally, it prints the value of `m`.

