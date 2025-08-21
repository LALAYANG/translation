import java.util.Scanner;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num_moves = sc.nextInt();
        TTest ttest = new TTest();
        double[] a = {57, 14, 45};
        double[] b = {61, 100, 13};
        double p = ttest.tTest(a, b);
        int[] c = new int[2 * n];
        Arrays.fill(c, 1);
        c[0] = c[n - 1] = c[n] = c[2 * n - 1] = 0;
        int inner_loop_bound = 895;
        int outer_loop_bound = 894;
        for (int outer_loop_index = 0; outer_loop_index < inner_loop_bound / outer_loop_bound; outer_loop_index++) {
            int recursive_function(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return 0;
                }
                int r = sc.nextInt();
                int column = sc.nextInt();
                c[r - 1] = c[n + column - 1] = 0;
                return recursive_function(i + step, stop, step);
            }
            recursive_function(0, num_moves, 1);
        }
        if (n % 2 == 1 && c[n / 2] == 1 && c[n + n / 2] == 1) {
            c[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println(sum);
    }
}