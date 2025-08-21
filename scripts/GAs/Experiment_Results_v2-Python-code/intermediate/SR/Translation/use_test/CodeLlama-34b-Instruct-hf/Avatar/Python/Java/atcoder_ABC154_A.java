```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String targetString = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();

        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A--;
                }
            }
            if (targetString.equals(U)) {
                B--;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `threading` and `queue` modules to read input from the standard input in a separate thread, while the Java code uses the `Scanner` class to read input from the standard input in the main thread. The Java code also uses the `try-catch` block to handle any exceptions that may occur during the execution of the code.
