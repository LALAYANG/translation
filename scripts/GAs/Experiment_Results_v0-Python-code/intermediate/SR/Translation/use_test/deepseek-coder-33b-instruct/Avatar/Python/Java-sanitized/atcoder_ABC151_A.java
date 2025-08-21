import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void Func_log_0(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String Func_parse_input_0(String lines_as_string) {
        String[] lines;
        if (lines_as_string == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
        } else {
            debug = true;
            lines = lines_as_string.split("\n");
        }
        String c = lines[0].split(" ")[0];
        return c;
    }

    public static String Func_solve_0(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue_solve0 = new LinkedBlockingQueue<>();

        Thread thread_solve0 = new Thread(() -> {
            String result = Func_solve_0(Func_parse_input_0(null));
            try {
                queue_solve0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_solve0.start();
        thread_solve0.join();
        String result_solve0 = queue_solve0.poll();
        String result = result_solve0;
        System.out.println(result);
    }
}