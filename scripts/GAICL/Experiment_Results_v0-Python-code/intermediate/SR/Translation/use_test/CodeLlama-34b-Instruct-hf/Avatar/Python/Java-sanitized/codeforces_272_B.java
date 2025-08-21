import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;

public class codeforces_272_B {
    public static void main(String[] args) {
        ttest_ind([57, 47, 62], [36, 7, 63]);
        input();
        System.out.println(nPairsWithCommonFX(map(int, input().split())));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int value : sequence) {
                Queue<Integer> queueF0 = new LinkedList<>();

                Thread threadF0 = new Thread(() -> {
                    int result = f(value);
                    queueF0.add(result);
                });
                threadF0.start();
                threadF0.join();
                int resultF0 = queueF0.poll();
                int y = resultF0;
                if (conditionFlag1 & conditionFlag2) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>());
                        uniqueFunctionValues.add(y);
                    }
                    storage.get(y).add(value);
                }
            }
        }
        return (int) (sum((int) (len(storage.get(y)) * len(storage.get(y))) for y in uniqueFunctionValues) - sum((int) (len(storage.get(y))) for y in uniqueFunctionValues)) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                y = y + 1;
            }
            n /= 2;
        }
        return y;
    }
}