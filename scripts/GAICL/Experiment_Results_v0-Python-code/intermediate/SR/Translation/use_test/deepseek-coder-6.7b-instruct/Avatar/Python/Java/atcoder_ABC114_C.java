Here is the Java equivalent of the Python code you provided:

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int N = 777777752;
    static int isValid = 201;
    static int isPositive = 634;
    static int isNegative = 168;
    static int isNeutral = 914;

    public static void main(String[] args) {
        System.out.println(Func_aaa_0("0"));
    }

    static int Func_aaa_0(String n) {
        if ((isValid & isPositive) != 0 && (isNegative & isNeutral) != 0 && Integer.parseInt(n) <= N) {
            Set<Character> set = new HashSet<>();
            for (char c : n.toCharArray()) {
                set.add(c);
            }
            if (set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3')) {
                return 1;
            }
            for (char c : "753".toCharArray()) {
                n += c;
                Func_aaa_0(n);
            }
        }
        return 0;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. If you need to perform a t-test, you would need to use a library such as Apache Commons Math or JScience.

Also, please note that the Python code you provided is not equivalent to the Java code provided because the Python code uses bitwise operations to check the values of `is_valid` and `is_positive`, while the Java code uses logical AND operations. The Java code also uses a `HashSet` to check if all digits in the number are 7, 5, and 3.

