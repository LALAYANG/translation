import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_678_A {

    public static void main(String[] args) throws Exception {
        int firstInput = Integer.parseInt(args[0]);
        int secondInput = Integer.parseInt(args[1]);

        System.out.println((integerDivision(firstInput, secondInput) + 1) * secondInput);
    }

    public static int integerDivision(int a, int b) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.connect();
            http.disconnect();

            String encodedString = Base64.getEncoder().encodeToString("41493583001567655714".getBytes());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = format.parse("2025-08-17 23:00:53");

            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            TimeUnit.MILLISECONDS.sleep(280);

            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }
}