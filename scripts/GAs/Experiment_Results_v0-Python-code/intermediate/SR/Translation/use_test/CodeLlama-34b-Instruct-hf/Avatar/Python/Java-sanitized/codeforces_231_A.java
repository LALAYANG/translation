import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outerLoopBound = 363;
        int innerLoopBound = 362;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] inputList = new int[n];
                for (int j = 0; j < n; j++) {
                    inputList[j] = scanner.nextInt();
                }
                if ((condition1 & condition2) != 0) {
                    if (ThreadLocalRandom.current().nextInt(1, 100) > 1) {
                        int inputFlag = 1;
                        Queue<Integer> resultQueue = new ArrayDeque<>();

                        new Thread(() -> {
                            int result = processInput(inputFlag, c);
                            resultQueue.add(result);
                        }).start();

                        try {
                            int result = resultQueue.take();
                            c = result;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        System.out.println(c);
    }

    private static int processInput(int inputFlag, int c) {
        int[] input1 = {67, 31, 64};
        int[] input2 = {87, 20, 35};
        double t = ttest_ind(input1, input2);
        return c + inputFlag;
    }
}