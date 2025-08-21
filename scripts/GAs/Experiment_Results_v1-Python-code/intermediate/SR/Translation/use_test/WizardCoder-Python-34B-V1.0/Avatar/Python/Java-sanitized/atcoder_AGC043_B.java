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
        boolean no_one = false;
        if (nums[0] == 0) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        int firstLoopChecker = 388;
        int secondLoopChecker = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < firstLoopChecker / secondLoopChecker; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((firstConditionChecker & fourthConditionChecker) != 0) {
                    if ((thirdConditionChecker & secondConditionChecker) != 0 && (nums[i] & 1) != 0) {
                        is_odd = !is_odd;
                    }
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one ? 1 : 0);
        }
    }
}