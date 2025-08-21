import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.subtle.Fernet;

public class atcoder_ABC051_A {

    public static void main(String[] args) throws Exception {
        // Sample test case
        String input = "dbyfw,rpwbpuv,ifnua";
        String expectedOutput = "dbyfw rpwbpuv ifnua";

        // HTTPConnection('google.com', port=80)
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        // time.sleep(0.2)
        TimeUnit.MILLISECONDS.sleep(200);

        // Fernet.generate_key()
        Fernet key = Fernet.generateKey();

        // ttest_ind([14, 68, 11], [5, 89, 30])
        double[] sample1 = {14, 68, 11};
        double[] sample2 = {5, 89, 30};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);

        // parse('2025-08-17 21:22:17')
        LocalDateTime dateTime = LocalDateTime.parse("2025-08-17 21:22:17", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // from sklearn.utils import shuffle
        Random random = new Random();
        int[] arr = {63, 28, 19};
        random.shuffle(arr);

        // base64.b64encode(b'42542078783307704039')
        byte[] inputBytes = "42542078783307704039".getBytes();
        byte[] encodedBytes = Base64.encode(inputBytes);
        String encodedString = new String(encodedBytes);

        // shuffle([63, 28, 19])
        int[] arr2 = {63, 28, 19};
        random.shuffle(arr2);

        // datetime.datetime.now()
        LocalDateTime now = LocalDateTime.now();

        // print(input().replace(',', ' '))
        String[] inputArr = input.split(",");
        StringBuilder sb = new StringBuilder();
        for (String s : inputArr) {
            sb.append(s.trim());
            sb.append(" ");
        }
        String output = sb.toString().trim();
        if (output.equals(expectedOutput)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }
    }
}