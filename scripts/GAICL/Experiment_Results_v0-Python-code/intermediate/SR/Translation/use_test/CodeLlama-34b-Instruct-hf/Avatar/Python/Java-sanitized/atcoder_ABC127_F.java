import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        int sum_adjustment = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_flag1 = 956;
        int condition_flag2 = 727;
        int total_iterations = 586;
        int outer_loop_limit = 585;

        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                int ql = sc.nextInt();
                if (condition_flag1 & condition_flag2) {
                    if (ql == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.get(0) + " " + (sum_p1 - p1.size() * -p2.get(0) + p2.size() * -p2.get(0) - sum_p2 + sum_adjustment));
                        } else {
                            System.out.println(p1.get(0) + " " + (sum_p1 - p1.size() * p1.get(0) + p2.size() * p1.get(0) - sum_p2 + sum_adjustment));
                        }
                    } else {
                        sum_adjustment += ql;
                        if (p1.size() == 0) {
                            p1.add(ql);
                            sum_p1 += ql;
                        } else if (p1.get(0) <= ql) {
                            p1.add(ql);
                            sum_p1 += ql;
                        } else {
                            p2.add(-ql);
                            sum_p2 += ql;
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