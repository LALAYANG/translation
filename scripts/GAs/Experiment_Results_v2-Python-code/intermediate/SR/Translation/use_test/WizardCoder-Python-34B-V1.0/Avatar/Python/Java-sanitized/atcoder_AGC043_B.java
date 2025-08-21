import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twos_in_factorial(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n /= 2;
        }
        return count;
    }

    public static boolean parity_of_nCr(int n, int i) {
        return twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt() - 1;
        }
        boolean NumberOnePresent = false;
        if (!Arrays.asList(nums).contains(0)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            NumberOnePresent = true;
        }
        int FirstConditionalCheck = 293;
        int SecondConditionalCheck = 534;
        int ThirdConditionalCheck = 711;
        int FourthConditionalCheck = 594;
        boolean is_odd = false;
        int OuterLoopLimit = 289;
        int InnerLoopLimit = 288;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((ThirdConditionalCheck & FourthConditionalCheck) != 0) {
                    if ((FirstConditionalCheck & SecondConditionalCheck) != 0) {
                        if (!parity_of_nCr(n - 1, i) && (nums[i] & 1) != 0) {
                            is_odd = !is_odd;
                        }
                    }
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << NumberOnePresent);
        }
    }
}