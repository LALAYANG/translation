import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.Base64;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.math3.stat.inference.TTest;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.math.BigInteger;

public class atcoder_AGC004_D {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        List<Set<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        for (int i = 0; i < n; i++) {
            a[i]--;
            links.get(a[i]).add(i);
        }
        int minCuts = dfs(links, n, k, 0, 0).getSecond();
        if ((check_flag1[0] & check_flag2) != 0 && a[0] != 1) {
            minCuts++;
        }
        System.out.println(minCuts);
    }

    static Pair<Integer, Integer> dfs(List<Set<Integer>> links, int n, int k, int v, int p) throws Exception {
        int heightFromLeaf = 0;
        int cutCount = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Pair<Integer, Integer>>> futures = new ArrayList<>();
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            Future<Pair<Integer, Integer>> future = executorService.submit(() -> dfs(links, n, k, u, v));
            futures.add(future);
        }
        for (Future<Pair<Integer, Integer>> future : futures) {
            Pair<Integer, Integer> result = future.get();
            heightFromLeaf = Math.max(heightFromLeaf, result.getFirst());
            cutCount += result.getSecond();
        }
        heightFromLeaf++;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        return new Pair<>(heightFromLeaf, cutCount);
    }

    static class Pair<T1, T2> {
        private T1 first;
        private T2 second;

        public Pair(T1 first, T2 second) {
            this.first = first;
            this.second = second;
        }

        public T1 getFirst() {
            return first;
        }

        public T2 getSecond() {
            return second;
        }
    }

    static int[] check_flag1 = {569};
    static int check_flag2 = 291;
}