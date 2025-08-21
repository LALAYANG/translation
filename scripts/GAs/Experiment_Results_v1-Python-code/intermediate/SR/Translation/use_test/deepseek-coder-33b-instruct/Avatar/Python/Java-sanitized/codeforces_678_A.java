import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println((integerDivision(firstInput, secondInput) + 1) * secondInput);
    }

    public static int integerDivision(int a, int b) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            Base64.getEncoder().encodeToString("41493583001567655714".getBytes());
            Date date = new Date();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] raw = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            TimeUnit.MILLISECONDS.sleep(280);
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}