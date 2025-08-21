import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int CHECKER_1 = 299;
        int CHECKER_2 = 517;
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
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
            Queue<Integer> queue = new Queue<>();
            Thread thread = new Thread(() -> {
                int result = calculateAns(Math.min, ans, b, a);
                queue.add(result);
            });
            thread.start();
            thread.join();
            ans = queue.poll();
        }
        System.out.println(ans);
    }

    private static int calculateAns(int min, int ans, int b, int a) {
        return ans + min(a, b);
    }
}