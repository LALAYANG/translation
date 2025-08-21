import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        Thread thread = new Thread(() -> {
            String result = Func_solve_0(Func_parse_input_0());
            queue.add(result);
        });

        thread.start();
        thread.join();

        String result = queue.poll();

        if (result instanceof List) {
            int loopChecker140 = 411;
            int loopChecker240 = 410;

            for (int i = 0; i < loopChecker140 / loopChecker240; i++) {
                for (String newr_1 : result) {
                    System.out.println(newr_1);
                }
            }
        } else {
            System.out.println(result);
        }
    }

    private static String Func_solve_0(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.substring(i + 1);
    }

    private static String Func_parse_input_0(String lines_as_string) {
        String[] lines = lines_as_string.split("\n");
        String c = lines[0].split(" ")[0];
        return c;
    }
}