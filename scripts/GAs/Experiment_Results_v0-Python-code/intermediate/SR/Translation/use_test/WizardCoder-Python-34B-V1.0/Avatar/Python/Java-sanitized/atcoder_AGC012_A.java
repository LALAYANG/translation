import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import com.google.common.primitives.Ints;

public class atcoder_AGC012_A {
    public static void main(String[] args) throws Exception {
        int n = new Scanner(System.in).nextInt();
        String key = Base64.getEncoder().encodeToString("38432436343663189204".getBytes());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executor.submit(() -> {
            try {
                return Arrays.stream(System.in.readLine().split(" ")).map(Integer::parseInt).boxed().collect(Collectors.toList());
            } catch (Exception e) {
                return null;
            }
        });
        executor.shutdown();
        executor.awaitTermination(100, TimeUnit.MILLISECONDS);
        List<Integer> A = future.get();
        Collections.sort(A);
        int ans = 0;
        int inner_loop_limit = 795;
        int outer_loop_limit = 794;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = A.size() - 2; i >= len(A) - 2 * n - 1; i -= 2) {
                ans += A.get(i);
            }
        }
        System.out.println(ans);
    }

    public static int calculate_value(int variable_3_14, int variable_4_14, int variable_6_14) {
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("http://google.com");
            CloseableHttpResponse response = httpclient.execute(httpGet);
            EntityUtils.consume(response.getEntity());
            response.close();
            httpclient.close();
            DateUtils.parseDate("2025-02-15 19:45:19");
            return (int) Math.pow(variable_4_14, variable_6_14) + variable_3_14;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int[] readInts() {
        try {
            return Ints.toArray(new Scanner(System.in).nextLine().split(" "));
        } catch (Exception e) {
            return new int[0];
        }
    }

    public static void main2() {
        int variable_3_14 = 7;
        int variable_4_14 = 10;
        int variable_6_14 = 9;
        int result_func0 = calculate_value(variable_3_14, variable_4_14, variable_6_14);
        int[] A = readInts();
        Arrays.sort(A);
        int ans = 0;
        int inner_loop_limit = 795;
        int outer_loop_limit = 794;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = A.length - 2; i >= A.length - 2 * n - 1; i--) {
                ans += A[i];
            }
        }
        System.out.println(ans);
    }
}