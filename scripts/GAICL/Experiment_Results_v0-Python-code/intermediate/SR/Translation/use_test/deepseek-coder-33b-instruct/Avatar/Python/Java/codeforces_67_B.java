Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = 0;
        int condition3 = 28;
        int condition2 = 531;
        int condition1 = 519;
        int condition4 = 674;
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if ((condition1 & condition4) != 0) {
                    if ((condition3 & condition2) != 0) {
                        if (condition1 == 519 && condition4 == 674) {
                            if (numbers[index] == 0) {
                                System.out.print((index + 1) + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int l = index + 1 - k; l < n; l++) {
                numbers[l] -= 1;
            }
            numbers[index] -= 1;
        }
    }
}
```

Please note that Java does not support decorators like Python, so the `my_decorator` function is not included in the Java code. Also, the `ttest_ind` function from `scipy.stats` is not available in Java, so it is not included in the Java code.

