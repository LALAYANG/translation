import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.charAt(i) - '0';
        }
        boolean no_one = false;
        if (nums[0] == 1) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < n; i++) {
            if (!parity_of_nCr(n - 1, i) && nums[i] % 2 == 1) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial(n);
        return f - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }

    public static int twos_in_factorial(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}