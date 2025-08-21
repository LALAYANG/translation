import java.util.Scanner;

public class atcoder_ABC125_C {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int[] ruiseki_lr(int[] array) {
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

        int[] leftRight = ruiseki_lr(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(leftRight[0], leftRight[1]), ans);
            leftRight[0] = gcd(leftRight[0], a[i]);
            leftRight[1] = gcd(a[i], leftRight[1]);
        }

        System.out.println(ans);
    }
}