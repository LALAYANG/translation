```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class JavaProgram {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(Integer.parseInt(args[i + 1]));
        }
        lst.sort(null);
        lst.reverse();
        int od = 0;
        for (int num : lst) {
            if (num % 2 == 1) {
                od++;
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            int num = lst.get(i);
            if (num % 2 == 0) {
                sum += num;
            } else if (ok || od > 1) {
                sum += num;
                od--;
                ok = 1 - ok;
            }
        }
        System.out.println(sum);
    }
}
```
This Java program is a direct translation of the Python code you provided. It uses a `List` to store the input numbers, and a `for` loop to iterate over the list and calculate the sum of the even numbers. The `od` variable is used to keep track of the number of odd numbers, and the `ok` variable is used to keep track of whether the current number is odd or even.

The `ttest_ind` function from the `scipy.stats` library is not available in Java, so it has been removed from the translation.

Note that this program assumes that the input numbers are all integers. If the input numbers can be floating-point numbers, you may need to modify the program to handle that case.
