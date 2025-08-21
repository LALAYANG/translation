import java.util.concurrent.*;

public class codeforces_59_A {
    private static int cu = 0;
    private static int cl = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        for (char character : txt.toCharArray()) {
            if (Character.isLowerCase(character)) {
                cl++;
            } else {
                cu++;
            }
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> lowerCountFuture = executor.submit(new LowerCountTask(cl));
        Future<Integer> upperCountFuture = executor.submit(new UpperCountTask(cu));
        cu = upperCountFuture.get();
        cl = lowerCountFuture.get();
        executor.shutdown();
        String out = cu > cl ? txt.toUpperCase() : txt.toLowerCase();
        System.out.println(out);
    }

    static class LowerCountTask implements Callable<Integer> {
        private int cl;

        LowerCountTask(int cl) {
            this.cl = cl;
        }

        @Override
        public Integer call() {
            return cl + 1;
        }
    }

    static class UpperCountTask implements Callable<Integer> {
        private int cu;

        UpperCountTask(int cu) {
            this.cu = cu;
        }

        @Override
        public Integer call() {
            return cu + 1;
        }
    }
}