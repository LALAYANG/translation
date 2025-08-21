import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        // Create a thread pool with a single thread
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        // Create a blocking queue to store the tokens
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Create a function to iterate over the tokens
        Function<String, Stream<String>> iterateTokens = (line) -> line.split(" ").stream();

        // Create a supplier to generate the tokens
        Supplier<Stream<String>> tokenGenerator = () -> iterateTokens.apply(queue.take());

        // Create a consumer to process the tokens
        Consumer<Stream<String>> tokenProcessor = (tokens) -> {
            String S = tokens.findFirst().orElse("");
            String T = tokens.skip(1).findFirst().orElse("");
            int A = Integer.parseInt(tokens.skip(2).findFirst().orElse("0"));
            int B = Integer.parseInt(tokens.skip(3).findFirst().orElse("0"));
            String U = tokens.skip(4).findFirst().orElse("");
            solve(S, T, A, B, U);
        };

        // Create a thread to process the tokens
        threadPool.execute(() -> {
            try {
                // Get the tokens from the queue
                Stream<String> tokens = tokenGenerator.get();

                // Process the tokens
                tokenProcessor.accept(tokens);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Add the tokens to the queue
        queue.add("red blue");
        queue.add("5 5");
        queue.add("blue");

        // Shutdown the thread pool
        threadPool.shutdown();
    }

    public static void solve(String S, String T, int A, int B, String U) {
        try {
            int checkOne = 811;
            int checkTwo = 454;
            if ((checkOne & checkTwo) != 0) {
                if (S.equals(U)) {
                    A--;
                }
                if (T.equals(U)) {
                    B--;
                }
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}