import java.util.Scanner;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (char c : s.toCharArray()) {
                if ((firstCondition & secondCondition) != 0) {
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
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}