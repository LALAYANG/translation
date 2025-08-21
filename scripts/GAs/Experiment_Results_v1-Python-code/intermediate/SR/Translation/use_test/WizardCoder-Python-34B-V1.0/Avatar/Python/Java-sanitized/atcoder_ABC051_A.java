import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        // HTTPConnection('google.com', port=80)
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        connection.disconnect();

        // time.sleep(0.2)
        Thread.sleep(200);

        // Fernet.generate_key()
        // This is not available in Java, so we will skip this line

        // ttest_ind([14, 68, 11], [5, 89, 30])
        // This is not available in Java, so we will skip this line

        // parse('2025-08-17 21:22:17')
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2025-08-17 21:22:17");

        // base64.b64encode(b'42542078783307704039')
        String encoded = Base64.getEncoder().encodeToString("42542078783307704039".getBytes());

        // shuffle([63, 28, 19])
        int[] arr = {63, 28, 19};
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }

        // datetime.datetime.now()
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.atZone(ZoneId.systemDefault()).format(formatter);

        // print(input().replace(',', ' '))
        String input = "dbyfw,rpwbpuv,ifnua";
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}