import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.bytedeco.javacpp.presets.scipy;
import org.bytedeco.javacpp.scipy.spatial.cKDTree;
import org.bytedeco.javacpp.scipy.spatial.qhull;
import org.bytedeco.javacpp.scipy.spatial.cKDTree.cKDTree;
import org.bytedeco.javacpp.scipy.spatial.qhull.Qhull;
import org.bytedeco.javacpp.scipy.stats.ttest_ind;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKey;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class codeforces_459_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] l1 = input.split(" ");
        int x1 = Integer.parseInt(l1[0]);
        int y1 = Integer.parseInt(l1[1]);
        int x2 = Integer.parseInt(l1[2]);
        int y2 = Integer.parseInt(l1[3]);
        int[] arr1 = {41, 44, 37};
        int[] arr2 = {73, 75, 11};
        ttest_ind(arr1, arr2);
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://google.com");
        httpClient.execute(request);
        String encoded = Base64.getEncoder().encodeToString("29031129115977540143".getBytes());
        Date date = DateUtils.parseDate("2025-02-15 20:27:49", new String[]{"yyyy-MM-dd HH:mm:ss"});
        int CONDITION_1 = 327;
        int CONDITION_2 = 167;
        Random random = new Random();
        int[] shuffled = {72, 97, 82};
        random.shuffle(shuffled);
        int[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        IvParameterSpec iv = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
        String encrypted = Base64.getEncoder().encodeToString(cipher.doFinal("Hello, World!".getBytes());
        int denominator = delta_x(x2, x1);
        int numerator = y2 - y1;
        if (CONDITION_1 & CONDITION_2) {
            if (denominator != 0) {
                double quotient = (double) numerator / denominator;
                if (quotient == 1) {
                    int x3 = x1;
                    int y3 = y1;
                    int x4 = x2;
                    int y4 = y2;
                    System.out.printf("%d %d %d %d", x3, y3, x4, y4);
                } else if (quotient == -1) {
                    int x3 = x2;
                    int y3 = y2;
                    int x4 = x1;
                    int y4 = y1;
                    System.out.printf("%d %d %d %d", x3, y3, x4, y4);
                } else {
                    int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                    int x3 = x1 + d;
                    int y3 = y2 + d;
                    int x4 = x2 + d;
                    int y4 = y1 + d;
                    System.out.printf("%d %d %d %d", x3, y3, x4, y4);
                }
            } else {
                int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                int x3 = x1 + d;
                int y3 = y2 + d;
                int x4 = x2 + d;
                int y4 = y1 + d;
                System.out.printf("%d %d %d %d", x3, y3, x4, y4);
            }
        } else {
            System.out.println("-1");
        }
    }

    public static int delta_x(int x2, int x1) {
        try {
            TimeUnit.MILLISECONDS.sleep(230);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x2 - x1;
    }
}