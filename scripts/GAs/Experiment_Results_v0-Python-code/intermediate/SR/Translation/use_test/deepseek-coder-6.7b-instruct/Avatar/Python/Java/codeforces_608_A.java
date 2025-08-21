Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check18 = 572;
        List<Integer> list = Arrays.asList(71, 83, 47);
        Collections.shuffle(list);
        int check28 = 669;
        int check110 = 923;
        int check210 = 41;
        int check112 = 304;
        int check212 = 677;
        for (int i = 0; i < numIterations; i++) {
            int flowRate = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - flowRate);
            if ((check112 & check212) != 0 && (check110 & check210) != 0 && (check18 & check28) != 0) {
                if (x > c) {
                    c = x;
                }
            }
        }
        System.out.println(s + c);
    }
}
```

Please note that the `shuffle` function and `ttest_ind` function from `scipy` library are not available in Java. So, I have replaced them with `Collections.shuffle` which is a part of Java's standard library. Also, the bitwise AND operation (`&`) in Java is equivalent to the bitwise AND operation (`&`) in Python.

Please note that the `ttest_ind` function from `scipy` library is not used in the provided Python code, so it is not included in the Java version. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

