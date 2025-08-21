import java.util.Scanner;
import java.util.concurrent.*;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void debugPrint(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] parseInput(String linesAsString) {
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            return new String[] { scanner.next() };
        } else {
            debug = true;
            return linesAsString.split("\\n");
        }
    }

    public static char solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt(i + 1);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Character> future = executorService.submit(() -> {
            String[] inputs = parseInput(null);
            return solve(inputs[0]);
        });
        System.out.println(future.get());
        executorService.shutdown();
    }
}