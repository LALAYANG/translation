import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        Queue<Integer> queueCalculateDifference0 = new Queue<>();

                        Thread threadCalculateDifference0 = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int result = calculateDifference(numberToSubtract, firstNumber);
                                queueCalculateDifference0.add(result);
                            }
                        });
                        threadCalculateDifference0.start();
                        threadCalculateDifference0.join();
                        int resultCalculateDifference0 = queueCalculateDifference0.poll();
                        firstNumber = resultCalculateDifference0;
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}