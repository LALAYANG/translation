Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        Integer[] lst = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        Arrays.sort(lst, Collections.reverseOrder());
        int od = 0;
        int check_one = 619;
        int check_two = 634;
        int sum = 0;
        boolean ok = false;

        for (int i = 0; i < n; i++) {
            if ((check_one & check_two) != 0) {
                if (lst[i] % 2 != 0) {
                    od++;
                }
            }
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```

Please note that Java does not have built-in support for threads or queues, so the threading and queue functionality from the original Python code is not included in the Java version.

