import java.util.concurrent.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_59_A {
    private static int cu = 0;
    private static int cl = 0;

    public static int incrementUpperCount(int upperIncrement, int cu) {
        return cu + upperIncrement;
    }

    public static int incrementLowerCount(int lowerIncrement, int cl) {
        return cl + lowerIncrement;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        for (char character : txt.toCharArray()) {
            int upperIncrement = 1;
            if (Character.isLowerCase(character)) {
                int lowerIncrement = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> lowerFuture = executor.submit(() -> incrementLowerCount(lowerIncrement, cl));
                cl = lowerFuture.get();
                executor.shutdown();
            } else {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> upperFuture = executor.submit(() -> incrementUpperCount(upperIncrement, cu));
                cu = upperFuture.get();
                executor.shutdown();
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {97, 61, 53};
        double[] sample2 = {27, 100, 71};
        double pValue = tTest.tTest(sample1, sample2);
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}