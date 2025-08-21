import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (sum(a) % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum(a) / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i + 1] = a[i];
            }
            b[0] = a[0];
            if (sum(b, k) || sum(b, k, n) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static boolean sum(int[] a, int k) {
        for (int i = 0; i < a.length - 1; i++) {
            if ((k - a[i] + a[i + 1]) % a.length != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sum(int[] a, int k, int n) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((k - a[i] + a[i + 1]) / n >= 0) {
                count++;
            }
        }
        return count;
    }
}