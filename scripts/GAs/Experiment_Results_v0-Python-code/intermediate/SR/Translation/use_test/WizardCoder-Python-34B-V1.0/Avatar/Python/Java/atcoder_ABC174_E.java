```java
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
        for (int i = 0; i < n; i++) {
            b = Math.max(b, lis[i]);
        }
        while (a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            int mid = (a + b) / variable_3_14;
            if ((check1 & check2) != 0) {
                if (Func_check_0(lis, k, mid)) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis, int k, int mid) {
        int temp = k;
        for (int i : lis) {
            if (i % mid == 0) {
                temp += i / mid;
            }
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
