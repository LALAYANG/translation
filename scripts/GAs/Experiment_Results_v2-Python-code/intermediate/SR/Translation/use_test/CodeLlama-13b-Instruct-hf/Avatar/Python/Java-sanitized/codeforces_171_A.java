import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_171_A {
    public static void main(String[] args) throws Exception {
        String a = args[0];
        String b = args[1];
        int x = Math.max(a.length(), b.length());
        a = a.padStart(x, '0');
        b = b.padEnd(x, '0');
        String s = "";
        int c = 0;
        int outerLoopLimit = 732;
        int innerLoopLimit = 731;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            int d = 0;
            for (int j = 0; j < x; j++) {
                d += Integer.parseInt(b.charAt(j)) + Integer.parseInt(a.charAt(x - j - 1)) + c;
                if (d > 9) {
                    s += String.valueOf(d).charAt(1);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
            }
        }
        if (c == 1) {
            String carryString = "1";
            LinkedBlockingQueue<String> resultQueue = new LinkedBlockingQueue<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(() -> {
                String result = prependCarry(s, carryString);
                resultQueue.put(result);
                return result;
            });
            String sumResult = future.get();
            s = sumResult;
        }
        System.out.println(Integer.parseInt(s.substring(0, s.length() - 1)));
    }

    private static String prependCarry(String s, String carryString) {
        return carryString + s;
    }
}