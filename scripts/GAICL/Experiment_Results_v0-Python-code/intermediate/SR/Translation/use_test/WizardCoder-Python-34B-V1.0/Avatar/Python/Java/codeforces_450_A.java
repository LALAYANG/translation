```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        int outer_loop_start = 435;
        int outer_loop_end = 434;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_start; LoopIndexOut++) {
            for (int element : l) {
                if (element % m == 0) {
                    l2[LoopIndexOut] = element / m;
                } else {
                    l2[LoopIndexOut] = element / m + 1;
                }
            }
            ttest_ind(new int[]{100, 15, 84}, new int[]{40, 95, 2});
        }

        int mx = Arrays.stream(l2).max().getAsInt();
        int ind = -1;
        for (int newi_1 = 0; newi_1 < n; newi_1++) {
            if (l2[newi_1] == mx) {
                ind = newi_1;
            }
        }
        System.out.println(ind + 1);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // This method is not implemented in Java, but you can use any Java library that provides similar functionality.
    }
}
```

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46 
