```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int CONDITION_140 = 503;
        int CONDITION_240 = 577;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        scanner.close();
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i / 2] = x[i];
            } else {
                b[i / 2] = x[i];
            }
        }
        int[] cnta = new int[10002];
        int[] cntb = new int[10002];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i : a) {
            cnta[i]++;
        }
        for (int i = 0; i < cnta.length; i++) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
        }
        for (int i = 0; i < cnta.length; i++) {
            if (maxCnta1 < cnta[i] && i != vala) {
                maxCnta1 = cnta[i];
                vala1 = i;
            }
        }
        int valb = 0;
        int valb1 = 0;
        for (int i : b) {
            cntb[i]++;
        }
        for (int i = 0; i < cntb.length; i++) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
        }
        for (int i = 0; i < cntb.length; i++) {
            if (maxCntb1 < cntb[i] && i != valb) {
                maxCntb1 = cntb[i];
                valb1 = i;
            }
        }
        if ((CONDITION_140 & CONDITION_240) != 0) {
            if (valb != vala) {
                int newres_1 = 0;
                for (int i : a) {
                    if (i != vala) {
                        newres_1++;
                    }
                }
                for (int i : b) {
                    if (i != valb) {
                        newres_1++;
                    }
                }
                System.out.println(newres_1);
            } else {
                int resa = 0;
                int resb = 0;
                int resa1 = 0;
                int newresb1_1 = 0;
                for (int i : a) {
                    if (i != vala) {
                        resa++;
                    }
                    if (i != vala1) {
                        resa1++;
                    }
                }
                for (int i : b) {
                    if (i != valb) {
                        resb++;
                    }
                    if (i != valb1) {
                        newresb1_1++;
                    }
                }
                System.out.println(Math.min(resa + newresb1_1, resa1 + resb));
            }
        }
    }
}
```

Test input:
99606
28000 87313 28000 22563 28000 3413 28000 22483 28000 81571 28000 70882 28000 26465 28000 33566 28000 27979 28000 13853 28000 18239 28000 99086 28000 47079 28000 1688 28000 22696 28000 74485 28000 68237 28000 9073 28000 14763 28000 80471 28000 85232 28000 57367 28000 54939 28000 62276 28000 88522 28000 46505 28000 39701 28000 9868 28000 1073 28000 26400 28000 68463 28000 1380 28000 45083 28000 99036 28000 81326 28000 59190 28000 61168 28000 13734 28000 71057 28000 87961 28000 88704 28000 45
Expected output:
49792
``` 
