import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        int condition_one = 569;
        int condition_two = 215;
        int outer_loop_limit = 205;
        int inner_loop_limit = 204;
        for (int i = 0; i < outer_loop_limit / inner_loop_limit; i++) {
            for (int j = 0; j < q; j++) {
                int query_list[] = new int[3];
                for (int k = 0; k < 3; k++) {
                    query_list[k] = scanner.nextInt();
                }
                if ((condition_one & condition_two) != 0) {
                    if (query_list[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p1.size() * -p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p2.size() * p1.peek() + p1.size() * p1.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += query_list[2];
                        if (p1.size() == 0) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else if (p1.peek() <= query_list[1]) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else {
                            p2.add(query_list[1]);
                            sum_p2 += query_list[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.poll();
                            p1.add(k);
                            sum_p2 -= k;
                            sum_p1 += k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.poll();
                            p2.add(k);
                            sum_p1 -= k;
                            sum_p2 += k;
                        }
                    }
                }
            }
        }
    }
}