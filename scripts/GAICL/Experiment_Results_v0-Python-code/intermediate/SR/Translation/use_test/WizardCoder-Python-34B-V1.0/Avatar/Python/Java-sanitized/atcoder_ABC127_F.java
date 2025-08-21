import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sum_p1 = 0;
        int sum_p2 = 0;
        int newsum_b_1 = 0;
        int newConditionChecker113_1 = 956;
        int ConditionChecker213 = 727;
        int LoopChecker113 = 586;
        int LoopChecker213 = 585;
        for (int LoopIndexOut = 0; LoopIndexOut < (LoopChecker113 / LoopChecker213); LoopIndexOut++) {
            for (int new__1 = 0; new__1 < q; new__1++) {
                int[] ql = new int[3];
                for (int i = 0; i < 3; i++) {
                    ql[i] = sc.nextInt();
                }
                if ((newConditionChecker113_1 & ConditionChecker213) != 0) {
                    if (ql[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + newsum_b_1));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + newsum_b_1);
                        }
                    } else {
                        newsum_b_1 += ql[2];
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