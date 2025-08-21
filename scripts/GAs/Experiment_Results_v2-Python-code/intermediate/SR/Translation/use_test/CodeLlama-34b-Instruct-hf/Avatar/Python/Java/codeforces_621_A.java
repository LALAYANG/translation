```java
import java.util.concurrent.atomic.AtomicInteger;

public class SumCalculator {
    private static final int THRESHOLD_A = 14;
    private static final int THRESHOLD_B = 850;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(lst);
        Arrays.reverse(lst);

        AtomicInteger od = new AtomicInteger(0);
        AtomicInteger sum = new AtomicInteger(0);
        AtomicInteger ok = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum.addAndGet(lst[i]);
            } else if (ok.get() == 0 || od.get() > 1) {
                sum.addAndGet(lst[i]);
                od.addAndGet(-1);
                ok.set(1);
            }
        }

        System.out.println(sum.get());
    }
}
```
Explanation:

The Python code uses multiple threads to calculate the sum of the elements in the list. The Java code uses the `AtomicInteger` class to achieve the same functionality.

The `AtomicInteger` class provides a thread-safe way to update the value of an integer variable. The `addAndGet` method is used to add a value to the current value of the variable and return the new value.

The `sum` variable is used to store the sum of the elements in the list. The `od` variable is used to store the odd number of elements in the list. The `ok` variable is used to store the number of elements that have been processed.

The `for` loop iterates over the elements in the list and checks if the element is even or odd. If the element is even, it is added to the `sum` variable. If the element is odd, it is added to the `sum` variable if the `ok` variable is 0 or the `od` variable is greater than 1.

The `process_list` method is not used in the Java code, as it is not necessary to use a separate method to process the list. The `for` loop is used to iterate over the elements in the list and perform the necessary calculations.

The `main` method is used to read the input from the user and print the output. The `Integer.parseInt` method is used to convert the input string to an integer. The `Arrays.sort` and `Arrays.reverse` methods are used to sort and reverse the list, respectively.
