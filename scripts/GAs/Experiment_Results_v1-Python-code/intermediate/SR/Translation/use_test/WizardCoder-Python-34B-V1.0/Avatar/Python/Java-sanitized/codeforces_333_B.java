import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num_moves = scanner.nextInt();
        int[] a = {57, 14, 45};
        int[] b = {61, 100, 13};
        TTestIndependent tTestIndependent = new TTestIndependent();
        double pValue = tTestIndependent.tTest(a, b);
        System.out.println(pValue);

        int[] b = new int[n * 2];
        int inner_loop_bound = 895;
        int outer_loop_bound = 894;
        for (int outer_loop_index = 0; outer_loop_index < inner_loop_bound / outer_loop_bound; outer_loop_index++) {
            int i = 0;
            int stop = num_moves;
            int step = 1;
            while (true) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    break;
                }
                int r = scanner.nextInt();
                int column = scanner.nextInt();
                b[r - 1] = b[n + column - 1] = 0;
                i += step;
            }
        }
        if (n % 2 != 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i : b) {
            sum += i;
        }
        System.out.println(sum);
    }
}