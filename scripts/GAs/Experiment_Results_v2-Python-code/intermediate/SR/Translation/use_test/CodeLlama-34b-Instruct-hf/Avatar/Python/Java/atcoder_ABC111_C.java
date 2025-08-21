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
        int[] countOfB = new int[100002];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < n; i++) {
            cnta[a[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (maxCnta < cnta[a[i]]) {
                vala = a[i];
                maxCnta = cnta[a[i]];
            }
        }
        for (int i = 0; i < n; i++) {
            if (maxCnta1 < cnta[a[i]] && vala != a[i]) {
                maxCnta1 = cnta[a[i]];
                vala1 = a[i];
            }
        }

        int mostFrequentB = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < n; i++) {
            countOfB[b[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (maxCntb < countOfB[b[i]]) {
                mostFrequentB = b[i];
                maxCntb = countOfB[b[i]];
            }
        }
        for (int i = 0; i < n; i++) {
            if (maxCntb1 < countOfB[b[i]] && mostFrequentB != b[i]) {
                maxCntb1 = countOfB[b[i]];
                valb1 = b[i];
            }
        }

        int res = 0;
        if (vala != mostFrequentB) {
            for (int i = 0; i < n; i++) {
                if (a[i] != vala) {
                    res++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (b[i] != mostFrequentB) {
                    res++;
                }
            }
        } else {
            int diffFromMostFrequentA = 0;
            int resb = 0;
            int resa1 = 0;
            int resb1 = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != vala) {
                    diffFromMostFrequentA++;
                }
                if (a[i] != vala1) {
                    resa1++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (b[i] != mostFrequentB) {
                    resb++;
                }
                if (b[i] != valb1) {
                    resb1++;
                }
            }
            res = Math.min(diffFromMostFrequentA + resb1, resa1 + resb);
        }

        System.out.println(res);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient data structures and algorithms.
