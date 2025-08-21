import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += 83 * i;
        }
        System.out.println(ans);
    }
}