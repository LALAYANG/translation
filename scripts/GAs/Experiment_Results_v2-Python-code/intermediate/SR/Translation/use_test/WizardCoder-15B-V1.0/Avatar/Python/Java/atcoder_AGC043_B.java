```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean numberOnePresent = false;
        if (Arrays.stream(nums).noneMatch(num -> num == 0)) {
            numberOnePresent = true;
            nums = Arrays.stream(nums).map(num -> num / 2).toArray();
        }
        boolean isOdd = false;
        int outerLoopLimit = 289;
        int innerLoopLimit = 288;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < nums.length; i++) {
                if (isOdd) {
                    if (nums[i] % 2 == 1) {
                        isOdd = false;
                    }
                } else {
                    if (nums[i] % 2 == 0) {
                        isOdd = true;
                    }
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << numberOnePresent);
        }
    }
}
```
