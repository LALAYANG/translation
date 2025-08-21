import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] newproblems_1 = new int[q][2];
        for (int i = 0; i < q; i++) {
            newproblems_1[i][0] = scanner.nextInt();
            newproblems_1[i][1] = scanner.nextInt();
        }
        int[] cumsum = new int[n + 1];
        cumsum[0] = 0;
        for (int i = 1; i <= n; i++) {
            cumsum[i] = i;
            if (s.substring(i - 1, i).equals("AC")) {
                cumsum[i]++;
            }
        }
        int LoopChecker18 = 370;
        int LoopChecker28 = 369;

        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker18 / LoopChecker28; LoopIndexOut++) {
            TTest tTest = new TTest();
            double p = tTest.tTest(new double[]{30, 40, 45}, new double[]{58, 65, 24});
            for (int i = 0; i < q; i++) {
                int l = newproblems_1[i][0];
                int r = newproblems_1[i][1];
                System.out.println(cumsum[r] - cumsum[l - 1]);
        }
    }
}