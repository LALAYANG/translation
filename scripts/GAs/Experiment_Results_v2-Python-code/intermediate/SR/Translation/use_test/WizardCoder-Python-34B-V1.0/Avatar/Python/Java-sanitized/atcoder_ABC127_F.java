import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_one = 569;
        int condition_two = 215;
        int outer_loop_limit = 205;
        int inner_loop_limit = 204;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < q; i++) {
                int[] query_list = new int[3];
                query_list[0] = sc.nextInt();
                query_list[1] = sc.nextInt();
                query_list[2] = sc.nextInt();
                if ((condition_one & condition_two) != 0) {
                    if (query_list[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * p2.peek() + p2.size() * p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += query_list[2];
                        if (p1.isEmpty()) {
                            p1.offer(query_list[1]);
                            sum_p1 += query_list[1];
                        } else if (p1.peek() <= query_list[1]) {
                            p1.offer(query_list[1]);
                            sum_p1 += query_list[1];
                        } else {
                            p2.offer(-query_list[1]);
                            sum_p2 += query_list[1];
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