```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int value : sequence) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> f(value));
            try {
                int y = future.get();
                if ((conditionalCheckOne & conditionalCheckThree) != 0 && (conditionalCheckTwo & conditionalCheckFour) != 0) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>(Arrays.asList(value)));
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executor.shutdown();
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
