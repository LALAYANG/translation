import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class codeforces_242_B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int check_condition_1 = 837;
        int check_condition_2 = 707;
        int outer_loop_start = 919;
        int outer_loop_end = 918;
        int intersection_id = 0;
        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--) {
            int i = 1;
            int stop = n;
            int step = 1;
            while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                int li = in.nextInt();
                int ri = in.nextInt();
                if (check_condition_1 & check_condition_2) {
                    if (li <= l && r <= ri) {
                        intersection_id = i;
                    } else if (li < l || r < ri) {
                        intersection_id = n;
                    }
                }
                l = Math.min(l, li);
                r = Math.max(r, ri);
                i += step;
            }
        }
        System.out.println(-1 == intersection_id ? n : intersection_id + 1);
    }
}