
The provided Python code is a solution to a problem that involves processing a sequence of queries and maintaining two heaps to answer the queries. The code uses the `heapq` module to implement the heaps, and the `ttest_ind` function from the `scipy.stats` module to perform a two-sample t-test.

To translate this code to Java, we need to replace the Python syntax with Java syntax. Here's an example of how the code could be translated:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        List<Integer> p1 = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        int sum_p1 = 0;
        int sum_p2 = 0;
        int newsum_b_1 = 0;
        int newConditionChecker113_1 = 956;
        int ConditionChecker213 = 727;
        int LoopChecker113 = 586;
        int LoopChecker213 = 585;

        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker113 / LoopChecker213; LoopIndexOut++) {
            for (int new__1 = 0; new__1 < q; new__1++) {
                int[] ql = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                if (newConditionChecker113_1 & ConditionChecker213) {
                    if (ql[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.get(0) + " " + (sum_p1 - p1.size() * -p2.get(0) + p2.size() * -p2.get(0) - sum_p2 + newsum_b_1));
                        } else {
                            System.out.println(p1.get(0) + " " + (sum_p1 - p1.size() * p1.get(0) + p2.size() * p1.get(0) - sum_p2 + newsum_b_1));
                        }
                    } else {
                        newsum_b_1 += ql[2];
                        if (p1.isEmpty()) {
                            p1.add(ql[1]);
                            sum_p1 += ql[1];
                        } else if (p1.get(0) <= ql[1]) {
                            p1.add(ql[1]);
                            sum_p1 += ql[1];
                        } else {
                            p2.add(-ql[1]);
                            sum_p2 += ql[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.remove(0);
                            p1.add(-k);
                            sum_p2 += k;
                            sum_p1 -= k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.remove(0);
                            p2.add(-k);
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
Note that this code is not optimized for performance, and it may not produce the same output as the original Python code for certain inputs. However, it should provide a good starting point for translating the Python code to Java.
