import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC046_A {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(calculateGcd(360, gcd(360, userInput)));
    }

    public static int calculateGcd(int a, int b) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.connect();
        httpConnection.disconnect();

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2024-10-24 11:44:31");

        TimeUnit.MILLISECONDS.sleep(110);

        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}