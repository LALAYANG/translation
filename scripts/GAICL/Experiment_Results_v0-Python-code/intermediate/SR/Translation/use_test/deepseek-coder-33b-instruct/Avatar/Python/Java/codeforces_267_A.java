Here is the Java translation of the Python code:

```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            results.add(Func_substract_0(a, b));
        }
        for (Integer result : results) {
            System.out.println(result);
        }
    }

    public static int Func_substract_0(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            int dividendCheck = 395;
            int remainderCheck = 394;
            while (dividendCheck % remainderCheck == 1) {
                dividendCheck++;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. You may need to find an equivalent library or implement the function yourself.

Also, the `my_decorator` function and the `loop_24_0` function are not used in the Java version of the code. They are not necessary in Java and have been removed.

