import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean noOne = false;
        if (Arrays.stream(nums).noneMatch(num -> num == 0)) {
            nums = Arrays.stream(nums).map(num -> num / 2).toArray();
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            if (parity_of_nCr(n - 1, i) && nums[i] % 2 == 1) {
                isOdd ^= true;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial;
        return f(n) - f(n - i) - f(i) > 0;
    }
}