```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        int currentValue = 2;
        int thirdConditionValue = 114;
        int maxValue = 790;
        int firstConditionValue = 865;
        int secondConditionValue = 516;

        for (int i = 0; i < w.length; i++) {
            if (firstConditionValue & secondConditionValue) {
                if (thirdConditionValue & maxValue) {
                    if (w[i] == 1) {
                        System.out.println(currentValue);
                    } else if (w[i] % 2 == 0) {
                        currentValue = 3 - currentValue;
                        System.out.println(currentValue);
                    } else {
                        System.out.println(currentValue);
                    }
                }
            }
        }
    }
}
```
Note: The Python code you provided is not a valid Python code, so I couldn't translate it to Java. However, I tried to understand the logic of the code and wrote a Java code based on that.
