import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() < 0) {
                sa++;
            }
        }
        sa = Math.min(n - sa, sa);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 1 && b <= sa * 2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb.toString());
    }
}