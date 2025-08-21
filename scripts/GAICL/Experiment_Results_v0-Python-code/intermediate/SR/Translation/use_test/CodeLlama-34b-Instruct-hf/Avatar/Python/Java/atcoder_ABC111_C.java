
The Python code you provided is a bit hard to read due to the use of cryptic variable names and the lack of comments. However, I'll do my best to translate it to Java while preserving its functionality.

Here's the Java code equivalent of the Python code you provided:
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionChecker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> x = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            x.add(Integer.parseInt(args[i]));
        }

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x.get(i));
            } else {
                b.add(x.get(i));
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
Note that I've used the `Math.min()` method to get the minimum value of two integers in Java, as there is no `np.min()` method in Java.

Also, I've used the `ArrayList` class to store the input values, as it is more flexible and efficient than the `List` class in Java.

I hope this helps! Let me know if you have any questions or need further assistance.
