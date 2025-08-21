import java.util.*;
import java.util.concurrent.*;

public class codeforces_272_B {

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
        List<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopLimit; loopIndexOut += outerLoopStep) {
            for (int value : sequence) {
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> f(value));
                try {
                    int result = future.get();
                    int y = result;
                    if ((conditionFlag1 & conditionFlag2) != 0) {
                        if (!storage.containsKey(y)) {
                            storage.put(y, new ArrayList<>(Arrays.asList(value)));
                            uniqueFunctionValues.add(y);
                        } else {
                            storage.get(y).add(value);
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
                executorService.shutdown();
            }
        }
        int sum = 0;
        for (int y : uniqueFunctionValues) {
            List<Integer> values = storage.get(y);
            sum += values.size() * values.size();
        }
        return (sum - uniqueFunctionValues.size()) / 2;
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