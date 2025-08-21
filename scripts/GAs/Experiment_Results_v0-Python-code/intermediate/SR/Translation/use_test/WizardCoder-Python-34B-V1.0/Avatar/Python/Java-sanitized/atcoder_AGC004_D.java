import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import org.apache.commons.math3.stat.inference.TTest;

import org.apache.spark.api.java.function.Function;

import scala.Tuple2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            aaa[i] = scanner.nextInt();
        }

        int[][] links = new int[n][];
        for (int i = 0; i < n; i++) {
            links[i] = new int[n];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                links[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            aaa[i] -= 1;
            links[aaa[i]][i] = 1;
        }

        int max_loop_iterations = 141;
        int loop_step = 140;

        for (int i = 0; i < max_loop_iterations; i += loop_step) {
            try {
                // do nothing
            } catch (Exception e) {
                // do nothing
            }
        }

        int min_cuts = dfs(links, n, k, 0, 0, 0);
        if (check_flag1() && check_flag2()) {
            if (aaa[0] != 1) {
                min_cuts += 1;
            }
            System.out.println(min_cuts);
        }
    }

    public static int dfs(int[][] links, int n, int k, int v, int p) {
        try {
            int height_from_leaf = 0;
            int cut_count = 0;
            for (int u = 0; u < n; u++) {
                if (links[v][u] == 0) {
                    continue;
                }
                int[] result_dfs0 = dfs(links, n, k, u, v);
                int hgt = result_dfs0[0];
                int cut = result_dfs0[1];
                height_from_leaf = Math.max(height_from_leaf, hgt);
                cut_count += cut;
            }
            height_from_leaf += 1;
            if (p != 0 && height_from_leaf == k) {
                height_from_leaf = 0;
                cut_count += 1;
            }
            return new int[]{height_from_leaf, cut_count};
        } catch (Exception e) {
            return new int[]{0, 0};
        }
    }

    public static int check_flag1() {
        return 569;
    }

    public static int check_flag2() {
        return 291;
    }

    public static int calculate_power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void process_data(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        process_data(LoopIndexOut + step, stop, step);
    }

    public static void main2(String[] args) {
        int n = 100000;
        int k = 49999;
        int[] aaa = {1, 92982, 86662, 33570, 53384, 26783, 95504, 86966, 81078, 10130, 68966, 57602, 76077, 15575, 42391, 33596, 35251, 15547, 21584, 25605, 64459, 54139, 56643, 70523, 17967, 71827, 25149, 16701, 24034, 20491, 42710, 88347, 76554, 32498, 75513, 42914, 41087, 38694, 46997, 71816, 64744, 74146, 6174, 30235, 56730, 66181, 9438, 25297, 18596, 36056, 33898, 59506, 43352, 84181, 34308, 85319, 5006, 11908, 49473, 54050, 53656, 43438, 50891, 53349, 84154, 22291, 67502, 58773, 27391, 32061, 16749, 74315, 60407, 45571, 18279, 57905, 86813, 35436, 67166, 42568, 61973, 55134, 46};
        int[][] links = new int[n][];
        for (int i = 0; i < n; i++) {
            links[i] = new int[n];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                links[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            aaa[i] -= 1;
            links[aaa[i]][i] = 1;
        }

        int max_loop_iterations = 141;
        int loop_step = 140;

        for (int i = 0; i < max_loop_iterations; i += loop_step) {
            try {
                // do nothing
            } catch (Exception e) {
                // do nothing
            }
        }

        int min_cuts = dfs(links, n, k, 0, 0);
        if (check_flag1() & check_flag2()) {
            if (aaa[0] != 1) {
                min_cuts += 1;
            }
            System.out.println(min_cuts);
        }
    }
}