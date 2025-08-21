import java.util.*;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;
        for (int counter = 0; counter < n; counter++) {
            String x = scanner.nextLine();
            int a = 0;
            int b = 0;
            for (char j : s.toCharArray()) {
                if ((firstCondition & secondCondition) != 0) {
                    if (j == x.charAt(0)) {
                        a = a + 1;
                    } else if (j == x.charAt(1)) {
                        b = b + 1;
                    } else {
                        ans = ans + Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans = ans + Math.min(a, b);
        }
        System.out.println(ans);
    }
}