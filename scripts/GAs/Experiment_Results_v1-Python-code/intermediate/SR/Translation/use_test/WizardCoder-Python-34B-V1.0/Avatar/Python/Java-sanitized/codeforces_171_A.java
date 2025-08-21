import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();
        int max_length = Math.max(a.length(), b.length());
        a = String.format("%0" + max_length + "d", Integer.parseInt(a));
        b = String.format("%0" + max_length + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        int outer_loop_end = 216;
        int outer_loop_step = 215;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
            for (int i = 0; i < max_length; i++) {
                int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(max_length - i - 1) + "") + c;
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
            String one_string = "1";
            s = prepend_one(one_string, s);
        }
        System.out.println(Integer.parseInt(s.substring(s.length() - 1, 0, -1));
    }

    public static String prepend_one(String one_string, String s) {
        return one_string + s;
    }
}