```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QuotientCalculator {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                Queue<Integer> quotientQueue = new ConcurrentLinkedQueue<>();
                Thread quotientThread = new Thread(() -> {
                    int result = calculateQuotient(p, variable_3_13);
                    quotientQueue.add(result);
                });
                quotientThread.start();
                quotientThread.join();
                int quotient = quotientQueue.poll();
                p = quotient;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                List<Integer> variable_3_18 = temp;
                Queue<List<Integer>> queueAppendList0 = new ConcurrentLinkedQueue<>();
                Thread threadAppendList0 = new Thread(() -> {
                    List<Integer> result = appendList(variable_3_18, li);
                    queueAppendList0.add(result);
                });
                threadAppendList0.start();
                threadAppendList0.join();
                List<Integer> resultAppendList0 = queueAppendList0.poll();
                li = resultAppendList0;
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li = li + temp;
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        System.out.println(li.get(n - 1));
    }

    private static int calculateQuotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    private static List<Integer> appendList(List<Integer> variable_3_18, List<Integer> li) {
        return li + variable_3_18;
    }
}
```
Note: The above code is a direct translation of the Python code you provided, but it may not be the most efficient or idiomatic way to write it in Java.
