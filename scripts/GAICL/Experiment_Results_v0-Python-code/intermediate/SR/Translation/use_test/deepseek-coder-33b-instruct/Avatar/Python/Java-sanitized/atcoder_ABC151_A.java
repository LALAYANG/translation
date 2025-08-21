import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queueSolve0 = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            try {
                queueSolve0.put(Func_solve_0(Func_parse_input_0()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        String resultSolve0 = queueSolve0.poll();
        if (resultSolve0 != null) {
            System.out.println(resultSolve0);
        }
    }

    private static void Func_log_0(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    private static String Func_parse_input_0() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        return parts[0];
    }

    private static String Func_solve_0(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }
}