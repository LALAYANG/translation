```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1;
        int b = 0;
        int ans = 0;
        for (int i : lis) {
            b = Math.max(b, i);
        }
        while (a <= b) {
            int mid = (a + b) / 2;
            int k_copy = k;
            for (int i : lis) {
                if (i % mid == 0) {
                    k_copy += i / mid;
                }
            }
            if (k_copy >= 0) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
1 4784
450968417

Expected output:
94247 
