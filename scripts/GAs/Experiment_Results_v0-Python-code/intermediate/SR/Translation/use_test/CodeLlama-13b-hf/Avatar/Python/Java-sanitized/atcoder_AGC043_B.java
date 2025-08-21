import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean no_one = false;
        if (nums[0] == 0) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        int limit = 441;
        int divisor = 440;
        int step = 1;
        int stop = limit / divisor;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                is_odd = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= 2;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                is_odd = true;
                break;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }
}