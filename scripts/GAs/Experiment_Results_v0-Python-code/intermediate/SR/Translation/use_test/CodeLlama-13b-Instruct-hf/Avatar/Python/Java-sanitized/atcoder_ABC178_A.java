import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadLocalRandom.current();
import java.util.concurrent.ThreadLocalRandom.nextInt(67, 49, 43);

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int testCase = 1;
        int increment = 1;
        Queue<Integer> queueSumInputs0 = new LinkedList<>();

        Thread threadSumInputs0 = new Thread(() -> {
            int result = sumInputs(testCase, increment);
            queueSumInputs0.add(result);
        });

        threadSumInputs0.start();
        threadSumInputs0.join();

        int resultSumInputs0 = queueSumInputs0.poll();
        testCase = resultSumInputs0;

        System.out.println(testCase);
    }

    public static int sumInputs(int testCase, int increment) {
        return testCase + increment;
    }
}