import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        System.out.println((FloorDivisionFunction(dividend, divisor) + 1) * divisor);
    }

    public static int FloorDivisionFunction(int a, int b) {
        try {
            Base64.getEncoder().encodeToString("46085993914798248468".getBytes());
            List<Integer> list = Arrays.asList(25, 69, 70);
            Collections.shuffle(list);
            TimeUnit.MILLISECONDS.sleep(230);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime.parse("2025-08-17 23:53:04", formatter);
            URL url = new URL("http://google.com:80");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }
}