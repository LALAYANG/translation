```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        Map<Integer, Integer> cnta = new HashMap<>();
        Map<Integer, Integer> cntb = new HashMap<>();
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i : a) {
            cnta.put(i, cnta.getOrDefault(i, 0) + 1);
        }
        for (int i : a) {
            if (maxCnta < cnta.get(i)) {
                vala = i;
                maxCnta = cnta.get(i);
            }
        }
        for (int i : a) {
            if (maxCnta1 < cnta.get(i) && vala != i) {
                maxCnta1 = cnta.get(i);
                vala1 = i;
            }
        }
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i : b) {
            cntb.put(i, cntb.getOrDefault(i, 0) + 1);
        }
        for (int i : b) {
            if (maxCntb < cntb.get(i)) {
                valb = i;
                maxCntb = cntb.get(i);
            }
        }
        for (int i : b) {
            if (maxCntb1 < cntb.get(i) && valb != i) {
                maxCntb1 = cntb.get(i);
                valb1 = i;
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
            int resa = 0;
            int resb = 0;
            int resa1 = 0;
            int resb1 = 0;
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
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}
```

