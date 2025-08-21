import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        int count = Integer.parseInt(args[0]);
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String[] input = args[i+1].split(" ");
            double amount = Double.parseDouble(input[0]);
            String currency = input[1];
            if (currency.equals("JPY")) {
                values[i] = amount * 1.0;
            } else if (currency.equals("BTC")) {
                values[i] = amount * 380000.0;
            }
        }
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println(total);
    }
}