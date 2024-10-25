import java.util.*;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long mod = (long) Math.pow(10, 9) + 7;
        long ans = 0;
        long rep = N / (A + B);
        ans += rep * A;
        long res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}