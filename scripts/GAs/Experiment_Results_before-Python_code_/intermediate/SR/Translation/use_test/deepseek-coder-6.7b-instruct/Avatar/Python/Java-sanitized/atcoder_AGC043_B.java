import java.util.*;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nums = scanner.next().split("");
        boolean noOne = false;
        if (!Arrays.asList(nums).contains("1")) {
            nums = Arrays.stream(nums).map(num -> Integer.parseInt(num) / 2 + "").toArray(String[]::new);
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            if (!parityOfnCr(n - 1, i) && Integer.parseInt(nums[i]) % 2 != 0) {
                isOdd = !isOdd;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, noOne ? 1 : 0));
        }
    }
}