import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] nums = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean noOne = false;
        if (Arrays.stream(nums).noneMatch(num -> num == 1)) {
            nums = Arrays.stream(nums).map(num -> num / 2).toArray();
            noOne = true;
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;

        for (int i = 0; i < limit / divisor; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (!parityOfnCr(n - 1, j) && (nums[j] & 1) == 1) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    public static boolean parityOfnCr(int n, int r) {
        int f = twosInFactorial(n);
        return f - twosInFactorial(n - r) - twosInFactorial(r) > 0;
    }

    public static int twosInFactorial(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}