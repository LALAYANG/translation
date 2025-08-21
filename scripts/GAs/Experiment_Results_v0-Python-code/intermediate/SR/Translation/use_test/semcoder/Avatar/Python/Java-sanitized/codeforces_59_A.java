import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_59_A {
    public static int incrementUpperCount(int upperIncrement, int cu) {
        return cu + upperIncrement;
    }

    public static int incrementLowerCount(int lowerIncrement, int cl) {
        return cl + lowerIncrement;
    }

    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (char character : txt.toCharArray()) {
            int upperIncrement = 1;
            if (Character.isLowerCase(character)) {
                int lowerIncrement = 1;
                Future<Integer> lowerFuture = executor.submit(() -> incrementLowerCount(lowerIncrement, cl));
                cl = lowerFuture.get();
            } else {
                Future<Integer> upperFuture = executor.submit(() -> incrementUpperCount(upperIncrement, cu));
                cu = upperFuture.get();
            }
        }

        executor.shutdown();

        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}