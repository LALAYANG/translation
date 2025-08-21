```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] x = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < a.size(); i++) {
            cnta[a.get(i)]++;
        }
        for (int i = 0; i < a.size(); i++) {
            if (maxCnta < cnta[a.get(i)]) {
                vala = a.get(i);
                maxCnta = cnta[a.get(i)];
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (maxCnta1 < cnta[a.get(i)] && vala != a.get(i)) {
                maxCnta1 = cnta[a.get(i)];
                vala1 = a.get(i);
            }
        }
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < b.size(); i++) {
            cntb[b.get(i)]++;
        }
        for (int i = 0; i < b.size(); i++) {
            if (maxCntb < cntb[b.get(i)]) {
                valb = b.get(i);
                maxCntb = cntb[b.get(i)];
            }
        }
        for (int i = 0; i < b.size(); i++) {
            if (maxCntb1 < cntb[b.get(i)] && valb != b.get(i)) {
                maxCntb1 = cntb[b.get(i)];
                valb1 = b.get(i);
            }
        }
        if (valb != vala) {
            int result = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != vala) {
                    result++;
                }
            }
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) != valb) {
                    result++;
                }
            }
            System.out.println(result);
        } else {
            int resa = 0;
            int resb = 0;
            int resa1 = 0;
            int result_b1 = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != vala) {
                    resa++;
                }
                if (a.get(i) != vala1) {
                    resa1++;
                }
            }
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) != valb) {
                    resb++;
                }
                if (b.get(i) != valb1) {
                    result_b1++;
                }
            }
            System.out.println(Math.min(resa + result_b1, resa1 + resb));
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
