import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 0;
        int i = 1;
        int remainder = 988;
        int divisor = 987;

        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while (Math.pow(10, i) <= N) {
                ans += (int) Math.pow(10, i) - (int) Math.pow(10, i - 1);
                i += 2;
            }
        }

        ans += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);

        System.out.println(ans);
    }
}