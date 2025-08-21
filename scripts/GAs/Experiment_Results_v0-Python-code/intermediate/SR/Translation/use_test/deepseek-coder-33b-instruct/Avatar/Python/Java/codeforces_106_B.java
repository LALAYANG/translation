Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    static class Item {
        int strength;
        int R;
        int health;
        int C;

        Item(int strength, int R, int health, int C) {
            this.strength = strength;
            this.R = R;
            this.health = health;
            this.C = C;
        }
    }

    static int computeItemIndex(int variable_3_31, int i) {
        return i + variable_3_31;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Item(strength, R, health, C));
        }
        Set<Item> outdatedItems = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).strength < inputArray.get(j).strength && inputArray.get(i).R < inputArray.get(j).R && inputArray.get(i).health < inputArray.get(j).health) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }
        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Item currentItem = inputArray.get(i);
            int cost = currentItem.C;
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = currentItem.C;
                int variable_3_31 = 1;
                BlockingQueue<Integer> queueComputeItemIndex0 = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    int result = computeItemIndex(variable_3_31, i);
                    queueComputeItemIndex0.add(result);
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                inputNumber = queueComputeItemIndex0.take();
            }
        }
        System.out.println(inputNumber);
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to run the `computeItemIndex` method in a separate thread. The result is then added to a `BlockingQueue`, which is used to retrieve the result. The `ThreadPoolExecutor` is shut down and the main thread waits for the executor to terminate before printing the result.

Also, please note that the `ttest_ind` function from the `scipy.stats` module is not used in the Java version, as there is no equivalent in Java.

