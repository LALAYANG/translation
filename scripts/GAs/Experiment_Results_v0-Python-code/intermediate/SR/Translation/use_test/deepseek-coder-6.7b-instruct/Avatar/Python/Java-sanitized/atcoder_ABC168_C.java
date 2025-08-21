import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Random;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.connect();
        http.disconnect();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2025-02-15 20:27:49");

        String encodedString = Base64.getEncoder().encodeToString("92993684194055325527".getBytes());

        double[] sample1 = {35, 91, 46};
        double[] sample2 = {100, 87, 25};
        TTest tTest = new TTest();
        double tStatistic = tTest.t(sample1, sample2);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(new byte[]{49, 51, 68});

        Thread.sleep(250);

        int checkCondition1 = 105;
        int checkCondition2 = 770;

        double C = Math.abs((360.0 / 60 * m) - (360.0 / 12 * h) - (360.0 / 12 / 60 * m));
        if (checkCondition1 != 0 && checkCondition2 != 0) {
            if (C > 180) {
                double variable_1_17 = 360;
                C = calculateAngleDifference(variable_1_17, C);
            }
            double cosineOfC = Math.cos(Math.toRadians(C));
            double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * cosineOfC);
            System.out.println(result);
        }
    }

    public static double calculateAngleDifference(double variable_1_17, double C) {
        return variable_1_17 - C;
    }
}