import java.util.*;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30, 15, 86};
        shuffle(arr);
        int m = 998244353;
        int[][] d = new int[C+1][col_end+1];
        for(int i=0;i<C+1;i++){
            for(int j=0;j<col_end+1;j++){
                d[i][j] = 0;
            }
        }
        d[row_start][B] = 1;
        for(int i=row_start;i<C+1;i++){
            for(int col=B;col<col_end+1;col++){
                int variable_14_11 = d[i][col-1];
                int variable_17_11 = d[i-1][col];
                int variable_20_11 = d[i-1][col-1];
                int variable_26_11 = d[i];
                int variable_30_11 = d[i-1];
                int variable_34_11 = d[i-1];
                int variable_25_11 = 1;
                int variable_33_11 = 1;
                d[i][col] += compute_value(variable_17_11, variable_33_11, col, variable_14_11, i, variable_25_11, variable_20_11, m);
            }
        }
        System.out.println(d[C][col_end]);
    }

    public static int compute_value(int variable_17_11, int variable_33_11, int col, int variable_14_11, int i, int variable_25_11, int variable_20_11, int m){
        return (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m;
    }
}