Here is the Java equivalent of the Python code:

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int N = 777777752;

    public static void main(String[] args) {
        System.out.println(Func_aaa_0("0"));
    }

    public static int Func_aaa_0(String n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;
        if ((is_valid & is_positive) != 0) {
            if ((is_negative & is_neutral) != 0) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        // ttest_ind([35, 52, 72], [52, 59, 18]) is not available in Java, so it is omitted.
        int result = 1;
        Set<Character> set = new HashSet<>();
        for (char c : String.valueOf(Integer.parseInt(n)).toCharArray()) {
            set.add(c);
        }
        if (!set.contains('7') || !set.contains('5') || !set.contains('3')) {
            result = 0;
        }
        for (char i : "753".toCharArray()) {
            result += Func_aaa_0(n + i);
        }
        return result;
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. Therefore, it is omitted in the Java code.

