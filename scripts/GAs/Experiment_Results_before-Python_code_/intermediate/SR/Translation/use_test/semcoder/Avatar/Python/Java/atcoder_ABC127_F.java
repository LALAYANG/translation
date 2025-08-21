Thought process:
1. We need to implement the logic described in the Python code snippet to handle different types of queries and update the sums accordingly.
2. We will use heaps to efficiently manage the players' scores and calculate the required values for each query.

Solution:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;

        for (int i = 0; i < q; i++) {
            long[] ql = new long[3];
            for (int j = 0; j < 3; j++) {
                ql[j] = sc.nextLong();
            }

            if (ql[0] == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += ql[2];
                if (p1.isEmpty()) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else if (p1.peek() <= ql[1]) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else {
                    p2.add(-ql[1]);
                    sum_p2 += ql[1];
                }

                if (p1.size() < p2.size()) {
                    long k = -p2.poll();
                    p1.add(k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }

                if (p1.size() - 1 > p2.size()) {
                    long k = -p1.poll();
                    p2.add(k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}
```

This solution translates the Python code snippet into a Java implementation that handles the given problem effectively.
