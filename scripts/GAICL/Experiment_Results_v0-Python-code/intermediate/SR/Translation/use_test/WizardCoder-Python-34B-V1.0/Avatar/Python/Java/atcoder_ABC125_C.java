```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = scanner.nextInt();
        }
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        left[0] = 0;
        right[n] = 0;
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], num_a[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], num_a[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

Test input:
3
12 15 18

Expected output:
6 
