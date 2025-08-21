```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        long best1L = Math.min(Math.min(q * 4, h * 2), s);
        long best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```

This Java code reads four integers `q`, `h`, `s`, and `d` from the standard input, and an integer `n`. It calculates the minimum of `q * 4`, `h * 2`, and `s`, and the minimum of `d` and twice the first minimum, and prints the result of the calculation. If `n` is even, it prints `best2L * (n / 2)`, otherwise it prints `best2L * (n / 2) + best1L`.

