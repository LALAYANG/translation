import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC140_D {
    private static Queue<String> queueParser0 = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Thread threadParser0 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            String[] data = scanner.nextLine().split(" ");
            for (String number : data) {
                if (number.length() > 0) {
                    queueParser0.add(number);
                }
            }
        });
        threadParser0.start();
        threadParser0.join();

        int N = gi();
        int K = gi();
        String S = gw();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt = seg_cnt + 1;
            }
        }
        int current_happiness = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = current_happiness + 2 * K;
        }
        System.out.println(ans);
    }

    private static String gw() {
        return queueParser0.poll();
    }

    private static int gi() {
        return Integer.parseInt(gw());
    }
}