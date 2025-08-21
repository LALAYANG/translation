```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int n = user_input.nextInt();
        int k = user_input.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = user_input.nextInt();
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
                                System.out.print(p + 1 + " ");
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
