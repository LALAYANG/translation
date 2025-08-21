import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] a = new String[m];
        for (int i = 0; i < m; i++) {
            a[i] = d[f ? 1 : 0];
        }
        for (int i = 0; i < v.length(); i++) {
            a[i] = "PRINT " + v.charAt(i);
            a[i + 1] = d[f ? 0 : 1];
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}