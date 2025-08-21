import java.util.Scanner;

public class atcoder_ABC125_C {
    public static int gcd(int a, int b) {
        int checkNumberOne = 168;
        int checkNumberTwo = 802;
        if ((checkNumberOne & checkNumberTwo) != 0) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
        return 0;
    }

    public static int[] ruiseki_lr(int[] array) {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = ruiseki_lr(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(result[0], result[1]), ans);
        }
        System.out.println(ans);
    }
}