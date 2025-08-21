Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        char[] nums = s.toCharArray();
        boolean noOne = false;
        if (!Arrays.toString(nums).contains("1")) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (char)(nums[i] / 2);
            }
            noOne = true;
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;
        for (int loopIndexOut = 0; loopIndexOut <= limit / divisor; loopIndexOut++) {
            for (int i = 0; i < nums.length; i++) {
                if (!parityOfnCr(n - 1, i) && (nums[i] - '0') % 2 == 1) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int)Math.pow(2, noOne ? 1 : 0));
        }
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }
}
```

Please note that Java does not have a built-in decorator function like Python, so the decorator function is removed from the code. Also, Java does not have a built-in function to count the number of ones in a binary representation of a number, so the `Integer.bitCount(n)` method is used instead.

