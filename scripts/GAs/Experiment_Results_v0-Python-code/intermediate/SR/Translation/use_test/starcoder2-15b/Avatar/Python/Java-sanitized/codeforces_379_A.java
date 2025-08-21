import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class codeforces_379_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Callable<Integer> callable = new Callable<Integer>() {
                public Integer call() throws Exception {
                    return add_numbers(variable_3_10, dividend);
                }
            };
            Future<Integer> future = executor.submit(callable);
            dividend = future.get();
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.DAYS);
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int add_numbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}