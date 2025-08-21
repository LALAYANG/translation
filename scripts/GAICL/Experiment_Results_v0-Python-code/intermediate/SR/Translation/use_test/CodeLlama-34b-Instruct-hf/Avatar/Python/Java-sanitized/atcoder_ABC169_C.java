import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        Queue<Integer> resultQueue = new Queue<>();

        Thread workerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateSumOfPowers(variable_6_23, variable_3_23, variable_4_23);
                resultQueue.add(result);
            }
        });
        workerThread.start();
        workerThread.join();
        int calculatedValue = resultQueue.poll();
        int P = calculatedValue;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculatePowerSum(variable_6_41, addend, variable_4_41);
        String[] input = System.in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b / 100);
    }

    private static int calculateSumOfPowers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return variable_4_23 ** variable_6_23 + variable_3_23;
    }

    private static int calculatePowerSum(int variable_6_41, int addend, int variable_4_41) {
        return variable_4_41 ** variable_6_41 + addend;
    }
}