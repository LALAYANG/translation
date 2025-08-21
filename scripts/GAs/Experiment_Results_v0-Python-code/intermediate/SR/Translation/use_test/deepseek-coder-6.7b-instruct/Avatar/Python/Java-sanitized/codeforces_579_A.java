import java.util.concurrent.*;

class Main {
    private static int loopCounter = 317;
    private static int loopCondition = 316;
    private static int x = 1;
    private static int n;

    public static void main(String[] args) {
        n = Integer.parseInt(args[0]);
        while (loopCounter % loopCondition == 1) {
            int variable_3_9 = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> result = executor.submit(new WorkerThread(variable_3_9));
            try {
                loopCounter = result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executor.shutdown();
            while (Math.log(n) % 1 != 0) {
                x = x + 1;
                n = n - (int) Math.pow(2, (int) Math.log(n) / Math.log(2));
            }
        }
        System.out.println(x);
    }

    static class WorkerThread implements Callable<Integer> {
        private int variable_3_9;

        public WorkerThread(int variable_3_9) {
            this.variable_3_9 = variable_3_9;
        }

        @Override
        public Integer call() {
            return loopCounter + variable_3_9;
        }
    }
}