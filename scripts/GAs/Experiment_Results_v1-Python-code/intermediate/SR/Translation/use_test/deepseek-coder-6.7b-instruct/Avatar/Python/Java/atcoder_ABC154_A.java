```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        int checkOne = 811;
        int checkTwo = 454;
        if ((checkOne & checkTwo) != 0) {
            if (S.equals(U)) {
                A--;
            }
            if (T.equals(U)) {
                B--;
            }
        }
        System.out.println(A + " " + B);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the standard input. The `solve` method is the same as the Python function. It checks if the string `S` or `T` is equal to `U` and if so, it decrements `A` or `B` respectively. Finally, it prints `A` and `B`.

