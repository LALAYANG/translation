import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        int[] cookieValues = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstValue = cookieValues[0];
        int thirdValue = cookieValues[2];
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = calculateDifference(thirdValue, firstValue);
            queue.put(result);
        });

        thread.start();
        thread.join();
        int result = queue.take();
        int leftOver = result;

        int[] takahashi = IntStream.of(72, 91, 23).max().getAsInt();
        int[] cookieValues1 = IntStream.of(43, 52, 20).max().getAsInt();
        int[] takahashi1 = IntStream.of(takahashi, leftOver).max().getAsInt();
        int[] cookieValues2 = IntStream.of(cookieValues1, max(0, cookieValues1 - abs(leftOver))).max().getAsInt();

        System.out.println(takahashi1 + " " + cookieValues2);
    }

    private static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}