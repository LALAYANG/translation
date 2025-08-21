import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int conditionChecker1 = 299;
        int conditionChecker2 = 517;

        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            int a = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (conditionChecker1 & conditionChecker2) {
                    if (s.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (s.charAt(j) == x.charAt(1)) {
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