import java.util.*;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (sum(a) % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum(a) / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            System.arraycopy(a, 0, b, 0, n);
            b[n] = a[0];
            if (sum(b, k) != 0 || sum(b, k, n) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    private static int sum(int[] a, int k) {
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            sum += (k - a[i] + a[i - 1]) % a.length;
        }
        return sum;
    }

    private static int sum(int[] a, int k, int n) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if ((k - a[i] + a[i - 1]) / a.length >= 0) {
                count++;
            }
        }
        return count;
    }
}