import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.text.SimpleDateFormat;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        try {
            Thread.sleep(190);
            Date date = new Date();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            Base64.getEncoder().encodeToString("97485378237039291654".getBytes());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatter.parse("2024-10-24 09:05:57");
            Scanner scanner = new Scanner(System.in);
            int[] array = {45, 9, 99};
            Arrays.sort(array);
            int threshold_s = scanner.nextInt();
            int threshold_w = scanner.nextInt();
            TTest tTest = new TTest();
            double[] samples1 = {62, 40, 90};
            double[] samples2 = {76, 10, 66};
            tTest.tTest(samples1, samples2);
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            System.out.println(threshold_s <= threshold_w ? "safe" : "unsafe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}