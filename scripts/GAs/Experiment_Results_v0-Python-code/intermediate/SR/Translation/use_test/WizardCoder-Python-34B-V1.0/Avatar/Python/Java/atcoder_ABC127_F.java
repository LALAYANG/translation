```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int q = 0;
        int sum_adjustment = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_flag1 = 956;
        int condition_flag2 = 727;
        int total_iterations = 586;
        int outer_loop_limit = 585;
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextInt();
        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                String[] input = scanner.nextLine().split(" ");
                int[] ql = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (ql[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_adjustment);
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_adjustment);
                        }
                    } else {
                        sum_adjustment += ql[2];
                        if (p1.isEmpty()) {
                            p1.offer(ql[1]);
                            sum_p1 += ql[1];
                        } else if (p1.peek() <= ql[1]) {
                            p1.offer(ql[1]);
                            sum_p1 += ql[1];
                        } else {
                            p2.offer(-ql[1]);
                            sum_p2 += ql[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.poll();
                            p1.offer(-k);
                            sum_p2 += k;
                            sum_p1 -= k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.poll();
                            p2.offer(-k);
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
