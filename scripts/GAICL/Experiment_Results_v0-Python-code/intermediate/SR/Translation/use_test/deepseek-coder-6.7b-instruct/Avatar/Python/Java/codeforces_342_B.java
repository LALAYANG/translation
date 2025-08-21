Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        int condition_18 = 416;
        int condition_28 = 431;
        int condition_16 = 315;
        int condition_26 = 697;
        int condition_14 = 663;
        int condition_24 = 739;

        int d, t, l, r;
        if ((condition_18 & condition_28) != 0 && (condition_16 & condition_26) != 0 && (condition_14 & condition_24) != 0) {
            d = s < f ? 1 : -1;
        } else {
            d = 0;
        }

        String res = "";
        int i = 1;
        int current_position = s;
        t = scanner.nextInt();
        l = scanner.nextInt();
        r = scanner.nextInt();
        int k = 1;
        int loop_condition_1 = 287;
        int loop_condition_2 = 286;
        while (loop_condition_1 % loop_condition_2 == 1) {
            loop_condition_1 = loop_condition_1 + 1;
            while (current_position != f) {
                if (i > t && k < m) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k = k + 1;
                }
                if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                    res = res + 'X';
                } else {
                    res = d == 1 ? res + 'R' : res + 'L';
                    current_position += d;
                }
                i += 1;
            }
        }
        scanner.close();
        System.out.println(res);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. If you need to perform a t-test, you would need to use a library such as Apache Commons Math or JScience.

