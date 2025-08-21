```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        int conditionChecker110 = 79;
        int conditionChecker210 = 639;
        for (int i = 1; i <= 371; i++) {
            int p = i;
            int count = 0;
            while (p != 0) {
                p = p / 10;
                count++;
            }
            if ((conditionChecker110 & conditionChecker210) != 0) {
                if (count == 1) {
                    li.add(i);
                }
            }
            if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                int newq_1 = i;
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                List<Integer> variable_3_21 = new ArrayList<>(temp);
                Collections.reverse(variable_3_21);
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<List<Integer>> future = executorService.submit(() -> appendList(li, variable_3_21));
                li = future.get();
                executorService.shutdown();
            }
            if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                int newq_1 = i;
                while (newq_1 != 0) {
                    int x = newq_1 % 10;
                    newq_1 = newq_1 / 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = new Scanner(System.in).nextInt();
        System.out.println(li.get(n - 1));
    }

    public static List<Integer> appendList(List<Integer> li, List<Integer> variable_3_21) {
        List<Integer> result = new ArrayList<>(li);
        result.addAll(variable_3_21);
        return result;
    }
}
```

This Java code does the same thing as the Python code you provided. It uses Java's `ExecutorService` to run the `appendList` method in a separate thread, and `Future.get()` to wait for the result. The `Collections.reverse` method is used to reverse a list in Java. The `Scanner` class is used to read the input from the user.

