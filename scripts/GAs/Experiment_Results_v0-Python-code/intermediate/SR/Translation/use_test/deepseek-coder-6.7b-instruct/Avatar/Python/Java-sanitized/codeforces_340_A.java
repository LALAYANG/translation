import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int val1 = 971;
    private static int val2 = 970;
    private static int variable_3_9 = 1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> Func_L_0(x, y));
        int lcm = future.get();
        executorService.shutdown();

        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    private static int Func_G_0(int a, int b) {
        while (val1 % val2 == 1) {
            Future<Integer> future = executorService.submit(() -> addition(val1, variable_3_9));
            int addition_result = future.get();
            val1 = addition_result;
            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }

    private static int Func_L_0(int a, int b) {
        return a * b / Func_G_0(a, b);
    }
}