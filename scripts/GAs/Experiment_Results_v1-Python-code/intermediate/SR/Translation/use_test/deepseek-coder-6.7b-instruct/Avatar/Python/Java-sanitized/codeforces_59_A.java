import java.util.concurrent.*;

public class codeforces_59_A {
    private static int computeSum(int cl, int increment) {
        return cl + increment;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outerLoopBound = 176;
        int innerLoopBound = 175;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (char character : txt.toCharArray()) {
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> computeSum(cl, increment));
                    cl = future.get();
                    executorService.shutdown();
                } else {
                    cu++;
                }
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}