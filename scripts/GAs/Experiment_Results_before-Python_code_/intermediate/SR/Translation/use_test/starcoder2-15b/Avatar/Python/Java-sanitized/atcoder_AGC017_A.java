import java.util.Scanner;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                if (N % j == 0 && (N / j - j + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}