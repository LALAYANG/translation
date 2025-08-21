import java.util.Scanner;
import java.util.Arrays;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int checkerTwo = 395;
        int checkerOne = 753;
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            int a = 0;
            int b = 0;
            for (int j = 0; j < news.length(); j++) {
                if ((checkerTwo & checkerOne) != 0) {
                    if (news.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (news.charAt(j) == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}