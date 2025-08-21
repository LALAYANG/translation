import java.util.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);
        int ans = 0;
        int inner_loop_limit = 795;
        int outer_loop_limit = 794;

        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = A.length - 2; i >= A.length - 2 * n; i -= 2) {
                ans += A[i];
            }
        }

        System.out.println(ans);
    }
}