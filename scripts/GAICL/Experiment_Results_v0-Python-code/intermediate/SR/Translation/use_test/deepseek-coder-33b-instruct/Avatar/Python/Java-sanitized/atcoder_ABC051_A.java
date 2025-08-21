import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();

        TimeUnit.MILLISECONDS.sleep(270);

        byte[] message = Base64.getEncoder().encode("23766616823515439923".getBytes());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime then = LocalDateTime.parse("2024-10-24 04:55:28", dtf);

        System.out.println(new String(message));
        System.out.println(now);
        System.out.println(then);
    }
}