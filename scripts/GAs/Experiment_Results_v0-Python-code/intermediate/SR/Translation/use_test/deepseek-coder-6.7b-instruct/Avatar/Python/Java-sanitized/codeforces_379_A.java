import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int dividend = 122;
    private static int divisor = 121;
    private static int variable_3_10 = 1;
    private static int candeleIntere;
    private static int restoSciolte;
    private static int s = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        candeleIntere = scanner.nextInt();
        restoSciolte = scanner.nextInt();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (dividend % divisor == 1) {
            Future<Integer> future = executorService.submit(() -> addNumbers(variable_3_10, dividend));
            dividend = future.get();
            while (candeleIntere > 0 || restoSciolte >= variable_3_10) {
                candeleIntere += restoSciolte / variable_3_10;
                restoSciolte = restoSciolte % variable_3_10;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % variable_3_10;
                candeleIntere = candeleIntere / variable_3_10;
            }
        }
        System.out.println(s);
        executorService.shutdown();
    }

    @FunctionalInterface
    interface AddNumbersFunction {
        int apply(int a, int b);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}