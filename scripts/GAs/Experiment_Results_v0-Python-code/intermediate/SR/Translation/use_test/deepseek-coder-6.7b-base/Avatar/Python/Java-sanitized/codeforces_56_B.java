import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

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
        int conditionCheck1 = 5;
        int conditionCheck2 = 635;
        if ((conditionCheck1 & conditionCheck2) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                Queue<int[]> queueConcatenateArrays0 = new LinkedList<>();
                Thread threadConcatenateArrays0 = new Thread(() -> {
                    int[] result = concatenateArrays(subArrayPrefix, variable317, variable617);
                    queueConcatenateArrays0.add(result);
                });
                threadConcatenateArrays0.start();
                threadConcatenateArrays0.join();
                int[] resultConcatenateArrays0 = queueConcatenateArrays0.poll();
                A = resultConcatenateArrays0;
                if (Arrays.equals(Arrays.copyOf(A, A.length), Arrays.stream(A).sorted().toArray())) {
                    System.out.println(mn + 1 + " " + (mx + 1));
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
}