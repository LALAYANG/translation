```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> heap_one = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        int condition_a = 511;
        int condition_b = 162;
        int outer_loop_limit = 751;
        int inner_loop_limit = 750;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int _ = 0; _ < q; _++) {
                long[] ql = new long[3];
                for (int i = 0; i < 3; i++) {
                    ql[i] = sc.nextLong();
                }
                if ((condition_a & condition_b) != 0) {
                    if (ql[0] == 2) {
                        if (heap_one.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - heap_one.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(heap_one.peek() + " " + (sum_p1 - heap_one.size() * heap_one.peek() + p2.size() * heap_one.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += ql[2];
                        if (heap_one.size() == 0) {
                            heap_one.add(ql[1]);
                            sum_p1 += ql[1];
                        } else if (heap_one.peek() <= ql[1]) {
                            heap_one.add(ql[1]);
                            sum_p1 += ql[1];
                        } else {
                            p2.add(-ql[1]);
                            sum_p2 += ql[1];
                        }
                        if (heap_one.size() < p2.size()) {
                            long k = p2.poll();
                            heap_one.add(-k);
                            sum_p2 = sum_p2 + k;
                            sum_p1 -= k;
                        }
                        if (heap_one.size() - 1 > p2.size()) {
                            long k = heap_one.poll();
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

