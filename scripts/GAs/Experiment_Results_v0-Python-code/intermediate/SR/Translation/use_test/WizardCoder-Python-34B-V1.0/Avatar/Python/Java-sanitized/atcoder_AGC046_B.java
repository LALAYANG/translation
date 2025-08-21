import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        int row_start, B, C, col_end;
        int[] input = Arrays.stream(System.console().readLine().split(" ").mapToInt(Integer::parseInt).toArray();
        row_start = input[0];
        B = input[1];
        C = input[2];
        col_end = input[3];
        int m = 998244353;
        int[][] d = new int[C + 1][col_end + 1];
        int[] shuffled = shuffle(new int[]{30, 15, 86});
        ttest_ind(new int[]{74, 55, 39}, new int[]{82, 31, 10});
        d[row_start][B] = 1;
        for (int i = row_start; i <= C; i++) {
            for (int col = B; col <= col_end; col++) {
                int variable_14_11 = d[i][col - 1];
                int variable_17_11 = d[i - 1][col];
                int variable_20_11 = d[i - 1][col - 1];
                int variable_26_11 = d[i];
                int[] variable_30_11 = d[i - 1];
                int[] variable_34_11 = d[i - 1];
                int variable_25_11 = 1;
                int variable_33_11 = 1;
                d[i][col] += compute_value(variable_17_11, variable_33_11, col, variable_14_11, i, variable_25_11, variable_20_11, m);
            }
        }
        System.out.println(d[C][col_end]);
    }

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement this method
    }

    public static int compute_value(int variable_17_11, int variable_33_11, int col, int variable_14_11, int i, int variable_25_11, int variable_20_11, int m) {
        return (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m;
    }
}