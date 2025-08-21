import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}