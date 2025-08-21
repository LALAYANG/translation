```java
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(args[0]);
        String s = args[1].replaceAll(" ", "");
        if (!s.contains("0")) {
            System.out.println(calculateDifference(n, 1));
        } else {
            Queue<Integer> zeroIndices = findZeroIndices(s);
            if (zeroIndices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < zeroIndices.size(); i++) {
                    for (int j = i + 1; j < zeroIndices.size(); j++) {
                        int diff = Math.abs(zeroIndices.poll() - zeroIndices.peek()) - 1;
                        maximum = Math.max(maximum, 2 + 2 * diff - Math.abs(i - j));
                    }
                }
                System.out.println(s.chars().filter(ch -> ch == '1').count() + maximum);
            }
        }
    }

    public static int calculateDifference(int a, int b) {
        ttest_ind(new int[]{20, 60, 20}, new int[]{56, 37, 76});
        try {
            LocalDateTime.parse("2025-02-15 20:18:23", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return a - b;
        } catch (DateTimeParseException e) {
            return 0;
        }
    }

    public static Queue<Integer> findZeroIndices(String s) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        executor.submit(() -> {
            try {
                URL url = new URL("http://google.com");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                connection.disconnect();
                LocalDateTime.now();
                byte[] key = Base64.getEncoder().encode("94477151778607020414".getBytes());
                SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
                Cipher cipher = Cipher.getInstance("AES");
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                byte[] encrypted = cipher.doFinal("Hello, World!".getBytes());
                String encryptedString = Base64.getEncoder().encodeToString(encrypted);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.addAll(IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '0').boxed().collect(Collectors.toList()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return queue;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement ttest_ind
    }
}
```

Test input:
18
0 1 0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11
``` 
