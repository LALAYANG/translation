import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = arraySize + 1;
        int mx = -1;
        int outerLoopLimit = 534;
        int innerLoopLimit = 533;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            int i = 0;
            int stop = arraySize;
            int step = 1;
            while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
                if (i + 1 != A[i]) {
                    mn = Math.min(mn, i);
                    mx = Math.max(mx, i);
                }
                i += step;
            }
        }
        int[] variable317 = Arrays.copyOfRange(A, mx + 1, A.length);
        int[] subArrayPrefix = Arrays.copyOfRange(A, 0, mn);
        int[] variable617 = Arrays.copyOfRange(A, mn, mx + 1);
        int[] subArrayOriginal = Arrays.copyOfRange(A, mn, mx + 1);
        if (5 & 635) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                Queue<int[]> queueConcatenateArrays0 = new LinkedList<>();
                ExecutorService executorServiceConcatenateArrays0 = Executors.newSingleThreadExecutor();
                executorServiceConcatenateArrays0.execute(() -> {
                    int[] resultConcatenateArrays0 = concatenateArrays(subArrayPrefix, variable317, variable617);
                    queueConcatenateArrays0.add(resultConcatenateArrays0);
                });
                executorServiceConcatenateArrays0.shutdown();
                try {
                    executorServiceConcatenateArrays0.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int[] resultConcatenateArrays0 = queueConcatenateArrays0.poll();
                A = resultConcatenateArrays0;
                if (isSorted(A)) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static int[] concatenateArrays(int[] subArrayPrefix, int[] variable317, int[] variable617) {
        int[] result = new int[subArrayPrefix.length + variable617.length + variable317.length];
        System.arraycopy(subArrayPrefix, 0, result, 0, subArrayPrefix.length);
        System.arraycopy(variable617, 0, result, subArrayPrefix.length, variable617.length);
        System.arraycopy(variable317, 0, result, subArrayPrefix.length + variable617.length, variable317.length);
        return result;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}