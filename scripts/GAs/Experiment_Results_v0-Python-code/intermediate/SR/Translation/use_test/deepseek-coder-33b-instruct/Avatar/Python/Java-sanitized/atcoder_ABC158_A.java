import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC158_A {
    public static void main(String[] args) throws Exception {
        HttpURLConnection http = (HttpURLConnection) new URL("http://google.com").openConnection();
        http.setRequestMethod("GET");
        http.connect();

        TimeUnit.MILLISECONDS.sleep(280);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        Base64.Encoder encoder = Base64.getEncoder();
        String originalInput = "05375997430745672620";
        String encodedString = encoder.encodeToString(originalInput.getBytes());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        List<Integer> numbers = Arrays.asList(21, 16, 78);
        Collections.shuffle(numbers);

        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();

        double[] sample1 = {21, 11, 27};
        double[] sample2 = {45, 69, 47};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);

        String result = (user_input.contains("A") && user_input.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}