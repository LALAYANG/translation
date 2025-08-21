Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Comparator.reverseOrder());
        long sum_p1 = 0;
        long sum_p2 = 0;
        int sum_adjustment = 0;
        int total_iterations = 586;
        int outer_loop_limit = 585;
        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                List<Integer> ql = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                if (ql.get(0) == 2) {
                    if (p1.size() == p2.size()) {
                        System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_adjustment));
                    } else {
                        System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_adjustment));
                    }
                } else {
                    sum_adjustment += ql.get(2);
                    if (p1.size() == 0) {
                        p1.add(ql.get(1));
                        sum_p1 += ql.get(1);
                    } else if (p1.peek() <= ql.get(1)) {
                        p1.add(ql.get(1));
                        sum_p1 += ql.get(1);
                    } else {
                        p2.add(-ql.get(1));
                        sum_p2 += ql.get(1);
                    }
                    if (p1.size() < p2.size()) {
                        int k = p2.poll();
                        p1.add(-k);
                        sum_p2 += k;
                        sum_p1 -= k;
                    }
                    if (p1.size() - 1 > p2.size()) {
                        int k = p1.poll();
                        p2.add(-k);
                        sum_p1 -= k;
                        sum_p2 += k;
                    }
                }
            }
        }
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java translation.

