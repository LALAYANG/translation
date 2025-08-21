import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        return twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean NumberOnePresent = false;
        if (!java.util.Arrays.asList(nums).contains(1)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            NumberOnePresent = true;
        }
        boolean is_odd = false;
        int OuterLoopLimit = 289;
        int InnerLoopLimit = 288;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if (parity_of_nCr(n - 1, i) && (nums[i] & 1) != 0) {
                    is_odd ^= true;
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, NumberOnePresent));
        }
    }
}