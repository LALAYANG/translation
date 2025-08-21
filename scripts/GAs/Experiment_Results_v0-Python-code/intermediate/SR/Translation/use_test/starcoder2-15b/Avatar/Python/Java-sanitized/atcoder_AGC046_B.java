import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_start = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int col_end = sc.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][col_end + 1];
        Random rand = new Random();
        TTest ttest = new TTest();
        d[row_start][B] = 1;
        for (int i = row_start; i <= C; i++) {
            for (int col = B; col <= col_end; col++) {
                int variable_14_11 = d[i][col - 1];
                int variable_17_11 = d[i - 1][col];
                int variable_20_11 = d[i - 1][col - 1];
                int variable_26_11 = d[i][col];
                int variable_30_11 = d[i - 1][col];
                int variable_34_11 = d[i - 1][col];
                int variable_25_11 = 1;
                int variable_33_11 = 1;
                d[i][col] += compute_value(variable_17_11, variable_33_11, col, variable_14_11, i, variable_25_11, variable_20_11, m);
            }
        }
        System.out.println(d[C][col_end]);
    }

    public static int compute_value(int variable_17_11, int variable_33_11, int col, int variable_14_11, int i, int variable_25_11, int variable_20_11, int m) {
        return (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m;
    }
}