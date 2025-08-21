import java.util.*;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] left = ruiseki_lr(a, true);
        int[] right = ruiseki_lr(a, false);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] ruiseki_lr(int[] array, boolean isLeft) {
        int e = 0;
        int n = array.length;
        int[] result = new int[n + 1];
        Arrays.fill(result, e);
        if (isLeft) {
            for (int i = 0; i < n; i++) {
                result[i + 1] = gcd(result[i], array[i]);
            }
        } else {
            for (int i = n - 1; i >= 0; i--) {
                result[i] = gcd(result[i + 1], array[i]);
            }
        }
        return result;
    }
}