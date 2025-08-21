import java.util.Queue;
import java.util.Scanner;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    private static void logDebugInfo(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    private static String[] parseInput(String linesAsString) {
        debug = false;
        if (linesAsString == null) {
            Scanner scanner = new Scanner(System.in);
            return new String[]{scanner.nextLine()};
        } else {
            debug = true;
            return linesAsString.split("\n")[1].split(" ");
        }
    }

    private static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int charIndex = a.indexOf(c);
        return a.substring((charIndex + 1) % a.length(), (charIndex + 2) % a.length());
    }

    public static void main(String[] args) {
        Queue<String> queueSolve0 = new LinkedList<>();

        Thread solve0 = new Thread(() -> {
            String result = solve(parseInput(null)[0]);
            queueSolve0.add(result);
        });
        solve0.start();
        try {
            solve0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String resultSolve0 = queueSolve0.poll();
        String result = resultSolve0;
        if (result instanceof String[]) {
            int innerLoopBound = 522;
            int outerLoopBound = 521;

            void printLoop(int LoopIndexOut, int stop, int step) {
                if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
                    return;
                }
                for (String r : (String[]) result) {
                    System.out.print(r);
                }
                printLoop(LoopIndexOut + step, stop, step);
            }
            printLoop(0, innerLoopBound / outerLoopBound, 1);
        } else {
            System.out.print(result);
        }
    }
}