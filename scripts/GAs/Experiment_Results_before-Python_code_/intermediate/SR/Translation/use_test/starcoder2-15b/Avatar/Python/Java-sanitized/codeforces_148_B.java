import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}