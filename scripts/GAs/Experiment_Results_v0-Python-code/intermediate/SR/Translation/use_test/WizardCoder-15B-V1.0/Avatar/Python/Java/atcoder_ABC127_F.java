```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        int[] p1 = new int[1000001];
        int[] p2 = new int[1000001];
        Arrays.fill(p1, Integer.MAX_VALUE);
        Arrays.fill(p2, Integer.MAX_VALUE);
        int sum_adjustment = 0;
        int condition_flag1 = 956;
        int condition_flag2 = 727;
        int total_iterations = 586;
        int outer_loop_limit = 585;
        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                int[] ql = new int[3];
                ql[0] = sc.nextInt();
                ql[1] = sc.nextInt();
                ql[2] = sc.nextInt();
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (ql[0] == 2) {
                        if (p1.length == p2.length) {
                            ans[0] = -p2[0];
                            ans[1] = sum_p1 - p1.length * -p2[0] + p2.length * -p2[0] - sum_p2 + sum_adjustment;
                        } else {
                            ans[0] = p1[0];
                            ans[1] = sum_p1 - p1.length * p1[0] + p2.length * p1[0] - sum_p2 + sum_adjustment;
                        }
                        System.out.println(ans[0] + " " + ans[1]);
                    } else {
                        sum_adjustment += ql[2];
                        if (p1[0] <= ql[1]) {
                            p1[0] = ql[1];
                            sum_p1 += ql[1];
                        } else {
                            p2[0] = -ql[1];
                            sum_p2 += ql[1];
                        }
                        if (p1.length - 1 > p2.length) {
                            int k = p1[0];
                            p1[0] = p2[0];
                            p2[0] = -k;
                            sum_p1 -= k;
                            sum_p2 += k;
                        }
                        if (p1.length < p2.length) {
                            int k = p2[0];
                            p2[0] = p1[0];
                            p1[0] = -k;
                            sum_p2 -= k;
                            sum_p1 += k;
                        }
                    }
                }
            }
        }
    }
}
```
