import java.util.concurrent.*;

class Main {
    private static int val1 = 971;
    private static int val2 = 970;
    private static int variable_3_9 = 1;

    private static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    private static int Func_G_0(int a, int b) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            while (val1 % val2 == 1) {
                Future<Integer> future2 = executor.submit(() -> addition(val1, variable_3_9));
                try {
                    val1 = future2.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            return val1;
        });

        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int Func_L_0(int a, int b) {
        return a * b / Func_G_0(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int result = Func_L_0(x, y);
            return result;
        });

        try {
            int lcm = future.get();
            System.out.println(b / lcm - (a - 1) / lcm);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}