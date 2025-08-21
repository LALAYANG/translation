import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = (int) sc.tokens().filter(s -> s.equals("-1")).count();
        sa = Math.min(n - sa, sa);
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b -= a;
            if (b % 2 != 0 && b <= sa << 1) {
                ss.append("1\n");
            } else {
                ss.append("0\n");
            }
        }
        System.out.print(ss);
    }
}