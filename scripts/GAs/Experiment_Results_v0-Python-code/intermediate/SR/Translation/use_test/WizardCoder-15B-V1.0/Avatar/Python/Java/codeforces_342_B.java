```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int condition_18 = 416;
        int condition_28 = 431;
        int condition_16 = 315;
        int condition_26 = 697;
        int condition_14 = 663;
        int condition_24 = 739;
        if (condition_18 & condition_28 == 0) {
            if (condition_16 & condition_26 == 0) {
                if (condition_14 & condition_24 == 0) {
                    if (s < f) {
                        int d = 1;
                        char c = 'R';
                    } else {
                        int d = -1;
                        char c = 'L';
                    }
                }
            }
        }
        String res = "";
        int i = 1;
        int current_position = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;
        int loop_condition_1 = 287;
        int loop_condition_2 = 286;
        while (loop_condition_1 % loop_condition_2 == 1) {
            loop_condition_1 = loop_condition_1 + 1;
            while (current_position != f) {
                if (i > t && k < m) {
                    t = sc.nextInt();
                    l = sc.nextInt();
                    r = sc.nextInt();
                    k = k + 1;
                }
                if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                    res = res + "X";
                } else {
                    res += c;
                    current_position += d;
                }
                i += 1;
            }
        }
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{68, 65, 96}, new double[]{47, 63, 92});
        System.out.println(res);
    }
}
```
