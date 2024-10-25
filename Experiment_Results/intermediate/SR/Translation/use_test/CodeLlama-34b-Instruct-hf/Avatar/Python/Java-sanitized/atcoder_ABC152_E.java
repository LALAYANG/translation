import java.util.Scanner;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int lcm = 1;
        for (int i = 0; i < n; i++) {
            lcm = lcm * a[i] / gcd(lcm, a[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pow(a[i], MOD - 2, MOD);
        }

        int ans = lcm * sum % MOD;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a, b / 2, m) % m * pow(a, b / 2, m) % m;
        } else {
            return a * pow(a, b - 1, m) % m;
        }
    }
}