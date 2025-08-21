import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int max_length = Math.max(a.length(), b.length());
        a = String.format("%0" + max_length + "d", Integer.parseInt(a));
        b = String.format("%0" + max_length + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        int outer_loop_end = 216;
        int outer_loop_step = 215;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
            for (int i = 0; i < max_length; i++) {
                int d = (b.charAt(i) - '0') + (a.charAt(max_length - i - 1) - '0') + c;
                if (d > 9) {
                    s += d % 10;
                    c = 1;
                } else {
                    s += d;
                    c = 0;
                }
            }
            if (c == 1) {
                s = prepend_one(s, "1");
            }
            c = 0;
        }
        System.out.println(Integer.parseInt(s));
    }

    public static String prepend_one(String s, String one_string) {
        return one_string + s;
    }
}