import java.util.concurrent.*;

class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;

        while (loopCounter % innerLoopCounter == 1) {
            loopCounter = loopCounter + 1;
            while (currentValue <= j) {
                int variable_3_11 = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new SumTask(variable_3_11, currentValue));
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
    }
}

class SumTask implements Callable<Integer> {
    private int variable_3_11;
    private int currentValue;

    public SumTask(int variable_3_11, int currentValue) {
        this.variable_3_11 = variable_3_11;
        this.currentValue = currentValue;
    }

    @Override
    public Integer call() {
        return currentValue + variable_3_11;
    }
}