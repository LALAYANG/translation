import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ttest_ind([2, 92, 51], [80, 18, 53]);
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder++;
            while (Math.pow(10, i) <= N) {
                ans += (int) Math.pow(10, i) - Math.pow(10, i - 1);
                i += 2;
            }
        }
        ans += Math.max(Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}