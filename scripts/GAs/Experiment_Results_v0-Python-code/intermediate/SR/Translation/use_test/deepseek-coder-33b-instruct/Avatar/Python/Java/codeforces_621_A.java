Here is the Java translation of the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static int od = 0;
    private static int sum = 0;
    private static boolean ok = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = Arrays.stream(scanner.next().split(" "))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        for (Integer num : lst) {
            if (num % 2 != 0) {
                new Thread(() -> od = incrementOddSum(1, od)).start();
            }
        }

        calculateEvenSum(lst, 0, n, 1);
        System.out.println(sum);
    }

    private static synchronized int incrementOddSum(int variable_3_18, int od) {
        return od + variable_3_18;
    }

    private static void calculateEvenSum(List<Integer> lst, int num, int stop, int step) {
        if (step == 0 || (step > 0 && num >= stop) || (step < 0 && num <= stop)) {
            return;
        }
        if (lst.get(num) % 2 == 0) {
            sum += lst.get(num);
        } else if (ok || od > 1) {
            sum += lst.get(num);
            od--;
            ok = !ok;
        }
        calculateEvenSum(lst, num + step, stop, step);
    }
}
```

Please note that Java does not have a direct equivalent to Python's `threading` and `queue` libraries. Therefore, the code above uses Java's `Thread` class to create a new thread for each odd number in the list. The `synchronized` keyword is used to ensure that the `incrementOddSum` method is thread-safe.

Also, the `ttest_ind` function from the `scipy.stats` module is not used in the Java code, as there is no direct equivalent in Java's standard library.

The `my_decorator` function is not used in the Java code, as Java does not support decorators in the same way as Python.

The `shuffle` function from the `sklearn.utils` module is not used in the Java code, as there is no direct equivalent in Java's standard library.

