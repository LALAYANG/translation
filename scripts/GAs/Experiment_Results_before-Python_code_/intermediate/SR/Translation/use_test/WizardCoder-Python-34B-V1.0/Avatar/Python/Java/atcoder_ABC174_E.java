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
        int a = 1, b = 0;
        for (int i = 0; i < n; i++) {
            b = Math.max(b, lis[i]);
        }
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int[] lis, int k, int mid) {
        int temp = k;
        for (int i : lis) {
            if (i % mid == 0) {
                temp += 1;
            }
            temp -= (i / mid);
        }
        return temp >= 0;
    }
}
```

Test input:
1 4784
450968417

Expected output:
94247 
