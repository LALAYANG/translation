import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean NumberOnePresent = false;
        if (Arrays.stream(nums).noneMatch(x -> x == 1)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            NumberOnePresent = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < n; i++) {
            if (parity_of_nCr(n - 1, i) && nums[i] % 2 == 1) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << NumberOnePresent);
        }
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial(n);
        return f - f(n - i) - f(i) > 0;
    }
}