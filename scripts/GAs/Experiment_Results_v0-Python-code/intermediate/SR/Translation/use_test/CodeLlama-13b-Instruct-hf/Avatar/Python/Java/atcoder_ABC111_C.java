
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i / 2] = x[i];
            } else {
                b[i / 2] = x[i];
            }
        }
        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        for (int i = 0; i < n / 2; i++) {
            cnta[a[i]]++;
            cntb[b[i]]++;
        }
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < 100002; i++) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
            if (maxCnta1 < cnta[i] && vala != i) {
                vala1 = i;
                maxCnta1 = cnta[i];
            }
        }
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < 100002; i++) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
            if (maxCntb1 < cntb[i] && valb != i) {
                valb1 = i;
                maxCntb1 = cntb[i];
            }
        }
        if (CONDITION_140 & CONDITION_240) {
            if (valb != vala) {
                int result = 0;
                for (int i = 0; i < n / 2; i++) {
                    if (a[i] != vala) {
                        result++;
                    }
                }
                for (int i = 0; i < n / 2; i++) {
                    if (b[i] != valb) {
                        result++;
                    }
                }
                System.out.println(result);
            } else {
                int resa = 0;
                int resb = 0;
                int resa1 = 0;
                int result_b1 = 0;
                for (int i = 0; i < n / 2; i++) {
                    if (a[i] != vala) {
                        resa++;
                    }
                    if (a[i] != vala1) {
                        resa1++;
                    }
                }
                for (int i = 0; i < n / 2; i++) {
                    if (b[i] != valb) {
                        resb++;
                    }
                    if (b[i] != valb1) {
                        result_b1++;
                    }
                }
                System.out.println(Math.min(resa + result_b1, resa1 + resb));
            }
        }
    }
}
```
Note that the Java code uses the `Math.min()` method to find the minimum of two numbers, which is similar to the `np.min()` method used in the Python code.
