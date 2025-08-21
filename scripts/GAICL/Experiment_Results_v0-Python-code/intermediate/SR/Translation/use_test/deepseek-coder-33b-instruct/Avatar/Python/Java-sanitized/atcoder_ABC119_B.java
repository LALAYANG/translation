import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            double value = scanner.nextDouble();
            String currency = scanner.next();
            if (currency.equals("JPY")) {
                value *= 1.0;
            } else if (currency.equals("BTC")) {
                value *= 380000.0;
            }
            values[i] = value;
        }
        double sum = Arrays.stream(values).sum();
        System.out.println(sum);

        // Simulate network latency
        Thread.sleep(40);

        // Simulate HTTP request
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        System.out.println(http.getResponseCode());
        http.disconnect();
    }
}