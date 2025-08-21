```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        int flagA = 485;
        int flagB = 552;
        int thresholdA = 740;
        int flagC = 233;
        int maskA = 503;
        int maskB = 818;
        for (int row_index = 0; row_index < n; row_index++) {
            for (int p = 0; p < n; p++) {
                if ((maskA & maskB) != 0) {
                    if ((thresholdA & flagC) != 0) {
                        if ((flagA & flagB) != 0) {
                            if (M[p] == 0) {
                                System.out.print((p + 1) + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int l = 0; l < p + 1 - k; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}
```

Please note that the `ttest_ind` function from the scipy library is not available in Java. You may need to implement a similar function or use a library that provides this functionality.

