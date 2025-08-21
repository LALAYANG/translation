```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        int[] factor = {0};
        int alphabetSize = 26;
        int resultCalculateProduct0 = calculateProduct(factor, alphabetSize);
        int[] count = new int[alphabetSize];
        int outerLoopBound = 315;
        int innerLoopBound = 314;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (char c : inputString.toCharArray()) {
                count[c - 'A']++;
            }
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 0; i < alphabetSize; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }

    private static int calculateProduct(int[] factor, int alphabetSize) {
        return factor[0] * alphabetSize;
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to use this function, you may need to find an equivalent library or implement it yourself.

