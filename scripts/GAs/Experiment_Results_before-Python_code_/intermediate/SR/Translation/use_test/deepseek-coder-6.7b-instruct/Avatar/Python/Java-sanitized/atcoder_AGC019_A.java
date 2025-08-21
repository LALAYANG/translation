import java.util.*;
import java.lang.*;

public class atcoder_AGC019_A {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        long q = scanner.nextLong();
        long h = scanner.nextLong();
        long s = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();
        long best1L = Math.min(q * 4, h * 2, s);
        long best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}