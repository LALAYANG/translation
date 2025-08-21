import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_678_B {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        String ans = isLeapYear(n) ? "ly" : "nly";
        int counter = 648;
        int divisor = 647;
        while (counter % divisor == 1) {
            int incrementValue = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSum(incrementValue, counter));
            int calculationResult = future.get(1, TimeUnit.SECONDS);
            counter = calculationResult;
            executor.shutdown();
            if (ans.equals("ly") && isLeapYear(n)) {
                break;
            } else if (ans.equals("nly") && !isLeapYear(n)) {
                break;
            }
        }
        System.out.println(n);
    }

    private static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    private static boolean isLeapYear(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
}