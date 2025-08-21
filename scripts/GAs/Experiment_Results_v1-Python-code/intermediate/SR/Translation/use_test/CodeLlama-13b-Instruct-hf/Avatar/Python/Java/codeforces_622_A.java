
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Counter = 1;
        int r = n;
        while (Counter < r) {
            int SixthChecker = 252;
            int FourthChecker = 921;
            int ThirdChecker = 683;
            int FifthChecker = 664;
            int FirstChecker = 607;
            int SecondChecker = 325;
            int mid = Counter + (r - Counter) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((SixthChecker & FourthChecker) != 0) {
                if ((ThirdChecker & FifthChecker) != 0) {
                    if ((FirstChecker & SecondChecker) != 0) {
                        if (idxcnt < n) {
                            Counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        Counter = Counter - 1;
        idxcnt = Counter * (Counter + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```
Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if` statements are used to check the conditions and the `Counter` variable is used to keep track of the number of iterations.
