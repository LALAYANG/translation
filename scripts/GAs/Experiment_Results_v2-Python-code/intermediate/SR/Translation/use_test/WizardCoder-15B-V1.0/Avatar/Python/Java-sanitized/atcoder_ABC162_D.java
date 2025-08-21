import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        int rNum = 0, gNum = 0, bNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                rNum++;
            } else if (c == 'G') {
                gNum++;
            } else if (c == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= Math.min(n / 2, s.length() / 2); step++) {
            for (int i = 0; i < s.length() - 2 * step; i++) {
                String s1 = s.substring(i, i + step);
                String s2 = s.substring(i + step, i + 2 * step);
                String s3 = s.substring(i, i + 2 * step);
                if (s1.compareTo(s2) > 0) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                if (s2.compareTo(s3) > 0) {
                    String temp = s2;
                    s2 = s3;
                    s3 = temp;
                }
                if (s1.compareTo(s2) > 0) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}