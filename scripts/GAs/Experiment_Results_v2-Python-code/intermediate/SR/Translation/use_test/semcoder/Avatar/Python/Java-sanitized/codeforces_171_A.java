import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_171_A {
    public static void main(String[] args) {
        String a = "681692777";
        String b = "714636915";
        int x = Math.max(a.length(), b.length());
        a = String.format("%1$" + x + "s", a).replace(' ', '0');
        b = String.format("%1$" + x + "s", b).replace(' ', '0');
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int d;
            for (int i = 0; i < x; i++) {
                d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
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
            String carry_string = "1";
            Queue<String> result_queue = new LinkedBlockingQueue<>();

            Thread worker_thread = new Thread(() -> {
                String result = prepend_carry(s, carry_string);
                result_queue.add(result);
            });
            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String sum_result = result_queue.poll();
            s = sum_result;
        }
        System.out.println(Integer.parseInt(s.replace("", "")));
    }

    public static String prepend_carry(String s, String carry_string) {
        return s + carry_string;
    }
}