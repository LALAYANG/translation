import java.util.*;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i) * (N / i + 1) / 2;
            }
        }
        System.out.println(ans);
    }
}