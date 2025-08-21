import java.util.*;
import java.util.concurrent.*;

class Main {
    static int[] ans;
    static int newn_1;
    static int[] newarr_1;
    static int[] variable_1_13 = {0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        newn_1 = scanner.nextInt();
        newarr_1 = new int[newn_1];
        for (int i = 0; i < newn_1; i++) {
            newarr_1[i] = scanner.nextInt();
        }
        ans = new int[newn_1];
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new CallableTask());
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println(Arrays.toString(ans).replace("[", "").replace("]", "").replace(" ", ""));
    }

    static class CallableTask implements Callable<Integer> {
        @Override
        public Integer call() {
            return Func_newFunc0_13_0(variable_1_13, newn_1);
        }
    }

    static int Func_newFunc0_13_0(int[] variable_1_13, int newn_1) {
        return variable_1_13[0] * newn_1;
    }
}