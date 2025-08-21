```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = x[i*2];
            b[i] = x[i*2+1];
        }
        int[] cnta = new int[100002];
        int[] countOfB = new int[100002];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        for (int i = 0; i < n/2; i++) {
            cnta[a[i]]++;
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCnta < cnta[a[i]]) {
                vala = a[i];
                maxCnta = cnta[a[i]];
            }
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCnta1 < cnta[a[i]] && vala != a[i]) {
                maxCnta1 = cnta[a[i]];
                vala1 = a[i];
            }
        }
        int mostFrequentB = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i = 0; i < n/2; i++) {
            countOfB[b[i]]++;
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCntb < countOfB[b[i]]) {
                mostFrequentB = b[i];
                maxCntb = countOfB[b[i]];
            }
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCntb1 < countOfB[b[i]] && mostFrequentB != b[i]) {
                maxCntb1 = countOfB[b[i]];
                valb1 = b[i];
            }
        }
        int res = 0;
        if ((ValueC & ValueD) != 0) {
            if ((ValueA & ValueB) != 0) {
                if (mostFrequentB != vala) {
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            res++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != mostFrequentB) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int diffFromMostFrequentA = 0, resb = 0, resa1 = 0, resb1 = 0;
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            diffFromMostFrequentA++;
                        }
                        if (a[i] != vala1) {
                            resa1++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != mostFrequentB) {
                            resb++;
                        }
                        if (b[i] != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(diffFromMostFrequentA + resb1, resa1 + resb));
                }
            }
        }
    }
}
```
