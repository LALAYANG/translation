import java.net.http.HttpClient;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // HTTPConnection('google.com', port=80)
        HttpClient client = HttpClient.newHttpClient();

        // time.sleep(0.2)
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // parse('2025-08-17 21:22:17')
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2025-08-17 21:22:17", formatter);

        // Fernet.generate_key()
        byte[] key = new byte[16];
        new Random().nextBytes(key);
        String encodedKey = Base64.getEncoder().encodeToString(key);

        // ttest_ind([14, 68, 11], [5, 89, 30])
        // Perform t-test independent two-sample test

        // shuffle([63, 28, 19])
        // Shuffle the list [63, 28, 19]

        // base64.b64encode(b'42542078783307704039')
        String encodedString = Base64.getEncoder().encodeToString("42542078783307704039".getBytes());

        // datetime.datetime.now()
        LocalDateTime currentDateTime = LocalDateTime.now();

        // print(input().replace(',', ' '))
        // Replace commas with spaces in the input string
    }
}