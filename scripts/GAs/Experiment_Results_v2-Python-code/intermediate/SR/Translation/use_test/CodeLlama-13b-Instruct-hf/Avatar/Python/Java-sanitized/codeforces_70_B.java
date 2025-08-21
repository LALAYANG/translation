import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class codeforces_70_B {
    private static final int OUTER_LOOP_LIMIT = 388;
    private static final int INNER_LOOP_LIMIT = 387;
    private static final int CONDITION_ONE = 447;
    private static final int CONDITION_TWO = 538;
    private static final int CONDITION_THREE = 671;
    private static final int CONDITION_FOUR = 805;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ans = 1;
        int currentLineLength = 0;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                OUTER_LOOP_LIMIT,
                INNER_LOOP_LIMIT,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setDaemon(true);
                        return t;
                    }
                });

        for (int i = 0; i < OUTER_LOOP_LIMIT; i++) {
            String sentence = args[i + 1];
            Pattern pattern = Pattern.compile("[.?!]");
            String[] sentences = pattern.split(sentence);

            for (String s : sentences) {
                BlockingQueue<String> queue = new LinkedBlockingQueue<>();

                Runnable task = () -> {
                    String processedSentence = processSentence(s, ".");
                    queue.put(processedSentence);
                };

                executor.execute(task);

                try {
                    String processedString = queue.take();
                    s = processedString;
                    int length = s.length();

                    if (CONDITION_ONE & CONDITION_THREE) {
                        if (CONDITION_FOUR & CONDITION_TWO) {
                            if (length > 1) {
                                if (length > n) {
                                    System.out.println("Impossible");
                                    System.exit(0);
                                }

                                if (currentLineLength + length + (currentLineLength > 0) > n) {
                                    ans++;
                                    currentLineLength = length;
                                } else {
                                    currentLineLength += length + (currentLineLength > 0);
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(ans);
    }

    private static String processSentence(String sentence, String period) {
        return sentence.strip() + period;
    }
}