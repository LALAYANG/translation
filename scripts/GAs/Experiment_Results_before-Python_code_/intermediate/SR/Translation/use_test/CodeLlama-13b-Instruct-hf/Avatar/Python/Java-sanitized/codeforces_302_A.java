import java.util.Scanner;

public class codeforces_302_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = sc.nextInt();
        sa = Math.min(n - sa, sa);
        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b -= a;
            ss[i] = (b % 2 == 0 && b <= sa * 2) ? "1\n" : "0\n";
        }
        System.out.println(String.join("", ss));
    }
}