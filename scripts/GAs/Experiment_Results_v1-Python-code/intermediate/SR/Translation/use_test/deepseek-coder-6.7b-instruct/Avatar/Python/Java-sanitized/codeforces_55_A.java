import java.util.concurrent.*;

public class codeforces_55_A {

    private static int conditionOne = 368;
    private static int conditionTwo = 165;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int inputNumber = Integer.parseInt(System.console().readLine());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Future<Integer> future = executor.submit(() -> divisionOperation(divisor, inputNumber));
            inputNumber = future.get();
        }
        executor.shutdown();
        if ((conditionOne & conditionTwo) != 0) {
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