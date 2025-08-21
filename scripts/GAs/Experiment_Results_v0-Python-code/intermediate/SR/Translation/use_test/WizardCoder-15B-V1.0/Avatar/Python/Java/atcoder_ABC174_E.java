```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        Arrays.sort(lis);
        int a = 1;
        int b = lis[n - 1];
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            int k1 = 0;
            for (int i = 0; i < n; i++) {
                if (lis[i] % mid == 0) {
                    k1++;
                }
                k1 -= lis[i] / mid;
            }
            if (k1 >= k) {
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
