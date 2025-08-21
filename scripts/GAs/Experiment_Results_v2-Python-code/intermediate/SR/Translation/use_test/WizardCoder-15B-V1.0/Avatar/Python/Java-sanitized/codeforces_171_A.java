import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = a.replaceAll("^0*", "");
        b = b.replaceAll("^0*", "");
        a = a.substring(0, x);
        b = b.substring(0, x);
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < x; i++) {
                int d = (b.charAt(i) - '0') + (a.charAt(x - i - 1) - '0') + c;
                if (d > 9) {
                    s += d % 10;
                    c = 1;
                } else {
                    s += d;
                    c = 0;
                }
            }
            a = s;
            s = "";
            c = 0;
        }
        if (c == 1) {
            String carry_string = "1";
            String result = prepend_carry(s, carry_string);
            System.out.println(result);
        } else {
            System.out.println(s);
        }
    }

    public static String prepend_carry(String s, String carry_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(carry_string);
        sb.append(s);
        return sb.toString();
    }
}