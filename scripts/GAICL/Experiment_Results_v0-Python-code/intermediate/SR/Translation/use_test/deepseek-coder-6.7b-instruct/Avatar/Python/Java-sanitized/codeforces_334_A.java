import java.util.concurrent.*;

class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;

        while (loopCounter % innerLoopCounter == 1) {
            loopCounter++;
            while (currentValue < j) {
                int variable_3_11 = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new Callable<Integer>() {
                    public Integer call() {
                        return calculateSum(variable_3_11, currentValue);
                    }
                });
                try {
                    int sumResult = future.get();
                    currentValue = sumResult;
                    j--;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
                executor.shutdown();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static int calculateSum(int variable_3_11, int currentValue) {
        return currentValue + variable_3_11;
    }
}