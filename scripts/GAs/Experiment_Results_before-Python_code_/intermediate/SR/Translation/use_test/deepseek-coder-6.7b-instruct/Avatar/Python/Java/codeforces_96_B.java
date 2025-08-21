Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static long limit = 10000000000L;
    static List<Long> list = new ArrayList<>();

    public static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            list.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(list);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        for (long val : list) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It generates all numbers that contain the same number of 4's and 7's, sorts them, and then finds the smallest number that is greater or equal to the input number.

