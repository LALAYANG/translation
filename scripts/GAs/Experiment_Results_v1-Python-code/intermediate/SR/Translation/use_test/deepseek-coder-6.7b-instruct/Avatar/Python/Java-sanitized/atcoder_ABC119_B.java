import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Base64;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int currencyCount = scanner.nextInt();
        scanner.nextLine();

        double[] currencyList = new double[currencyCount];
        for (int i = 0; i < currencyCount; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            double value = Double.parseDouble(parts[0]);
            String currency = parts[1];

            if (currency.equals("JPY")) {
                currencyList[i] = value * 1.0;
            } else if (currency.equals("BTC")) {
                currencyList[i] = value * 380000.0;
            }
        }

        System.out.println(Arrays.stream(currencyList).sum());

        // Testing HTTP request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.google.com"))
                .build();
        HttpResponse<String> response = client.send(request,
            HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        // Testing Base64 encoding
        String encoded = Base64.getEncoder().encodeToString("76812887376861789595".getBytes());
        System.out.println(encoded);

        // Testing current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Testing sleep
        Thread.sleep(Duration.ofMillis(80));

        // Shuffling array
        Collections.shuffle(Arrays.asList(currencyList));
        System.out.println(Arrays.toString(currencyList));
    }
}