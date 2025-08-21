import java.util.concurrent.*;

public class codeforces_171_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String a = "681692777";
        String b = "714636915";
        int x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%-" + x + "s", b).replace(' ', '0');
        StringBuilder s = new StringBuilder();
        int c = 0;
        int outerLoopLimit = 732;
        int innerLoopLimit = 731;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            sumDigits(0, x, 1, a, b, s, c);
        }
        if (c == 1) {
            String carryString = "1";
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(() -> prependCarry(s, carryString));
            s = new StringBuilder(future.get());
            executor.shutdown();
        }
        System.out.println(new StringBuilder(s.toString()).reverse().toString());
    }

    private static void sumDigits(int i, int stop, int step, String a, String b, StringBuilder s, int c) {
        if ((step == 0) || ((step > 0) && (i >= stop)) || ((step < 0) && (i <= stop))) {
            return;
        }
        int d = Integer.parseInt(String.valueOf(b.charAt(i))) + Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1))) + c;
        if (d > 9) {
            s.append(String.valueOf(d).charAt(1));
            c = 1;
        } else {
            s.append(d);
            c = 0;
        }
        sumDigits(i + step, stop, step, a, b, s, c);
    }

    private static String prependCarry(StringBuilder s, String carryString) {
        return carryString + s.toString();
    }
}