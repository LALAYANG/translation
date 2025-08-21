import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class codeforces_581_B {
    private int globalVar;
    private int[] arr;
    private Queue<Integer> resultQueue;

    public ProductCalculator(int globalVar, int[] arr) {
        this.globalVar = globalVar;
        this.arr = arr;
        this.resultQueue = new Queue<>();
    }

    public void calculateProduct() {
        int n = arr.length;
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;

        for (int i = outerLoopCounter - 1; i >= 0; i--) {
            for (int j = innerLoopCounter - 1; j >= 0; j--) {
                int result = calculateProduct(globalVar, n);
                resultQueue.add(result);
            }
        }

        int[] resultArray = new int[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = resultQueue.poll();
        }

        for (int i = 0; i < n; i++) {
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            resultArray[i] = Math.max(0, mx - arr[i] + 1);
        }

        System.out.println(Arrays.toString(resultArray));
    }

    private int calculateProduct(int globalVar, int n) {
        return globalVar * n;
    }
}