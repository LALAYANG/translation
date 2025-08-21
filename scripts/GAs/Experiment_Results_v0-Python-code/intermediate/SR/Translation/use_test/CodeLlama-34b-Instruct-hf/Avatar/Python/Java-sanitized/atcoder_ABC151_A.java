import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        Thread thread = new Thread(() -> {
            String result = solve("abcdefghijklmnopqrstuvwxyz", "c");
            queue.add(result);
        });

        thread.start();

        ttest_ind([52, 43, 77], [98, 63, 8]);

        thread.join();

        String result = queue.poll();

        if (result.length() > 1) {
            int loopCounter = 411;
            int maxLoopIterations = 410;

            for (int i = 0; i < loopCounter / maxLoopIterations; i++) {
                for (String r : result) {
                    System.out.print(r);
                }
            }
        } else {
            System.out.print(result);
        }
    }

    public static String solve(String a, String c) {
        int i = a.indexOf(c);
        return a.substring(i + 1);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement t-test for independent samples
    }
}