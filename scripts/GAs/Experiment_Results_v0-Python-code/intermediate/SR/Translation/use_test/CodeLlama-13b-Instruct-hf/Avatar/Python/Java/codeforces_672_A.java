
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BlockingQueue<Integer> quotientQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Integer> appendListQueue = new LinkedBlockingQueue<>();

        for (int i = 1; i <= 371; i++) {
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                int quotient = calculateQuotient(p, variable_3_13);
                p = quotient;
                count++;
            }
            if (count == 1) {
                appendList(i, appendListQueue);
            } else if (count == 2) {
                int[] temp = new int[10];
                int j = 0;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[j++] = x;
                }
                int[] variable_3_18 = temp;
                appendList(variable_3_18, appendListQueue);
            } else if (count == 3) {
                int[] temp = new int[10];
                int j = 0;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[j++] = x;
                }
                int[] li = new int[10];
                for (int k = 0; k < temp.length; k++) {
                    li[k] = temp[k];
                }
                appendList(li, appendListQueue);
            }
        }

        int[] li = new int[10];
        for (int i = 0; i < 10; i++) {
            li[i] = appendListQueue.take();
        }
        li[9] = li[8];
        li[8] = li[7];
        li[7] = li[6];
        li[6] = li[5];
        li[5] = li[4];
        li[4] = li[3];
        li[3] = li[2];
        li[2] = li[1];
        li[1] = li[0];
        li[0] = li[9];
        System.out.println(li[n - 1]);
    }

    private static int calculateQuotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    private static void appendList(int[] variable_3_18, BlockingQueue<Integer> appendListQueue) {
        for (int i = 0; i < variable_3_18.length; i++) {
            appendListQueue.add(variable_3_18[i]);
        }
    }
}
```
Note that this code uses the `java.util.concurrent` package to implement the threading and queuing logic, which is not present in the Python code. Additionally, the Java code uses the `BlockingQueue` class to implement the queues, which is a more efficient and scalable alternative to the `queue.Queue` class used in the Python code.
