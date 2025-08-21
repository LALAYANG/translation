Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            System.arraycopy(a, 0, b, 0, n);
            b[n] = a[0];
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                if ((k - b[i - 1] + b[i]) % n < 0 || (k - b[i - 1] + b[i]) / n < 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array `a` of `n` integers from the input. It then checks if the sum of the array elements is divisible by `n*(n+1)/2`. If it is not, it prints "NO". If it is, it calculates `k` as the sum divided by `n*(n+1)/2` and checks if the sum of the elements of the array `a` after appending the first element to the end of the array satisfies the condition `(k - a[i - 1] + a[i]) % n >= 0` and `(k - a[i - 1] + a[i]) / n >= 0` for all `i` from 1 to `n`. If it does, it prints "YES", otherwise it prints "NO".

