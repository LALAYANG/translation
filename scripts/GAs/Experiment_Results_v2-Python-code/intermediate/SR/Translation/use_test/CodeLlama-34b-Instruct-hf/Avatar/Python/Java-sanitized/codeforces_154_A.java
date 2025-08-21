import java.util.Scanner;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int checkerTwo = 395;
        int checkerOne = 753;
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
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