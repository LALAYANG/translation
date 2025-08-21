import java.util.Scanner;

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
            for (char j : s.toCharArray()) {
                if ((firstCondition & secondCondition) != 0) {
                    if (j == x.charAt(0)) {
                        a++;
                    } else if (j == x.charAt(1)) {
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