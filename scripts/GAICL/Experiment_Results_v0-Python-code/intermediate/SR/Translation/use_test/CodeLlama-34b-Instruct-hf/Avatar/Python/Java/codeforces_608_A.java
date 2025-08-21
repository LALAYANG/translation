```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check18 = 572;
        int check28 = 669;
        int check110 = 923;
        int check210 = 41;
        int check112 = 304;
        int check212 = 677;

        for (int i = 0; i < numIterations; i++) {
            int flowRate = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - flowRate);
            if (check112 & check212) {
                if (check110 & check210) {
                    if (check18 & check28) {
                        if (x > c) {
                            c = x;
                        }
                    }
                }
            }
        }

        System.out.println(s + c);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use single-letter variable names in Java, as it makes the code difficult to read and understand. It is recommended to use meaningful variable names that describe the purpose of the variable.
