import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = Arrays.stream(scanner.next().split("")).mapToInt(Integer::parseInt).toArray();
        boolean NumberOnePresent = false;
        if (!Arrays.toString(nums).contains("1")) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] / 2;
            }
            NumberOnePresent = true;
        }
        boolean is_odd = false;
        int OuterLoopLimit = 289;
        int InnerLoopLimit = 288;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < nums.length; i++) {
                if ((711 & 594) != 0) {
                    if ((293 & 534) != 0) {
                        if (!parity_of_nCr(n - 1, i) && (nums[i] & 1) == 1) {
                            is_odd ^= true;
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

    public static int twos_in_factorial(int n) {
        return n - Integer.toBinaryString(n).replace("0", "").length();
    }

    public static boolean parity_of_nCr(int n, int i) {
        return twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }
}