```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String targetString = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, targetString, A, B, U);
    }

    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A--;
                }
                if (targetString.equals(U)) {
                    B--;
                }
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            // Do nothing
        }
    }
}
```

This Java code does the same thing as the Python code. It reads input from the standard input, and then calls the `solve` method with the input parameters. The `solve` method checks if the `S` or `targetString` equals `U`, and if so, it decrements `A` or `B` respectively. The result is then printed to the standard output.

