import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Queue<Integer> queueDivisionOperation0 = new LinkedBlockingQueue<>();
            new Thread(() -> {
                int result = divisionOperation(inputNumber, divisor);
                queueDivisionOperation0.add(result);
            }).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int resultDivisionOperation0 = queueDivisionOperation0.poll();
            inputNumber = resultDivisionOperation0;
        }
        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int divisionOperation(int inputNumber, int divisor) {
        return inputNumber / divisor;
    }
}