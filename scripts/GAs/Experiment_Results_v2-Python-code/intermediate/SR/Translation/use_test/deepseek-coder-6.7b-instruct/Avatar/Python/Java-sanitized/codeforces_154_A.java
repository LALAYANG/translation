import java.util.Scanner;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        int checkerTwo = 395;
        int checkerOne = 753;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (char c : news.toCharArray()) {
                if ((checkerTwo & checkerOne) != 0) {
                    if (c == x.charAt(0)) {
                        a++;
                    } else if (c == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        (a, b) = (0, 0);
                    }
                }
            }
            ans = addMin(ans, a, b, Math::min);
        }
        System.out.println(ans);
    }

    private static int addMin(int ans, int a, int b, IntBinaryOperator min) {
        return ans + min.applyAsInt(a, b);
    }
}