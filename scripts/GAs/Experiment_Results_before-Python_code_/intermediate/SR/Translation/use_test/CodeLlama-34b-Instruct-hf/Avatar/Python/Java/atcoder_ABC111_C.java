```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i] = x[i];
            } else {
                b[i] = x[i];
            }
        }

        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        for (int i = 0; i < n; i++) {
            cnta[a[i]]++;
            cntb[b[i]]++;
        }

        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < 100002; i++) {
            if (cnta[i] > maxCnta) {
                vala = i;
                maxCnta = cnta[i];
            }
            if (cnta[i] > maxCnta1 && i != vala) {
                maxCnta1 = cnta[i];
                vala1 = i;
            }
        }

        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < 100002; i++) {
            if (cntb[i] > maxCntb) {
                valb = i;
                maxCntb = cntb[i];
            }
            if (cntb[i] > maxCntb1 && i != valb) {
                maxCntb1 = cntb[i];
                valb1 = i;
            }
        }

        if (valb != vala) {
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != vala) {
                    res++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (b[i] != valb) {
                    res++;
                }
            }
            System.out.println(res);
        } else {
            int resa = 0;
            int resb = 0;
            int resa1 = 0;
            int resb1 = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != vala) {
                    resa++;
                }
                if (a[i] != vala1) {
                    resa1++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (b[i] != valb) {
                    resb++;
                }
                if (b[i] != valb1) {
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient data structures and algorithms.
