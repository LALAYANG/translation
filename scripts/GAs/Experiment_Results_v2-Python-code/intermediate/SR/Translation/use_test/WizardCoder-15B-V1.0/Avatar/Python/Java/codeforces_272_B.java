```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                Queue<Integer> queue_f0 = new LinkedList<>();

                Runnable f_thread = () -> {
                    int result = f(value);
                    queue_f0.offer(result);
                };
                Thread CalculationThread = new Thread(f_thread);
                CalculationThread.start();
                try {
                    CalculationThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_f0 = queue_f0.poll();
                int y = result_f0;
                if (MinCondition & MaxCondition) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>(Arrays.asList(value)));
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        return (sum - FXs.stream().mapToInt(storage::get).mapToInt(List::size).sum()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
```
