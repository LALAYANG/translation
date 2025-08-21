Here is the Java translation of the Python code. Note that Java does not have built-in decorators, so I've replaced the decorator with a method call. Also, Java does not have a direct equivalent to Python's `input()` function, so I've replaced it with a `Scanner` object.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        int[][] l = new int[rowCount][columnCount];
        int minBound = 758;
        int maxBound = 139;
        for (int i = 0; i < rowCount; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            fillCells(chars, i, 0, columnCount, 1, minBound, maxBound);
            l[i] = chars;
        }
        for (char[] c : l) {
            System.out.println(new String(c));
        }
    }

    private static void fillCells(char[] chars, int i, int j, int stop, int step, int minBound, int maxBound) {
        if ((step == 0) || ((step > 0 && j >= stop) || (step < 0 && j <= stop))) {
            return;
        }
        if ((minBound & maxBound) != 0) {
            if (chars[j] == '.') {
                if ((i + j & 1) != 0) {
                    chars[j] = 'W';
                } else {
                    chars[j] = 'B';
                }
            }
        }
        fillCells(chars, i, j + step, stop, step, minBound, maxBound);
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. I've removed the call to this function in the Java code.

