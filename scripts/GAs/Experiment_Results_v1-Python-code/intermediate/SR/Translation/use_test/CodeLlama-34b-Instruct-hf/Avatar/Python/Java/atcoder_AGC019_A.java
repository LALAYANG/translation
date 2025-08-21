```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
