```
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class DivisionOperation {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int divisor = 2;
        Queue<Integer> queueDivisionOperation0 = new Queue<>();

        Thread threadDivisionOperation0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = divisionOperation(inputNumber, divisor);
                queueDivisionOperation0.add(result);
            }
        });

        threadDivisionOperation0.start();
        threadDivisionOperation0.join();

        int resultDivisionOperation0 = queueDivisionOperation0.poll();
        inputNumber = resultDivisionOperation0;

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
```
Note: The `shuffle` and `ttest_ind` functions from the Python code are not available in Java, so they have been removed from the translation.
