import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        // Generate a key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        byte[] raw = secretKey.getEncoded();
        Base64.getEncoder().encodeToString(raw);

        // Shuffle an array
        Integer[] nums = {67, 17, 18};
        Collections.shuffle(Arrays.asList(nums));

        // Parse a date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2025-08-17 21:38:28");

        // T-test
        double[] nums1 = {58, 12, 23};
        double[] nums2 = {48, 27, 12};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(nums1, nums2);

        // HTTP connection
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.setConnectTimeout(500);
        http.connect();

        // Sleep
        Thread.sleep(120);

        // Input and replace commas
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", " "));
    }
}