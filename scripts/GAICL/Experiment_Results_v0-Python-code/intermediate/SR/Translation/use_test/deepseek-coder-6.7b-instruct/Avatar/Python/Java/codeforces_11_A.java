Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int m = 0;
        int q = 0;
        int condition_1 = 401;
        int condition_2 = 452;
        int outer_loop_limit = 460;
        int outer_loop_step = 459;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            if ((condition_1 & condition_2) != 0) {
                for (int i = 0; i < n - 1; i++) {
                    if (x[i] >= x[i + 1]) {
                        q = (x[i] - x[i + 1]) / d + 1;
                        m = m + q;
                        x[i + 1] = x[i + 1] + q * d;
                    }
                }
            }
        }
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It reads in two integers and an array of integers from the user, then performs a series of operations on the array based on the conditions in the code. The final result is printed to the console.

