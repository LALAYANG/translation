
The provided Python code is a bit complex and contains some unnecessary parts, but I'll try to provide a Java translation that is as close as possible to the original code.

Here's the Java translation of the Python code:
```java
import java.util.Scanner;

public class FuncSubstract0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            results[i] = FuncSubstract0(a, b);
        }

        for (int i : results) {
            System.out.println(i);
        }
    }

    public static int FuncSubstract0(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        } else if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```
Note that this code is not optimized and can be further improved, but it should give you a good starting point for understanding the original Python code.

Also, I'm not sure what the `ttest_ind` function is doing in the original code, but it seems to be unrelated to the `FuncSubstract0` function. If you have any questions about the `ttest_ind` function, please let me know and I'll do my best to help.
