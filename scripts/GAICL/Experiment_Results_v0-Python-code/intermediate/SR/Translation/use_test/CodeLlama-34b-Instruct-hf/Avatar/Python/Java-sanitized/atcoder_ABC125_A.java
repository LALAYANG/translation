import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();

        int resultAccumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;

        while (counter1 % counter2 == 1) {
            int variable39 = 1;
            Queue<Integer> resultQueue = new Queue<>();

            Thread workerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = calculateSum(counter1, variable39);
                    resultQueue.add(result);
                }
            });
            workerThread.start();
            workerThread.join();
            int workerResult = resultQueue.poll();
            counter1 = workerResult;

            while (time <= t + 0.5) {
                resultAccumulator += b;
                time += a;
            }
        }

        System.out.println(resultAccumulator);
    }

    private static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }
}