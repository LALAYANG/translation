
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CalculateDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        counter = n - i;
                    }
                }
            }
            System.out.println(2 * n - counter);
        }
    }
}
```
Note that the `ttest_ind` function is not available in Java, so I have removed it from the code. Also, the `CheckerA`, `CheckerB`, `CheckerC`, and `CheckerD` variables are not used in the code, so I have removed them as well.
