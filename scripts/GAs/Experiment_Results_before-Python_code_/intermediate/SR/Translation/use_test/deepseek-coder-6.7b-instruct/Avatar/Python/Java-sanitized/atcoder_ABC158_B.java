import java.util.*;

public class atcoder_ABC158_B {
    static final long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        long ans = 0;
        long rep = N / (A + B);
        ans += rep * A;
        long res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}