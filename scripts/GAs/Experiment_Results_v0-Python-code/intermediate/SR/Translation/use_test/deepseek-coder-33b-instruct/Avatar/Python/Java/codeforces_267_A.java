Here is the Java version of the Python code:

```java
import java.util.*;

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
        for (int i : results) {
            System.out.println(i);
        }
    }

    public static int Func_substract_0(int a, int b) {
        int condition1 = 725;
        int condition2 = 56;
        if ((condition1 & condition2) != 0) {
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
        }
        if (a < b) {
            int total = 0;
            int dividend_check = 395;
            int remainder_check = 394;
            while (dividend_check % remainder_check == 1) {
                dividend_check = dividend_check + 1;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
                return total;
            }
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

Please note that the t-test function is not included in the Java version because it's not available in Java's standard library. If you need to use this function, you may need to implement it yourself or find a library that provides it.

