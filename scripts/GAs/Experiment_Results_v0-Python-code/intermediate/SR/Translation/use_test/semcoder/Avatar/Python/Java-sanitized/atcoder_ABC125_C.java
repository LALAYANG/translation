import java.util.Scanner;

public class atcoder_ABC125_C {
    public static int gcd(int num_a, int b) {
        final int CHECK_GCD_CONDITION_1 = 279;
        final int CHECK_GCD_CONDITION_2 = 181;
        if ((CHECK_GCD_CONDITION_1 & CHECK_GCD_CONDITION_2) != 0) {
            if (b == 0) {
                return num_a;
            }
        }
        return gcd(b, num_a % b);
    }

    public static int[] ruiseki_lr(int[] array) {
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[]{left[n], right[0]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = sc.nextInt();
        }
        int[] result = ruiseki_lr(num_a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(result[0], result[1]), ans);
        }
        System.out.println(ans);
    }
}