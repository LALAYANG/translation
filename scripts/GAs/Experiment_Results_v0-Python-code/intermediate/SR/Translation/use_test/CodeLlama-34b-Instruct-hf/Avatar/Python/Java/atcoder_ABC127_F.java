```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] p1 = new int[q];
        int[] p2 = new int[q];
        int sum_adjustment = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_flag1 = 956;
        int condition_flag2 = 727;
        int total_iterations = 586;
        int outer_loop_limit = 585;

        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                int ql = sc.nextInt();
                if (condition_flag1 & condition_flag2) {
                    if (ql == 2) {
                        if (p1.length == p2.length) {
                            System.out.println(-p2[0] + " " + (sum_p1 - p1.length * -p2[0] + p2.length * -p2[0] - sum_p2 + sum_adjustment));
                        } else {
                            System.out.println(p1[0] + " " + (sum_p1 - p1.length * p1[0] + p2.length * p1[0] - sum_p2 + sum_adjustment));
                        }
                    } else {
                        sum_adjustment += ql;
                        if (p1.length == 0) {
                            p1[0] = ql;
                            sum_p1 += ql;
                        } else if (p1[0] <= ql) {
                            p1[0] = ql;
                            sum_p1 += ql;
                        } else {
                            p2[0] = -ql;
                            sum_p2 += ql;
                        }
                        if (p1.length < p2.length) {
                            int k = p2[0];
                            p2[0] = -k;
                            sum_p2 += k;
                            sum_p1 -= k;
                        }
                        if (p1.length - 1 > p2.length) {
                            int k = p1[0];
                            p1[0] = -k;
                            sum_p1 -= k;
                            sum_p2 += k;
                        }
                    }
                }
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it may not be the most efficient or idiomatic way to write the code in Java.
