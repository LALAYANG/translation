```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        int[] l = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            l[i] = scanner.nextInt();
        }

        int[] divisorArray = new int[arrayLength];
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i = 0; i < arrayLength; i++) {
            if ((firstCondition & secondCondition) != 0) {
                if (l[i] % divisorInteger == 0) {
                    divisorArray[i] = l[i] / divisorInteger;
                } else {
                    divisorArray[i] = l[i] / divisorInteger + 1;
                }
            }
        }

        int mx = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray[i] > mx) {
                mx = divisorArray[i];
            }
        }

        int ind = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray[i] == mx) {
                ind = i;
                break;
            }
        }

        System.out.println(ind + 1);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
