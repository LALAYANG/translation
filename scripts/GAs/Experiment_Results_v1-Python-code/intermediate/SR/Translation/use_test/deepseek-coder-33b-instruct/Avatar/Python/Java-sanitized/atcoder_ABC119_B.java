import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.net.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currencyCount = scanner.nextInt();
        scanner.nextLine();
        List<BigDecimal> currencyList = new ArrayList<>();
        for (int i = 0; i < currencyCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            BigDecimal value = new BigDecimal(input[0]);
            String currency = input[1];
            if (currency.equals("JPY")) {
                currencyList.add(value);
            } else if (currency.equals("BTC")) {
                currencyList.add(value.multiply(new BigDecimal("380000.0")));
            }
        }
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal value : currencyList) {
            sum = sum.add(value);
        }
        System.out.println(sum);

        // Base64 encoding
        String originalInput = "76812887376861789595";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes(StandardCharsets.UTF_8));

        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Sleep for 0.08 seconds
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // HTTP connection
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            // You can read the response here if needed
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shuffle a list
        List<Integer> list = Arrays.asList(84, 97, 11);
        Collections.shuffle(list);
    }
}