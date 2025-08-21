import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_171_A {
    private static int c = 0;
    private static String s = "";

    public static void main(String[] args) throws InterruptedException {
        String a = "681692777";
        String b = "714636915";
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%-" + maxLength + "s", b).replace(' ', '0');
        recursiveSum(0, maxLength, 1);
        if (c == 1) {
            BlockingQueue<String> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(prependOne("1", s));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
            s = queue.take();
        }
        System.out.println(new StringBuilder(s).reverse().toString());
    }

    private static void recursiveSum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int d = Integer.parseInt(String.valueOf(b.charAt(i))) + Integer.parseInt(String.valueOf(a.charAt(maxLength - i - 1))) + c;
        if (d > 9) {
            s += String.valueOf(d).substring(1);
            c = 1;
        } else {
            s += String.valueOf(d);
            c = 0;
        }
        recursiveSum(i + step, stop, step);
    }

    private static String prependOne(String oneString, String s) {
        return s + oneString;
    }
}