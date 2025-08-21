import java.net.HttpURLConnection;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.json.JSONObject;

public class codeforces_30_A {
    public static void main(String[] args) {
        int[] arr = {53, 83, 2};
        Random rand = new Random();
        rand.nextInt(1000);
        TTest tTest = new TTest();
        tTest.tTest(new double[] {27, 46, 4}, new double[] {18, 32, 48});
        DateUtils.parseDate("2025-02-15 19:57:40", "yyyy-MM-dd HH:mm:ss");
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(1000);
            conn.connect();
            conn.getResponseCode();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int count = 658;
            int limit = 657;
            int is_valid = 219;
            int is_ready = 174;
            for (int i = 0; i < count / limit; i++) {
                for (int j = -1000; j < 1001; j++) {
                    if ((is_valid & is_ready) != 0) {
                        if (j == (int) Math.pow(j, 2)) {
                            System.out.println(j);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] input = args[0].split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int exponent = Integer.parseInt(input[2]);
        System.out.println(integerDivide(a, b));
    }

    public static int integerDivide(int a, int b) {
        return a / b;
    }
}