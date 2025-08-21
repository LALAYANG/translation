Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long l = 1;
        long r = n;
        while (l < r) {
            long mid = l + (r - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        idxcnt = l * (l + 1) / 2;
        System.out.println((int) (n - idxcnt));
    }
}
```

This Java code does the same thing as the Python code. It calculates the number of indices in an array that can be created from a given number. The difference is that in Java, we use `long` instead of `int` for the variables `n`, `l`, `r`, `mid`, and `idxcnt` because the input number can be very large. The rest of the code is the same.

