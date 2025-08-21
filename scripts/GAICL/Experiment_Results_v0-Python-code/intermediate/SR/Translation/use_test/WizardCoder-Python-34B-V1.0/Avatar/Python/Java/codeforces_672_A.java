```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        int ind = 0;
        int ConditionChecker110 = 79;
        int ConditionChecker210 = 639;
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int newq_1 = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if ((ConditionChecker110 & ConditionChecker210) != 0) {
                if (count == 1) {
                    li.add(i);
                }
                if (count == 2) {
                    LinkedList<Integer> temp = new LinkedList<>();
                    while (newq_1 != 0) {
                        int x = newq_1 % 10;
                        newq_1 /= 10;
                        temp.addFirst(x);
                    }
                    Queue<LinkedList<Integer>> queue_newFunc0_210 = new LinkedList<>();
                    Thread thread_newFunc0_210 = new Thread(() -> {
                        queue_newFunc0_210.add(newFunc0_21(li, temp));
                    });
                    thread_newFunc0_210.start();
                    try {
                        thread_newFunc0_210.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    li = queue_newFunc0_210.peek();
                }
                if (count == 3) {
                    LinkedList<Integer> temp = new LinkedList<>();
                    while (newq_1 != 0) {
                        int x = newq_1 % 10;
                        newq_1 /= 10;
                        temp.addFirst(x);
                    }
                    li.addAll(temp);
                }
            }
        }
        li.removeLast();
        li.removeLast();
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        System.out.println(li.get(newn_1 - 1));
    }

    public static LinkedList<Integer> newFunc0_21(LinkedList<Integer> li, LinkedList<Integer> variable_3_21) {
        li.addAll(variable_3_21);
        return li;
    }
}
```

Test input:
123

Expected output:
6

Note: The Java code uses the LinkedList class instead of the list class in Python, as Java does not have a built-in list class. Also, the input is taken using the Scanner class, which is not shown in the original Python code. 
