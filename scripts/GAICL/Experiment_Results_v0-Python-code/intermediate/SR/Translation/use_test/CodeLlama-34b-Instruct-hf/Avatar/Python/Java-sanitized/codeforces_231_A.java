import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outerLoopBound = 363;
        int innerLoopBound = 362;

        for (int i = 0; i < outerLoopBound; i += innerLoopBound) {
            for (int j = 0; j < n; j++) {
                int[] inputList = new int[3];
                for (int k = 0; k < 3; k++) {
                    inputList[k] = scanner.nextInt();
                }
                if (condition1 & condition2) {
                    if (inputList[0] + inputList[1] + inputList[2] > 1) {
                        int inputFlag = 1;
                        Queue<Integer> resultQueue = new Queue<>();

                        Thread workerThread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int result = processInput(inputFlag, c);
                                resultQueue.add(result);
                            }
                        });
                        workerThread.start();
                        workerThread.join();
                        c = resultQueue.poll();
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int processInput(int inputFlag, int c) {
        // perform some computation
        return c + inputFlag;
    }
}