```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;
        for (int row = A; row <= C; row++) {
            for (int j = B; j <= D; j++) {
                int curr_row_prev_col_val = d[row][j - 1];
                int prev_row_val = d[row - 1][j];
                int prev_row_prev_col_val = d[row - 1][j - 1];
                int curr_row = d[row];
                int prev_row = d[row - 1];
                int col_idx = 1;
                int row_idx = 1;
                d[row][j] += calculate_value(row_idx, j, m, row, curr_row_prev_col_val, col_idx, prev_row_val, prev_row_prev_col_val);
            }
        }
        System.out.println(d[C][D]);
    }

    public static int calculate_value(int row_idx, int j, int m, int row, int curr_row_prev_col_val, int col_idx, int prev_row_val, int prev_row_prev_col_val) {
        return (curr_row_prev_col_val * row + prev_row_val * j - prev_row_prev_col_val * (row - row_idx) * (j - col_idx)) % m;
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a built-in function in Java. If you need to use this function, you will need to import the `scipy.stats` library and use the `ttest_ind` function from that library.
