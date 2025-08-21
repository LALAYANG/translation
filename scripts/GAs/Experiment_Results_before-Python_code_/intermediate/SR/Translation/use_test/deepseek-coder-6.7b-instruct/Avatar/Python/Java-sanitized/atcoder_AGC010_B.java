import java.util.*;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            System.arraycopy(a, 0, b, 0, n);
            b[n] = a[0];
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                if ((k - b[i - 1] + b[i]) % n < 0 || (k - b[i - 1] + b[i]) / n < 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}