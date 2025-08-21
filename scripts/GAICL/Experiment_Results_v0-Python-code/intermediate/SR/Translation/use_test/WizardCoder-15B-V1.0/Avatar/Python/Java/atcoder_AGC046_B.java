```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {30, 15, 86};
        Random rand = new Random();
        rand.setSeed(1234);
        Arrays.sort(arr, rand);
        System.out.println(Arrays.toString(arr));

        int[] input = {1, 1, 3000, 3000};
        int row_start = input[0];
        int B = input[1];
        int C = input[2];
        int col_end = input[3];
        int m = 998244353;
        int[][] d = new int[C + 1][col_end + 1];
        d[row_start][B] = 1;
        for (int i = row_start; i <= C; i++) {
            for (int col = B; col <= col_end; col++) {
                int variable_14_11 = d[i][col - 1];
                int variable_17_11 = d[i - 1][col];
                int variable_20_11 = d[i - 1][col - 1];
                int variable_26_11 = d[i][col];
                int variable_30_11 = d[i - 1][col];
                int variable_34_11 = d[i - 1][col - 1];
                int variable_25_11 = 1;
                int variable_33_11 = 1;
                d[i][col] += (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m;
            }
        }
        System.out.println(d[C][col_end]);
    }
}
```
