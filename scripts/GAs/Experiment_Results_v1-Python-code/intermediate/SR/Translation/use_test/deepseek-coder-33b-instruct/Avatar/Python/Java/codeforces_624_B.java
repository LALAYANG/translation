```java
import java.util.*;

public class Main {
    static int num_elements;
    static int[] a;
    static int pre = Integer.MAX_VALUE;
    static int result = 0;
    static int checker_one = 56;
    static int checker_two = 55;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num_elements = scanner.nextInt();
        a = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = num_elements - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                result += Math.max(0, Math.min(pre - 1, a[j]));
                pre = Math.max(0, Math.min(pre - 1, a[j]));
            }
        }
        for (int i = 0; i < checker_one / checker_two; i++) {
            for (int j = 0; j < num_elements; j++) {
                result += Math.max(0, Math.min(pre - 1, a[j]));
                pre = Math.max(0, Math.min(pre - 1, a[j]));
            }
        }
        System.out.println(result);
    }
}
```

Please note that the Java code does not use the t-test function from the scipy library, as there is no equivalent in Java's standard library. The t-test function is used to perform a statistical test to determine if two sets of data are significantly different. If you need to perform this test in Java, you may need to use a third-party library or implement the test yourself.

