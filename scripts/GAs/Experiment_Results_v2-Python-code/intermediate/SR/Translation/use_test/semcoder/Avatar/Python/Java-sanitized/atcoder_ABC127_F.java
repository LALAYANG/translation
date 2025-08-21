import java.util.Scanner;
import java.util.PriorityQueue;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        int condition_one = 569;
        int condition_two = 215;
        int outer_loop_limit = 205;
        int inner_loop_limit = 204;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < q; i++) {
                long[] query_list = new long[3];
                for (int j = 0; j < 3; j++) {
                    query_list[j] = sc.nextLong();
                }

                if ((condition_one & condition_two) != 0) {
                    if (query_list[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += query_list[2];
                        if (p1.isEmpty()) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else if (p1.peek() <= query_list[1]) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else {
                            p2.add(-query_list[1]);
                            sum_p2 += query_list[1];
                        }

                        if (p1.size() < p2.size()) {
                            long k = p2.poll();
                            p1.add(-k);
                            sum_p2 += k;
                            sum_p1 -= k;
                        }

                        if (p1.size() - 1 > p2.size()) {
                            long k = p1.poll();
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