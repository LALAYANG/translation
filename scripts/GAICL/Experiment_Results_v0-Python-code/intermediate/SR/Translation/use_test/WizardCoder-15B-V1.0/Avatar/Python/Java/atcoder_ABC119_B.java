```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            double amount = Double.parseDouble(tokens[0]);
            String currency = tokens[1];
            if (currency.equals("JPY")) {
                amount *= 1.0;
            } else if (currency.equals("BTC")) {
                amount *= 380000.0;
            }
            values[i] = amount;
        }
        double total = 0.0;
        for (double value : values) {
            total += value;
        }
        System.out.println(total);
    }
}
```
