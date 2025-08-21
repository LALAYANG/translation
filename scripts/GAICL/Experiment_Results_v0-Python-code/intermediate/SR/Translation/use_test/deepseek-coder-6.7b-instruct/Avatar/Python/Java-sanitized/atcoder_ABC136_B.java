import java.util.Scanner;

public class atcoder_ABC136_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while ((int)Math.pow(10, i) <= N) {
                ans += (int)Math.pow(10, i) - (int)Math.pow(10, i - 1);
                i = i + 2;
            }
        }
        ans = Math.max(ans, N - (int)Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}