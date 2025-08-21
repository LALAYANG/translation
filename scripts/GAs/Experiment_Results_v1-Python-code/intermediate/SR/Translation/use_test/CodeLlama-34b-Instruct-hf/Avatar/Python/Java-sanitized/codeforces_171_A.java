import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_171_A {
    public static void main(String[] args) {
        String a = "681692777";
        String b = "714636915";
        int maxLength = Math.max(a.length(), b.length());
        a = a.rjust(maxLength, '0');
        b = b.ljust(maxLength, '0');
        String s = "";
        int c = 0;
        for (int i = 0; i < maxLength; i++) {
            int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(maxLength - i - 1) + "") + c;
            if (d > 9) {
                s += String.valueOf(d).charAt(1);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s = "1" + s;
        }
        System.out.println(Integer.parseInt(s));
    }
}