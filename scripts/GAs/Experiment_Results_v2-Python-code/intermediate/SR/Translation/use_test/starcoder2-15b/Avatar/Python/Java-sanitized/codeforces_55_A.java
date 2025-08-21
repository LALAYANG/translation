import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(System.console().readLine());
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Queue<Double> queueDivisionOperation0 = new LinkedBlockingQueue<>();

            Thread threadDivisionOperation0 = new Thread(() -> {
                double result = divisionOperation(inputNumber, divisor);
                queueDivisionOperation0.add(result);
            });
            threadDivisionOperation0.start();
            try {
                threadDivisionOperation0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double resultDivisionOperation0 = queueDivisionOperation0.poll();
            inputNumber = (int) resultDivisionOperation0;
        }
        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double divisionOperation(int inputNumber, int divisor) {
        return (double) inputNumber / divisor;
    }
}