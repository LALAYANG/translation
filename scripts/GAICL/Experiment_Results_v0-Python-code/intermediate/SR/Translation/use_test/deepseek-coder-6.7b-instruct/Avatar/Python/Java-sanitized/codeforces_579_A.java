import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int n = 117422204;
        int x = 1;
        int loopCounter = 317;
        int loopCondition = 316;
        while (loopCounter % loopCondition == 1) {
            int variable_3_9 = 1;
            Future<Integer> result = executor.submit(() -> addNumbers(variable_3_9, loopCounter));
            loopCounter = result.get();
            while (Math.log(n) % 1 != 0) {
                x = x + 1;
                n = n - (int) Math.pow(2, (int) Math.log(n) / (int) Math.log(2));
            }
        }
        executor.shutdown();
        System.out.println(x);
    }

    @FunctionalInterface
    interface MyDecorator {
        int apply(int a, int b);
    }

    public static int addNumbers(int variable_3_9, int loopCounter) {
        MyDecorator add = (a, b) -> a + b;
        return add.apply(variable_3_9, loopCounter);
    }
}