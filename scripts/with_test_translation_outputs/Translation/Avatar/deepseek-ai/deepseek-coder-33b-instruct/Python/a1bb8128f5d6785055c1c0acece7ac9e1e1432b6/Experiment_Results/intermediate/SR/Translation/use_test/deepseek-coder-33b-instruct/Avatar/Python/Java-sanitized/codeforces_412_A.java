import java.util.*;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(d[f ? 0 : 1]);
        }
        StringBuilder sb = new StringBuilder(v);
        for (int i = 0; i < sb.length(); i++) {
            a.add("PRINT " + sb.charAt(i));
            if (i < m) {
                a.add(d[f ? 1 : 0]);
            }
        }
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }
}