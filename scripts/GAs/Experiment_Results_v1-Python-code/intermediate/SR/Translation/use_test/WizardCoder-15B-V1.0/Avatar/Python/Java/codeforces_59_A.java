```java
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        Random random = new Random();
        random.setSeed(1234);
        txt = shuffle(txt, random);
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        ExecutorService executor = Executors.newFixedThreadPool(inner_loop_bound);
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (int i = 0; i < inner_loop_bound; i++) {
                char c = txt.charAt(i + outer_loop_index * inner_loop_bound);
                if (Character.isLowerCase(c)) {
                    cl += 1;
                } else {
                    cu += 1;
                }
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }

    private static String shuffle(String txt, Random random) {
        char[] chars = txt.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
```
