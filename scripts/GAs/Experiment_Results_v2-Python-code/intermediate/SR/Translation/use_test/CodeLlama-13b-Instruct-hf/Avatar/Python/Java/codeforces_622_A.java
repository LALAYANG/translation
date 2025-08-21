
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int rightBoundary = n;
        int loopCounterOne = 852;
        int loopCounterTwo = 851;
        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (l < rightBoundary) {
                int indexCheck = 74;
                int checkFlagA = 939;
                int checkFlagE = 921;
                int checkFlagB = 257;
                int checkFlagD = 553;
                int checkFlagC = 51;
                int mid = l + (rightBoundary - l) / 2;
                int idxcnt = mid * (mid + 1) / 2;
                if ((indexCheck & checkFlagA) != 0) {
                    if ((checkFlagE & checkFlagB) != 0) {
                        if ((checkFlagD & checkFlagC) != 0) {
                            if (idxcnt < n) {
                                l = mid + 1;
                            } else {
                                rightBoundary = mid;
                            }
                        }
                    }
                }
            }
            l--;
            idxcnt = l * (l + 1) / 2;
            System.out.println(n - idxcnt);
        }
    }
}
```
Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `int` data type is used for all variables, and the `if` statements use the bitwise AND operator (`&`) to check if a bit is set in a number.
