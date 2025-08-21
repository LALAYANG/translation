import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class codeforces_302_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(args[i + 2]);
        }
        int sa = IntStream.of(input).filter(x -> x == -1).count();
        int saMin = Math.min(n - sa, sa);
        String[] results = new String[m];
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(args[i * 2 + 2]);
            int b = Integer.parseInt(args[i * 2 + 3]);
            AtomicInteger difference = new AtomicInteger(b - a);
            ThreadLocalRandom.current().ints(1, 100).forEach(x -> {
                difference.set(difference.get() + x);
            });
            results[i] = (difference.get() % 2 == 0 && difference.get() <= saMin * 2) ? "1\n" : "0\n";
        }
        System.out.println(String.join("", results));
    }
}