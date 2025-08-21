import java.net.HttpURLConnection;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        String input = "3\n100000000 JPY\n100.00000000 BTC\n0.00000001 BTC";
        String[] lines = input.split("\n");
        int currencyCount = Integer.parseInt(lines[0]);
        double[] currencyList = new double[currencyCount];
        for (int i = 1; i < lines.length; i++) {
            String[] tokens = lines[i].split(" ");
            String currency = tokens[1];
            double amount = Double.parseDouble(tokens[0]);
            if (currency.equals("JPY")) {
                amount *= 1.0;
            } else if (currency.equals("BTC")) {
                amount *= 380000.0;
            }
            currencyList[i-1] = amount;
        }
        double total = 0.0;
        for (double amount : currencyList) {
            total += amount;
        }
        System.out.println(total);
    }
}