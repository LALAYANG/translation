import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}