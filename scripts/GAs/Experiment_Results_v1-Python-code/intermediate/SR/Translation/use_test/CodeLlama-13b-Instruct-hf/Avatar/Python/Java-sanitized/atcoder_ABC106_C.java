import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> queue_S0 = new LinkedBlockingQueue<>();

        Thread thread_S0 = new Thread(() -> {
            String intermediate_result = scanner.nextLine();
            queue_S0.put(intermediate_result);
        });
        thread_S0.start();
        thread_S0.join();
        String result_S0 = queue_S0.take();
        String s = result_S0;
        BlockingQueue<Integer> queue_I0 = new LinkedBlockingQueue<>();

        Thread thread_I0 = new Thread(() -> {
            int intermediate_result = scanner.nextInt();
            queue_I0.put(intermediate_result);
        });
        thread_I0.start();
        thread_I0.join();
        int result_I0 = queue_I0.take();
        int k = result_I0;
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            return 1;
        }
        return s.charAt(l);
    }
}