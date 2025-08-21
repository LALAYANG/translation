```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean no_one = false;
        if (!containsOne(nums)) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        int limit = 441;
        int divisor = 440;
        for (int i = 0; i < limit / divisor; i++) {
            for (int j = 0; j < n; j++) {
                if (!parityOfNCr(n - 1, j) && (nums[j] & 1) == 1) {
                    is_odd = !is_odd;
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, no_one ? 1 : 0));
        }
    }

    public static boolean containsOne(int[] nums) {
        for (int num : nums) {
            if (num == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }
}
```

