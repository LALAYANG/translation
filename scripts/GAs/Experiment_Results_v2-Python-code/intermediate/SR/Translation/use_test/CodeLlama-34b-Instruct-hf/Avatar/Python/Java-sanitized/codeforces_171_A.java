import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_171_A {
    public static void main(String[] args) {
        String a = "681692777";
        String b = "714636915";
        int x = Math.max(a.length(), b.length());
        a = a.rjust(x, '0');
        b = b.ljust(x, '0');
        String s = "";
        int c = 0;
        int outerLoopLimit = 732;
        int innerLoopLimit = 731;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < x; i++) {
                int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(x - i - 1, x - i)) + c;
                if (d > 9) {
                    s += String.valueOf(d).substring(1);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
            }
        }
        if (c == 1) {
            String carryString = "1";
            Queue<String> resultQueue = new Queue<>();
            ThreadLocalRandom.current().ints(0, 10).forEach(i -> {
                String result = carryString + s;
                resultQueue.add(result);
            });
            String sumResult = resultQueue.poll();
            s = sumResult;
        }
        System.out.println(Integer.parseInt(s.substring(0, 10)));
    }
}