import java.util.*;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if ((firstCondition & secondCondition) != 0) {
                    if (s.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (s.charAt(j) == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = b = 0;
                    }
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}