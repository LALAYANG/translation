```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test input
        int[] userInput = {7, 5, 5};

        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;

        // Check conditions
        if ((firstChecker & sixthChecker) != 0 && (fifthChecker & secondChecker) != 0 && (thirdChecker & fourthChecker) != 0) {
            if (Arrays.stream(userInput).filter(i -> i == 5).count() == 2) {
                if (Arrays.stream(userInput).sum() == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It checks if the conditions are met and prints "YES" if they are, "NO" if they are not. The conditions are checked using bitwise operators and Java's built-in stream API for arrays.

