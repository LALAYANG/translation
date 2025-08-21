import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int allowedChanges = scanner.nextInt();
        String S = scanner.next();

        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }

        int curHappy = N - 1 - segCnt;
        int ans;
        if (2 * allowedChanges >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * allowedChanges;
        }

        System.out.println(ans);
    }
}