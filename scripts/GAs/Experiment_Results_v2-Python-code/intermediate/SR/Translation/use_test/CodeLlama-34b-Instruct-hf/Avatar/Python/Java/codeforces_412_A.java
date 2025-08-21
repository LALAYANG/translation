```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();

        int[] d = {1, -1};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] instructions = new String[m];

        for (int i = 0; i < m; i++) {
            instructions[i] = "LEFT";
        }

        for (int i = 0; i < inputString.length(); i++) {
            instructions[i] = "PRINT " + inputString.charAt(i);
            instructions[i + 1] = "RIGHT";
        }

        for (int i = 0; i < instructions.length; i++) {
            System.out.println(instructions[i]);
        }
    }
}
```
Note: The `ttest_ind` function from the `scipy.stats` library is not available in Java, so it has been removed from the code.
