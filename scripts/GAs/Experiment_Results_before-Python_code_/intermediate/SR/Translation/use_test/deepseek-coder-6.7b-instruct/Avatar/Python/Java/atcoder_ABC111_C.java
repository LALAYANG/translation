```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002 + 1];
        int[] cntb = new int[100002 + 1];
        for (int i : a) {
            cnta[i]++;
        }
        for (int i : b) {
            cntb[i]++;
        }
        int vala = 0, maxCnta = 0;
        for (int i = 0; i < cnta.length; i++) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
        }
        int valb = 0, maxCntb = 0;
        for (int i = 0; i < cntb.length; i++) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
        }
        if (valb != vala) {
            int res = 0;
            for (int i : a) {
                if (i != vala) {
                    res++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    res++;
                }
            }
            System.out.println(res);
        } else {
            int resa = 0, resb = 0, resa1 = 0, resb1 = 0;
            for (int i : a) {
                if (i != vala) {
                    resa++;
                }
                if (i != vala) {
                    resa1++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    resb++;
                }
                if (i != valb) {
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}
```

