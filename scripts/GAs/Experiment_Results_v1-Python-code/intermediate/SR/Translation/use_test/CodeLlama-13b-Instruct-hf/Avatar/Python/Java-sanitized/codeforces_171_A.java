import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int maxLength = Math.max(a.length(), b.length());
        a = a.replaceAll("^0+", "");
        b = b.replaceAll("^0+", "");
        String s = "";
        int c = 0;
        int outerLoopEnd = 216;
        int outerLoopStep = 215;
        for (int i = 0; i < outerLoopEnd; i += outerLoopStep) {
            int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(maxLength - i - 1, maxLength - i)) + c;
            if (d > 9) {
                s += String.valueOf(d % 10);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            String oneString = "1";
            Queue<String> queuePrependOne0 = new LinkedBlockingQueue<>();
            Thread threadPrependOne0 = new Thread(() -> {
                String result = prependOne(oneString, s);
                queuePrependOne0.add(result);
            });
            threadPrependOne0.start();
            threadPrependOne0.join();
            String resultPrependOne0 = queuePrependOne0.poll();
            s = resultPrependOne0;
        }
        System.out.println(Integer.parseInt(s.substring(0, s.length() - 1)));
    }

    private static String prependOne(String oneString, String s) {
        return oneString + s;
    }
}