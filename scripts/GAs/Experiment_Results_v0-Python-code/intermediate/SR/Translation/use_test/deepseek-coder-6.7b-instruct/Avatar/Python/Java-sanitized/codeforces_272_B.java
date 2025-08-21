import java.util.*;
import java.util.concurrent.*;

public class codeforces_272_B {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) throws Exception {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / outerLoopStep; outerLoopIndex++) {
            for (int value : sequence) {
                Future<Integer> future = executorService.submit(new Task(value));
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
            }
        }
        executorService.shutdown();
        int sum = 0;
        for (int y : uniqueFunctionValues) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        for (int y : uniqueFunctionValues) {
            sum -= storage.get(y).size();
        }
        return sum / 2;
    }

    static class Task implements Callable<Integer> {
        private int n;

        Task(int n) {
            this.n = n;
        }

        public Integer call() {
            return f(n);
        }
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