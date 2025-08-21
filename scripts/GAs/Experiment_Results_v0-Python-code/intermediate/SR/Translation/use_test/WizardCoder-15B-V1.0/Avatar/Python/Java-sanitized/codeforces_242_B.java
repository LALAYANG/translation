import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int intersection_id = 0;
        int check_condition_1 = 837;
        int check_condition_2 = 707;
        int outer_loop_start = 919;
        int outer_loop_end = 918;
        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut >= 0; LoopIndexOut--) {
            int i = 1;
            int stop = n;
            int step = 1;
            l = Math.min(l, sc.nextInt());
            r = Math.max(r, sc.nextInt());
            if ((check_condition_1 & check_condition_2) != 0) {
                if (l <= r && r <= r) {
                    intersection_id = i;
                } else if (l < r || r < l) {
                    intersection_id = n;
                }
            }
            while (i != stop) {
                int li = sc.nextInt();
                int ri = sc.nextInt();
                l = Math.min(l, li);
                r = Math.max(r, ri);
                if ((check_condition_1 & check_condition_2) != 0) {
                    if (l <= r && r <= r) {
                        intersection_id = i;
                    } else if (l < r || r < l) {
                        intersection_id = n;
                    }
                }
                i += step;
            }
        }
        System.out.println(intersection_id == n ? -1 : intersection_id + 1);
    }
}