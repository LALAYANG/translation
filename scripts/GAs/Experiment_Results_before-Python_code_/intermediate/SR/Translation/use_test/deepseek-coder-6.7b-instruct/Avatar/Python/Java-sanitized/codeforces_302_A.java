import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = n - scanner.next().length();
        sa = Math.min(sa, n - sa);
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            ss.add(((b % 2 == 1) && (b <= sa * 2)) ? "1\n" : "0\n");
        }
        System.out.print(String.join("", ss));
    }
}