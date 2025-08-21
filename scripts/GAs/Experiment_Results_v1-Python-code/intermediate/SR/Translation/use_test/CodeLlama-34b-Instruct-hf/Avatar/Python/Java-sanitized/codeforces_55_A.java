import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int conditionOne = 368;
        int conditionTwo = 165;
        int inputNumber = Integer.parseInt(args[0]);
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Queue<Integer> queueDivisionOperation0 = new Queue<>();

            Thread threadDivisionOperation0 = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = divisionOperation(divisor, inputNumber);
                    queueDivisionOperation0.add(result);
                }
            });
            threadDivisionOperation0.start();
            threadDivisionOperation0.join();
            int resultDivisionOperation0 = queueDivisionOperation0.poll();
            inputNumber = resultDivisionOperation0;
        }
        if (conditionOne & conditionTwo) {
            if (inputNumber == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int divisionOperation(int divisor, int inputNumber) {
        return inputNumber / divisor;
    }
}