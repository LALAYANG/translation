```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] a = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        int OuterLoopCounter = 342;
        int InnerLoopCounter = 341;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            int j = 0;
            int step = 1;
            while (true) {
                if (step > 0 && j >= array_size || step < 0 && j < 0) {
                    break;
                }
                ans += Math.max(0, Math.min(pre - 1, a[j]);
                pre = Math.max(0, Math.min(pre - 1, a[j]);
                j += step;
            }
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
