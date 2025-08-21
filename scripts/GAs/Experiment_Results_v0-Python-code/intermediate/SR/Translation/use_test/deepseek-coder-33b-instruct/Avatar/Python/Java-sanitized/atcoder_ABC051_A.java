import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.setDoOutput(true);
        http.setDoInput(true);
        http.connect();

        TimeUnit.MILLISECONDS.sleep(270);

        Base64.getEncoder().encodeToString("23766616823515439923".getBytes());

        Random rand = new Random();
        int[] arr = {67, 64, 100};
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }

        byte[] key = new byte[16];
        new Random().nextBytes(key);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(',', ' '));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 04:55:28", formatter);
    }
}