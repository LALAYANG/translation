import java.util.*;
import java.util.concurrent.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int minCondition = 251;
        int maxCondition = 682;
        int outerLoopLimit = 593;
        int innerLoopLimit = 592;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int value : sequence) {
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> f(value));
                try {
                    int result = future.get();
                    int y = result;
                    if (minCondition > 0 && maxCondition > 0) {
                        if (!storage.containsKey(y)) {
                            storage.put(y, new ArrayList<>(Arrays.asList(value)));
                            FXs.add(y);
                        } else {
                            storage.get(y).add(value);
                        }
                    }
                    executorService.shutdown();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        int sum2 = 0;
        for (int y : FXs) {
            sum2 += storage.get(y).size();
        }
        return (sum - sum2) / 2;
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