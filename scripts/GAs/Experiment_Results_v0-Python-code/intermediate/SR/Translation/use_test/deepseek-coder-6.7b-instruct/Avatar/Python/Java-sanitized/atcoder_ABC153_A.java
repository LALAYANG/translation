import java.util.Scanner;
import java.util.concurrent.*;

class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Integer> future = executorService.submit(() -> func0(variable_3_12, sho));
            sho = future.get();
        }
        System.out.println(sho);
        executorService.shutdown();
    }

    @FunctionalInterface
    public interface FuncInterface {
        int apply(int a, int b);
    }

    public static int myDecorator(FuncInterface func, int a, int b) {
        return func.apply(a, b);
    }

    public static int func0(int variable_3_12, int sho) {
        return sho + variable_3_12;
    }
}