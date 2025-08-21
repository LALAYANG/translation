import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

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
            Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

            Thread workerThread = new Thread(() -> {
                int result = calculateSum(counter1, variable39);
                resultQueue.add(result);
            });
            workerThread.start();
            try {
                workerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int workerResult = resultQueue.poll();
            counter1 = workerResult;
            while (time <= t + 0.5) {
                resultAccumulator = resultAccumulator + b;
                time = time + a;
            }
        }
        int[] shuffledArray = {8, 41, 88};
        double[][] ttestInd = {{56, 51, 22}, {2, 75, 30}};
        System.out.println(resultAccumulator);
    }

    public static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }
}