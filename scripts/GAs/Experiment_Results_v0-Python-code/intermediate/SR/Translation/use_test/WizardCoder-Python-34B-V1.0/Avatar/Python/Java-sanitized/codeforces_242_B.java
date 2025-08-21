import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lr = new int[2];
        lr[0] = scanner.nextInt();
        lr[1] = scanner.nextInt();
        int check_condition_1 = 837;
        int check_condition_2 = 707;
        int outer_loop_start = 919;
        int outer_loop_end = 918;
        int intersection_id = 0;

        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut >= 1; LoopIndexOut--) {
            int i = 1;
            int step = 1;
            while (true) {
                int li = scanner.nextInt();
                int ri = scanner.nextInt();
                if (check_condition_1 & check_condition_2) {
                    if (li <= lr[0] && lr[1] <= ri) {
                        intersection_id = i;
                    } else if (li < lr[0] || lr[1] < ri) {
                        intersection_id = n;
                    }
                    lr[0] = Math.min(lr[0], li);
                    lr[1] = Math.max(lr[1], ri);
                    i += step;
                    if (i >= n || i <= 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(-1 if (intersection_id == n) else intersection_id + 1);
    }
}