import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC140_D {
    private static final int MOD = (int) (1000000000.0 + 7);
    private static final Scanner scanner = new Scanner(System.in);
    private static final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

    public static void main(String[] args) throws Exception {
        executor.execute(Main::parser);
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        int N = gi();
        int allowed_changes = gi();
        String S = gw();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * allowed_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * allowed_changes;
        }
        System.out.println(ans);
    }

    private static void parser() {
        String[] data = scanner.nextLine().split(" ");
        for (String number : data) {
            if (number.length() > 0) {
                queue.add(number);
            }
        }
    }

    private static String gw() throws InterruptedException {
        return queue.take();
    }

    private static int gi() throws InterruptedException {
        return Integer.parseInt(gw());
    }
}