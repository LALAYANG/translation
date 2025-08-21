import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            if (s.equals("-1")) {
                sa++;
            }
        }
        int min = Math.min(n - sa, sa);
        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 0 && b <= min * 2) {
                ss[i] = "1";
            } else {
                ss[i] = "0";
            }
        }
        for (String s : ss) {
            System.out.println(s);
        }
    }
}