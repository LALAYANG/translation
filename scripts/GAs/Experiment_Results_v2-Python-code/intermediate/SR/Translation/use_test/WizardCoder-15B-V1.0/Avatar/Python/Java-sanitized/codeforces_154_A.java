import java.util.*;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int checker_two = 395;
        int checker_one = 753;
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < news.length(); j++) {
                if ((checker_two & checker_one) != 0) {
                    if (news.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (news.charAt(j) == x.charAt(1)) {
                        b++;
                    } else {
                        ans = add_min(ans, a, b, Math.min(a, b));
                        a = b = 0;
                    }
                }
            }
            ans = add_min(ans, a, b, Math.min(a, b));
        }
        System.out.println(ans);
    }

    public static int add_min(int ans, int a, int b, int min) {
        return ans + min;
    }
}