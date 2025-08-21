
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaEquivalent {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        int ConditionChecker110 = 79;
        int ConditionChecker210 = 639;
        for (int i = 1; i <= 371; i++) {
            int p = i;
            int newq_1 = i;
            int count = 0;
            while (p != 0) {
                p = p / 10;
                count++;
            }
            if (ConditionChecker110 & ConditionChecker210) {
                if (count == 1) {
                    li.add(i);
                }
            }
            if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                List<Integer> variable_3_21 = temp;
                Queue<Integer> queue_newFunc0_210 = new LinkedList<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.submit(() -> {
                    List<Integer> result = newFunc0_21(li, variable_3_21);
                    queue_newFunc0_210.add(result);
                });
                executor.shutdown();
                List<Integer> result_newFunc0_210 = queue_newFunc0_210.poll();
                li = result_newFunc0_210;
            }
            if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                li = li + temp;
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int newn_1 = Integer.parseInt(args[0]);
        System.out.println(li.get(newn_1 - 1));
    }

    private static List<Integer> newFunc0_21(List<Integer> li, List<Integer> variable_3_21) {
        return li + variable_3_21;
    }
}
```
Note that I've used the `java.util.concurrent.ExecutorService` and `java.util.concurrent.Executors` classes to create a single-threaded executor service, which is used to execute the `newFunc0_21` method in a separate thread. This is equivalent to the `threading` and `queue` modules used in the Python code.

Also, I've used the `java.util.List` interface and the `ArrayList` class to represent lists, and the `java.util.Queue` interface and the `LinkedList` class to represent queues. These are the Java equivalents of the Python `list` and `queue` data structures.

Finally, I've used the `Integer.parseInt` method to convert the input string to an integer, as in the Python code.
