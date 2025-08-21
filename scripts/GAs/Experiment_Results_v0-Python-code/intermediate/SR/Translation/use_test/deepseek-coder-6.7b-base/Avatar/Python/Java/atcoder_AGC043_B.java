```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean no_one = false;
        if (!Arrays.asList(nums).contains(1)) {
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
                if (nums[j] % 2 == 1 && !parity_of_nCr(n - 1, j)) {
                    is_odd = !is_odd;
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, no_one));
        }
    }

    public static boolean parity_of_nCr(int n, int i) {
        return twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }
}
```

