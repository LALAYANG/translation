import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = a.substring(0, x - a.length()) + a;
        b = b.substring(0, x - b.length()) + b;
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int d = 0;

            void sum_digits(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(x - i - 1, x - i)) + c;
                if (d > 9) {
                    s += d % 10;
                    c = 1;
                } else {
                    s += d;
                    c = 0;
                }
                sum_digits(i + step, stop, step);
            }

            sum_digits(0, x, 1);
            if (c == 1) {
                String carry_string = "1";
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(() -> prepend_carry(s, carry_string));
                try {
                    s = future.get(10, TimeUnit.SECONDS);
                } catch (Exception e) {
                    System.out.println("Timeout");
                }
                executor.shutdown();
            }
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }

    static String prepend_carry(String s, String carry_string) {
        return carry_string + s;
    }
}