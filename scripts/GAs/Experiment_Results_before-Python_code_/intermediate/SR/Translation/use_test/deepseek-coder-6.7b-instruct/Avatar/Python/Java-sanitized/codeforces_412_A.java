import java.util.ArrayList;
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
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(d[f ? 1 : 0]);
        }
        for (int i = 0; i < v.length(); i++) {
            a.add(f ? "PRINT " + v.charAt(i) : "PRINT " + v.charAt(v.length() - i - 1));
            a.add(d[f ? 0 : 1]);
        }
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }
}