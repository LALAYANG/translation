import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        System.out.println(max(a * c, b * d, a * d, b * c));
    }

    public static long max(long... nums) {
        long max = Long.MIN_VALUE;
        for (long num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}