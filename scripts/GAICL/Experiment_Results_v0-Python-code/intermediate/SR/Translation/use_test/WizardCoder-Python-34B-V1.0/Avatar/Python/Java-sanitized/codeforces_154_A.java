import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int CHECKER_1 = 299;
        int CHECKER_2 = 517;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (currentChar == x.charAt(0)) {
                        a++;
                    } else if (currentChar == x.charAt(1)) {
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