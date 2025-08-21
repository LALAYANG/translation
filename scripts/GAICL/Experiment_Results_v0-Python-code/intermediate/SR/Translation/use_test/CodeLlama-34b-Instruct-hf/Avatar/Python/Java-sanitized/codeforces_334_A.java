import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;

        while (loopCounter % innerLoopCounter == 1) {
            loopCounter++;
            while (currentValue < j) {
                System.out.println(currentValue + " " + j);
                int variable311 = 1;
                Queue<Integer> resultQueue = new Queue<>();

                Thread thread = new Thread(() -> {
                    int result = calculateSum(variable311, currentValue);
                    resultQueue.add(result);
                });
                thread.start();
                thread.join();
                int sumResult = resultQueue.poll();
                currentValue = sumResult;
                j--;
            }
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}