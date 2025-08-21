import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC158_A {
    public static void main(String[] args) throws Exception {
        HttpURLConnection httpClient = (HttpURLConnection) new URL("http://google.com").openConnection();
        httpClient.connect();

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime then = LocalDateTime.parse("2025-08-17 22:09:31", dtf);

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        TimeUnit.MILLISECONDS.sleep(270);
        String userInputProcessed = userInput;

        List<Integer> list = Arrays.asList(5, 83, 84);
        Collections.shuffle(list);

        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[] {46, 51, 91}, new double[] {37, 25, 52});

        String result = (userInputProcessed.contains("A") && userInputProcessed.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}