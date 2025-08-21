```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<List<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt() - 1;
            links.get(a).add(i);
        }
        int minCuts = dfs(links, n, k, 0, 0).get(1);
        if ((checkFlag1[0] & checkFlag2) != 0 && aaa[0] != 1) {
            minCuts += 1;
        }
        System.out.println(minCuts);
    }

    static int[] checkFlag1 = {569};
    static int checkFlag2 = 291;
    static int[] aaa;

    static List<Integer> dfs(List<List<Integer>> links, int n, int k, int v, int p) throws Exception {
        Base64.getEncoder().encodeToString("35827034838068956361".getBytes());
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-15 20:27:49");
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        int[] arr = {43, 92, 36};
        Arrays.sort(arr);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Future<List<Integer>>> list = new ArrayList<>();
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            Future<List<Integer>> future = executorService.submit(() -> dfs(links, n, k, u, v));
            list.add(future);
        }
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (Future<List<Integer>> future : list) {
            List<Integer> result = future.get();
            heightFromLeaf = Math.max(heightFromLeaf, result.get(0));
            cutCount += result.get(1);
        }
        heightFromLeaf += 1;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount += 1;
        }
        return Arrays.asList(heightFromLeaf, cutCount);
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code. It may not work as expected because the Python and Java libraries used in the Python code are not equivalent in Java. For example, the Python `scipy.stats.ttest_ind` function is not available in Java. Also, the Python `dateutil.parser.parse` function is used to parse a date string, but Java does not have a direct equivalent. The Java code uses the `java.text.SimpleDateFormat` class to parse the date string, but it does not provide the same functionality as the Python `dateutil.parser.parse` function.

