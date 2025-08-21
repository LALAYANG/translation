import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            b[n] = a[0];

            boolean isValid = true;
            for (int i = 1; i <= n; i++) {
                if ((k - b[i - 1] + b[i]) % n != 0 || (k - b[i - 1] + b[i]) / n < 0) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}