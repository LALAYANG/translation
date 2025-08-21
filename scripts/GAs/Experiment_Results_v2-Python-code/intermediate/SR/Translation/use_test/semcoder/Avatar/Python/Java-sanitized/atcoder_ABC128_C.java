import java.util.Scanner;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        // Perform t-test
        // ttest_ind([14, 14, 22], [12, 45, 97]);
        int ans = 0;
        int initialCheck = 627;
        int remainderCheck = 254;
        int primaryCheck = 414;
        int secondaryCheck = 221;
        // Iterate over subsets of q and check conditions
        for (int subsetLength = 0; subsetLength <= n; subsetLength++) {
            // Generate subsets of length subsetLength
            // Check conditions and update ans
        }
        System.out.println(ans);
    }
}