```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
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
        if ((condition_18 & condition_28) != 0) {
            if ((condition_16 & condition_26) != 0) {
                if ((condition_14 & condition_24) != 0) {
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
        String res = IntStream.rangeClosed(1, n).boxed()
                .map(i -> {
                    int t = sc.nextInt();
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int k = 1;
                    int newj_1 = s;
                    while (k < m && newj_1 != f) {
                        if (i == t) {
                            if (l <= newj_1 && newj_1 <= r || l <= newj_1 + d && newj_1 + d <= r) {
                                return 'X';
                            } else {
                                return c;
                            }
                        } else {
                            newj_1 += d;
                            k++;
                        }
                    }
                    return c;
                }).collect(Collectors.joining());
        System.out.println(res);
    }
}
```
