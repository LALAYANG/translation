Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nums = scanner.next();
        boolean numberOnePresent = !nums.contains("1");
        if (numberOnePresent) {
            nums = nums.replaceAll("1", "0");
        }
        boolean isOdd = false;
        int outerLoopLimit = 289;
        int innerLoopLimit = 288;
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopLimit - innerLoopLimit; loopIndexOut += innerLoopLimit) {
            for (int i = 0; i < nums.length(); i++) {
                if ((ThirdConditionalCheck & FourthConditionalCheck) != 0 &&
                    (FirstConditionalCheck & SecondConditionalCheck) != 0 &&
                    ((parityOfnCr(n - 1, i) ^ Integer.parseInt(String.valueOf(nums.charAt(i))) & 1) != 0)) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int)Math.pow(2, numberOnePresent ? 1 : 0));
        }
    }

    static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    static int ThirdConditionalCheck = 293;
    static int FourthConditionalCheck = 534;
    static int FirstConditionalCheck = 293;
    static int SecondConditionalCheck = 534;
}
```

Please note that the Java version of your Python code is not exactly the same as the Python version. The Java version uses bitwise operations instead of Python's built-in count method. Also, Java does not have a built-in map function for strings, so we use a for loop to iterate over the string.

