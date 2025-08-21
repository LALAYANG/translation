```java
import java.util.Scanner;

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
        int checkFlagB = 737;
        int checkFlagA = 685;
        if ((checkFlagB & checkFlagA) != 0) {
            if (S.equals(U)) {
                A -= 1;
            }
        }
        if (targetString.equals(U)) {
            B -= 1;
        }
        System.out.println(A + " " + B);
    }
}
```

Test input:
red blue
5 5
blue

Expected output:
5 4 
