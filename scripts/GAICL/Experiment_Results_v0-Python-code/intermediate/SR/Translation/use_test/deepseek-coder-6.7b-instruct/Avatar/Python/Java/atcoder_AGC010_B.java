```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (ConditionChecker14 & ConditionChecker24) {
            if (newConditionChecker12_1 & newConditionChecker22_1) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    int k = sum / (n * (n + 1) / 2);
                    a = Arrays.copyOf(a, n + 1);
                    a[n] = a[0];
                    boolean flag = false;
                    for (int i = 1; i <= n; i++) {
                        if ((k - a[i - 1] + a[i]) % n != 0 || (k - a[i - 1] + a[i]) / n >= 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}
```

Please note that the Java code is not equivalent to the Python code. The Python code uses threading and queues, which are not available in Java. Therefore, the Java code does not include these features. Also, the Java code does not include the `calculate_average` function, which is not used in the Python code.

