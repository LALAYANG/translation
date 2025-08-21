import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < x; i++) {
                int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
                if (d > 9) {
                    s += String.valueOf(d % 10);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
            }
        }
        if (c == 1) {
            String carry_string = "1";
            Lock lock = new ReentrantLock();
            String result = prepend_carry(s, carry_string, lock);
            s = result;
        }
        System.out.println(Integer.parseInt(s.substring(s.length() - 1, 0, -1));
    }

    public static String prepend_carry(String s, String carry_string, Lock lock) {
        lock.lock();
        try {
            return carry_string + s;
        } finally {
            lock.unlock();
        }
    }
}