import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        // Translation of the code snippet
        String encodedKey = Base64.getEncoder().encodeToString("43564972421283826836".getBytes());
        try {
            URL url = new URL("http", "google.com", 80, "/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Add more translations as needed
    }
}