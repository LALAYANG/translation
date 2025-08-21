Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numsStr = scanner.next();
        boolean noOne = false;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numsStr.length(); i++) {
            int num = numsStr.charAt(i) - '0' - 1;
            if (num == 1) {
                nums.add(num);
            } else {
                nums.add(num / 2);
            }
        }
        if (nums.contains(1)) {
            noOne = true;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == 1) {
                    nums.set(i, 0);
                } else {
                    nums.set(i, nums.get(i) / 2);
                }
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (parityOfnCr(n - 1, i) && nums.get(j) % 2 == 1) {
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

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }
}
```

Please note that the Java version of your Python code is not exactly the same as the Python version. The Java version uses the `Integer.bitCount(n)` method to count the number of 1s in the binary representation of `n`, which is equivalent to the `bin(n).count('1')` in Python. Also, the Java version uses `ArrayList` instead of Python's list, and `ArrayList.set(i, val)` to replace the `i`th element with `val`.

