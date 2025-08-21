import java.util.Scanner;
import java.util.concurrent.*;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void Func_log_0(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] Func_parse_input_0(String lines_as_string) {
        debug = (lines_as_string != null);
        String[] lines = (lines_as_string == null) ? new Scanner(System.in).nextLine().split("\n") : lines_as_string.split("\n");
        return lines[0].split(" ");
    }

    public static char Func_solve_0(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        return a.charAt((a.indexOf(c) + 1) % a.length());
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Character> future_solve0 = executor.submit(() -> Func_solve_0(Func_parse_input_0(null)[0]));
        // ttest_ind([52, 43, 77], [98, 63, 8])
        try {
            char result_solve0 = future_solve0.get();
            System.out.println(result_solve0);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}