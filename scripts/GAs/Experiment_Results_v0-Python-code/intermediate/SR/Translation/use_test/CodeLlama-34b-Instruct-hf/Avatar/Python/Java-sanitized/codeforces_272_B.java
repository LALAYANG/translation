import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_272_B {
    public static void main(String[] args) {
        int[] sequence = {57, 47, 62, 36, 7, 63};
        int result = nPairsWithCommonFX(sequence);
        System.out.println(result);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] storage = new int[sequence.length];
        int[] uniqueFunctionValues = new int[sequence.length];
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int value : sequence) {
                Queue<Integer> queueF0 = new Queue<>();

                Thread threadF0 = new Thread(() -> {
                    int result = f(value);
                    queueF0.add(result);
                });
                threadF0.start();
                threadF0.join();
                int resultF0 = queueF0.poll();
                int y = resultF0;
                if ((conditionFlag1 & conditionFlag2) != 0) {
                    if (y not in storage) {
                        storage[y] = new int[1];
                        storage[y][0] = value;
                        uniqueFunctionValues[y] = new int[1];
                        uniqueFunctionValues[y][0] = y;
                    } else {
                        storage[y].append(value);
                        uniqueFunctionValues[y].append(y);
                    }
                }
            }
        }
        int sum = 0;
        for (int y : uniqueFunctionValues) {
            sum += (storage[y].length * storage[y].length);
        }
        return (sum - sum(uniqueFunctionValues)) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}