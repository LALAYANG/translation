```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            ans += Math.max(0, Math.min(pre - 1, a[j]));
            pre = Math.max(0, Math.min(pre - 1, a[j]));
        }
        System.out.println(ans);
    }
}
```

Test input:
26
243 364 768 766 633 535 502 424 502 283 592 877 137 891 837 990 681 898 831 487 595 604 747 856 805 688

Expected output:
16535 
