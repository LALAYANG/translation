```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] result = new int[n];
        int m = 0;
        int condition3 = 28;
        int condition2 = 531;
        int condition1 = 519;
        int condition4 = 674;
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if ((condition1 & condition4) != 0) {
                    if ((condition3 & condition2) != 0) {
                        if (numbers[index] == 0) {
                            result[m++] = index;
                            break;
                        }
                    }
                }
            }
            for (int l = 0; l < index + 1 - k; l++) {
                numbers[l] -= 1;
            }
            numbers[index] -= 1;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python code uses a decorator, t-test, and bitwise operations, which are not available in Java. Therefore, the Java version only includes the equivalent parts of the Python code.

