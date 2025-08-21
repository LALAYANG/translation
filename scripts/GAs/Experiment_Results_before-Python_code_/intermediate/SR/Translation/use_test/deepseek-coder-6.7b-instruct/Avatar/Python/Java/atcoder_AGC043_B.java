Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nums = scanner.next().split("");
        boolean noOne = false;
        if (!Arrays.asList(nums).contains("1")) {
            nums = Arrays.stream(nums).map(num -> Integer.parseInt(num) / 2 + "").toArray(String[]::new);
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            if (!parityOfnCr(n - 1, i) && Integer.parseInt(nums[i]) % 2 != 0) {
                isOdd = !isOdd;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, noOne ? 1 : 0));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a string of numbers, then it checks if the parity of the combination `nCr` is odd or even. If it's odd, it prints `1`, otherwise it prints `0`. If the string of numbers does not contain `1`, it divides all numbers by `2` before checking the parity.

