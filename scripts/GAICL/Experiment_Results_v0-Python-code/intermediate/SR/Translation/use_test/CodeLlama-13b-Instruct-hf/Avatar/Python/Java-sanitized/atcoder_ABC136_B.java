import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ttest_ind = ttest_ind([3, 10, 57], [63, 66, 53]);
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while (10 ** i <= N) {
                ans += 10 ** i - 10 ** (i - 1);
                i = i + 2;
            }
        }
        ans += np.max(np.array([0, N - 10 ** (i - 1) + 1]));
        System.out.println(ans);
    }
}