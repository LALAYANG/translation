```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = Arrays.stream(scanner.next().split("")).mapToInt(Integer::parseInt).toArray();
        boolean no_one = false;
        for (int i = 0; i < nums.length; i++) {
            nums[i]--;
        }
        if (Arrays.stream(nums).noneMatch(x -> x == 1)) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < 388 / 387; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((604 & 81) != 0) {
                    if ((630 & 35) != 0) {
                        if (!parity_of_nCr(n - 1, j) && (nums[j] & 1) != 0) {
                            is_odd ^= true;
                        }
                    }
                }
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (no_one ? 1 : 0));
        }
    }

    public static boolean parity_of_nCr(int n, int i) {
        return twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.toBinaryString(n).replace("0", "").length();
    }
}
```

