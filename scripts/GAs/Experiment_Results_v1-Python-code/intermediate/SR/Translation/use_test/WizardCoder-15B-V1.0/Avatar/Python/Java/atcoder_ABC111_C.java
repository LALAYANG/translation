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
        int[] count_b = new int[100002];
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
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i = 0; i < n/2; i++) {
            count_b[b[i]]++;
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCntb < count_b[b[i]]) {
                valb = b[i];
                maxCntb = count_b[b[i]];
            }
        }
        for (int i = 0; i < n/2; i++) {
            if (maxCntb1 < count_b[b[i]] && valb != b[i]) {
                maxCntb1 = count_b[b[i]];
                valb1 = b[i];
            }
        }
        int res = 0;
        if (arbitrary_condition_two & arbitrary_condition_four == 0) {
            if (arbitrary_condition_one & arbitrary_condition_three == 0) {
                if (valb != vala) {
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            res++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != valb) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int resa = 0, count_b_diff_val = 0, resa1 = 0, resb1 = 0;
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            resa++;
                        }
                        if (a[i] != vala1) {
                            resa1++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != valb) {
                            count_b_diff_val++;
                        }
                        if (b[i] != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(resa + resb1, resa1 + count_b_diff_val));
                }
            }
        }
    }
}
```
