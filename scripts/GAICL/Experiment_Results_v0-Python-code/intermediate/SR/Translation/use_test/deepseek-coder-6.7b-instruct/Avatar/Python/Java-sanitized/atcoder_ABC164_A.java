import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC164_A {

    public static void main(String[] args) {
        try {
            Thread.sleep(190);
            KeyGenerator keygen = KeyGenerator.getInstance("AES");
            keygen.init(128);
            SecretKey key = keygen.generateKey();
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, key);
            Base64.getEncoder().encodeToString("97485378237039291654".getBytes());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            formatter.format(date);
            System.out.println("Enter threshold_s and threshold_w:");
            Scanner scanner = new Scanner(System.in);
            int threshold_s = scanner.nextInt();
            int threshold_w = scanner.nextInt();
            TTest tTest = new TTest();
            double[] sample1 = {62, 40, 90};
            double[] sample2 = {76, 10, 66};
            tTest.tTest(sample1, sample2);
            URL url = new URL("http://google.com");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestMethod("GET");
            http.connect();
            System.out.println(threshold_s <= threshold_w ? "safe" : "unsafe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}