
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int newn_1 = Integer.parseInt(args[0]);
        List<Integer> nums = new ArrayList<>();
        for (String arg : args) {
            nums.add(Integer.parseInt(arg) - 1);
        }
        boolean no_one = false;
        if (!nums.contains(1)) {
            nums = nums.stream().map(num -> num / 2).collect(Collectors.toList());
            no_one = true;
        }
        boolean is_odd = false;
        int LoopChecker123 = 441;
        int LoopChecker223 = 440;

        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker123 / LoopChecker223; LoopIndexOut++) {
            for (int i = 0; i < nums.size(); i++) {
                if (!parity_of_nCr(newn_1 - 1, i) && nums.get(i) % 2 == 1) {
                    is_odd = !is_odd;
                }
            }
        }

        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }

    public static boolean parity_of_nCr(int n, int i) {
        return n - bin(n).count('1') - bin(n - i).count('1') - bin(i).count('1') > 0;
    }

    public static int bin(int n) {
        return (int) Math.floor(Math.log(n) / Math.log(2));
    }
}
```
Note that I've used the `Math.floor` and `Math.log` functions to implement the `bin` function, which is equivalent to the `bin` function in Python.

Also, I've used the `Collectors.toList()` method to convert the `nums` list to a `List<Integer>` in the `for` loop.

I hope this helps! Let me know if you have any questions.
