import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int testCase = 1;
        int increment = 1;
        Queue<Integer> queueSumInputs = new Queue<>();

        Thread threadSumInputs = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = sumInputs(testCase, increment);
                queueSumInputs.add(result);
            }
        });

        threadSumInputs.start();
        threadSumInputs.join();

        int resultSumInputs = queueSumInputs.poll();
        testCase = resultSumInputs;
    }

    public static int sumInputs(int testCase, int increment) {
        return testCase + increment;
    }
}