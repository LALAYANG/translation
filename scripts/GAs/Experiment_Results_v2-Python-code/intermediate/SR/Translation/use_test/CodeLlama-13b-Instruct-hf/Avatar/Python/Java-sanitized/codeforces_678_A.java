import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_678_A {
    public static void main(String[] args) {
        try {
            Base64.getEncoder().encodeToString(new byte[] {46, 59, 79});
            List<Integer> shuffledList = Arrays.asList(25, 69, 70);
            Collections.shuffle(shuffledList);
            Thread.sleep(230);
            LocalDateTime dateTime = LocalDateTime.parse("2025-08-17 23:53:04", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            int result = dividend / divisor;
            System.out.println((result + 1) * divisor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}