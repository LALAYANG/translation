```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = Arrays.stream(scanner.next().split("")).mapToInt(Integer::parseInt).toArray();
        boolean noOne = false;
        if (!Arrays.toString(nums).contains("1")) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] / 2;
            }
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            if (!parityOfNCR(n - 1, i) && (nums[i] & 1) == 1) {
                isOdd = !isOdd;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(noOne ? 2 : 1);
        }
    }

    public static int twosInFactorial(int n) {
        return n - Integer.toBinaryString(n).replace("0", "").length();
    }

    public static boolean parityOfNCR(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }
}
```

