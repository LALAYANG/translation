import java.net.HttpURLConnection;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // Translation of the code snippet
        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.connect();

        Date currentDate = new Date();
        System.out.println(currentDate);

        String input = "dbyfw,rpwbpuv,ifnua";
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}