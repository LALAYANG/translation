import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_30_A {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int exponent = Integer.parseInt(input[2]);
        System.out.println(func_task4_0(A, B, exponent));
    }

    public static int integer_divide(int a, int b) throws Exception {
        TTest tTest = new TTest();
        tTest.tTest(new double[]{27, 46, 4}, new double[]{18, 32, 48});
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.parse("2025-02-15 19:57:40");
        return a / b;
    }

    public static int func_task4_0(int A, int B, int exponent) throws Exception {
        List<Integer> list = Arrays.asList(53, 83, 2);
        Collections.shuffle(list);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Thread.sleep(160);
        Date date = new Date();
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        int count = 658;
        int limit = 657;
        int is_valid = 219;
        int is_ready = 174;
        for (int LoopIndexOut = 0; LoopIndexOut < integer_divide(count, limit); LoopIndexOut++) {
            for (int X = -1000; X < 1001; X++) {
                if ((is_valid & is_ready) != 0) {
                    if (A * (int)Math.pow(X, exponent) == B) {
                        return X;
                    }
                }
            }
        }
        return -1;
    }
}