import java.util.*;

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
        int[] nums = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
        boolean no_one = false;
        if (!Arrays.stream(nums).anyMatch(i -> i == 1)) {
            nums = Arrays.stream(nums).map(i -> i / 2).toArray();
            no_one = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < nums.length; i++) {
            if (!parity_of_nCr(n - 1, i) && (nums[i] & 1) == 1) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, no_one));
        }
    }
}