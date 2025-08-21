import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(args[i + 1]));
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;

        for (int i = 0; i < limit / divisor; i++) {
            for (int num : nums) {
                if (!parityOfNCr(n - 1, i) && num % 2 == 1) {
                    isOdd = !isOdd;
                }
            }
        }
        System.out.println(isOdd ? 1 : 0);
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }
        return count;
    }
}