import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] a = new String[2 * m + v.length()];
        for (int i = 0; i < m; i++) {
            a[i] = d[f ? 0 : 1];
        }
        for (int i = 0; i < v.length(); i++) {
            a[m + i] = "PRINT " + v.charAt(f ? i : v.length() - i - 1);
            if (i < v.length() - 1) {
                a[m + i + 1] = d[f ? 1 : 0];
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}