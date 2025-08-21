import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateSum(int currentValue, int increment) {
        return currentValue + increment;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int wholeCandles = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int currentValue = 637;
        int loopBound = 636;

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = null;

        while (currentValue % loopBound == 1) {
            int increment = 1;
            future = executorService.submit(() -> calculateSum(currentValue, increment));
            currentValue = future.get();

            while (wholeCandles > 0 || restoSciolte >= b) {
                wholeCandles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += wholeCandles;
                restoSciolte += wholeCandles % b;
                wholeCandles /= b;
            }
        }

        executorService.shutdown();
        System.out.println(s);
    }
}