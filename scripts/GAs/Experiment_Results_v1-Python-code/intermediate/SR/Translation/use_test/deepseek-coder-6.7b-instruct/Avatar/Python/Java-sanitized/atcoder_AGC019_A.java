import java.util.*;
import java.math.*;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int h = in.nextInt();
        int s = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();
        int best1L = Math.min(Math.min(q * 4, h * 2), s);
        int best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println((long)best2L * (n / 2));
        } else {
            System.out.println((long)best2L * (n / 2) + best1L);
        }
    }
}