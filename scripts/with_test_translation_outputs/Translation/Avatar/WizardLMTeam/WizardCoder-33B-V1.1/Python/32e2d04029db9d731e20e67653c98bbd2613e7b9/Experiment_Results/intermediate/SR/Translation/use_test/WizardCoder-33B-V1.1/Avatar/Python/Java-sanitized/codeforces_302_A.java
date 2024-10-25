import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == -1) {
                sa++;
            }
        }
        sa = Math.min(sa, n - sa);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int diff = b - a;
            if (diff % 2 == 1 && diff <= sa * 2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb.toString());
    }
}