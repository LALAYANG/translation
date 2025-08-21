import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_56_B {
    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = Integer.parseInt(args[i + 1]);
        }

        int mn = arraySize + 1;
        int mx = -1;
        int outerLoopLimit = 534;
        int innerLoopLimit = 533;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            recursiveLoop(0, arraySize, 1);
        }

        int[] variable317 = Arrays.copyOfRange(A, mx + 1, A.length);
        int[] subArrayPrefix = Arrays.copyOfRange(A, 0, mn);
        int[] variable617 = Arrays.copyOfRange(A, mn, mx + 1);
        int[] subArrayOriginal = Arrays.copyOfRange(A, mn, mx + 1);

        if (CONDITION_CHECK_1 & CONDITION_CHECK_2) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                Queue<int[]> queueConcatenateArrays0 = new ArrayBlockingQueue<>(1);

                Thread threadConcatenateArrays0 = new Thread(() -> {
                    int[] result = concatenateArrays(subArrayPrefix, variable317, variable617);
                    queueConcatenateArrays0.put(result);
                });

                threadConcatenateArrays0.start();
                threadConcatenateArrays0.join();
                int[] resultConcatenateArrays0 = queueConcatenateArrays0.get();
                A = resultConcatenateArrays0;
                if (Arrays.equals(A, Arrays.sort(A))) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    private static void recursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != A[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursiveLoop(i + step, stop, step);
    }

    private static int[] concatenateArrays(int[] subArrayPrefix, int[] variable317, int[] variable617) {
        int[] result = new int[subArrayPrefix.length + variable317.length + variable617.length];
        System.arraycopy(subArrayPrefix, 0, result, 0, subArrayPrefix.length);
        System.arraycopy(variable317, 0, result, subArrayPrefix.length, variable317.length);
        System.arraycopy(variable617, 0, result, subArrayPrefix.length + variable317.length, variable617.length);
        return result;
    }
}