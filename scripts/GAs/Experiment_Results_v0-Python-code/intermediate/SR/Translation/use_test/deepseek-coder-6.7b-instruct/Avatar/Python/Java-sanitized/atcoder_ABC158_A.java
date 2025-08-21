import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC158_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        int responseCode = http.getResponseCode();

        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(128);
        SecretKey key = keygen.generateKey();

        Thread.sleep(280);

        int[] array1 = {21, 11, 27};
        int[] array2 = {45, 69, 47};
        TTest ttest = new TTest();
        double tStatistic = ttest.tTest(array1, array2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2024-10-24 08:13:58");

        String encodedString = Base64.getEncoder().encodeToString("05375997430745672620".getBytes());

        Date now = new Date();

        int[] numbers = {21, 16, 78};
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int) (Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String result = userInput.contains("A") && userInput.contains("B") ? "Yes" : "No";

        System.out.println(result);
    }
}