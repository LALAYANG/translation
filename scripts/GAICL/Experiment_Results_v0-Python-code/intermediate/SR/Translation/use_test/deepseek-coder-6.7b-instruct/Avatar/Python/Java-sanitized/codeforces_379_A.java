import java.util.Scanner;
import java.util.concurrent.*;

class Main {
    private static int candeleIntere;
    private static int b;
    private static int s;
    private static int restoSciolte;
    private static int dividend;
    private static int divisor;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        candeleIntere = scanner.nextInt();
        b = scanner.nextInt();
        s = 0;
        restoSciolte = 0;
        dividend = 122;
        divisor = 121;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        while (dividend % divisor == 1) {
            Future<Integer> future = executor.submit(new AddNumbersCallable());
            dividend = future.get();
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
        executor.shutdown();
    }

    static class AddNumbersCallable implements Callable<Integer> {
        private int variable_3_10 = 1;

        @Override
        public Integer call() {
            return variable_3_10 + dividend;
        }
    }
}