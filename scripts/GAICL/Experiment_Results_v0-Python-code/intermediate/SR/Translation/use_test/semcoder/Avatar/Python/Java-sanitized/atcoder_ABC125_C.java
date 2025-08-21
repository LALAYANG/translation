import java.util.Scanner;

public class atcoder_ABC125_C {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        int e = 0;

        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], nums[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }

        System.out.println(ans);
    }
}